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

public class UnassignIpv6CidrBlockRequest  extends AbstractModel{

    /**
    * `VPC`实例`ID`，形如：`vpc-f49l6u0z`。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * `IPv6`网段。形如：`3402:4e00:20:1000::/56`
    */
    @SerializedName("Ipv6CidrBlock")
    @Expose
    private String Ipv6CidrBlock;

    /**
     * 获取`VPC`实例`ID`，形如：`vpc-f49l6u0z`。
     * @return VpcId `VPC`实例`ID`，形如：`vpc-f49l6u0z`。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置`VPC`实例`ID`，形如：`vpc-f49l6u0z`。
     * @param VpcId `VPC`实例`ID`，形如：`vpc-f49l6u0z`。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取`IPv6`网段。形如：`3402:4e00:20:1000::/56`
     * @return Ipv6CidrBlock `IPv6`网段。形如：`3402:4e00:20:1000::/56`
     */
    public String getIpv6CidrBlock() {
        return this.Ipv6CidrBlock;
    }

    /**
     * 设置`IPv6`网段。形如：`3402:4e00:20:1000::/56`
     * @param Ipv6CidrBlock `IPv6`网段。形如：`3402:4e00:20:1000::/56`
     */
    public void setIpv6CidrBlock(String Ipv6CidrBlock) {
        this.Ipv6CidrBlock = Ipv6CidrBlock;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Ipv6CidrBlock", this.Ipv6CidrBlock);

    }
}

