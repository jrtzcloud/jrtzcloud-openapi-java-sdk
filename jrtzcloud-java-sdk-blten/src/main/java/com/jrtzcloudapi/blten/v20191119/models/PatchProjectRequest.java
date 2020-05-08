package com.jrtzcloudapi.blten.v20191119.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.blten.v20191119.models.entity.Patch;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class PatchProjectRequest extends AbstractModel {
    /**
     * 模型ID
     */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
     * 修改补丁实体，参考 JSON Patch [RFC6902]
     */
    @SerializedName("Patch")
    @Expose
    private Patch[] Patch;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Model", this.Patch);
    }

    public Patch[] getPatch() {
        return Patch;
    }

    public void setPatch(Patch[] patch) {
        Patch = patch;
    }


    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }
}
