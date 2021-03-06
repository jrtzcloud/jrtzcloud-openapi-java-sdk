package riskwarn.v20200521;

import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;
import com.jrtzcloudapi.riskwarn.v20200521.RiskWarnClient;
import com.jrtzcloudapi.riskwarn.v20200521.models.DescribeStockRiskInfoRequest;
import com.jrtzcloudapi.riskwarn.v20200521.models.DescribeStockRiskInfoResponse;

public class DescribeStockRiskInfo {

    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
            Credential cred = new Credential(Constants.SECRET_ID, Constants.SECRET_KEY);

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("GET"); // GET请求，缺省值为POST请求
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒，缺省值为60秒
            httpProfile.setEndpoint("lyzt.test.investoday.net"); // 此为测试域名，缺省值为生产域名

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品的client对象，clientProfile是可选的
            RiskWarnClient client = new RiskWarnClient(cred, clientProfile);

            // 实例化一个client实例信息查询请求对象，每个接口都会对应一个request对象。
            DescribeStockRiskInfoRequest req = new DescribeStockRiskInfoRequest();

            // 填充请求参数，这里request对象的成员变量即对应接口的入参
            req.setStockCode("000100");

            // 通过client对象发起请求，注意请求方法名与请求对象是对应的
            DescribeStockRiskInfoResponse resp = client.DescribeStockRiskInfo(req);

            System.out.println("\n" + DescribeStockRiskInfoResponse.toJsonString(resp));

            // 也可以取出单个值
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(resp.getRequestId());
        } catch (JrtzCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}
