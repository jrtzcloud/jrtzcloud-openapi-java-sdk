package com.jrtzcloudapi.cust.v20200115.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;
import com.jrtzcloudapi.cust.v20200115.models.entity.SelfStockList;

import java.util.HashMap;
import java.util.List;

public class BatchImportSelfStockRequest extends AbstractModel {

    /**
     * 券商id
     */
    //@SerializedName("AppId")
    //@Expose
    //private String AppId;

    /**
     * 用户自选股数组
     */
    @SerializedName("SelfStockLists")
    @Expose
    private List<SelfStockList> SelfStockLists;

    /**
     * Get 券商Id，今日投资分配给券商的id
     * @return 券商Id，今日投资分配给券商的id
     */
    //public String getAppId() {
    //    return AppId;
    //}

    /**
     * Set 券商Id，今日投资分配给券商的id
     * @param AppId 券商Id，今日投资分配给券商的id
     */
    //public void setAppId(String AppId) {
    //    this.AppId = AppId;
    //}

    /**
     * Get 用户自选股数组
     * @return 用户自选股数组
     */
    public List<SelfStockList> getSelfStockLists() {
        return SelfStockLists;
    }

    /**
     * Set 用户自选股数组
     * @param SelfStockLists 用户自选股数组
     */
    public void setSelfStockLists(List<SelfStockList> SelfStockLists) {
        this.SelfStockLists = SelfStockLists;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        //this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "SelfStockLists", this.SelfStockLists);
    }
}
