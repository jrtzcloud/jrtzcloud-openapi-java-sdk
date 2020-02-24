package com.jrtzcloudapi.blten.v20191119;

import com.jrtzcloudapi.blten.v20191119.models.ProjectResponse;
import com.jrtzcloudapi.common.Constants;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;

public class DescribeProject {
    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
            Credential cred = new Credential(Constants.SECRET_ID, Constants.SECRET_KEY);

            String projectId = "f863b416-06be-11ea-b4e9-000c2947adc4";

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod(HttpProfile.REQ_GET); // (默认为POST请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("blten.jrtzcloud.cn"); // 指定接入地域域名(默认就近接入)

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品(以blten为例)的client对象,clientProfile是可选的
            BltenClient client = new BltenClient(cred, "ap-shenzhen", clientProfile, "/blten/projects/" + projectId);

            /**
             * 通过client对象调用 DescribeProject 方法发起请求。注意请求方法名与请求对象是对应的
             * 返回的resp是一个 ProjectResponse 类的实例，与请求对象对应
             */
            ProjectResponse resp = client.DescribeProject();

            // 输出json格式的字符串回包
            System.out.println("SUCCESS==>\n" + ProjectResponse.toJsonString(resp));

            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(resp.getRequestId());
        } catch (JrtzCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}
