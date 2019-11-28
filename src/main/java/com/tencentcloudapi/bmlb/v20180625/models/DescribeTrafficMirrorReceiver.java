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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficMirrorReceiver  extends AbstractModel{

    /**
    * 物理机实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 物理机绑定的端口。
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
     * 获取物理机实例ID。
     * @return InstanceId 物理机实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置物理机实例ID。
     * @param InstanceId 物理机实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取物理机绑定的端口。
     * @return Port 物理机绑定的端口。
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置物理机绑定的端口。
     * @param Port 物理机绑定的端口。
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

