package com.jrtzcloudapi.blten.v20191119.models.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;
import java.util.HashMap;

public class Project extends AbstractModel {
    /**
     * 模型参数ID
     */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;
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
    /**
     * 任务长度
     */
    @SerializedName("TasksLength")
    @Expose
    private Integer TasksLength;
    /**
     * 用户自定义模型
     */
    @SerializedName("Model")
    @Expose
    private Model Model;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "StopDate", this.StopDate);
        this.setParamSimple(map, prefix + "TasksLength", this.TasksLength);
        this.setParamObj(map, prefix + "Model", this.Model);
    }


    public String getProjectId() {
        return ProjectId;
    }

    public void setProjectId(String projectId) {
        ProjectId = projectId;
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

    public Integer getTasksLength() {
        return TasksLength;
    }

    public void setTasksLength(Integer tasksLength) {
        TasksLength = tasksLength;
    }

    public Model getModel() {
        return Model;
    }

    public void setModel(Model model) {
        Model = model;
    }

}
