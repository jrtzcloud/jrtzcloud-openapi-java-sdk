package com.jrtzcloudapi.riskwarn.v20200521.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;
import java.util.List;

public class DescribeStockRiskInfoRequest extends AbstractModel {
    /**
     * 用户自选股数组
     */
    @SerializedName("StockCode")
    @Expose
    private String StockCode;


    @Override
    protected void toMap(HashMap<String, String> hashMap, String s) {

    }

    public String getStockCode() {
        return StockCode;
    }

    public void setStockCode(String StockCode) {
        this.StockCode = StockCode;
    }
}
