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
    @SerializedName("Op")
    @Expose
    private final String Op = "replace";
    /**
     * JSON实体需要修改的节点路径
     * JSON-Pointer path [RFC6901](https://tools.ietf.org/html/rfc6901) that references a location within the target document
     * (the "target location") where the operation is performed
     */
    @SerializedName("Path")
    @Expose
    private String Path;
    /**
     * 修改值
     */
    @SerializedName("Value")
    @Expose
    private Object Value;

    /**
     *  封装Patch, path can not be empty
     * @param path JSON实体需要修改的节点路径,JSON-Pointer path [RFC6901](https://tools.ietf.org/html/rfc6901)
     * @param value 修改值
     */
    public Patch(String path, Object value){
        if(StringUtils.isBlank(path)) throw new IllegalArgumentException("Path can not be empty to constructor");
        this.Path = path;
        this.Value = value;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Op", this.Op);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "Value", this.Value);
    }

    public String getOp() {
        return Op;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

    public Object getValue() {
        return Value;
    }

    public void setValue(Object value) {
        Value = value;
    }
}
