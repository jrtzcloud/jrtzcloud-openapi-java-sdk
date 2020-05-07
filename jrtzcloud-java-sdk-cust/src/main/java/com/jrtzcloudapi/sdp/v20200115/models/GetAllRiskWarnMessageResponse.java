package com.jrtzcloudapi.sdp.v20200115.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class GetAllRiskWarnMessageResponse extends AbstractModel {

    @SerializedName("Data")
    @Expose
    private RiskWarnMessage [] Data;

    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    public RiskWarnMessage[] getData() {
        return Data;
    }

    public void setData(RiskWarnMessage[] Data) {
        this.Data = Data;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
    }
}
