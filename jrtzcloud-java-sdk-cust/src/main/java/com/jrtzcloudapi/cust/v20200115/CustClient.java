package com.jrtzcloudapi.cust.v20200115;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.jrtzcloudapi.common.AbstractClient;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.cust.v20200115.models.*;

import java.lang.reflect.Type;

public class CustClient extends AbstractClient {
    private static String endpoint = "lyzt.investoday.net";
    private static String version = "2020-01-15";

    public CustClient(Credential credential, String region, String path) {
        this(credential, region, new ClientProfile(), path);
    }

    public CustClient(Credential credential, String region, ClientProfile profile,
                      String path) {
        super(  CustClient.endpoint,
                CustClient.version,
                credential, region, profile, path);
    }

    /**
     * 批量导入自选股信息
     */
    public BatchImportSelfStockResponse BatchImportSelfStock(BatchImportSelfStockRequest req) throws JrtzCloudSDKException {
        BatchImportSelfStockResponse rsp = null;
        try {
            Type type = new TypeToken<BatchImportSelfStockResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "BatchImportSelfStock"), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }

}
