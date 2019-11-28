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

public class AsyncRegisterIpsRequest  extends AbstractModel{

    /**
    * 私有网络的唯一ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网唯一ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 需要注册的IP列表。
    */
    @SerializedName("Ips")
    @Expose
    private String [] Ips;

    /**
     * 获取私有网络的唯一ID。
     * @return VpcId 私有网络的唯一ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络的唯一ID。
     * @param VpcId 私有网络的唯一ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网唯一ID。
     * @return SubnetId 子网唯一ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网唯一ID。
     * @param SubnetId 子网唯一ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取需要注册的IP列表。
     * @return Ips 需要注册的IP列表。
     */
    public String [] getIps() {
        return this.Ips;
    }

    /**
     * 设置需要注册的IP列表。
     * @param Ips 需要注册的IP列表。
     */
    public void setIps(String [] Ips) {
        this.Ips = Ips;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArraySimple(map, prefix + "Ips.", this.Ips);

    }
}

