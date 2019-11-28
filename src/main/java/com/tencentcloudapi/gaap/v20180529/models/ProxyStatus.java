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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProxyStatus  extends AbstractModel{

    /**
    * 通道实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 通道状态。
其中：
RUNNING，运行中；
CREATING，创建中；
DESTROYING，销毁中；
OPENING，开启中；
CLOSING，关闭中；
CLOSED，已关闭；
ADJUSTING，配置变更中；
ISOLATING，隔离中；
ISOLATED，已隔离；
UNKNOWN，未知状态。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * 获取通道实例ID。
     * @return InstanceId 通道实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置通道实例ID。
     * @param InstanceId 通道实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取通道状态。
其中：
RUNNING，运行中；
CREATING，创建中；
DESTROYING，销毁中；
OPENING，开启中；
CLOSING，关闭中；
CLOSED，已关闭；
ADJUSTING，配置变更中；
ISOLATING，隔离中；
ISOLATED，已隔离；
UNKNOWN，未知状态。
     * @return Status 通道状态。
其中：
RUNNING，运行中；
CREATING，创建中；
DESTROYING，销毁中；
OPENING，开启中；
CLOSING，关闭中；
CLOSED，已关闭；
ADJUSTING，配置变更中；
ISOLATING，隔离中；
ISOLATED，已隔离；
UNKNOWN，未知状态。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置通道状态。
其中：
RUNNING，运行中；
CREATING，创建中；
DESTROYING，销毁中；
OPENING，开启中；
CLOSING，关闭中；
CLOSED，已关闭；
ADJUSTING，配置变更中；
ISOLATING，隔离中；
ISOLATED，已隔离；
UNKNOWN，未知状态。
     * @param Status 通道状态。
其中：
RUNNING，运行中；
CREATING，创建中；
DESTROYING，销毁中；
OPENING，开启中；
CLOSING，关闭中；
CLOSED，已关闭；
ADJUSTING，配置变更中；
ISOLATING，隔离中；
ISOLATED，已隔离；
UNKNOWN，未知状态。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

