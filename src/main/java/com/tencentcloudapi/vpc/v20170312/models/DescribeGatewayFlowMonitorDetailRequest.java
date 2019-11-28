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

public class DescribeGatewayFlowMonitorDetailRequest  extends AbstractModel{

    /**
    * 时间点。表示要查询这分钟内的明细。如：`2019-02-28 18:15:20`，将查询 `18:15` 这一分钟内的明细。
    */
    @SerializedName("TimePoint")
    @Expose
    private String TimePoint;

    /**
    * VPN网关实例ID，形如：`vpn-ltjahce6`。
    */
    @SerializedName("VpnId")
    @Expose
    private String VpnId;

    /**
    * 专线网关实例ID，形如：`dcg-ltjahce6`。
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * 对等连接实例ID，形如：`pcx-ltjahce6`。
    */
    @SerializedName("PeeringConnectionId")
    @Expose
    private String PeeringConnectionId;

    /**
    * NAT网关实例ID，形如：`nat-ltjahce6`。
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * 偏移量。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数量。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 排序字段。支持 `InPkg` `OutPkg` `InTraffic` `OutTraffic`。
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方法。顺序：`ASC`，倒序：`DESC`。
    */
    @SerializedName("OrderDirection")
    @Expose
    private String OrderDirection;

    /**
     * 获取时间点。表示要查询这分钟内的明细。如：`2019-02-28 18:15:20`，将查询 `18:15` 这一分钟内的明细。
     * @return TimePoint 时间点。表示要查询这分钟内的明细。如：`2019-02-28 18:15:20`，将查询 `18:15` 这一分钟内的明细。
     */
    public String getTimePoint() {
        return this.TimePoint;
    }

    /**
     * 设置时间点。表示要查询这分钟内的明细。如：`2019-02-28 18:15:20`，将查询 `18:15` 这一分钟内的明细。
     * @param TimePoint 时间点。表示要查询这分钟内的明细。如：`2019-02-28 18:15:20`，将查询 `18:15` 这一分钟内的明细。
     */
    public void setTimePoint(String TimePoint) {
        this.TimePoint = TimePoint;
    }

    /**
     * 获取VPN网关实例ID，形如：`vpn-ltjahce6`。
     * @return VpnId VPN网关实例ID，形如：`vpn-ltjahce6`。
     */
    public String getVpnId() {
        return this.VpnId;
    }

    /**
     * 设置VPN网关实例ID，形如：`vpn-ltjahce6`。
     * @param VpnId VPN网关实例ID，形如：`vpn-ltjahce6`。
     */
    public void setVpnId(String VpnId) {
        this.VpnId = VpnId;
    }

    /**
     * 获取专线网关实例ID，形如：`dcg-ltjahce6`。
     * @return DirectConnectGatewayId 专线网关实例ID，形如：`dcg-ltjahce6`。
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * 设置专线网关实例ID，形如：`dcg-ltjahce6`。
     * @param DirectConnectGatewayId 专线网关实例ID，形如：`dcg-ltjahce6`。
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * 获取对等连接实例ID，形如：`pcx-ltjahce6`。
     * @return PeeringConnectionId 对等连接实例ID，形如：`pcx-ltjahce6`。
     */
    public String getPeeringConnectionId() {
        return this.PeeringConnectionId;
    }

    /**
     * 设置对等连接实例ID，形如：`pcx-ltjahce6`。
     * @param PeeringConnectionId 对等连接实例ID，形如：`pcx-ltjahce6`。
     */
    public void setPeeringConnectionId(String PeeringConnectionId) {
        this.PeeringConnectionId = PeeringConnectionId;
    }

    /**
     * 获取NAT网关实例ID，形如：`nat-ltjahce6`。
     * @return NatId NAT网关实例ID，形如：`nat-ltjahce6`。
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * 设置NAT网关实例ID，形如：`nat-ltjahce6`。
     * @param NatId NAT网关实例ID，形如：`nat-ltjahce6`。
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * 获取偏移量。
     * @return Offset 偏移量。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量。
     * @param Offset 偏移量。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量。
     * @return Limit 返回数量。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量。
     * @param Limit 返回数量。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取排序字段。支持 `InPkg` `OutPkg` `InTraffic` `OutTraffic`。
     * @return OrderField 排序字段。支持 `InPkg` `OutPkg` `InTraffic` `OutTraffic`。
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * 设置排序字段。支持 `InPkg` `OutPkg` `InTraffic` `OutTraffic`。
     * @param OrderField 排序字段。支持 `InPkg` `OutPkg` `InTraffic` `OutTraffic`。
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * 获取排序方法。顺序：`ASC`，倒序：`DESC`。
     * @return OrderDirection 排序方法。顺序：`ASC`，倒序：`DESC`。
     */
    public String getOrderDirection() {
        return this.OrderDirection;
    }

    /**
     * 设置排序方法。顺序：`ASC`，倒序：`DESC`。
     * @param OrderDirection 排序方法。顺序：`ASC`，倒序：`DESC`。
     */
    public void setOrderDirection(String OrderDirection) {
        this.OrderDirection = OrderDirection;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimePoint", this.TimePoint);
        this.setParamSimple(map, prefix + "VpnId", this.VpnId);
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamSimple(map, prefix + "PeeringConnectionId", this.PeeringConnectionId);
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "OrderDirection", this.OrderDirection);

    }
}

