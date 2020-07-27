package com.jrtzcloudapi.vip.v20200722.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribeTrendLightNewSignalRequest extends AbstractModel {
    /**
     * 信号状态：1（机会信号）-1（风险信号）
     */
    @SerializedName("Chance")
    @Expose
    private Integer Chance;

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

    /**
     * 筛选范围:1.全市场A股 2.用户自选股 3.用户持仓股
     */
    @SerializedName("SelectScope")
    @Expose
    private Integer SelectScope;

    /**
     * 筛选方式：1.仅信号（默认）2.hert值过滤
     */
    @SerializedName("Type")
    @Expose
    private Integer Type;

    /**
     * 客户账号
     */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    public Integer getChance() {
        return Chance;
    }

    public void setChance(Integer Chance) {
        this.Chance = Chance;
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

    public Integer getSelectScope() {
        return SelectScope;
    }

    public void setSelectScope(Integer SelectScope) {
        this.SelectScope = SelectScope;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer Type) {
        this.Type = Type;
    }

    public String getAccountId() {
        return AccountId;
    }

    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "Chance", this.Chance);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "SelectScope", this.SelectScope);
        this.setParamSimple(map, prefix + "Type", this.Type);
    }

}
