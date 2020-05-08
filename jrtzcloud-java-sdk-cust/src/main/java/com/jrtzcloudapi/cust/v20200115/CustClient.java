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

    private static final String DEFAULT_REGION = "ap-shenzhen";
    private static final String BATCH_IMPORT_SELFSTOCK_PATH = "/cust/customers/self-stocks";

    public CustClient(Credential credential) {
        this(credential, DEFAULT_REGION, new ClientProfile());
    }

    public CustClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public CustClient(Credential credential, ClientProfile profile) {
        super(CustClient.endpoint, CustClient.version, credential, DEFAULT_REGION, profile);
    }

    public CustClient(Credential credential, String region, ClientProfile profile) {
        super(CustClient.endpoint, CustClient.version, credential, region, profile);
    }

    /**
     * 批量导入自选股信息
     */
    public BatchImportSelfStockResponse BatchImportSelfStock(BatchImportSelfStockRequest req) throws JrtzCloudSDKException {
        BatchImportSelfStockResponse rsp = null;
        try {
            Type type = new TypeToken<BatchImportSelfStockResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "BatchImportSelfStock", BATCH_IMPORT_SELFSTOCK_PATH), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }

}
