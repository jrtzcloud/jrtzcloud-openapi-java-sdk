package com.jrtzcloudapi.sdp.v20200115.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class SetSelfStockRequest extends AbstractModel {

    /**
     * 券商系统内部C用户唯一Id
     */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * 券商Id，今日投资分配给券商的id
     */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * 股票代码
     */
    @SerializedName("StockCode")
    @Expose
    private String StockCode;

    /**
     * 是否删除自选股标记 0 添加 1 删除
     */
    @SerializedName("IsDeleted")
    @Expose
    private Integer IsDeleted;

    /**
     * Get 是否删除自选股标记 0 添加 1 删除
     * @return 是否删除自选股标记 0 添加 1 删除
     */
    public Integer getIsDeleted() {
        return IsDeleted;
    }

    /**
     * Set 是否删除自选股标记 0 添加 1 删除
     * @param IsDeleted 是否删除自选股标记 0 添加 1 删除
     */
    public void setIsDeleted(Integer IsDeleted) {
        this.IsDeleted = IsDeleted;
    }

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
     * Get 券商Id，今日投资分配给券商的id
     * @return 券商Id，今日投资分配给券商的id
     */
    public String getAppId() {
        return AppId;
    }

    /**
     * Set 券商Id，今日投资分配给券商的id
     * @param AppId 券商Id，今日投资分配给券商的id
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get 股票代码
     * @return 股票代码
     */
    public String getStockCode() {
        return StockCode;
    }

    /**
     * Set 股票代码
     * @param StockCode 股票代码
     */
    public void setStockCode(String StockCode) {
        this.StockCode = StockCode;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDeleted", this.IsDeleted);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "StockCode", this.StockCode);
    }
}
