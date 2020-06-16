package com.jrtzcloudapi.riskwarn.v20200521.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribeRiskStockCountResponse extends AbstractModel {

    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    @SerializedName("RiskStockCount")
    @Expose
    private Integer RiskStockCount;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public Integer getCount() {
        return RiskStockCount;
    }

    public void setCount(Integer count) {
        this.RiskStockCount = count;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RiskStockCount", this.RiskStockCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
    }

}
