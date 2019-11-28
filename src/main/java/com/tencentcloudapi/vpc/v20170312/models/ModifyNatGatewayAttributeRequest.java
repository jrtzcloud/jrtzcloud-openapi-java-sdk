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

public class ModifyNatGatewayAttributeRequest  extends AbstractModel{

    /**
    * NAT网关的ID，形如：`nat-df45454`。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * NAT网关的名称，形如：`test_nat`。
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * NAT网关最大外网出带宽(单位:Mbps)。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Integer InternetMaxBandwidthOut;

    /**
     * 获取NAT网关的ID，形如：`nat-df45454`。
     * @return NatGatewayId NAT网关的ID，形如：`nat-df45454`。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * 设置NAT网关的ID，形如：`nat-df45454`。
     * @param NatGatewayId NAT网关的ID，形如：`nat-df45454`。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * 获取NAT网关的名称，形如：`test_nat`。
     * @return NatGatewayName NAT网关的名称，形如：`test_nat`。
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * 设置NAT网关的名称，形如：`test_nat`。
     * @param NatGatewayName NAT网关的名称，形如：`test_nat`。
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * 获取NAT网关最大外网出带宽(单位:Mbps)。
     * @return InternetMaxBandwidthOut NAT网关最大外网出带宽(单位:Mbps)。
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * 设置NAT网关最大外网出带宽(单位:Mbps)。
     * @param InternetMaxBandwidthOut NAT网关最大外网出带宽(单位:Mbps)。
     */
    public void setInternetMaxBandwidthOut(Integer InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);

    }
}

