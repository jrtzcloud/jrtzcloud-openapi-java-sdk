package com.jrtzcloudapi.sdp.v20200115;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.jrtzcloudapi.common.AbstractClient2;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.sdp.v20200115.models.GetAllRiskWarnMessageRequest;
import com.jrtzcloudapi.sdp.v20200115.models.GetAllRiskWarnMessageResponse;

import java.lang.reflect.Type;

public class SdpClient extends AbstractClient2 {
    private static String endpoint = "sdp.investoday.net";
    private static String version = "2020-01-15";

    public SdpClient(Credential credential, String region, String path) {
        this(credential, region, new ClientProfile(), path);
    }

    public SdpClient(Credential credential, String region, ClientProfile profile,
                     String path) {
        super(  SdpClient.endpoint,
                SdpClient.version,
                credential, region, profile, path);
    }

    /**
     * 获取全量消息
     */
    public GetAllRiskWarnMessageResponse GetAllRiskWarnMessage(GetAllRiskWarnMessageRequest req) throws JrtzCloudSDKException {
        GetAllRiskWarnMessageResponse rsp = null;
        try {
            Type type = new TypeToken<GetAllRiskWarnMessageResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "GetAllRiskWarnMessage"), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }
}
