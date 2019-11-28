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

public class DescribeTaskLogsRequest  extends AbstractModel{

    /**
    * 作业ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 任务名称
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务实例集合
    */
    @SerializedName("TaskInstanceIndexes")
    @Expose
    private Integer [] TaskInstanceIndexes;

    /**
    * 起始任务实例
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 最大任务实例数
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

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
     * 获取任务名称
     * @return TaskName 任务名称
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * 设置任务名称
     * @param TaskName 任务名称
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * 获取任务实例集合
     * @return TaskInstanceIndexes 任务实例集合
     */
    public Integer [] getTaskInstanceIndexes() {
        return this.TaskInstanceIndexes;
    }

    /**
     * 设置任务实例集合
     * @param TaskInstanceIndexes 任务实例集合
     */
    public void setTaskInstanceIndexes(Integer [] TaskInstanceIndexes) {
        this.TaskInstanceIndexes = TaskInstanceIndexes;
    }

    /**
     * 获取起始任务实例
     * @return Offset 起始任务实例
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置起始任务实例
     * @param Offset 起始任务实例
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取最大任务实例数
     * @return Limit 最大任务实例数
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置最大任务实例数
     * @param Limit 最大任务实例数
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamArraySimple(map, prefix + "TaskInstanceIndexes.", this.TaskInstanceIndexes);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

