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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnassignIpv6SubnetCidrBlockRequest  extends AbstractModel{

    /**
    * 子网所在私有网络`ID`。形如：`vpc-f49l6u0z`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `IPv6` 子网段列表。
    */
    @SerializedName("Ipv6SubnetCidrBlocks")
    @Expose
    private Ipv6SubnetCidrBlock [] Ipv6SubnetCidrBlocks;

    /**
     * 获取子网所在私有网络`ID`。形如：`vpc-f49l6u0z`。
     * @return VpcId 子网所在私有网络`ID`。形如：`vpc-f49l6u0z`。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置子网所在私有网络`ID`。形如：`vpc-f49l6u0z`。
     * @param VpcId 子网所在私有网络`ID`。形如：`vpc-f49l6u0z`。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取`IPv6` 子网段列表。
     * @return Ipv6SubnetCidrBlocks `IPv6` 子网段列表。
     */
    public Ipv6SubnetCidrBlock [] getIpv6SubnetCidrBlocks() {
        return this.Ipv6SubnetCidrBlocks;
    }

    /**
     * 设置`IPv6` 子网段列表。
     * @param Ipv6SubnetCidrBlocks `IPv6` 子网段列表。
     */
    public void setIpv6SubnetCidrBlocks(Ipv6SubnetCidrBlock [] Ipv6SubnetCidrBlocks) {
        this.Ipv6SubnetCidrBlocks = Ipv6SubnetCidrBlocks;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "Ipv6SubnetCidrBlocks.", this.Ipv6SubnetCidrBlocks);

    }
}

