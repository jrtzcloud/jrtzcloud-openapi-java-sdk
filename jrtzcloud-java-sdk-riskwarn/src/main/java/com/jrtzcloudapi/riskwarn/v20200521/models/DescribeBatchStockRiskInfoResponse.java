package com.jrtzcloudapi.riskwarn.v20200521.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;
import java.util.List;

@Deprecated
public class DescribeBatchStockRiskInfoResponse extends AbstractModel {

    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    @SerializedName("Data")
    @Expose
    private List<DescribeStockRiskInfoResponse> Data;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Data", this.Data);
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public List<DescribeStockRiskInfoResponse> getData() {
        return Data;
    }

    public void setData(List<DescribeStockRiskInfoResponse> data) {
        Data = data;
    }
}
