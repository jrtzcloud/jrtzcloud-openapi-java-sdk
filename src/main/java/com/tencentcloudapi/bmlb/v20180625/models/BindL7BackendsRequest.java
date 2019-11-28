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

public class BindL7BackendsRequest  extends AbstractModel{

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
    * 转发域名实例ID，可通过接口DescribeL7Rules查询。
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 转发路径实例ID，可通过接口DescribeL7Rules查询。
    */
    @SerializedName("LocationId")
    @Expose
    private String LocationId;

    /**
    * 待绑定的主机信息。可以绑定多个主机端口。目前一个七层转发路径下面最多允许绑定255个主机端口。
    */
    @SerializedName("BackendSet")
    @Expose
    private BindL7Backend [] BackendSet;

    /**
    * 绑定类型。0：物理机，1：虚拟机 2：半托管机器。
    */
    @SerializedName("BindType")
    @Expose
    private Integer BindType;

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
     * 获取转发域名实例ID，可通过接口DescribeL7Rules查询。
     * @return DomainId 转发域名实例ID，可通过接口DescribeL7Rules查询。
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * 设置转发域名实例ID，可通过接口DescribeL7Rules查询。
     * @param DomainId 转发域名实例ID，可通过接口DescribeL7Rules查询。
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * 获取转发路径实例ID，可通过接口DescribeL7Rules查询。
     * @return LocationId 转发路径实例ID，可通过接口DescribeL7Rules查询。
     */
    public String getLocationId() {
        return this.LocationId;
    }

    /**
     * 设置转发路径实例ID，可通过接口DescribeL7Rules查询。
     * @param LocationId 转发路径实例ID，可通过接口DescribeL7Rules查询。
     */
    public void setLocationId(String LocationId) {
        this.LocationId = LocationId;
    }

    /**
     * 获取待绑定的主机信息。可以绑定多个主机端口。目前一个七层转发路径下面最多允许绑定255个主机端口。
     * @return BackendSet 待绑定的主机信息。可以绑定多个主机端口。目前一个七层转发路径下面最多允许绑定255个主机端口。
     */
    public BindL7Backend [] getBackendSet() {
        return this.BackendSet;
    }

    /**
     * 设置待绑定的主机信息。可以绑定多个主机端口。目前一个七层转发路径下面最多允许绑定255个主机端口。
     * @param BackendSet 待绑定的主机信息。可以绑定多个主机端口。目前一个七层转发路径下面最多允许绑定255个主机端口。
     */
    public void setBackendSet(BindL7Backend [] BackendSet) {
        this.BackendSet = BackendSet;
    }

    /**
     * 获取绑定类型。0：物理机，1：虚拟机 2：半托管机器。
     * @return BindType 绑定类型。0：物理机，1：虚拟机 2：半托管机器。
     */
    public Integer getBindType() {
        return this.BindType;
    }

    /**
     * 设置绑定类型。0：物理机，1：虚拟机 2：半托管机器。
     * @param BindType 绑定类型。0：物理机，1：虚拟机 2：半托管机器。
     */
    public void setBindType(Integer BindType) {
        this.BindType = BindType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "LocationId", this.LocationId);
        this.setParamArrayObj(map, prefix + "BackendSet.", this.BackendSet);
        this.setParamSimple(map, prefix + "BindType", this.BindType);

    }
}

