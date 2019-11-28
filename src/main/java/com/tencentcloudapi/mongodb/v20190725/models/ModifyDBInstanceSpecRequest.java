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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstanceSpecRequest  extends AbstractModel{

    /**
    * 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例配置变更后的内存大小，单位：GB。内存和磁盘必须同时升配或同时降配
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 实例配置变更后的硬盘大小，单位：GB。内存和磁盘必须同时升配或同时降配。降配时，新的磁盘参数必须大于已用磁盘容量的1.2倍
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;

    /**
    * 实例配置变更后oplog的大小，单位：GB，默认为磁盘空间的10%，允许设置的最小值为磁盘的10%，最大值为磁盘的90%
    */
    @SerializedName("OplogSize")
    @Expose
    private Integer OplogSize;

    /**
     * 获取实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     * @return InstanceId 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceId 实例ID，格式如：cmgo-p8vnipr5。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取实例配置变更后的内存大小，单位：GB。内存和磁盘必须同时升配或同时降配
     * @return Memory 实例配置变更后的内存大小，单位：GB。内存和磁盘必须同时升配或同时降配
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置实例配置变更后的内存大小，单位：GB。内存和磁盘必须同时升配或同时降配
     * @param Memory 实例配置变更后的内存大小，单位：GB。内存和磁盘必须同时升配或同时降配
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取实例配置变更后的硬盘大小，单位：GB。内存和磁盘必须同时升配或同时降配。降配时，新的磁盘参数必须大于已用磁盘容量的1.2倍
     * @return Volume 实例配置变更后的硬盘大小，单位：GB。内存和磁盘必须同时升配或同时降配。降配时，新的磁盘参数必须大于已用磁盘容量的1.2倍
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置实例配置变更后的硬盘大小，单位：GB。内存和磁盘必须同时升配或同时降配。降配时，新的磁盘参数必须大于已用磁盘容量的1.2倍
     * @param Volume 实例配置变更后的硬盘大小，单位：GB。内存和磁盘必须同时升配或同时降配。降配时，新的磁盘参数必须大于已用磁盘容量的1.2倍
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取实例配置变更后oplog的大小，单位：GB，默认为磁盘空间的10%，允许设置的最小值为磁盘的10%，最大值为磁盘的90%
     * @return OplogSize 实例配置变更后oplog的大小，单位：GB，默认为磁盘空间的10%，允许设置的最小值为磁盘的10%，最大值为磁盘的90%
     */
    public Integer getOplogSize() {
        return this.OplogSize;
    }

    /**
     * 设置实例配置变更后oplog的大小，单位：GB，默认为磁盘空间的10%，允许设置的最小值为磁盘的10%，最大值为磁盘的90%
     * @param OplogSize 实例配置变更后oplog的大小，单位：GB，默认为磁盘空间的10%，允许设置的最小值为磁盘的10%，最大值为磁盘的90%
     */
    public void setOplogSize(Integer OplogSize) {
        this.OplogSize = OplogSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "OplogSize", this.OplogSize);

    }
}

