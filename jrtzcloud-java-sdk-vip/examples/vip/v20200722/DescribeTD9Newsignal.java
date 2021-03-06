package vip.v20200722;

import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;
import com.jrtzcloudapi.vip.v20200722.VipClient;
import com.jrtzcloudapi.vip.v20200722.models.DescribeTD9NewsignalRequest;
import com.jrtzcloudapi.vip.v20200722.models.DescribeTD9NewsignalResponse;

public class DescribeTD9Newsignal {

    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
            Credential cred = new Credential(Constants.SECRET_ID, Constants.SECRET_KEY);

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod("GET"); // get请求(默认为post请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("lyzt.test.investoday.net"); // 指定接入地域域名(默认就近接入)

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品的client对象,clientProfile是可选的
            VipClient client = new VipClient(cred, clientProfile);

            // 实例化一个client实例信息查询请求对象,每个接口都会对应一个request对象。
            DescribeTD9NewsignalRequest req = new DescribeTD9NewsignalRequest();

            // 填充请求参数,这里request对象的成员变量即对应接口的入参
            req.setStockType(1);//股票筛选范围(1: 全市场,  2: 自选股)，这里统一使用1: 全市场
            req.setSignalModel(1);//信号类型 (1: 9转,  2: 13转,  0: 全部)
            //req.setSignalFlag(1);//信号状态 (1: 抄底,  -1: 见顶,  0: 无信号 )
            req.setPageSize(10);
            req.setPageNumber(1);

            // 通过client对象调用 DescribeStockRiskInfo 方法发起请求。注意请求方法名与请求对象是对应的
            // 返回的resp是一个 DescribeStockRiskInfoResponse 类的实例，与请求对象对应
            DescribeTD9NewsignalResponse resp = client.DescribeTD9NewSignal(req);

            System.out.println("\n" + DescribeTD9NewsignalResponse.toJsonString(resp));

            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(resp.getRequestId());
        } catch (JrtzCloudSDKException e) {
            System.out.println(e.toString());
        }
    }
}
