/*
 * Copyright (c) 2018 THL A29 Limited, a Investoday company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.jrtzcloudapi.common;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.http.HttpConnection;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;
import com.squareup.okhttp.*;
import com.squareup.okhttp.Headers.Builder;
import com.sun.deploy.net.HttpResponse;
import org.apache.commons.lang3.StringUtils;

import javax.crypto.Mac;
import javax.net.ssl.SSLContext;
import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLEncoder;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 抽象client类
 */
abstract public class AbstractClient2 {

    public static final int HTTP_RSP_OK = 200;
    public static final String SDK_VERSION = "SDK_JAVA_1.0.001";


    private Credential credential;
    private ClientProfile profile;
    private String endpoint;
    private String region;
    private String path;
    private String sdkVersion;
    private String apiVersion;
    public Gson gson;

    public AbstractClient2(String endpoint, String version, Credential credential, String region, String path) {
        this(endpoint, version, credential, region, new ClientProfile(), path);
    }

    public AbstractClient2(String endpoint, String version, Credential credential, String region,
                           ClientProfile profile, String path) {

        this.credential = credential;
        this.profile = profile;
        this.endpoint = endpoint;
        this.region = region;
        this.path = path;
        this.sdkVersion = AbstractClient2.SDK_VERSION;
        this.apiVersion = version;
        this.gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        warmup();
    }

    /**
     * 设置产品地域
     *
     * @param region
     *            产品地域
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * 返回产品地域
     *
     * @return 地域名称
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * 设置配置实例
     *
     * @param profile
     *            配置实例
     */
    public void setClientProfile(ClientProfile profile) {
        this.profile = profile;
    }

    /**
     * 获取配置实例
     *
     * @return 配置实例
     */
    public ClientProfile getClientProfile() {
        return this.profile;
    }

    /**
     * 设置认证信息实例
     *
     * @param credential
     *            认证信息实例
     */
    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    /**
     * 获取认证信息实例
     *
     * @return 认证信息实例
     */
    public Credential getCredential() {
        return this.credential;
    }

    /**
     * Use post/json with jc1-hmac-sha256 signature to call any action. Ignore
     * request method and signature method defined in profile.
     *
     * @param action
     *            Name of action to be called.
     * @param jsonPayload
     *            Parameters of action serialized in json string format.
     * @return Raw response from API if request succeeded, otherwise an exception
     *         will be raised instead of raw response
     * @throws JrtzCloudSDKException
     */
    public String call(String action, String jsonPayload) throws JrtzCloudSDKException {
        String endpoint = this.endpoint;
        // in case user has reset endpoint after init this client
        if (!(this.profile.getHttpProfile().getEndpoint() == null)) {
            endpoint = this.profile.getHttpProfile().getEndpoint();
        }
        // always use post jc1-hmac-sha256 signature process
        // okhttp always set charset even we don't specify it,
        // to ensure signature be correct, we have to set it here as well.
        String contentType = "application/json; charset=utf-8";
        byte[] requestPayload = jsonPayload.getBytes();
        String canonicalUri = this.path;
        String canonicalQueryString = "";
        String canonicalHeaders = "content-type:" + contentType + "\nhost:" + endpoint + "\n";
        String signedHeaders = "content-type;host";

        String hashedRequestPayload = "";
        if (this.profile.isUnsignedPayload()) {
            hashedRequestPayload = Sign.sha256Hex("UNSIGNED-PAYLOAD".getBytes());
        } else {
            hashedRequestPayload = Sign.sha256Hex(requestPayload);
        }
        String canonicalRequest = HttpProfile.REQ_POST + "\n" + canonicalUri + "\n" + canonicalQueryString + "\n"
                + canonicalHeaders + "\n" + signedHeaders + "\n" + hashedRequestPayload;

        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.valueOf(timestamp + "000")));
        String service = endpoint.split("\\.")[0];
        String credentialScope = date + "/" + service + "/" + "jc1_request";
        String hashedCanonicalRequest = Sign.sha256Hex(canonicalRequest.getBytes());
        String stringToSign = "JC1-HMAC-SHA256\n" + timestamp + "\n" + credentialScope + "\n" + hashedCanonicalRequest;

        String secretId = this.credential.getSecretId();
        String secretKey = this.credential.getSecretKey();
        byte[] secretDate = Sign.hmac256(("JC1" + secretKey).getBytes(), date);
        byte[] secretService = Sign.hmac256(secretDate, service);
        byte[] secretSigning = Sign.hmac256(secretService, "jc1_request");
        String signature = DatatypeConverter.printHexBinary(Sign.hmac256(secretSigning, stringToSign)).toLowerCase();
        String authorization = "JC1-HMAC-SHA256 " + "Credential=" + secretId + "/" + credentialScope + ", "
                + "SignedHeaders=" + signedHeaders + ", " + "Signature=" + signature;

        HttpConnection conn = new HttpConnection(this.profile.getHttpProfile().getConnTimeout(),
                this.profile.getHttpProfile().getReadTimeout(), this.profile.getHttpProfile().getWriteTimeout());
        this.trySetProxy(conn);
        String url = this.profile.getHttpProfile().getProtocol() + endpoint + this.path;
        Builder hb = new Builder();
        hb.add("Content-Type", contentType).add("Host", endpoint).add("Authorization", authorization)
                .add("X-JC-Action", action).add("X-JC-Timestamp", timestamp).add("X-JC-Version", this.apiVersion)
                .add("X-JC-Region", this.getRegion()).add("X-JC-RequestClient", SDK_VERSION);
        String token = this.credential.getToken();
        if (token != null && !token.isEmpty()) {
            hb.add("X-JC-Token", token);
        }
        if (this.profile.isUnsignedPayload()) {
            hb.add("X-JC-Content-SHA256", "UNSIGNED-PAYLOAD");
        }

        Headers headers = hb.build();
        Response resp = conn.postRequest(url, requestPayload, headers);
        if (resp.code() != AbstractClient2.HTTP_RSP_OK) {
            throw new JrtzCloudSDKException(resp.code() + resp.message());
        }
        String respbody = null;
        try {
            respbody = resp.body().string();
        } catch (IOException e) {
            throw new JrtzCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        JsonResponseModel<JsonResponseErrModel> errResp = null;
        try {
            Type errType = new TypeToken<JsonResponseModel<JsonResponseErrModel>>() {
            }.getType();
            errResp = gson.fromJson(respbody, errType);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        if (errResp.response.error != null) {
            throw new JrtzCloudSDKException(errResp.response.error.code + "-" + errResp.response.error.message,
                    errResp.response.requestId);
        }
        return respbody;
    }

    private void trySetProxy(HttpConnection conn) {
        String host = this.profile.getHttpProfile().getProxyHost();
        int port = this.profile.getHttpProfile().getProxyPort();

        if (host == null || host.isEmpty()) {
            return;
        }
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        conn.setProxy(proxy);

        final String username = this.profile.getHttpProfile().getProxyUsername();
        final String password = this.profile.getHttpProfile().getProxyPassword();
        if (username == null || username.isEmpty()) {
            return;
        }
        conn.setAuthenticator(new Authenticator() {
            @Override
            public Request authenticate(Proxy proxy, Response response) throws IOException {
                String credential = Credentials.basic(username, password);
                return response.request().newBuilder().header("Proxy-Authorization", credential).build();
            }

            @Override
            public Request authenticateProxy(Proxy proxy, Response response) throws IOException {
                return authenticate(proxy, response);
            }
        });
    }

    protected String internalRequest(AbstractModel request, String actionName) throws JrtzCloudSDKException {
        Response okRsp = null;
        String endpoint = this.endpoint;
        if (!(this.profile.getHttpProfile().getEndpoint() == null)) {
            endpoint = this.profile.getHttpProfile().getEndpoint();
        }
        String [] binaryParams = request.getBinaryParams();
        String sm = this.profile.getSignMethod();
        String reqMethod = this.profile.getHttpProfile().getReqMethod();

        // currently, customized params only can be supported via post json jc1-hmac-sha256
        HashMap<String, Object> customizedParams = request.any();
        if (customizedParams.size() > 0) {
            if (binaryParams.length > 0) {
                throw new JrtzCloudSDKException("WrongUsage: Cannot post multipart with customized parameters.");
            }
            if (sm.equals(ClientProfile.SIGN_SHA1) || sm.equals(ClientProfile.SIGN_SHA256)) {
                throw new JrtzCloudSDKException("WrongUsage: Cannot use HmacSHA1 or HmacSHA256 with customized parameters.");
            }
            if (reqMethod.equals(HttpProfile.REQ_GET)) {
                throw new JrtzCloudSDKException("WrongUsage: Cannot use get method with customized parameters.");
            }
        }

        if (binaryParams.length > 0 || sm.equals(ClientProfile.SIGN_JC1_256)) {
            okRsp = doRequestWithJC1(endpoint, request, actionName);
        } else if (sm.equals(ClientProfile.SIGN_SHA1) || sm.equals(ClientProfile.SIGN_SHA256)) {
            okRsp = doRequest(endpoint, request, actionName);
        } else {
            throw new JrtzCloudSDKException("Signature method " + sm + " is invalid or not supported yet.");
        }

        return this.readResponse(okRsp);
    }

    private String readResponse(Response okRsp) throws JrtzCloudSDKException {
        String strResp = null;
        try {
            strResp = okRsp.body().string();
        } catch (IOException e) {
            throw new JrtzCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }

        if(StringUtils.isBlank(strResp)){
            throw new JrtzCloudSDKException("SDK.InvalidServerResponse" + "-" + "Failed to parse the response. The request was succeeded, but the server returned an empty HTTP body.");
        }

        if(!okRsp.isSuccessful()){
            JsonResponseErrModel2 errResp = null;
            try {
                Type errType = new TypeToken<JsonResponseErrModel2>() {
                }.getType();
                errResp = gson.fromJson(strResp, errType);
            } catch (JsonSyntaxException e) {
                throw new JrtzCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
            }

            if (StringUtils.isBlank(errResp.errorCode)) {
                throw new JrtzCloudSDKException("SDK.InvalidServerResponse: "+ okRsp.code() + "-" + okRsp.message());
            }else{
                throw new JrtzCloudSDKException(errResp.errorCode, errResp.errorMessage, errResp.requestId);
            }
        }
        return strResp;
    }

    private Response doRequest(String endpoint, AbstractModel request, String action) throws JrtzCloudSDKException {
        HashMap<String, String> param = new HashMap<String, String>();
        request.toMap(param, "");
        String strParam = this.formatRequestData(action, param);
        HttpConnection conn = new HttpConnection(
                this.profile.getHttpProfile().getConnTimeout(),
                this.profile.getHttpProfile().getReadTimeout(),
                this.profile.getHttpProfile().getWriteTimeout());
        this.trySetProxy(conn);
        String reqMethod = this.profile.getHttpProfile().getReqMethod();
        String url = this.profile.getHttpProfile().getProtocol() + endpoint + this.path;
        if (reqMethod.equals(HttpProfile.REQ_GET)) {
            return conn.getRequest(url + "?" + strParam);
        } else if (reqMethod.equals(HttpProfile.REQ_POST)) {
            return conn.postRequest(url, strParam);
        } else {
            throw new JrtzCloudSDKException("Method only support (GET, POST)");
        }
    }

    private Response doRequestWithJC1(String endpoint, AbstractModel request, String action) throws JrtzCloudSDKException {
        String httpRequestMethod = this.profile.getHttpProfile().getReqMethod();
        if (httpRequestMethod == null) {
            throw new JrtzCloudSDKException("Request method should not be null, can only be GET or POST");
        }
        String contentType = "application/x-www-form-urlencoded";
        byte [] requestPayload = "".getBytes();
        HashMap<String, String> params = new HashMap<String, String>();
        request.toMap(params, "");
        String [] binaryParams = request.getBinaryParams();
        if ( binaryParams.length > 0 ) {
            httpRequestMethod = HttpProfile.REQ_POST;
            String boundary = UUID.randomUUID().toString();
            // okhttp always set charset even we don't specify it,
            // to ensure signature be correct, we have to set it here as well.
            contentType = "multipart/form-data; charset=utf-8" + "; boundary=" + boundary;
            try {
                requestPayload = getMultipartPayload(request, boundary);
            } catch (Exception e) {
                throw new JrtzCloudSDKException("Failed to generate multipart. because: " + e);
            }
        } else if (httpRequestMethod.equals(HttpProfile.REQ_POST)) {
            requestPayload = AbstractModel.toJsonString(request).getBytes();
            // okhttp always set charset even we don't specify it,
            // to ensure signature be correct, we have to set it here as well.
            contentType = "application/json; charset=utf-8";
        }
        String canonicalUri = this.path;
        String canonicalQueryString = this.getCanonicalQueryString(params, httpRequestMethod);
        String canonicalHeaders = "content-type:" + contentType + "\nhost:" + endpoint + "\n";
        String signedHeaders = "content-type;host";

        String hashedRequestPayload = "";
        if (this.profile.isUnsignedPayload()) {
            hashedRequestPayload = Sign.sha256Hex("UNSIGNED-PAYLOAD".getBytes());
        } else {
            hashedRequestPayload = Sign.sha256Hex(requestPayload);
        }

        System.out.println("hashedRequestPayload==>" + hashedRequestPayload);

        String canonicalRequest = httpRequestMethod + "\n" + canonicalUri + "\n" + canonicalQueryString + "\n"
                + canonicalHeaders + "\n" + signedHeaders + "\n" + hashedRequestPayload;

        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);

        System.out.println("timestamp==>" + timestamp);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.valueOf(timestamp + "000")));
        String service = endpoint.split("\\.")[0];
        String credentialScope = date + "/" + service + "/" + "jc1_request";
        String hashedCanonicalRequest = Sign.sha256Hex(canonicalRequest.getBytes());

        System.out.println("hashedCanonicalRequest==>" + hashedCanonicalRequest);

        String stringToSign = "JC1-HMAC-SHA256\n" + timestamp + "\n" + credentialScope + "\n" + hashedCanonicalRequest;

        String secretId = this.credential.getSecretId();
        String secretKey = this.credential.getSecretKey();
        byte[] secretDate = Sign.hmac256(("JC1" + secretKey).getBytes(), date);
        byte[] secretService = Sign.hmac256(secretDate, service);
        byte[] secretSigning = Sign.hmac256(secretService, "jc1_request");
        String signature = DatatypeConverter.printHexBinary(Sign.hmac256(secretSigning, stringToSign)).toLowerCase();

        System.out.println("signature==>" + signature);

        String authorization = "JC1-HMAC-SHA256 " + "Credential=" + secretId + "/" + credentialScope + ", "
                + "SignedHeaders=" + signedHeaders + ", " + "Signature=" + signature;

        HttpConnection conn = new HttpConnection(
                this.profile.getHttpProfile().getConnTimeout(),
                this.profile.getHttpProfile().getReadTimeout(),
                this.profile.getHttpProfile().getWriteTimeout());
        this.trySetProxy(conn);
        String url = this.profile.getHttpProfile().getProtocol() + endpoint + this.path;
        Builder hb = new Builder();
        hb.add("Content-Type", contentType)
            .add("Host", endpoint)
            .add("Authorization", authorization)
            .add("X-JC-Action", action)
            .add("X-JC-Timestamp", timestamp)
            .add("X-JC-Version", this.apiVersion)
            .add("X-JC-RequestClient", SDK_VERSION);
        if (null != this.getRegion()) {
            hb.add("X-JC-Region", this.getRegion());
        }
        String token = this.credential.getToken();
        if (token != null && ! token.isEmpty()) {
            hb.add("X-JC-Token", token);
        }
        if (this.profile.isUnsignedPayload()) {
            hb.add("X-JC-Content-SHA256", "UNSIGNED-PAYLOAD");
        }

        Headers headers = hb.build();
        if (httpRequestMethod.equals(HttpProfile.REQ_GET)) {
            return conn.getRequest(url + "?" + canonicalQueryString, headers);
        } else if (httpRequestMethod.equals(HttpProfile.REQ_POST)) {
            return conn.postRequest(url, requestPayload, headers);
        } else {
            throw new JrtzCloudSDKException("Method only support GET, POST");
        }
    }

    private byte [] getMultipartPayload(AbstractModel request, String boundary) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String [] binaryParams = request.getBinaryParams();
        for (Map.Entry<String, byte []> entry : request.getMultipartRequestParams().entrySet()) {
            baos.write("--".getBytes());
            baos.write(boundary.getBytes());
            baos.write("\r\n".getBytes());
            baos.write("Content-Disposition: form-data; name=\"".getBytes());
            baos.write(entry.getKey().getBytes());
            if (Arrays.asList(binaryParams).contains(entry.getKey())) {
                baos.write("\"; filename=\"".getBytes());
                baos.write(entry.getKey().getBytes());
                baos.write("\"\r\n".getBytes());
            } else {
                baos.write("\"\r\n".getBytes());
            }
            baos.write("\r\n".getBytes());
            baos.write(entry.getValue());
            baos.write("\r\n".getBytes());
        }
        if (baos.size() != 0) {
            baos.write("--".getBytes());
            baos.write(boundary.getBytes());
            baos.write("--\r\n".getBytes());
        }
        byte [] bytes = baos.toByteArray();
        baos.close();
        return bytes;
    }

    private String getCanonicalQueryString(HashMap<String, String> params, String method) throws JrtzCloudSDKException {
        if ( method != null && method.equals(HttpProfile.REQ_POST)) {
            return "";
        }
        StringBuilder queryString = new StringBuilder("");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String v;
            try {
                v = URLEncoder.encode(entry.getValue(), "UTF8");
            } catch (UnsupportedEncodingException e) {
                throw new JrtzCloudSDKException("UTF8 is not supported." + e.getMessage());
            }
            queryString.append("&")
            .append(entry.getKey())
            .append("=")
            .append(v);
        }
        return queryString.toString().substring(1);
    } 

    private String formatRequestData(String action, Map<String, String> param) throws JrtzCloudSDKException {
        param.put("Action", action);
        param.put("RequestClient", this.sdkVersion);
        param.put("Nonce", String.valueOf(Math.abs(new Random().nextInt())));
        param.put("Timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        param.put("Version", this.apiVersion);

        if (this.credential.getSecretId() != null && (!this.credential.getSecretId().isEmpty())) {
            param.put("SecretId", this.credential.getSecretId());
        }

        if (this.region != null && (!this.region.isEmpty())) {
            param.put("Region", this.region);
        }

        if (this.profile.getSignMethod() != null && (!this.profile.getSignMethod().isEmpty())) {
            param.put("SignatureMethod", this.profile.getSignMethod());
        }

        if (this.credential.getToken() != null && (!this.credential.getToken().isEmpty())) {
            param.put("Token", this.credential.getToken());
        }

        String endpoint = this.endpoint;
        if (!(this.profile.getHttpProfile().getEndpoint() == null)) {
            endpoint = this.profile.getHttpProfile().getEndpoint();
        }

        String sigInParam = Sign.makeSignPlainText(new TreeMap<String, String>(param),
                this.profile.getHttpProfile().getReqMethod(), endpoint, this.path);
        String sigOutParam = Sign.sign(this.credential.getSecretKey(), sigInParam, this.profile.getSignMethod());

        String strParam = "";
        try {
            for (Map.Entry<String, String> entry : param.entrySet()) {
                strParam += (URLEncoder.encode(entry.getKey(), "utf-8") + "="
                        + URLEncoder.encode(entry.getValue(), "utf-8") + "&");
            }
            strParam += ("Signature=" + URLEncoder.encode(sigOutParam, "utf-8"));
        } catch (UnsupportedEncodingException e) {
            throw new JrtzCloudSDKException(e.getClass().getName() + "-" + e.getMessage());
        }
        return strParam;
    }
    
    /**
     * warm up, try to avoid unnecessary cost in the first request
     */
    private void warmup() {
        try {
            // it happens in SDK signature process.
            // first invoke costs around 250 ms.
            Mac.getInstance("HmacSHA1");
            Mac.getInstance("HmacSHA256");
            // it happens inside okhttp, but I think any https framework/package will do the same.
            // first invoke costs around 150 ms.
            SSLContext sslContext = SSLContext.getInstance("TLS");
            sslContext.init(null, null, null);
        } catch (Exception e) {
            // ignore but print message to console
            e.printStackTrace();
        }
    }
}
