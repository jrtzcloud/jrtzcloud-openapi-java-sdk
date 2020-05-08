package com.jrtzcloudapi.cust.v20200115.models.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;
import java.util.List;

public class SelfStockList extends AbstractModel {

    /**
     * 券商系统内部C用户唯一Id
     */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * 股票代码
     */
    @SerializedName("StockCode")
    @Expose
    private List<String> StockCode;

    /**
     * Get 券商系统内部C用户唯一Id
     * @return 券商系统内部C用户唯一Id
     */
    public String getAccountId() {
        return AccountId;
    }

    /**
     * Set 券商系统内部C用户唯一Id
     * @param AccountId 券商系统内部C用户唯一Id
     */
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    /**
     * Get 股票代码
     * @return 股票代码
     */
    public List<String> getStockCode() {
        return StockCode;
    }

    /**
     * Set 股票代码
     * @param StockCode 股票代码
     */
    public void setStockCode(List<String> StockCode) {
        this.StockCode = StockCode;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "StockCode", this.StockCode);
    }
}
