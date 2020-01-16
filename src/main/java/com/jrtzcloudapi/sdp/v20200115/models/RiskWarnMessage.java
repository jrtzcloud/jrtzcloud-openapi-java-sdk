package com.jrtzcloudapi.sdp.v20200115.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class RiskWarnMessage extends AbstractModel {

    @SerializedName("StockCode")
    @Expose
    private String StockCode;

    @SerializedName("StockName")
    @Expose
    private String StockName;

    @SerializedName("RiskTypeList")
    @Expose
    private String [] RiskTypeList;

    public String getStockCode() {
        return StockCode;
    }

    public void setStockCode(String StockCode) {
        StockCode = StockCode;
    }

    public String getStockName() {
        return StockName;
    }

    public void setStockName(String StockName) {
        StockName = StockName;
    }

    public String[] getRiskTypeList() {
        return RiskTypeList;
    }

    public void setRiskTypeList(String[] RiskTypeList) {
        RiskTypeList = RiskTypeList;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StockCode", this.StockCode);
        this.setParamSimple(map, prefix + "StockName", this.StockName);
        this.setParamSimple(map, prefix + "RiskTypeList", this.RiskTypeList);
    }
}
