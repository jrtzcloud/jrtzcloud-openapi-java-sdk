package com.jrtzcloudapi.blten.v20191119.models.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class Instance extends AbstractModel {
    /**
     * 返回风险权重数据对象
     */
    @SerializedName("RiskWtSet")
    @Expose
    private Float[] RiskWtSet;
    /**
     * 日期，格式yyyy-MM-dd
     */
    @SerializedName("Day")
    @Expose
    private String Day;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Day", this.Day);
        this.setParamArraySimple(map, prefix + "RiskWtSets", this.RiskWtSet);
    }

    public Float[] getRiskWtSet() {
        return RiskWtSet;
    }

    public void setRiskWtSet(Float[] riskWtSet) {
        RiskWtSet = riskWtSet;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }
}
