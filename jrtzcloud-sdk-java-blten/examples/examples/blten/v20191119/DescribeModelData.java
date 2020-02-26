package examples.blten.v20191119;

import com.jrtzcloudapi.blten.v20191119.BltenClient;
import com.jrtzcloudapi.blten.v20191119.models.DescribeModelDataRequest;
import com.jrtzcloudapi.blten.v20191119.models.DescribeModelDataResponse;
import com.jrtzcloudapi.blten.v20191119.models.ProjectResponse;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;

public class DescribeModelData {
    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
            Credential cred = new Credential(Constants.SECRET_ID, Constants.SECRET_KEY);

            String projectId = "4987324e-577a-11ea-a43a-c60aaec77637";

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod(HttpProfile.REQ_GET); // (默认为POST请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("blten.jrtzcloud.cn"); // 指定接入地域域名(默认就近接入)

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品(以blten为例)的client对象,clientProfile是可选的
            BltenClient client = new BltenClient(cred, "ap-shenzhen", clientProfile, "/blten/model-data/projects/" + projectId);

            // 实例化一个cvm实例信息查询请求对象,每个接口都会对应一个request对象。
            DescribeModelDataRequest req = new DescribeModelDataRequest();

            // 填充请求参数,这里request对象的成员变量即对应接口的入参
            // 你可以通过官网接口文档或跳转到request对象的定义处查看请求参数的定义
            req.setStartDate("2019-08-22");
            req.setEndDate("2020-02-22");
            req.setRiskN(1);

            /**
             * 通过client对象调用 DescribeModelData 方法发起请求。注意请求方法名与请求对象是对应的
             * 返回的resp是一个 DescribeModelDataResponse 类的实例，与请求对象对应
             */
            DescribeModelDataResponse resp = client.DescribeModelData(req);

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
