package com.jrtzcloudapi.sdp.v20200115;

// 导入对应产品模块的client

// 导入要请求接口对应的request response类

import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;
import com.jrtzcloudapi.sdp.v20200115.models.SysInfoRequest;
import com.jrtzcloudapi.sdp.v20200115.models.SysInfoResponse;

public class GetSysInfo_Prod {

    /**
     * Signature Version 1
     */
    public static final String SIGN_JC1_256 = "JC1-HMAC-SHA256";

    public static final String REGION = "ap-shenzhen";

    public static final String PATH = "/sdp-cust/sysinfo";

    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
//            Credential cred = new Credential("RuHmwN6Y60PiNmVJAQvGbV5sv9a6dKPP",
//                                            "BUTGjrtgVALSt3K15dE4I6tMnJSBZ4Ku");
            Credential cred = new Credential("stu5fnrW50QWZgXBM9b0ZlSHYstfoxZ9",
                    "we6COHqWiKBHAlA24GJ7C57D7iYyYz9L");

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("GET"); // get请求(默认为post请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("sdp.investoday.net"); // 指定接入地域域名(默认就近接入)

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setSignMethod(SIGN_JC1_256); // 指定签名算法(默认为HmacSHA256)
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品(以blten为例)的client对象,clientProfile是可选的
            SdpClient client = new SdpClient(cred, REGION, clientProfile, PATH);

            // 实例化一个sdpclient实例信息查询请求对象,每个接口都会对应一个request对象。
            SysInfoRequest req = new SysInfoRequest();

            // 通过client对象调用DescribeAssetAllocationParam方法发起请求。注意请求方法名与请求对象是对应的
            // 返回的resp是一个DescribeAssetAllocationParamResponse类的实例，与请求对象对应
            SysInfoResponse resp = client.GetSysInfo(req);

            System.out.println("\n");

            // 输出json格式的字符串回包
            System.out.println(SysInfoResponse.toJsonString(resp));

            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
//            System.out.println(resp.getRequestId());
        } catch (JrtzCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}
