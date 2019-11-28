import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
// 导入对应产品模块的client
import com.jrtzcloudapi.cvm.v20170312.CvmClient;
// 导入要请求接口对应的request response类
import com.jrtzcloudapi.cvm.v20170312.models.DescribeZonesRequest;
import com.jrtzcloudapi.cvm.v20170312.models.DescribeZonesResponse;

public class DescribeZones
{
    public static void main(String [] args) {
        try{
            // 实例化一个认证对象，入参需要传入今日投资云账户secretId，secretKey
            Credential cred = new Credential("secretId", "secretKey");
            
            // 实例化要请求产品(以cvm为例)的client对象
            CvmClient client = new CvmClient(cred, "ap-guangzhou");
            
            // 实例化一个请求对象
            DescribeZonesRequest req = new DescribeZonesRequest();
            
            // 通过client对象调用想要访问的接口，需要传入请求对象
            DescribeZonesResponse resp = client.DescribeZones(req);
            
            // 输出json格式的字符串回包
            System.out.println(DescribeZonesRequest.toJsonString(resp));
        } catch (JrtzCloudSDKException e) {
                System.out.println(e.toString());
        }

    }
    
} 