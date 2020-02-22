package com.jrtzcloudapi.blten.v20191119.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribeModelDataRequest extends AbstractModel {
    /**
     * 开始日期，格式yyyy-MM-dd
     */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;
    /**
     * 结束日期，格式yyyy-MM-dd
     */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }
}
