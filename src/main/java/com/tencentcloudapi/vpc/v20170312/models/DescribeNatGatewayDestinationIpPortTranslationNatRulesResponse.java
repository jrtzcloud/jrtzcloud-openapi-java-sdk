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

public class DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse  extends AbstractModel{

    /**
    * NAT网关端口转发规则对象数组。
    */
    @SerializedName("NatGatewayDestinationIpPortTranslationNatRuleSet")
    @Expose
    private NatGatewayDestinationIpPortTranslationNatRule [] NatGatewayDestinationIpPortTranslationNatRuleSet;

    /**
    * 符合条件的NAT网关端口转发规则对象数目。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取NAT网关端口转发规则对象数组。
     * @return NatGatewayDestinationIpPortTranslationNatRuleSet NAT网关端口转发规则对象数组。
     */
    public NatGatewayDestinationIpPortTranslationNatRule [] getNatGatewayDestinationIpPortTranslationNatRuleSet() {
        return this.NatGatewayDestinationIpPortTranslationNatRuleSet;
    }

    /**
     * 设置NAT网关端口转发规则对象数组。
     * @param NatGatewayDestinationIpPortTranslationNatRuleSet NAT网关端口转发规则对象数组。
     */
    public void setNatGatewayDestinationIpPortTranslationNatRuleSet(NatGatewayDestinationIpPortTranslationNatRule [] NatGatewayDestinationIpPortTranslationNatRuleSet) {
        this.NatGatewayDestinationIpPortTranslationNatRuleSet = NatGatewayDestinationIpPortTranslationNatRuleSet;
    }

    /**
     * 获取符合条件的NAT网关端口转发规则对象数目。
     * @return TotalCount 符合条件的NAT网关端口转发规则对象数目。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合条件的NAT网关端口转发规则对象数目。
     * @param TotalCount 符合条件的NAT网关端口转发规则对象数目。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NatGatewayDestinationIpPortTranslationNatRuleSet.", this.NatGatewayDestinationIpPortTranslationNatRuleSet);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

