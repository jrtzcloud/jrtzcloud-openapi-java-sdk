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

public class DescribeTrafficMirrorListenersRequest  extends AbstractModel{

    /**
    * 流量镜像实例ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 分页的偏移量，也即从第几条记录开始查询
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 单次查询返回的条目数，默认值：500。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 待搜索的负载均衡Id。
    */
    @SerializedName("SearchLoadBalancerIds")
    @Expose
    private String [] SearchLoadBalancerIds;

    /**
    * 待搜索的负载均衡名称。
    */
    @SerializedName("SearchLoadBalancerNames")
    @Expose
    private String [] SearchLoadBalancerNames;

    /**
    * 待搜索的Vip。
    */
    @SerializedName("SearchVips")
    @Expose
    private String [] SearchVips;

    /**
    * 待搜索的监听器ID。
    */
    @SerializedName("SearchListenerIds")
    @Expose
    private String [] SearchListenerIds;

    /**
    * 待搜索的监听器名称。
    */
    @SerializedName("SearchListenerNames")
    @Expose
    private String [] SearchListenerNames;

    /**
    * 待搜索的协议名称。
    */
    @SerializedName("SearchProtocols")
    @Expose
    private String [] SearchProtocols;

    /**
    * 待搜索的端口。
    */
    @SerializedName("SearchLoadBalancerPorts")
    @Expose
    private Integer [] SearchLoadBalancerPorts;

    /**
     * 获取流量镜像实例ID。
     * @return TrafficMirrorId 流量镜像实例ID。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * 设置流量镜像实例ID。
     * @param TrafficMirrorId 流量镜像实例ID。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * 获取分页的偏移量，也即从第几条记录开始查询
     * @return Offset 分页的偏移量，也即从第几条记录开始查询
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页的偏移量，也即从第几条记录开始查询
     * @param Offset 分页的偏移量，也即从第几条记录开始查询
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取单次查询返回的条目数，默认值：500。
     * @return Limit 单次查询返回的条目数，默认值：500。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置单次查询返回的条目数，默认值：500。
     * @param Limit 单次查询返回的条目数，默认值：500。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取待搜索的负载均衡Id。
     * @return SearchLoadBalancerIds 待搜索的负载均衡Id。
     */
    public String [] getSearchLoadBalancerIds() {
        return this.SearchLoadBalancerIds;
    }

    /**
     * 设置待搜索的负载均衡Id。
     * @param SearchLoadBalancerIds 待搜索的负载均衡Id。
     */
    public void setSearchLoadBalancerIds(String [] SearchLoadBalancerIds) {
        this.SearchLoadBalancerIds = SearchLoadBalancerIds;
    }

    /**
     * 获取待搜索的负载均衡名称。
     * @return SearchLoadBalancerNames 待搜索的负载均衡名称。
     */
    public String [] getSearchLoadBalancerNames() {
        return this.SearchLoadBalancerNames;
    }

    /**
     * 设置待搜索的负载均衡名称。
     * @param SearchLoadBalancerNames 待搜索的负载均衡名称。
     */
    public void setSearchLoadBalancerNames(String [] SearchLoadBalancerNames) {
        this.SearchLoadBalancerNames = SearchLoadBalancerNames;
    }

    /**
     * 获取待搜索的Vip。
     * @return SearchVips 待搜索的Vip。
     */
    public String [] getSearchVips() {
        return this.SearchVips;
    }

    /**
     * 设置待搜索的Vip。
     * @param SearchVips 待搜索的Vip。
     */
    public void setSearchVips(String [] SearchVips) {
        this.SearchVips = SearchVips;
    }

    /**
     * 获取待搜索的监听器ID。
     * @return SearchListenerIds 待搜索的监听器ID。
     */
    public String [] getSearchListenerIds() {
        return this.SearchListenerIds;
    }

    /**
     * 设置待搜索的监听器ID。
     * @param SearchListenerIds 待搜索的监听器ID。
     */
    public void setSearchListenerIds(String [] SearchListenerIds) {
        this.SearchListenerIds = SearchListenerIds;
    }

    /**
     * 获取待搜索的监听器名称。
     * @return SearchListenerNames 待搜索的监听器名称。
     */
    public String [] getSearchListenerNames() {
        return this.SearchListenerNames;
    }

    /**
     * 设置待搜索的监听器名称。
     * @param SearchListenerNames 待搜索的监听器名称。
     */
    public void setSearchListenerNames(String [] SearchListenerNames) {
        this.SearchListenerNames = SearchListenerNames;
    }

    /**
     * 获取待搜索的协议名称。
     * @return SearchProtocols 待搜索的协议名称。
     */
    public String [] getSearchProtocols() {
        return this.SearchProtocols;
    }

    /**
     * 设置待搜索的协议名称。
     * @param SearchProtocols 待搜索的协议名称。
     */
    public void setSearchProtocols(String [] SearchProtocols) {
        this.SearchProtocols = SearchProtocols;
    }

    /**
     * 获取待搜索的端口。
     * @return SearchLoadBalancerPorts 待搜索的端口。
     */
    public Integer [] getSearchLoadBalancerPorts() {
        return this.SearchLoadBalancerPorts;
    }

    /**
     * 设置待搜索的端口。
     * @param SearchLoadBalancerPorts 待搜索的端口。
     */
    public void setSearchLoadBalancerPorts(Integer [] SearchLoadBalancerPorts) {
        this.SearchLoadBalancerPorts = SearchLoadBalancerPorts;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "SearchLoadBalancerIds.", this.SearchLoadBalancerIds);
        this.setParamArraySimple(map, prefix + "SearchLoadBalancerNames.", this.SearchLoadBalancerNames);
        this.setParamArraySimple(map, prefix + "SearchVips.", this.SearchVips);
        this.setParamArraySimple(map, prefix + "SearchListenerIds.", this.SearchListenerIds);
        this.setParamArraySimple(map, prefix + "SearchListenerNames.", this.SearchListenerNames);
        this.setParamArraySimple(map, prefix + "SearchProtocols.", this.SearchProtocols);
        this.setParamArraySimple(map, prefix + "SearchLoadBalancerPorts.", this.SearchLoadBalancerPorts);

    }
}

