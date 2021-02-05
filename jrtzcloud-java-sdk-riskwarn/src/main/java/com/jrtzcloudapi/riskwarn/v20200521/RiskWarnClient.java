package com.jrtzcloudapi.riskwarn.v20200521;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.jrtzcloudapi.common.AbstractClient;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.riskwarn.v20200521.models.*;

import java.lang.reflect.Type;

public class RiskWarnClient extends AbstractClient {

    private static String endPoint = "lyzt.investoday.net";
    private static String version = "2019-11-19";

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
        DescribeStockRiskInfoResponse rsp;
        try {
            Type type = new TypeToken<DescribeStockRiskInfoResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "GetStockRiskInfo", "/riskwarn/stocks/"+ req.getStockCode() +"/composite-risk"), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }

    /**
     * 批量获取多股票风险信息
     */
    @Deprecated
    public DescribeBatchStockRiskInfoResponse DescribeBatchStockRiskInfo(DescribeBatchStockRiskInfoRequest req) throws JrtzCloudSDKException {
        DescribeBatchStockRiskInfoResponse rsp;
        try {
            Type type = new TypeToken<DescribeBatchStockRiskInfoResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "DescribeBatchStockRiskInfo", "/riskwarn/stocks/composite-risks"), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }

    /**
     * 批量获取多股票风险信息 V2
     */
    public DescribeResponse DescribeBatchStockRiskInfoV2(DescribeBatchStockRiskInfoRequest req) throws JrtzCloudSDKException {
        DescribeResponse rsp;
        try {
            Type type = new TypeToken<DescribeResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "DescribeBatchStockRiskInfoV2", "/riskwarn/stocks/integrated-risks"), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }

    /**
     * 获取全市场风险股票总数
     */
    public DescribeRiskStockCountResponse DescribeRiskStockCount() throws JrtzCloudSDKException {
        DescribeRiskStockCountResponse rsp;
        try {
            Type type = new TypeToken<DescribeRiskStockCountResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalGetRequest("GetRiskStockCount", "/riskwarn/stocks/risk-stock-count"), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }

    /**
     * 分页获取股票风险信息
     */
    public DescribeResponse DescribePageStockRiskInfo(DescribePageStockRiskInfoRequest req) throws JrtzCloudSDKException {
        if(req.getPageNo() == null || req.getPageNo() <= 0) req.setPageNo(1);
        if(req.getPageSize() == null || req.getPageSize() <= 0) req.setPageSize(10);

        String url = new StringBuffer("/riskwarn/stocks/composite-risks/").append(req.getPageNo()).append("/").append(req.getPageSize()).toString();
        DescribeResponse rsp;
        try {
            Type type = new TypeToken<DescribeResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "DescribePageStockRiskInfo", url), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }

}
