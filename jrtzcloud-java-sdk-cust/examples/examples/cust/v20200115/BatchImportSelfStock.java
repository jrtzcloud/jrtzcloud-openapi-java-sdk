package examples.cust.v20200115;

// 导入对应产品模块的client

// 导入要请求接口对应的request response类

import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;
import com.jrtzcloudapi.cust.v20200115.CustClient;
import com.jrtzcloudapi.cust.v20200115.models.BatchImportSelfStockRequest;
import com.jrtzcloudapi.cust.v20200115.models.BatchImportSelfStockResponse;
import com.jrtzcloudapi.cust.v20200115.models.entity.SelfStockList;

import java.util.ArrayList;
import java.util.List;

public class BatchImportSelfStock {

    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
//            Credential cred = new Credential(Constants.SECRET_ID, Constants.SECRET_KEY);
            Credential cred = new Credential("04qquIswFv6GskjwLS1vsABdyePIwxI7", "uiCBZEjYuK8XhTk9bjYdx73h3ZZsa1wy");

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("lyzt.test.investoday.net"); // 指定接入地域域名(默认就近接入)

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品(以cust为例)的client对象,clientProfile是可选的
            CustClient client = new CustClient(cred, clientProfile);

            //入参：1、添加多只股票
            List<String> stockList = new ArrayList<String>();
            stockList.add("000001");
            stockList.add("000002");
            stockList.add("600000");

            //入参：2、添加多个C端用户
            SelfStockList userSelfStock = new SelfStockList();
            userSelfStock.setAccountId("10000009");//用户1
            userSelfStock.setStockCode(stockList);
            SelfStockList userSelfStock2 = new SelfStockList();
            userSelfStock2.setAccountId("10123");//用户2
            userSelfStock2.setStockCode(stockList);

            List<SelfStockList> selfStockList = new ArrayList<SelfStockList>();
            selfStockList.add(userSelfStock);//添加第1个用户
            selfStockList.add(userSelfStock2);//添加第2个用户

            //。。。。。。 添加第N个用户

            // 实例化一个cust client实例信息查询请求对象,每个接口都会对应一个request对象。
            BatchImportSelfStockRequest req = new BatchImportSelfStockRequest();

            // 填充请求参数,这里request对象的成员变量即对应接口的入参
            req.setSelfStockLists(selfStockList);

            //通过client对象调用 BatchImportSelfStock 方法发起请求。注意请求方法名与请求对象是对应的
            //返回的resp是一个 BatchImportSelfStockResponse 类的实例，与请求对象对应
            BatchImportSelfStockResponse resp = client.BatchImportSelfStock(req);

            // 输出json格式的字符串回包
            System.out.println("SUCCESS==>\n" + BatchImportSelfStockResponse.toJsonString(resp));

            // 也可以取出单个值。
            // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
            System.out.println(resp.getRequestId());
        } catch (JrtzCloudSDKException e) {
            e.printStackTrace();
        }
    }
}
