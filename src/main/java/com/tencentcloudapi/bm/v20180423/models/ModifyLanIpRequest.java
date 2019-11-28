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

public class ModifyLanIpRequest  extends AbstractModel{

    /**
    * 物理机ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 指定新VPC
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 指定新子网
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 指定新内网IP
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 是否需要重启机器，取值 1(需要) 0(不需要)，默认取值0
    */
    @SerializedName("RebootDevice")
    @Expose
    private Integer RebootDevice;

    /**
     * 获取物理机ID
     * @return InstanceId 物理机ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置物理机ID
     * @param InstanceId 物理机ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取指定新VPC
     * @return VpcId 指定新VPC
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置指定新VPC
     * @param VpcId 指定新VPC
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取指定新子网
     * @return SubnetId 指定新子网
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置指定新子网
     * @param SubnetId 指定新子网
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取指定新内网IP
     * @return LanIp 指定新内网IP
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * 设置指定新内网IP
     * @param LanIp 指定新内网IP
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * 获取是否需要重启机器，取值 1(需要) 0(不需要)，默认取值0
     * @return RebootDevice 是否需要重启机器，取值 1(需要) 0(不需要)，默认取值0
     */
    public Integer getRebootDevice() {
        return this.RebootDevice;
    }

    /**
     * 设置是否需要重启机器，取值 1(需要) 0(不需要)，默认取值0
     * @param RebootDevice 是否需要重启机器，取值 1(需要) 0(不需要)，默认取值0
     */
    public void setRebootDevice(Integer RebootDevice) {
        this.RebootDevice = RebootDevice;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "RebootDevice", this.RebootDevice);

    }
}

