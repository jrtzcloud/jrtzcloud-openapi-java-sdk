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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteRuleRequest  extends AbstractModel{

    /**
    * 负载均衡实例 ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡监听器 ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 要删除的转发规则的ID组成的数组
    */
    @SerializedName("LocationIds")
    @Expose
    private String [] LocationIds;

    /**
    * 要删除的转发规则的域名，已提供LocationIds参数时本参数不生效
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 要删除的转发规则的转发路径，已提供LocationIds参数时本参数不生效
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * 获取负载均衡实例 ID
     * @return LoadBalancerId 负载均衡实例 ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * 设置负载均衡实例 ID
     * @param LoadBalancerId 负载均衡实例 ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * 获取负载均衡监听器 ID
     * @return ListenerId 负载均衡监听器 ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置负载均衡监听器 ID
     * @param ListenerId 负载均衡监听器 ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取要删除的转发规则的ID组成的数组
     * @return LocationIds 要删除的转发规则的ID组成的数组
     */
    public String [] getLocationIds() {
        return this.LocationIds;
    }

    /**
     * 设置要删除的转发规则的ID组成的数组
     * @param LocationIds 要删除的转发规则的ID组成的数组
     */
    public void setLocationIds(String [] LocationIds) {
        this.LocationIds = LocationIds;
    }

    /**
     * 获取要删除的转发规则的域名，已提供LocationIds参数时本参数不生效
     * @return Domain 要删除的转发规则的域名，已提供LocationIds参数时本参数不生效
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置要删除的转发规则的域名，已提供LocationIds参数时本参数不生效
     * @param Domain 要删除的转发规则的域名，已提供LocationIds参数时本参数不生效
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取要删除的转发规则的转发路径，已提供LocationIds参数时本参数不生效
     * @return Url 要删除的转发规则的转发路径，已提供LocationIds参数时本参数不生效
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置要删除的转发规则的转发路径，已提供LocationIds参数时本参数不生效
     * @param Url 要删除的转发规则的转发路径，已提供LocationIds参数时本参数不生效
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamArraySimple(map, prefix + "LocationIds.", this.LocationIds);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

