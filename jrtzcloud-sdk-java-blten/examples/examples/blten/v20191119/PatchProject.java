package examples.blten.v20191119;

import com.jrtzcloudapi.blten.v20191119.BltenClient;
import com.jrtzcloudapi.blten.v20191119.models.PatchProjectRequest;
import com.jrtzcloudapi.blten.v20191119.models.ProjectResponse;
import com.jrtzcloudapi.blten.v20191119.models.entity.Patch;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.common.profile.HttpProfile;

public class PatchProject {
    public static void main(String[] args) {
        try {
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
            Credential cred = new Credential(Constants.SECRET_ID, Constants.SECRET_KEY);

            String projectId = "bd883110-795e-11ea-a022-b6e29aad7c9c";

            // 实例化一个http选项，可选的，没有特殊需求可以跳过
            HttpProfile httpProfile = new HttpProfile();
            httpProfile.setReqMethod(HttpProfile.REQ_PATCH); // (默认为POST请求)
            httpProfile.setConnTimeout(30); // 请求连接超时时间，单位为秒(默认60秒)
            httpProfile.setEndpoint("blten.jrtzcloud.cn"); // 指定接入地域域名(默认就近接入)

            // 实例化一个client选项，可选的，没有特殊需求可以跳过
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setHttpProfile(httpProfile);

            // 实例化要请求产品(以blten为例)的client对象,clientProfile是可选的
            BltenClient client = new BltenClient(cred, "ap-shenzhen", clientProfile, "/blten/projects/" + projectId);

            // 实例化一个cvm实例信息查询请求对象,每个接口都会对应一个request对象。
            PatchProjectRequest req = new PatchProjectRequest();

            // 填充请求参数,这里request对象的成员变量即对应接口的入参
            // 你可以通过官网接口文档或跳转到request对象的定义处查看请求参数的定义
            Float[] floats = new Float[2];
            floats[0] = 0f;
            floats[1] = 0.2f;
//            Patch patch1 = new Patch("/Model/BoundaryDict/ABS_RETURN", floats);
//            Patch patch2 = new Patch("/Model/ConstrainList/0/1", "(0.2 * ASHARE) - USSHARE");
            Patch patch3 = new Patch("/StartDate","2020-03-09");
            Patch patch4 = new Patch("/StopDate","2029-09-02");
            req.setPatch(new Patch[]{patch3,patch4});

            // 这里还支持以标准json格式的string来赋值请求参数的方式。下面的代码跟上面的参数赋值是等效的
            String params = "{\"Patch\": [{\"op\": \"replace\", \"path\": \"/Model\", \"value\": {\"AssetList\": [\"ASHARE\", \"USSHARE\", \"HKSHARE\", \"ABS_RETURN\", \"OIL\", \"GOLD\", \"TREASURY\", \"CN_CREDIT\", \"GLOBAL_DEBT\", \"CASH\"], \"OriginalExpRtnDict\": {\"ASHARE\": 0.12, \"USSHARE\": 0.082, \"HKSHARE\": 0.082, \"ABS_RETURN\": 0.045, \"OIL\": 0.085, \"GOLD\": 0.06, \"CN_CREDIT\": 0.045, \"TREASURY\": 0.042, \"GLOBAL_DEBT\": 0.04, \"CASH\": 0.03}, \"BoundaryDict\": {\"ASHARE\": [0, 1.0], \"USSHARE\": [0, 1.0], \"HKSHARE\": [0, 1.0], \"ABS_RETURN\": [0, 0.1], \"OIL\": [0, 1.0], \"GOLD\": [0, 1.0], \"TREASURY\": [0.03, 1.0], \"CN_CREDIT\": [0, 1.0], \"GLOBAL_DEBT\": [0.0, 1.0], \"CASH\": [0.02, 1.0]}, \"ConstrainList\": [[\"ineq\", \"(0.3 * ASHARE) - USSHARE\"]]}}, {\"op\": \"replace\", \"path\": \"/StartDate\", \"value\": \"2019-09-01\"}, {\"op\": \"replace\", \"path\": \"/StopDate\", \"value\": \"2029-09-01\"}]}";
//            req = PatchProjectRequest.fromJsonString(params, PatchProjectRequest.class);

            /**
             * 通过client对象调用 PatchProject 方法发起请求。注意请求方法名与请求对象是对应的
             * 返回的resp是一个 ProjectResponse 类的实例，与请求对象对应
             */
            ProjectResponse resp = client.PatchProject(req);

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
