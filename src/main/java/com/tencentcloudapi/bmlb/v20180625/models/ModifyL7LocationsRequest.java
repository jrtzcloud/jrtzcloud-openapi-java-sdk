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

public class ModifyL7LocationsRequest  extends AbstractModel{

    /**
    * 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 七层监听器实例ID，可通过接口DescribeL7Listeners查询。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 待更新的七层转发规则信息数组。
    */
    @SerializedName("RuleSet")
    @Expose
    private ModifyL7LocationRule [] RuleSet;

    /**
     * 获取负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @return LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * 设置负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @param LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * 获取七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     * @return ListenerId 七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     * @param ListenerId 七层监听器实例ID，可通过接口DescribeL7Listeners查询。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取待更新的七层转发规则信息数组。
     * @return RuleSet 待更新的七层转发规则信息数组。
     */
    public ModifyL7LocationRule [] getRuleSet() {
        return this.RuleSet;
    }

    /**
     * 设置待更新的七层转发规则信息数组。
     * @param RuleSet 待更新的七层转发规则信息数组。
     */
    public void setRuleSet(ModifyL7LocationRule [] RuleSet) {
        this.RuleSet = RuleSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArrayObj(map, prefix + "RuleSet.", this.RuleSet);

    }
}

