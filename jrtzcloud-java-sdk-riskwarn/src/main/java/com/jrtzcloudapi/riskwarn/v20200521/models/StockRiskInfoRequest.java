package com.jrtzcloudapi.riskwarn.v20200521.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;
import java.util.List;

/**
 * @Author Drx
 * @Date 2020/5/19
 * @Description
 * @Email hjx8862825@hotmail.com
 * PS: Please tell me if you find any bugs ^_^
 **/
public class StockRiskInfoRequest extends AbstractModel {
    /**
     * 用户自选股数组
     */
    @SerializedName("stockCode")
    @Expose
    private String stockCode;


    @Override
    protected void toMap(HashMap<String, String> hashMap, String s) {

    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }
}
