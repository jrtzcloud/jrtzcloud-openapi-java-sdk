package com.jrtzcloudapi.blten.v20191119.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribeAssetAllocationParamRequest extends AbstractModel {

    /**
     * 资产配置参数方案id
     */
    @SerializedName("guid")
    @Expose
    private String guid;

    /**
     * 获取资产配置参数方案id
     * @return guid
     */
    public String getGuid() {
        return guid;
    }

    /**
     * 设置资产配置参数方案id
     * @param guid
     */
    public void setGuid(String guid) {
        this.guid = guid;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "guid", this.guid);
    }
}
