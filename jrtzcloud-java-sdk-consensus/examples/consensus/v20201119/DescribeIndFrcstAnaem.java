package consensus.v20201119;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;
import com.jrtzcloudapi.consensus.v20201119.ConsensusClient;
import com.jrtzcloudapi.consensus.v20201119.models.DescribeIndFrcstAnaemRequest;
import com.jrtzcloudapi.consensus.v20201119.models.DescribeResponse;

import java.util.List;
import java.util.stream.Collectors;

public class DescribeIndFrcstAnaem {

    private static Integer RPTYRCOUNT = 0;
    private static Integer DEV = 0;
    private static Integer PROD = 1;

//    private static Integer ENV = DEV;
    private static Integer ENV = PROD;

    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
            Credential cred = new Credential(Constants.SECRET_ID, Constants.SECRET_KEY);
            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            if (ENV == DEV) httpProfile.setProtocol(HttpProfile.REQ_HTTP);
            httpProfile.setReqMethod(HttpProfile.REQ_GET); // (默认为POST请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("localhost:8361"); // 指定接入地域域名(默认就近接入)
//            httpProfile.setEndpoint("lyzt.dev.investoday.net"); // 指定接入地域域名(默认就近接入)
            if (ENV == PROD) httpProfile.setEndpoint("dataapi.investoday.net"); // 指定接入地域域名(默认就近接入)

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品的client对象,clientProfile是可选的
            ConsensusClient client = new ConsensusClient(cred, clientProfile);
            Integer page = 1;
            Boolean next = singleRequest(client, page);
            while (next) {
                page += 1;
                next = singleRequest(client, page);
            }
            System.out.println("rptYrCount=> "+ RPTYRCOUNT);

        } catch (JrtzCloudSDKException e) {
            System.out.println(e.toString());
        }
    }

    private static Boolean singleRequest(ConsensusClient client, Integer page) throws JrtzCloudSDKException {
        // 实例化一个cvm实例信息查询请求对象,每个接口都会对应一个request对象。
        DescribeIndFrcstAnaemRequest req = new DescribeIndFrcstAnaemRequest();

        // 填充请求参数,这里request对象的成员变量即对应接口的入参
        // 你可以通过官网接口文档或跳转到request对象的定义处查看请求参数的定义
        req.setBeginDate("20190531");
        req.setEndDate("20190531");
        req.setSecCd("399106");
        req.setOperType(1);
        req.setRptRang(1);
//        req.setRptYr(2019);
        req.setPageNo(page);
        req.setPageSize(1000);


        // 这里还支持以标准json格式的string来赋值请求参数的方式。下面的代码跟上面的参数赋值是等效的
//            String params = "{\"RiskN\":1,\"StartDate\":\"1919-08-22\",\"EndDate\":\"2030-02-22\"}";
//            req = DescribeModelDataRequest.fromJsonString(params, DescribeModelDataRequest.class);

        /**
         * 通过client对象调用 DescribeIndFrcstAnaem 方法发起请求。注意请求方法名与请求对象是对应的
         * 返回的resp是一个 DescribeResponse 类的实例，与请求对象对应
         */
        DescribeResponse resp = client.DescribeIndFrcstAnaem(req);

        // 输出json格式的字符串回包
//            System.out.println("SUCCESS==>\n" + DescribeResponse.toJsonString(resp));
        System.out.println("SUCCESS ==> " + resp.getData().size());
        List<JsonArray> data = resp.getData();

        List<JsonArray> rptYrList = data.stream().filter(k -> k.get(3).getAsInt() == 2019).collect(Collectors.toList());

        System.out.println("rptYrList ==> " + rptYrList.size());
        RPTYRCOUNT += rptYrList.size();

        // 也可以取出单个值。
        // 你可以通过官网接口文档或跳转到response对象的定义处查看返回字段的定义
        System.out.println(resp.getPageNo() + " === " + resp.getHasNextPage());
        return resp.getHasNextPage();
    }
}
