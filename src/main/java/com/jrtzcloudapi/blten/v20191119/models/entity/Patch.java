package com.jrtzcloudapi.blten.v20191119.models.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.utils.StringUtils;

import java.util.HashMap;

public class Patch extends AbstractModel {
    /**
     * 操作指令，仅支持 replace
     */
    @SerializedName("op")
    @Expose
    private final String op = "replace";
    /**
     * JSON实体需要修改的节点路径
     * JSON-Pointer path [RFC6901](https://tools.ietf.org/html/rfc6901) that references a location within the target document
     * (the "target location") where the operation is performed
     */
    @SerializedName("path")
    @Expose
    private String path;
    /**
     * 修改值
     */
    @SerializedName("value")
    @Expose
    private Object value;

    /**
     *  封装Patch, path can not be empty
     * @param path JSON实体需要修改的节点路径,JSON-Pointer path [RFC6901](https://tools.ietf.org/html/rfc6901)
     * @param value 修改值
     */
    public Patch(String path, Object value){
        if(StringUtils.isBlank(path)) throw new IllegalArgumentException("Path can not be empty to constructor");
        this.path = path;
        this.value = value;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "op", this.op);
        this.setParamSimple(map, prefix + "path", this.path);
        this.setParamSimple(map, prefix + "value", this.value);
    }

    public String getOp() {
        return op;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
