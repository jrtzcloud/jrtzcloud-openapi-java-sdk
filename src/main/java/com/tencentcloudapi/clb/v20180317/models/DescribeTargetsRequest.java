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

public class DescribeTargetsRequest  extends AbstractModel{

    /**
    * 负载均衡实例 ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 监听器 ID列表
    */
    @SerializedName("ListenerIds")
    @Expose
    private String [] ListenerIds;

    /**
    * 监听器协议类型
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 监听器端口
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

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
     * 获取监听器 ID列表
     * @return ListenerIds 监听器 ID列表
     */
    public String [] getListenerIds() {
        return this.ListenerIds;
    }

    /**
     * 设置监听器 ID列表
     * @param ListenerIds 监听器 ID列表
     */
    public void setListenerIds(String [] ListenerIds) {
        this.ListenerIds = ListenerIds;
    }

    /**
     * 获取监听器协议类型
     * @return Protocol 监听器协议类型
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置监听器协议类型
     * @param Protocol 监听器协议类型
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取监听器端口
     * @return Port 监听器端口
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置监听器端口
     * @param Port 监听器端口
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArraySimple(map, prefix + "ListenerIds.", this.ListenerIds);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);

    }
}

