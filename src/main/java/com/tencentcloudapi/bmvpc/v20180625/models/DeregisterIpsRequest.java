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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeregisterIpsRequest  extends AbstractModel{

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 注销指定IP的列表
    */
    @SerializedName("IpSet")
    @Expose
    private String [] IpSet;

    /**
    * 私有网络子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * 获取私有网络ID
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取注销指定IP的列表
     * @return IpSet 注销指定IP的列表
     */
    public String [] getIpSet() {
        return this.IpSet;
    }

    /**
     * 设置注销指定IP的列表
     * @param IpSet 注销指定IP的列表
     */
    public void setIpSet(String [] IpSet) {
        this.IpSet = IpSet;
    }

    /**
     * 获取私有网络子网ID
     * @return SubnetId 私有网络子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置私有网络子网ID
     * @param SubnetId 私有网络子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "IpSet.", this.IpSet);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

