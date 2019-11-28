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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateHTTPListenerRequest  extends AbstractModel{

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 通道ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
     * 获取监听器名称
     * @return ListenerName 监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * 设置监听器名称
     * @param ListenerName 监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * 获取监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
     * @return Port 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * 设置监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
     * @param Port 监听器端口，基于同种传输层协议（TCP 或 UDP）的监听器，端口不可重复
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * 获取通道ID
     * @return ProxyId 通道ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * 设置通道ID
     * @param ProxyId 通道ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);

    }
}

