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
package com.tencentcloudapi.asr.v20190614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTaskStatusRequest  extends AbstractModel{

    /**
    * 从CreateRecTask接口获取的TaskId，用于获取任务状态与结果。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
     * 获取从CreateRecTask接口获取的TaskId，用于获取任务状态与结果。
     * @return TaskId 从CreateRecTask接口获取的TaskId，用于获取任务状态与结果。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置从CreateRecTask接口获取的TaskId，用于获取任务状态与结果。
     * @param TaskId 从CreateRecTask接口获取的TaskId，用于获取任务状态与结果。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);

    }
}

