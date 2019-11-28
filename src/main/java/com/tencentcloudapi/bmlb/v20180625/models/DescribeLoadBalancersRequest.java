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

public class DescribeLoadBalancersRequest  extends AbstractModel{

    /**
    * 负载均衡器ID数组
    */
    @SerializedName("LoadBalancerIds")
    @Expose
    private String [] LoadBalancerIds;

    /**
    * 负载均衡的类型 : open表示公网LB类型，internal表示内网LB类型
    */
    @SerializedName("LoadBalancerType")
    @Expose
    private String LoadBalancerType;

    /**
    * 负载均衡器名称
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡域名。规则：1-60个小写英文字母、数字、点号“.”或连接线“-”。内网类型的负载均衡不能配置该字段
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 负载均衡获得的公网IP地址,支持多个
    */
    @SerializedName("LoadBalancerVips")
    @Expose
    private String [] LoadBalancerVips;

    /**
    * 数据偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数据长度，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 模糊查找名称、域名、VIP
    */
    @SerializedName("SearchKey")
    @Expose
    private String SearchKey;

    /**
    * 排序字段，支持：loadBalancerName,createTime,domain,loadBalancerType
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 1倒序，0顺序，默认顺序
    */
    @SerializedName("OrderType")
    @Expose
    private Integer OrderType;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 是否筛选独占集群，0表示非独占集群，1表示四层独占集群，2表示七层独占集群，3表示四层和七层独占集群，4表示共享容灾
    */
    @SerializedName("Exclusive")
    @Expose
    private Integer Exclusive;

    /**
    * 该负载均衡对应的tgw集群（fullnat,tunnel,dnat）
    */
    @SerializedName("TgwSetType")
    @Expose
    private String TgwSetType;

    /**
    * 该负载均衡对应的所在的私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 'CONFLIST' 查询带confId的LB列表，'CONFID' 查询某个confId绑定的LB列表
    */
    @SerializedName("QueryType")
    @Expose
    private String QueryType;

    /**
    * 个性化配置ID
    */
    @SerializedName("ConfId")
    @Expose
    private String ConfId;

    /**
     * 获取负载均衡器ID数组
     * @return LoadBalancerIds 负载均衡器ID数组
     */
    public String [] getLoadBalancerIds() {
        return this.LoadBalancerIds;
    }

    /**
     * 设置负载均衡器ID数组
     * @param LoadBalancerIds 负载均衡器ID数组
     */
    public void setLoadBalancerIds(String [] LoadBalancerIds) {
        this.LoadBalancerIds = LoadBalancerIds;
    }

    /**
     * 获取负载均衡的类型 : open表示公网LB类型，internal表示内网LB类型
     * @return LoadBalancerType 负载均衡的类型 : open表示公网LB类型，internal表示内网LB类型
     */
    public String getLoadBalancerType() {
        return this.LoadBalancerType;
    }

    /**
     * 设置负载均衡的类型 : open表示公网LB类型，internal表示内网LB类型
     * @param LoadBalancerType 负载均衡的类型 : open表示公网LB类型，internal表示内网LB类型
     */
    public void setLoadBalancerType(String LoadBalancerType) {
        this.LoadBalancerType = LoadBalancerType;
    }

    /**
     * 获取负载均衡器名称
     * @return LoadBalancerName 负载均衡器名称
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * 设置负载均衡器名称
     * @param LoadBalancerName 负载均衡器名称
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * 获取负载均衡域名。规则：1-60个小写英文字母、数字、点号“.”或连接线“-”。内网类型的负载均衡不能配置该字段
     * @return Domain 负载均衡域名。规则：1-60个小写英文字母、数字、点号“.”或连接线“-”。内网类型的负载均衡不能配置该字段
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置负载均衡域名。规则：1-60个小写英文字母、数字、点号“.”或连接线“-”。内网类型的负载均衡不能配置该字段
     * @param Domain 负载均衡域名。规则：1-60个小写英文字母、数字、点号“.”或连接线“-”。内网类型的负载均衡不能配置该字段
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取负载均衡获得的公网IP地址,支持多个
     * @return LoadBalancerVips 负载均衡获得的公网IP地址,支持多个
     */
    public String [] getLoadBalancerVips() {
        return this.LoadBalancerVips;
    }

    /**
     * 设置负载均衡获得的公网IP地址,支持多个
     * @param LoadBalancerVips 负载均衡获得的公网IP地址,支持多个
     */
    public void setLoadBalancerVips(String [] LoadBalancerVips) {
        this.LoadBalancerVips = LoadBalancerVips;
    }

    /**
     * 获取数据偏移量，默认为0
     * @return Offset 数据偏移量，默认为0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置数据偏移量，默认为0
     * @param Offset 数据偏移量，默认为0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数据长度，默认为20
     * @return Limit 返回数据长度，默认为20
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数据长度，默认为20
     * @param Limit 返回数据长度，默认为20
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取模糊查找名称、域名、VIP
     * @return SearchKey 模糊查找名称、域名、VIP
     */
    public String getSearchKey() {
        return this.SearchKey;
    }

    /**
     * 设置模糊查找名称、域名、VIP
     * @param SearchKey 模糊查找名称、域名、VIP
     */
    public void setSearchKey(String SearchKey) {
        this.SearchKey = SearchKey;
    }

    /**
     * 获取排序字段，支持：loadBalancerName,createTime,domain,loadBalancerType
     * @return OrderBy 排序字段，支持：loadBalancerName,createTime,domain,loadBalancerType
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * 设置排序字段，支持：loadBalancerName,createTime,domain,loadBalancerType
     * @param OrderBy 排序字段，支持：loadBalancerName,createTime,domain,loadBalancerType
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * 获取1倒序，0顺序，默认顺序
     * @return OrderType 1倒序，0顺序，默认顺序
     */
    public Integer getOrderType() {
        return this.OrderType;
    }

    /**
     * 设置1倒序，0顺序，默认顺序
     * @param OrderType 1倒序，0顺序，默认顺序
     */
    public void setOrderType(Integer OrderType) {
        this.OrderType = OrderType;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取是否筛选独占集群，0表示非独占集群，1表示四层独占集群，2表示七层独占集群，3表示四层和七层独占集群，4表示共享容灾
     * @return Exclusive 是否筛选独占集群，0表示非独占集群，1表示四层独占集群，2表示七层独占集群，3表示四层和七层独占集群，4表示共享容灾
     */
    public Integer getExclusive() {
        return this.Exclusive;
    }

    /**
     * 设置是否筛选独占集群，0表示非独占集群，1表示四层独占集群，2表示七层独占集群，3表示四层和七层独占集群，4表示共享容灾
     * @param Exclusive 是否筛选独占集群，0表示非独占集群，1表示四层独占集群，2表示七层独占集群，3表示四层和七层独占集群，4表示共享容灾
     */
    public void setExclusive(Integer Exclusive) {
        this.Exclusive = Exclusive;
    }

    /**
     * 获取该负载均衡对应的tgw集群（fullnat,tunnel,dnat）
     * @return TgwSetType 该负载均衡对应的tgw集群（fullnat,tunnel,dnat）
     */
    public String getTgwSetType() {
        return this.TgwSetType;
    }

    /**
     * 设置该负载均衡对应的tgw集群（fullnat,tunnel,dnat）
     * @param TgwSetType 该负载均衡对应的tgw集群（fullnat,tunnel,dnat）
     */
    public void setTgwSetType(String TgwSetType) {
        this.TgwSetType = TgwSetType;
    }

    /**
     * 获取该负载均衡对应的所在的私有网络ID
     * @return VpcId 该负载均衡对应的所在的私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置该负载均衡对应的所在的私有网络ID
     * @param VpcId 该负载均衡对应的所在的私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取'CONFLIST' 查询带confId的LB列表，'CONFID' 查询某个confId绑定的LB列表
     * @return QueryType 'CONFLIST' 查询带confId的LB列表，'CONFID' 查询某个confId绑定的LB列表
     */
    public String getQueryType() {
        return this.QueryType;
    }

    /**
     * 设置'CONFLIST' 查询带confId的LB列表，'CONFID' 查询某个confId绑定的LB列表
     * @param QueryType 'CONFLIST' 查询带confId的LB列表，'CONFID' 查询某个confId绑定的LB列表
     */
    public void setQueryType(String QueryType) {
        this.QueryType = QueryType;
    }

    /**
     * 获取个性化配置ID
     * @return ConfId 个性化配置ID
     */
    public String getConfId() {
        return this.ConfId;
    }

    /**
     * 设置个性化配置ID
     * @param ConfId 个性化配置ID
     */
    public void setConfId(String ConfId) {
        this.ConfId = ConfId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "LoadBalancerIds.", this.LoadBalancerIds);
        this.setParamSimple(map, prefix + "LoadBalancerType", this.LoadBalancerType);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "LoadBalancerVips.", this.LoadBalancerVips);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "SearchKey", this.SearchKey);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Exclusive", this.Exclusive);
        this.setParamSimple(map, prefix + "TgwSetType", this.TgwSetType);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "QueryType", this.QueryType);
        this.setParamSimple(map, prefix + "ConfId", this.ConfId);

    }
}

