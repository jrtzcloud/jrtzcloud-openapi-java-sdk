package com.jrtzcloudapi.vip.v20200722;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.jrtzcloudapi.common.AbstractClient;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.vip.v20200722.models.*;

import java.lang.reflect.Type;

public class VipClient extends AbstractClient {

    private static String endPoint = "lyzt.investoday.net";
    private static String version = "2019-11-19";

    private static final String DEFAULT_REGION = "ap-shenzhen";

    public VipClient(Credential credential) {
        super(endPoint, version, credential, DEFAULT_REGION, new ClientProfile());
    }

    public VipClient(Credential credential, String region) {
        super(endPoint, version, credential, region, new ClientProfile());
    }

    public VipClient(Credential credential, ClientProfile profile) {
        super(endPoint, version, credential, DEFAULT_REGION, profile);
    }


    public VipClient(Credential credential, String region, ClientProfile profile) {
        super(endPoint, version, credential, region, profile);
    }

    /**
     * 趋势信号灯--查看每日最新信号
     */
    public DescribeTrendLightNewSignalResponse DescribeTrendLightNewSignal(DescribeTrendLightNewSignalRequest req) throws JrtzCloudSDKException {
        DescribeTrendLightNewSignalResponse rsp = null;
        try {
            Type type = new TypeToken<DescribeTrendLightNewSignalResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "NewTrendLight", "/vip/trendlight/new-trend-light"), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }

    /**
     * 九三反转--查看每日最新信号
     */
    public DescribeTD9NewsignalResponse DescribeTD9NewSignal(DescribeTD9NewsignalRequest req) throws JrtzCloudSDKException {
        DescribeTD9NewsignalResponse rsp = null;
        try {
            Type type = new TypeToken<DescribeTD9NewsignalResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "SignalNew", "/vip/td9/signal-new"), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }
}
