package com.jrtzcloudapi.riskwarn.v20200521.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribePageStockRiskInfoRequest extends AbstractModel {
    /**
     * 页码
     */
    @SerializedName("PageNo")
    @Expose
    private Integer PageNo;

    /**
     * 每页数量
     */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
     * 字段数组(多个用,隔开)
     */
    @SerializedName("Fields")
    @Expose
    private String Fields;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Fields", this.Fields);
    }

    public Integer getPageNo() {
        return PageNo;
    }

    public void setPageNo(Integer pageNo) {
        PageNo = pageNo;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public String getFields() {
        return Fields;
    }

    public void setFields(String fields) {
        Fields = fields;
    }
}

