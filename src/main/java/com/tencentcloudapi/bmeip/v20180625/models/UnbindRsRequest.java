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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindRsRequest  extends AbstractModel{

    /**
    * Eip实例ID
    */
    @SerializedName("EipId")
    @Expose
    private String EipId;

    /**
    * 物理服务器实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
     * 获取Eip实例ID
     * @return EipId Eip实例ID
     */
    public String getEipId() {
        return this.EipId;
    }

    /**
     * 设置Eip实例ID
     * @param EipId Eip实例ID
     */
    public void setEipId(String EipId) {
        this.EipId = EipId;
    }

    /**
     * 获取物理服务器实例ID
     * @return InstanceId 物理服务器实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置物理服务器实例ID
     * @param InstanceId 物理服务器实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EipId", this.EipId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);

    }
}

