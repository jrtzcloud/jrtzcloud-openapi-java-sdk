package com.jrtzcloudapi;

import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.utils.StringUtils;
import consensus.v20201119.Constants;

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

public class TestPostmanDemo {
    private final static String SECRET_ID = Constants.SECRET_ID;
    private final static String SECRET_KEY = Constants.SECRET_KEY;

    private final static String CT_JSON = "application/json; charset=utf-8";
    private final static String CT_JSON_PATCH = "application/json-patch+json; charset=utf-8";
    private final static String CT_FORM = "application/x-www-form-urlencoded; charset=utf-8";
    private final static Charset UTF8 = StandardCharsets.UTF_8;

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
//        String httpRequestMethod = "PUT";
//        String httpRequestMethod = "PATCH";

        String service = "stock-pick";
        String host = "lyzt.dev.investoday.net";
        String region = "ap-shenzhen";
        String action = "DescribeInstances";
        String version = "2019-11-19";
        String algorithm = "JC1-HMAC-SHA256";
        String contentType = "";
//        String timestamp = "1551113065";

        String timestamp = String.valueOf(System.currentTimeMillis() / 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        // 注意时区，否则容易出错
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String date = sdf.format(new Date(Long.valueOf(timestamp + "000")));

        // ************* 步骤 1：拼接规范请求串 *************
        String canonicalUri = "/stock-pick/user/programme/saveUserConditionProgramme/ex";
//        String canonicalUri = "/blten/model-data/projects/3939c562-74a0-11ea-a9df-e205e2a85470";
        String canonicalQueryString = "TenantId=RuHmwN6Y60PiNmVJAQvGbV5sv9a6dKPP&AccountId=10000565" +
                "&ConditionCode=RuHmwN6Y60PiNmVJAQvGbV5sv9a6dKPP_10000565_6683062" +
                "&ConditionName=%E6%88%91%E7%9A%84%E5%AE%9A%E5%88%B6%E7%AD%96%E7%95%A5+";
//        String canonicalQueryString = "RiskN=1&StartDate=2014-01-01&EndDate=2020-02-22";
//        String canonicalQueryString = "begin_date=20180101&end_date=20180131&ind_id=0&sec_cd=000001&fields=&oper_type=0&page=1&page_count=1000&rpt_yr=";
        String signedHeaders = "content-type;host";

        HashMap<String, String> params =  new HashMap<String, String>();
        params.put("begin_date", "20180101");
        params.put("end_date", "20180131");
        params.put("fields", "");
        params.put("oper_type", "0");
        params.put("page", "1");
        params.put("page_count", "1000");

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
        String patchPayload = "{\"Patch\": [{\"op\": \"replace\", \"path\": \"/Model\", \"value\": {\"AssetList\": [\"ASHARE\", \"USSHARE\", \"HKSHARE\", \"ABS_RETURN\", \"OIL\", \"GOLD\", \"TREASURY\", \"CN_CREDIT\", \"GLOBAL_DEBT\", \"CASH\"], \"OriginalExpRtnDict\": {\"ASHARE\": 0.12, \"USSHARE\": 0.082, \"HKSHARE\": 0.082, \"ABS_RETURN\": 0.045, \"OIL\": 0.085, \"GOLD\": 0.06, \"CN_CREDIT\": 0.045, \"TREASURY\": 0.042, \"GLOBAL_DEBT\": 0.04, \"CASH\": 0.03}, \"BoundaryDict\": {\"ASHARE\": [0, 1.0], \"USSHARE\": [0, 1.0], \"HKSHARE\": [0, 1.0], \"ABS_RETURN\": [0, 0.1], \"OIL\": [0, 1.0], \"GOLD\": [0, 1.0], \"TREASURY\": [0.03, 1.0], \"CN_CREDIT\": [0, 1.0], \"GLOBAL_DEBT\": [0.0, 1.0], \"CASH\": [0.02, 1.0]}, \"ConstrainList\": [[\"ineq\", \"(0.3 * ASHARE) - USSHARE\"]]}}, {\"op\": \"replace\", \"path\": \"/StartDate\", \"value\": \"2019-09-01\"}, {\"op\": \"replace\", \"path\": \"/StopDate\", \"value\": \"2029-09-01\"}]}";
        String postPayload = "{\"Model\": {\"AssetList\": [\"ASHARE\", \"USSHARE\", \"HKSHARE\", \"ABS_RETURN\", \"OIL\", \"GOLD\", \"TREASURY\", \"CN_CREDIT\", \"GLOBAL_DEBT\", \"CASH\"], \"OriginalExpRtnDict\": {\"ASHARE\": 0.12, \"USSHARE\": 0.082, \"HKSHARE\": 0.082, \"ABS_RETURN\": 0.045, \"OIL\": 0.085, \"GOLD\": 0.06, \"CN_CREDIT\": 0.045, \"TREASURY\": 0.042, \"GLOBAL_DEBT\": 0.04, \"CASH\": 0.03}, \"BoundaryDict\": {\"ASHARE\": [0, 1.0], \"USSHARE\": [0, 1.0], \"HKSHARE\": [0, 1.0], \"ABS_RETURN\": [0, 0.1], \"OIL\": [0, 1.0], \"GOLD\": [0, 1.0], \"TREASURY\": [0.03, 1.0], \"CN_CREDIT\": [0, 1.0], \"GLOBAL_DEBT\": [0.0, 1.0], \"CASH\": [0.02, 1.0]}, \"ConstrainList\": [[\"ineq\", \"(0.3 * ASHARE) - USSHARE\"]]}, \"StartDate\": \"2019-10-01\", \"StopDate\": \"2019-11-11\"}";
        String putPayload  = "{\"Model\": {\"AssetList\": [\"ASHARE\", \"USSHARE\", \"HKSHARE\", \"ABS_RETURN\", \"OIL\", \"GOLD\", \"TREASURY\", \"CN_CREDIT\", \"GLOBAL_DEBT\", \"CASH\"], \"OriginalExpRtnDict\": {\"ASHARE\": 0.12, \"USSHARE\": 0.082, \"HKSHARE\": 0.082, \"ABS_RETURN\": 0.045, \"OIL\": 0.085, \"GOLD\": 0.06, \"CN_CREDIT\": 0.045, \"TREASURY\": 0.042, \"GLOBAL_DEBT\": 0.04, \"CASH\": 0.03}, \"BoundaryDict\": {\"ASHARE\": [0, 1.0], \"USSHARE\": [0, 1.0], \"HKSHARE\": [0, 1.0], \"ABS_RETURN\": [0, 0.1], \"OIL\": [0, 1.0], \"GOLD\": [0, 1.0], \"TREASURY\": [0.03, 1.0], \"CN_CREDIT\": [0, 1.0], \"GLOBAL_DEBT\": [0.0, 1.0], \"CASH\": [0.02, 1.0]}, \"ConstrainList\": [[\"ineq\", \"(0.3 * ASHARE) - USSHARE\"]]}, \"StartDate\": \"2019-10-01\", \"StopDate\": \"2019-11-12\"}";
        String payload = patchPayload;
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
        System.out.println("Timestamp==>" + timestamp);
        System.out.println("signature==>" + signature);

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
        sb.append("curl -X ").append(httpRequestMethod).append(" https://").append(host).append(canonicalUri)
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