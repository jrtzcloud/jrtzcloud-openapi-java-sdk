package com.jrtzcloudapi.sdp.v20200115.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class SetProdUserRightRequest extends AbstractModel {

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
     * 系统产品Id
     */
    @SerializedName("ProdId")
    @Expose
    private String ProdId;

    /**
     * 权益标识位，0 关 1 开
     */
    @SerializedName("Flag")
    @Expose
    private Integer Flag;

    public String getAccountId() {
        return AccountId;
    }
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    public String getAppId() {
        return AppId;
    }
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    public String getProdId() {
        return ProdId;
    }
    public void setProdId(String StockCode) {
        this.ProdId = ProdId;
    }

    public Integer getFlag() {
        return Flag;
    }
    public void setFlag(Integer Flag) {
        this.Flag = Flag;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "ProdId", this.ProdId);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
    }
}
