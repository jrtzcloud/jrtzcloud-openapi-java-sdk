package com.jrtzcloudapi.riskwarn.v20200521.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribeBatchStockRiskInfoRequest extends AbstractModel {
    /**
     * 用户自选股数组(多个用,隔开)
     */
    @SerializedName("StockCodeList")
    @Expose
    private String StockCodeList;


    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StockCodeList", this.StockCodeList);
    }

    public String getStockCodeList() {
        return StockCodeList;
    }

    public void setStockCodeList(String stockCodeList) {
        StockCodeList = stockCodeList;
    }
}
