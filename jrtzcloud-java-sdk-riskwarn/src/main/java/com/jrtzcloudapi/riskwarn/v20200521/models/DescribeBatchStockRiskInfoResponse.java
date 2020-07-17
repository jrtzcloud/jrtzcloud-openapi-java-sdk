package com.jrtzcloudapi.riskwarn.v20200521.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;
import riskwarn.v20200521.DescribeStockRiskInfo;

import java.util.HashMap;
import java.util.List;

/**
 * @Author Drx
 * @Date 2020/7/9
 * @Description
 * @Email hjx8862825@hotmail.com
 * PS: Please tell me if you find any bugs ^_^
 **/
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
