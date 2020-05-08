package com.jrtzcloudapi.blten.v20191119.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.blten.v20191119.models.entity.Model;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribeProjectRequest extends AbstractModel {
    /**
     * 模型ID
     */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;


    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {

    }
}
