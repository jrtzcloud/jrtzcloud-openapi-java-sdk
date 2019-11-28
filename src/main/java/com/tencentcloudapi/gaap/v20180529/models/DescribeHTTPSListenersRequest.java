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

public class DescribeHTTPSListenersRequest  extends AbstractModel{

    /**
    * 过滤条件，通道ID
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 过滤条件，根据监听器ID进行精确查询。
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 过滤条件，根据监听器名称进行精确查询。
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 过滤条件，根据监听器端口进行精确查询。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * 偏移量， 默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制数量，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 过滤条件，支持按照端口或监听器名称进行模糊查询
    */
    @SerializedName("SearchValue")
    @Expose
    private String SearchValue;

    /**
     * 获取过滤条件，通道ID
     * @return ProxyId 过滤条件，通道ID
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * 设置过滤条件，通道ID
     * @param ProxyId 过滤条件，通道ID
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * 获取过滤条件，根据监听器ID进行精确查询。
     * @return ListenerId 过滤条件，根据监听器ID进行精确查询。
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置过滤条件，根据监听器ID进行精确查询。
     * @param ListenerId 过滤条件，根据监听器ID进行精确查询。
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取过滤条件，根据监听器名称进行精确查询。
     * @return ListenerName 过滤条件，根据监听器名称进行精确查询。
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * 设置过滤条件，根据监听器名称进行精确查询。
     * @param ListenerName 过滤条件，根据监听器名称进行精确查询。
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * 获取过滤条件，根据监听器端口进行精确查询。
     * @return Port 过滤条件，根据监听器端口进行精确查询。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * 设置过滤条件，根据监听器端口进行精确查询。
     * @param Port 过滤条件，根据监听器端口进行精确查询。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * 获取偏移量， 默认为0
     * @return Offset 偏移量， 默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量， 默认为0
     * @param Offset 偏移量， 默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取限制数量，默认为20
     * @return Limit 限制数量，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置限制数量，默认为20
     * @param Limit 限制数量，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取过滤条件，支持按照端口或监听器名称进行模糊查询
     * @return SearchValue 过滤条件，支持按照端口或监听器名称进行模糊查询
     */
    public String getSearchValue() {
        return this.SearchValue;
    }

    /**
     * 设置过滤条件，支持按照端口或监听器名称进行模糊查询
     * @param SearchValue 过滤条件，支持按照端口或监听器名称进行模糊查询
     */
    public void setSearchValue(String SearchValue) {
        this.SearchValue = SearchValue;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchValue", this.SearchValue);

    }
}

