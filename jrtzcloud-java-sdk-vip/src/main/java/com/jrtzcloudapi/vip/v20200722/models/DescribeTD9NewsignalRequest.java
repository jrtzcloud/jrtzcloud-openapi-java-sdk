package com.jrtzcloudapi.vip.v20200722.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribeTD9NewsignalRequest extends AbstractModel {
    /**
     * 股票筛选范围(1: 全市场,  2: 自选股)
     */
    @SerializedName("StockType")
    @Expose
    private Integer StockType;

    /**
     * 客户账号
     */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * 信号类型 (1: 9转,  2: 13转,  0: 全部)
     */
    @SerializedName("SignalModel")
    @Expose
    private Integer SignalModel;

    /**
     * 信号状态 (1: 抄底,  -1: 见顶,  0: 无信号 )
     */
    @SerializedName("SignalFlag")
    @Expose
    private Integer SignalFlag;

    /**
     * 每页大小
     */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
     * 当前页码
     */
    @SerializedName("PageNumber")
    @Expose
    private Integer PageNumber;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "StockType", this.StockType);
        this.setParamSimple(map, prefix + "SignalModel", this.SignalModel);
        this.setParamSimple(map, prefix + "SignalFlag", this.SignalFlag);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
    }

    public Integer getStockType() {
        return StockType;
    }

    public void setStockType(Integer StockType) {
        this.StockType = StockType;
    }

    public Integer getSignalModel() {
        return SignalModel;
    }

    public void setSignalModel(Integer SignalModel) {
        this.SignalModel = SignalModel;
    }

    public Integer getSignalFlag() {
        return SignalFlag;
    }

    public void setSignalFlag(Integer SignalFlag) {
        this.SignalFlag = SignalFlag;
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    public Integer getPageNumber() {
        return PageNumber;
    }

    public void setPageNumber(Integer PageNumber) {
        this.PageNumber = PageNumber;
    }

}
