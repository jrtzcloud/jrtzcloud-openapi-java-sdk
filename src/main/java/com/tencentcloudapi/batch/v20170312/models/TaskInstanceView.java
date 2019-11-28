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

public class TaskInstanceView  extends AbstractModel{

    /**
    * 任务实例索引
    */
    @SerializedName("TaskInstanceIndex")
    @Expose
    private Integer TaskInstanceIndex;

    /**
    * 任务实例状态
    */
    @SerializedName("TaskInstanceState")
    @Expose
    private String TaskInstanceState;

    /**
    * 应用程序执行结束的exit code
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExitCode")
    @Expose
    private Integer ExitCode;

    /**
    * 任务实例状态原因，任务实例失败时，会记录失败原因
    */
    @SerializedName("StateReason")
    @Expose
    private String StateReason;

    /**
    * 任务实例运行时所在计算节点（例如CVM）的InstanceId。任务实例未运行或者完结时，本字段为空。任务实例重试时，本字段会随之变化
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeNodeInstanceId")
    @Expose
    private String ComputeNodeInstanceId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LaunchTime")
    @Expose
    private String LaunchTime;

    /**
    * 开始运行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RunningTime")
    @Expose
    private String RunningTime;

    /**
    * 结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 重定向信息
    */
    @SerializedName("RedirectInfo")
    @Expose
    private RedirectInfo RedirectInfo;

    /**
    * 任务实例状态原因详情，任务实例失败时，会记录失败原因
    */
    @SerializedName("StateDetailedReason")
    @Expose
    private String StateDetailedReason;

    /**
     * 获取任务实例索引
     * @return TaskInstanceIndex 任务实例索引
     */
    public Integer getTaskInstanceIndex() {
        return this.TaskInstanceIndex;
    }

    /**
     * 设置任务实例索引
     * @param TaskInstanceIndex 任务实例索引
     */
    public void setTaskInstanceIndex(Integer TaskInstanceIndex) {
        this.TaskInstanceIndex = TaskInstanceIndex;
    }

    /**
     * 获取任务实例状态
     * @return TaskInstanceState 任务实例状态
     */
    public String getTaskInstanceState() {
        return this.TaskInstanceState;
    }

    /**
     * 设置任务实例状态
     * @param TaskInstanceState 任务实例状态
     */
    public void setTaskInstanceState(String TaskInstanceState) {
        this.TaskInstanceState = TaskInstanceState;
    }

    /**
     * 获取应用程序执行结束的exit code
注意：此字段可能返回 null，表示取不到有效值。
     * @return ExitCode 应用程序执行结束的exit code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getExitCode() {
        return this.ExitCode;
    }

    /**
     * 设置应用程序执行结束的exit code
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExitCode 应用程序执行结束的exit code
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExitCode(Integer ExitCode) {
        this.ExitCode = ExitCode;
    }

    /**
     * 获取任务实例状态原因，任务实例失败时，会记录失败原因
     * @return StateReason 任务实例状态原因，任务实例失败时，会记录失败原因
     */
    public String getStateReason() {
        return this.StateReason;
    }

    /**
     * 设置任务实例状态原因，任务实例失败时，会记录失败原因
     * @param StateReason 任务实例状态原因，任务实例失败时，会记录失败原因
     */
    public void setStateReason(String StateReason) {
        this.StateReason = StateReason;
    }

    /**
     * 获取任务实例运行时所在计算节点（例如CVM）的InstanceId。任务实例未运行或者完结时，本字段为空。任务实例重试时，本字段会随之变化
注意：此字段可能返回 null，表示取不到有效值。
     * @return ComputeNodeInstanceId 任务实例运行时所在计算节点（例如CVM）的InstanceId。任务实例未运行或者完结时，本字段为空。任务实例重试时，本字段会随之变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComputeNodeInstanceId() {
        return this.ComputeNodeInstanceId;
    }

    /**
     * 设置任务实例运行时所在计算节点（例如CVM）的InstanceId。任务实例未运行或者完结时，本字段为空。任务实例重试时，本字段会随之变化
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeNodeInstanceId 任务实例运行时所在计算节点（例如CVM）的InstanceId。任务实例未运行或者完结时，本字段为空。任务实例重试时，本字段会随之变化
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeNodeInstanceId(String ComputeNodeInstanceId) {
        this.ComputeNodeInstanceId = ComputeNodeInstanceId;
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
     * 获取启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return LaunchTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLaunchTime() {
        return this.LaunchTime;
    }

    /**
     * 设置启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LaunchTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLaunchTime(String LaunchTime) {
        this.LaunchTime = LaunchTime;
    }

    /**
     * 获取开始运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return RunningTime 开始运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRunningTime() {
        return this.RunningTime;
    }

    /**
     * 设置开始运行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RunningTime 开始运行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRunningTime(String RunningTime) {
        this.RunningTime = RunningTime;
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
     * 获取重定向信息
     * @return RedirectInfo 重定向信息
     */
    public RedirectInfo getRedirectInfo() {
        return this.RedirectInfo;
    }

    /**
     * 设置重定向信息
     * @param RedirectInfo 重定向信息
     */
    public void setRedirectInfo(RedirectInfo RedirectInfo) {
        this.RedirectInfo = RedirectInfo;
    }

    /**
     * 获取任务实例状态原因详情，任务实例失败时，会记录失败原因
     * @return StateDetailedReason 任务实例状态原因详情，任务实例失败时，会记录失败原因
     */
    public String getStateDetailedReason() {
        return this.StateDetailedReason;
    }

    /**
     * 设置任务实例状态原因详情，任务实例失败时，会记录失败原因
     * @param StateDetailedReason 任务实例状态原因详情，任务实例失败时，会记录失败原因
     */
    public void setStateDetailedReason(String StateDetailedReason) {
        this.StateDetailedReason = StateDetailedReason;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskInstanceIndex", this.TaskInstanceIndex);
        this.setParamSimple(map, prefix + "TaskInstanceState", this.TaskInstanceState);
        this.setParamSimple(map, prefix + "ExitCode", this.ExitCode);
        this.setParamSimple(map, prefix + "StateReason", this.StateReason);
        this.setParamSimple(map, prefix + "ComputeNodeInstanceId", this.ComputeNodeInstanceId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "LaunchTime", this.LaunchTime);
        this.setParamSimple(map, prefix + "RunningTime", this.RunningTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "RedirectInfo.", this.RedirectInfo);
        this.setParamSimple(map, prefix + "StateDetailedReason", this.StateDetailedReason);

    }
}

