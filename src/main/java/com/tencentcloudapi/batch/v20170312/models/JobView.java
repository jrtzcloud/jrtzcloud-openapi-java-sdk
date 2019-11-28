/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.batch.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class JobView  extends AbstractModel{

    /**
    * 作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 作业名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 作业状态
    */
    @SerializedName("JobState")
    @Expose
    private String JobState;

    /**
    * 作业优先级
    */
    @SerializedName("Priority")
    @Expose
    private Integer Priority;

    /**
    * 位置信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务统计指标
    */
    @SerializedName("TaskMetrics")
    @Expose
    private TaskMetrics TaskMetrics;

    /**
     * 获取作业ID
     * @return JobId 作业ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * 设置作业ID
     * @param JobId 作业ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * 获取作业名称
     * @return JobName 作业名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * 设置作业名称
     * @param JobName 作业名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * 获取作业状态
     * @return JobState 作业状态
     */
    public String getJobState() {
        return this.JobState;
    }

    /**
     * 设置作业状态
     * @param JobState 作业状态
     */
    public void setJobState(String JobState) {
        this.JobState = JobState;
    }

    /**
     * 获取作业优先级
     * @return Priority 作业优先级
     */
    public Integer getPriority() {
        return this.Priority;
    }

    /**
     * 设置作业优先级
     * @param Priority 作业优先级
     */
    public void setPriority(Integer Priority) {
        this.Priority = Priority;
    }

    /**
     * 获取位置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return Placement 位置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * 设置位置信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Placement 位置信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTime 结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取任务统计指标
     * @return TaskMetrics 任务统计指标
     */
    public TaskMetrics getTaskMetrics() {
        return this.TaskMetrics;
    }

    /**
     * 设置任务统计指标
     * @param TaskMetrics 任务统计指标
     */
    public void setTaskMetrics(TaskMetrics TaskMetrics) {
        this.TaskMetrics = TaskMetrics;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "JobState", this.JobState);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "TaskMetrics.", this.TaskMetrics);

    }
}

