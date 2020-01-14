package com.jrtzcloudapi.blten.v20191119;

import com.jrtzcloudapi.blten.v20191119.models.DescribeAssetAllocationParamRequest;
import com.jrtzcloudapi.blten.v20191119.models.DescribeAssetAllocationParamResponse;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;

// 导入对应产品模块的client
// 导入要请求接口对应的request response类
//导入可选配置类

public class DescribeAssetAllocationParam {

    /**
     * Signature Version 1
     */
    public static final String SIGN_JC1_256 = "JC1-HMAC-SHA256";

    public static final String REGION = "ap-shenzhen";

    public static final String PATH = "/blten/get_project_info";

    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
            Credential cred = new Credential("D8xc9JKzEmEvry8XRhkP8JPm5b530pdW",
                                            "w70qzZjKn7kl72FJ7BQ8oHoFFzZ0cUmj");

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
//            httpProfile.setReqMethod("GET"); // get请求(默认为post请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("blten.jrtzcloud.cn"); // 指定接入地域域名(默认就近接入)

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setSignMethod(SIGN_JC1_256); // 指定签名算法(默认为HmacSHA256)
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品(以blten为例)的client对象,clientProfile是可选的
            BltenClient client = new BltenClient(cred, REGION, clientProfile, PATH);

            // 实例化一个blten实例信息查询请求对象,每个接口都会对应一个request对象。
            DescribeAssetAllocationParamRequest req = new DescribeAssetAllocationParamRequest();

            // 填充请求参数,这里request对象的成员变量即对应接口的入参
            // 你可以通过官网接口文档或跳转到request对象的定义处查看请求参数的定义
            req.setGuid("4c3f67fe-11d4-11ea-8407-f228b5caf6e9");

            // 这里还支持以标准json格式的string来赋值请求参数的方式。下面的代码跟上面的参数赋值是等效的
            String params = "{\"guid\":\"4c3f67fe-11d4-11ea-8407-f228b5caf6e9\"}";
            req = DescribeAssetAllocationParamRequest.fromJsonString(params, DescribeAssetAllocationParamRequest.class);


            // 通过client对象调用DescribeAssetAllocationParam方法发起请求。注意请求方法名与请求对象是对应的
            // 返回的resp是一个DescribeAssetAllocationParamResponse类的实例，与请求对象对应
            DescribeAssetAllocationParamResponse resp = client.DescribeAssetAllocationParam(req);

            System.out.println("\n");

            // 输出json格式的字符串回包
            System.out.println(DescribeAssetAllocationParamResponse.toJsonString(resp));

            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
//            System.out.println(resp.getRequestId());
        } catch (JrtzCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}
