package com.jrtzcloudapi;

import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.utils.StringUtils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.*;

public class TestDataapiDemo {
    private final static Charset UTF8 = StandardCharsets.UTF_8;

    private final static String SECRET_ID = "nT3GoChoSilVSWskjjCxEKA1G8R6otAO";
    private final static String SECRET_KEY = "ZWqy9tQXHVzwOvBULX5GS0QWjv7E8Bz8";

    private final static String CT_JSON = "application/json; charset=utf-8";
    private final static String CT_JSON_PATCH = "application/json-patch+json; charset=utf-8";
    private final static String CT_FORM = "application/x-www-form-urlencoded; charset=utf-8";

    public static byte[] hmac256(byte[] key, String msg) throws Exception {
        Mac mac = Mac.getInstance("HmacSHA256");
        SecretKeySpec secretKeySpec = new SecretKeySpec(key, mac.getAlgorithm());
        mac.init(secretKeySpec);
        return mac.doFinal(msg.getBytes(UTF8));
    }

    public static String sha256Hex(String s) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] d = md.digest(s.getBytes(UTF8));
        return DatatypeConverter.printHexBinary(d).toLowerCase();
    }

    public static void main(String[] args) throws Exception {
        String httpRequestMethod = "GET";
//        String httpRequestMethod = "POST";

//        String timestamp = "1584959350";
        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        String service = "consensus";
        String host = "dataapi.investoday.net";
        String canonicalUri = "/consensus/est-bsc";
        String canonicalQueryString = "BeginDate=20180101&EndDate=20180131&IndId=0&SecCd=000001&Fields&OperType=0&Page=1&PageCount=1000&RptYr";


        String region = "ap-shenzhen";
        String action = "DescribeInstances";
        String version = "2019-11-19";
        String algorithm = "JC1-HMAC-SHA256";
        String contentType = "";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 注意时区，否则容易出错
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.valueOf(timestamp + "000")));

        // ************* 步骤 1：拼接规范请求串 *************
//        String canonicalQueryString = "Date=2020-03-16";
//        String canonicalQueryString = "UserId=001000000000024&AppId=001&ProdId=001&Target=a0001";
        String signedHeaders = "content-type;host";

        HashMap<String, String> params =  new HashMap<String, String>();
        params.put("begin_date", "20180101");

        StringBuilder queryString = new StringBuilder("");
        for (Map.Entry<String, String> entry : params.entrySet()) {
            String k, v;
            try {
                k = URLEncoder.encode(entry.getKey(), "UTF8");
                v = URLEncoder.encode(entry.getValue(), "UTF8");
            } catch (UnsupportedEncodingException e) {
                throw new JrtzCloudSDKException("UTF8 is not supported." + e.getMessage());
            }
            queryString.append("&")
                    .append(k)
                    .append("=")
                    .append(v);
        }
        String payload = "";
        //        payload = queryString.substring(1);
//        payload = "{\"Limit\": 1, \"Filters\": [{\"Values\": [\"未命名\"], \"Name\": \"instance-name\"}]}";

        if(StringUtils.equalsIgnoreCase(httpRequestMethod, "GET")) {
            contentType = CT_FORM;
            payload = "";
        }else if(StringUtils.equalsIgnoreCase(httpRequestMethod, "PATCH")) {
            contentType = CT_JSON_PATCH;
            canonicalQueryString = "";
        }else{
            contentType = CT_JSON;
            canonicalQueryString = "";
        }

        System.out.println("payload===>" + payload);
        String hashedRequestPayload = sha256Hex(payload);
        System.out.println("hashedRequestPayload==>" + hashedRequestPayload + "\n");

        String canonicalHeaders = "content-type:"+ contentType +"\n"
                + "host:" + host + "\n";

        String canonicalRequest = httpRequestMethod + "\n" + canonicalUri + "\n"
                + canonicalQueryString + "\n" + canonicalHeaders + "\n"
                + signedHeaders + "\n" + hashedRequestPayload;
        System.out.println("canonicalRequest==>" + canonicalRequest.replace("\n", "\\n"));
        String hashedCanonicalRequest = sha256Hex(canonicalRequest);
        System.out.println("hashedCanonicalRequest==>" + hashedCanonicalRequest + "\n");

        // ************* 步骤 2：拼接待签名字符串 *************
        String credentialScope = date + "/" + service + "/jc1_request";
        String stringToSign = algorithm + "\n" + timestamp + "\n" + credentialScope + "\n" + hashedCanonicalRequest;
        System.out.println("stringToSign==>" + stringToSign.replace("\n", "\\n"));

        // ************* 步骤 3：计算签名 *************
        byte[] secretDate = hmac256(("JC1" + SECRET_KEY).getBytes(UTF8), date);
        byte[] secretService = hmac256(secretDate, service);
        byte[] secretSigning = hmac256(secretService, "jc1_request");
        byte[] signatureBin = hmac256(secretSigning, stringToSign);
        String signature = DatatypeConverter.printHexBinary(signatureBin).toLowerCase();
        System.out.println("signature==>" + signature);
        System.out.println("Timestamp==>" + timestamp);

        // ************* 步骤 4：拼接 Authorization *************
        String authorization = algorithm + " " + "Credential=" + SECRET_ID + "/" + credentialScope + ", "
                + "SignedHeaders=" + signedHeaders + ", " + "Signature=" + signature;
        System.out.println("authorization==>" + authorization + "\n");

        TreeMap<String, String> headers = new TreeMap<String, String>();
        headers.put("Authorization", authorization);
        headers.put("Content-Type", contentType);
        headers.put("Host", host);
        headers.put("X-JC-Action", action);
        headers.put("X-JC-Timestamp", timestamp);
        headers.put("X-JC-Version", version);
        headers.put("X-JC-Region", region);

        StringBuilder sb = new StringBuilder();
        sb.append("curl -X ").append(httpRequestMethod)
                .append(" https://").append(host).append(canonicalUri)
                .append(" -H \"Authorization: ").append(authorization).append("\"")
                .append(" -H \"Content-Type: "+ contentType +"\"")
                .append(" -H \"Host: ").append(host).append("\"")
                .append(" -H \"X-JC-Action: ").append(action).append("\"")
                .append(" -H \"X-JC-Timestamp: ").append(timestamp).append("\"")
                .append(" -H \"X-JC-Version: ").append(version).append("\"")
                .append(" -H \"X-JC-Region: ").append(region).append("\"")
                .append(" -d '").append(payload).append("'");
        System.out.println(sb.toString());
    }
}