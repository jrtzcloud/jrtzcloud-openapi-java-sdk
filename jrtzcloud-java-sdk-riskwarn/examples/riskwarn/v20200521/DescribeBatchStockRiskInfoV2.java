package riskwarn.v20200521;

import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;
import com.jrtzcloudapi.riskwarn.v20200521.RiskWarnClient;
import com.jrtzcloudapi.riskwarn.v20200521.models.DescribeBatchStockRiskInfoRequest;
import com.jrtzcloudapi.riskwarn.v20200521.models.DescribeResponse;

public class DescribeBatchStockRiskInfoV2 {

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

            // 实例化要请求产品的client对象,clientProfile是可选的
            RiskWarnClient client = new RiskWarnClient(cred, clientProfile);

            // 实例化一个client实例信息查询请求对象,每个接口都会对应一个request对象。
            DescribeBatchStockRiskInfoRequest req = new DescribeBatchStockRiskInfoRequest();

            // 填充请求参数,这里request对象的成员变量即对应接口的入参
            req.setStockCodeList("600220,600909,300724,600503,600009,000001,600004,601390,600018,600030,600036,600177,600284," +
                    "601599,002566,300222,000651,600696,600730,600760,600936,601988,603518,603858,000750,002426,002747,002763," +
                    "300413,300433,300455,002538,300038,300042,300329,002218,300370,300618,600000,000728,002137,300001,600111," +
                    "600971,000608,000630,603843,000078,002064,002322,600452,000411,000687,300349,600104,600138,600278,600648," +
                    "600716,600750,600789,601166,601169,603228,000623,000901,002051,600006,300007,300002,300003,300004,300005," +
                    "300006,300008,300009,600007,600008,600200,002001,002002,002003,002004,002005,601000,601001,601002,601003," +
//                    "601005,601006,601007," +
                    "603833,600050,600481,600761,600900,600963,600981,601985,603819,000417,000521,000543");
            req.setFields("StockCode,PubDate,DebtPayingRisk");

            // 通过client对象调用 DescribeStockRiskInfo 方法发起请求。注意请求方法名与请求对象是对应的
            // 返回的resp是一个 DescribeBatchStockRiskInfoResponse 类的实例，与请求对象对应
            DescribeResponse resp = client.DescribeBatchStockRiskInfoV2(req);

            System.out.println("\n" + DescribeResponse.toJsonString(resp));

            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(resp.getRequestId());
        } catch (JrtzCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}
