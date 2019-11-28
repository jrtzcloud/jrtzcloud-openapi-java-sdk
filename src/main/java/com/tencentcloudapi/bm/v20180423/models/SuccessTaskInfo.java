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

public class SuccessTaskInfo  extends AbstractModel{

    /**
    * 运行脚本的设备ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 黑石异步任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private Integer TaskId;

    /**
    * 黑石自定义脚本运行任务ID
    */
    @SerializedName("CmdTaskId")
    @Expose
    private String CmdTaskId;

    /**
     * 获取运行脚本的设备ID
     * @return InstanceId 运行脚本的设备ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置运行脚本的设备ID
     * @param InstanceId 运行脚本的设备ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取黑石异步任务ID
     * @return TaskId 黑石异步任务ID
     */
    public Integer getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置黑石异步任务ID
     * @param TaskId 黑石异步任务ID
     */
    public void setTaskId(Integer TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取黑石自定义脚本运行任务ID
     * @return CmdTaskId 黑石自定义脚本运行任务ID
     */
    public String getCmdTaskId() {
        return this.CmdTaskId;
    }

    /**
     * 设置黑石自定义脚本运行任务ID
     * @param CmdTaskId 黑石自定义脚本运行任务ID
     */
    public void setCmdTaskId(String CmdTaskId) {
        this.CmdTaskId = CmdTaskId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "CmdTaskId", this.CmdTaskId);

    }
}

