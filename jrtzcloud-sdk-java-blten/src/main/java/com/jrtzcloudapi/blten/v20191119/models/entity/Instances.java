package com.jrtzcloudapi.blten.v20191119.models.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class Instances extends AbstractModel {
    /**
     * 总条数
     */
    @SerializedName("Count")
    @Expose
    private Integer Count;
    /**
     * 属性字段列表
     */
    @SerializedName("Fields")
    @Expose
    private String[] Fields;
    /**
     * 具体数据
     */
    @SerializedName("Data")
    @Expose
    private Instance[] Data;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArraySimple(map, prefix + "Fields", this.Fields);
        this.setParamArrayObj(map, prefix + "Data", this.Data);
    }
}
