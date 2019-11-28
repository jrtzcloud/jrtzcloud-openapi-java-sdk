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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UserCmdTask  extends AbstractModel{

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务状态ID，取值: -1(进行中) 0(结束)
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 脚本名称
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 脚本ID
    */
    @SerializedName("CmdId")
    @Expose
    private String CmdId;

    /**
    * 运行实例数量
    */
    @SerializedName("InstanceCount")
    @Expose
    private Integer InstanceCount;

    /**
    * 运行成功数量
    */
    @SerializedName("SuccessCount")
    @Expose
    private Integer SuccessCount;

    /**
    * 运行失败数量
    */
    @SerializedName("FailureCount")
    @Expose
    private Integer FailureCount;

    /**
    * 执行开始时间
    */
    @SerializedName("RunBeginTime")
    @Expose
    private String RunBeginTime;

    /**
    * 执行结束时间
    */
    @SerializedName("RunEndTime")
    @Expose
    private String RunEndTime;

    /**
     * 获取任务ID
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取任务状态ID，取值: -1(进行中) 0(结束)
     * @return Status 任务状态ID，取值: -1(进行中) 0(结束)
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置任务状态ID，取值: -1(进行中) 0(结束)
     * @param Status 任务状态ID，取值: -1(进行中) 0(结束)
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取脚本名称
     * @return Alias 脚本名称
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置脚本名称
     * @param Alias 脚本名称
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 获取脚本ID
     * @return CmdId 脚本ID
     */
    public String getCmdId() {
        return this.CmdId;
    }

    /**
     * 设置脚本ID
     * @param CmdId 脚本ID
     */
    public void setCmdId(String CmdId) {
        this.CmdId = CmdId;
    }

    /**
     * 获取运行实例数量
     * @return InstanceCount 运行实例数量
     */
    public Integer getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * 设置运行实例数量
     * @param InstanceCount 运行实例数量
     */
    public void setInstanceCount(Integer InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * 获取运行成功数量
     * @return SuccessCount 运行成功数量
     */
    public Integer getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * 设置运行成功数量
     * @param SuccessCount 运行成功数量
     */
    public void setSuccessCount(Integer SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * 获取运行失败数量
     * @return FailureCount 运行失败数量
     */
    public Integer getFailureCount() {
        return this.FailureCount;
    }

    /**
     * 设置运行失败数量
     * @param FailureCount 运行失败数量
     */
    public void setFailureCount(Integer FailureCount) {
        this.FailureCount = FailureCount;
    }

    /**
     * 获取执行开始时间
     * @return RunBeginTime 执行开始时间
     */
    public String getRunBeginTime() {
        return this.RunBeginTime;
    }

    /**
     * 设置执行开始时间
     * @param RunBeginTime 执行开始时间
     */
    public void setRunBeginTime(String RunBeginTime) {
        this.RunBeginTime = RunBeginTime;
    }

    /**
     * 获取执行结束时间
     * @return RunEndTime 执行结束时间
     */
    public String getRunEndTime() {
        return this.RunEndTime;
    }

    /**
     * 设置执行结束时间
     * @param RunEndTime 执行结束时间
     */
    public void setRunEndTime(String RunEndTime) {
        this.RunEndTime = RunEndTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CmdId", this.CmdId);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamSimple(map, prefix + "FailureCount", this.FailureCount);
        this.setParamSimple(map, prefix + "RunBeginTime", this.RunBeginTime);
        this.setParamSimple(map, prefix + "RunEndTime", this.RunEndTime);

    }
}

