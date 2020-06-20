package com.jrtzcloudapi.riskwarn.v20200521.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribeRiskStockCountResponse extends AbstractModel {

    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    @SerializedName("Zero")
    @Expose
    private Integer Zero;

    @SerializedName("One")
    @Expose
    private Integer One;

    @SerializedName("Two")
    @Expose
    private Integer Two;

    @SerializedName("Three")
    @Expose
    private Integer Three;

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public Integer getZero() {
        return Zero;
    }

    public void setZero(Integer zero) {
        Zero = zero;
    }

    public Integer getOne() {
        return One;
    }

    public void setOne(Integer one) {
        One = one;
    }

    public Integer getTwo() {
        return Two;
    }

    public void setTwo(Integer two) {
        Two = two;
    }

    public Integer getThree() {
        return Three;
    }

    public void setThree(Integer three) {
        Three = three;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Zero", this.Zero);
        this.setParamSimple(map, prefix + "One", this.One);
        this.setParamSimple(map, prefix + "Two", this.Two);
        this.setParamSimple(map, prefix + "Three", this.Three);
    }

}
