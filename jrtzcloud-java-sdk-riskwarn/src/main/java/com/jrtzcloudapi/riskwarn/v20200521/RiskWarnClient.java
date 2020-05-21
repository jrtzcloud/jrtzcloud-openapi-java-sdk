package com.jrtzcloudapi.riskwarn.v20200521;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.jrtzcloudapi.common.AbstractClient;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.riskwarn.v20200521.models.DescribeStockRiskInfoRequest;
import com.jrtzcloudapi.riskwarn.v20200521.models.DescribeStockRiskInfoResponse;

import java.lang.reflect.Type;

/**
 * @Author Drx
 * @Date 2020/5/19
 * @Description
 * @Email hjx8862825@hotmail.com
 * PS: Please tell me if you find any bugs ^_^
 **/
public class RiskWarnClient extends AbstractClient {

    private static String endPoint = "lyzt.investoday.net";
    private static String version = "2020-05-21";

    private static final String DEFAULT_REGION = "ap-shenzhen";

    public RiskWarnClient(Credential credential) {
        super(RiskWarnClient.endPoint, RiskWarnClient.version, credential, DEFAULT_REGION, new ClientProfile());
    }

    public RiskWarnClient(Credential credential, String region) {
        super(RiskWarnClient.endPoint, RiskWarnClient.version, credential, region, new ClientProfile());
    }

    public RiskWarnClient(Credential credential, ClientProfile profile) {
        super(RiskWarnClient.endPoint, RiskWarnClient.version, credential, DEFAULT_REGION, profile);
    }


    public RiskWarnClient(Credential credential, String region, ClientProfile profile) {
        super(RiskWarnClient.endPoint, RiskWarnClient.version, credential, region, profile);
    }

    /**
     * 获取单个股票风险信息
     */
    public DescribeStockRiskInfoResponse DescribeStockRiskInfo(DescribeStockRiskInfoRequest req) throws JrtzCloudSDKException {
        DescribeStockRiskInfoResponse rsp = null;
        try {
            Type type = new TypeToken<DescribeStockRiskInfoResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "GetStockRiskInfo", "/riskwarn/stocks/"+ req.getStockCode() +"/composite-risk"), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }

}
