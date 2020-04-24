package com.jrtzcloudapi.blten.v20191119.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.blten.v20191119.models.entity.Model;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class ReplaceProjectRequest extends AbstractModel {
    /**
     * 用户自定义模型
     */
    @SerializedName("Model")
    @Expose
    private Model Model;
    /**
     * 开始日期，格式yyyy-MM-dd
     */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;
    /**
     * 结束日期，格式yyyy-MM-dd
     */
    @SerializedName("StopDate")
    @Expose
    private String StopDate;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "StopDate", this.StopDate);
        this.setParamObj(map, prefix + "Model", this.Model);
    }


    public Model getModel() {
        return Model;
    }

    public void setModel(Model model) {
        Model = model;
    }

    public String getStartDate() {
        return StartDate;
    }

    public void setStartDate(String startDate) {
        StartDate = startDate;
    }

    public String getStopDate() {
        return StopDate;
    }

    public void setStopDate(String stopDate) {
        StopDate = stopDate;
    }
}
