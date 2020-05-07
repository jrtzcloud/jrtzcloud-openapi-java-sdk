package com.jrtzcloudapi;

import javafx.scene.web.WebView;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.naming.Context;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

/**
 * Android SDK Sign Method Demo
 */

public class JrtzMainActivity {

    private final static String SECRET_ID = "IddXR66kGfhIcfs86C9nvk1kTZvSample";
    private final static String SECRET_KEY = "keyWr9fmN5ARyoKFCJOgaicygO8Sample";

    private final static char[] hexCode = "0123456789ABCDEF".toCharArray();
    private WebView webView;


    private static class JrtzJSInterface {

        private Context mContext;

        public JrtzJSInterface() {}

        public JrtzJSInterface(Context context) {
            mContext = context;
        }

        /**
         * 获取签名ID
         * 必须添加JS注解@JavascriptInterface。该Android原生的本地方法，供H5 Web网页调用。
         * 该函数的访问属性必须是public。
         * @return
         */
//        @JavascriptInterface
        public String getSecretId() {
            return SECRET_ID;
        }

        /**
         * 获取签名，供H5 Web网页调用。
         * 必须添加JS注解@JavascriptInterface
         * 该函数的访问属性必须是public。
         * @param currentDateUTC 当前英国日期（UTC date）
         * @param product 产品名
         * @param stringToSign 待签名串
         * @return
         */
//        @JavascriptInterface
        public String getSignature(String currentDateUTC, String product, String stringToSign) {
            byte[] secretDate = HmacSHA256(("JC1" + SECRET_KEY).getBytes(), currentDateUTC);
            byte[] secretService = HmacSHA256(secretDate, product);
            byte[] secretSigning = HmacSHA256(secretService, "jc1_request");
            return printHexBinary(HmacSHA256(secretSigning, stringToSign)).toLowerCase();
        }
    }

    private static byte[] HmacSHA256(byte[] key, String msg) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, mac.getAlgorithm());
            mac.init(secretKeySpec);
            return mac.doFinal(msg.getBytes(StandardCharsets.UTF_8));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return "NoSuchAlgorithmException".getBytes(StandardCharsets.UTF_8);
        } catch (InvalidKeyException ex) {
            ex.printStackTrace();
            return "InvalidKeyException".getBytes(StandardCharsets.UTF_8);
        }
    }

    private static String printHexBinary(byte[] data) {
        StringBuilder r = new StringBuilder(data.length * 2);
        for (byte b : data) {
            r.append(hexCode[(b >> 4) & 0xF]);
            r.append(hexCode[(b & 0xF)]);
        }
        return r.toString();
    }

    public static void main(String[] args) {
        JrtzJSInterface jrtzJSInterface = new JrtzJSInterface();
        System.out.println(
                jrtzJSInterface.getSignature("2020-02-07", "key", "fasdfasdfasdfas"));
    }
}
