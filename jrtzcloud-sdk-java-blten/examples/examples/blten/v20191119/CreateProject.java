package examples.blten.v20191119;

import com.jrtzcloudapi.blten.v20191119.BltenClient;
import com.jrtzcloudapi.blten.v20191119.models.CreateProjectRequest;
import com.jrtzcloudapi.blten.v20191119.models.ProjectResponse;
import com.jrtzcloudapi.blten.v20191119.models.entity.Model;
import com.jrtzcloudapi.blten.v20191119.models.entity.OriginalExpRtnDict;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;

public class CreateProject {
    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
            Credential cred = new Credential(Constants.SECRET_ID, Constants.SECRET_KEY);

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod(HttpProfile.REQ_POST); // (默认为POST请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("blten.jrtzcloud.cn"); // 指定接入地域域名(默认就近接入)

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品(以blten为例)的client对象,clientProfile是可选的
            BltenClient client = new BltenClient(cred, "ap-shenzhen", clientProfile, "/blten/projects");

            // 实例化一个cvm实例信息查询请求对象,每个接口都会对应一个request对象。
            CreateProjectRequest req = new CreateProjectRequest();

            // 填充请求参数,这里request对象的成员变量即对应接口的入参
            // 你可以通过官网接口文档或跳转到request对象的定义处查看请求参数的定义
            Model model = new Model();
            OriginalExpRtnDict originalExpRtnDict = new OriginalExpRtnDict();
            model.setOriginalExpRtnDict(originalExpRtnDict);
            req.setModel(model);
            req.setStartDate("2019-11-11");
            req.setStopDate("2019-11-13");

            // 这里还支持以标准json格式的string来赋值请求参数的方式。下面的代码跟上面的参数赋值是等效的
            String params = "{\"Model\": {\"AssetList\": [\"ASHARE\", \"USSHARE\", \"HKSHARE\", \"ABS_RETURN\", \"OIL\", \"GOLD\", \"TREASURY\", \"CN_CREDIT\", \"GLOBAL_DEBT\", \"CASH\"], \"OriginalExpRtnDict\": {\"ASHARE\": 0.12, \"USSHARE\": 0.082, \"HKSHARE\": 0.082, \"ABS_RETURN\": 0.045, \"OIL\": 0.085, \"GOLD\": 0.06, \"CN_CREDIT\": 0.045, \"TREASURY\": 0.042, \"GLOBAL_DEBT\": 0.04, \"CASH\": 0.03}, \"BoundaryDict\": {\"ASHARE\": [0, 1.0], \"USSHARE\": [0, 1.0], \"HKSHARE\": [0, 1.0], \"ABS_RETURN\": [0, 0.1], \"OIL\": [0, 1.0], \"GOLD\": [0, 1.0], \"TREASURY\": [0.03, 1.0], \"CN_CREDIT\": [0, 1.0], \"GLOBAL_DEBT\": [0.0, 1.0], \"CASH\": [0.02, 1.0]}, \"ConstrainList\": [[\"ineq\", \"(0.3 * ASHARE) - USSHARE\"]]}, \"StartDate\": \"2019-10-01\", \"StopDate\": \"2019-11-11\"}";
            req = CreateProjectRequest.fromJsonString(params, CreateProjectRequest.class);

            /**
             * 通过client对象调用 CreateProject 方法发起请求。注意请求方法名与请求对象是对应的
             * 返回的resp是一个 ProjectResponse 类的实例，与请求对象对应
             */
            ProjectResponse resp = client.CreateProject(req);

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
