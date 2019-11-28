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

public class NatGateway  extends AbstractModel{

    /**
    * NAT网关的ID。
    */
    @SerializedName("NatGatewayId")
    @Expose
    private String NatGatewayId;

    /**
    * NAT网关的名称。
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * NAT网关创建的时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘FAILED’：失败。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 网关最大外网出带宽(单位:Mbps)。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Integer InternetMaxBandwidthOut;

    /**
    * 网关并发连接上限。
    */
    @SerializedName("MaxConcurrentConnection")
    @Expose
    private Integer MaxConcurrentConnection;

    /**
    * 绑定NAT网关的公网IP对象数组。
    */
    @SerializedName("PublicIpAddressSet")
    @Expose
    private NatGatewayAddress [] PublicIpAddressSet;

    /**
    * NAT网关网络状态。“AVAILABLE”:运行中, “UNAVAILABLE”:不可用, “INSUFFICIENT”:欠费停服。
    */
    @SerializedName("NetworkState")
    @Expose
    private String NetworkState;

    /**
    * NAT网关的端口转发规则。
    */
    @SerializedName("DestinationIpPortTranslationNatRuleSet")
    @Expose
    private DestinationIpPortTranslationNatRule [] DestinationIpPortTranslationNatRuleSet;

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * NAT网关所在的可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * 获取NAT网关的ID。
     * @return NatGatewayId NAT网关的ID。
     */
    public String getNatGatewayId() {
        return this.NatGatewayId;
    }

    /**
     * 设置NAT网关的ID。
     * @param NatGatewayId NAT网关的ID。
     */
    public void setNatGatewayId(String NatGatewayId) {
        this.NatGatewayId = NatGatewayId;
    }

    /**
     * 获取NAT网关的名称。
     * @return NatGatewayName NAT网关的名称。
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * 设置NAT网关的名称。
     * @param NatGatewayName NAT网关的名称。
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * 获取NAT网关创建的时间。
     * @return CreatedTime NAT网关创建的时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置NAT网关创建的时间。
     * @param CreatedTime NAT网关创建的时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘FAILED’：失败。
     * @return State NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘FAILED’：失败。
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘FAILED’：失败。
     * @param State NAT网关的状态。
 'PENDING'：生产中，'DELETING'：删除中，'AVAILABLE'：运行中，'UPDATING'：升级中，
‘FAILED’：失败。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取网关最大外网出带宽(单位:Mbps)。
     * @return InternetMaxBandwidthOut 网关最大外网出带宽(单位:Mbps)。
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * 设置网关最大外网出带宽(单位:Mbps)。
     * @param InternetMaxBandwidthOut 网关最大外网出带宽(单位:Mbps)。
     */
    public void setInternetMaxBandwidthOut(Integer InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * 获取网关并发连接上限。
     * @return MaxConcurrentConnection 网关并发连接上限。
     */
    public Integer getMaxConcurrentConnection() {
        return this.MaxConcurrentConnection;
    }

    /**
     * 设置网关并发连接上限。
     * @param MaxConcurrentConnection 网关并发连接上限。
     */
    public void setMaxConcurrentConnection(Integer MaxConcurrentConnection) {
        this.MaxConcurrentConnection = MaxConcurrentConnection;
    }

    /**
     * 获取绑定NAT网关的公网IP对象数组。
     * @return PublicIpAddressSet 绑定NAT网关的公网IP对象数组。
     */
    public NatGatewayAddress [] getPublicIpAddressSet() {
        return this.PublicIpAddressSet;
    }

    /**
     * 设置绑定NAT网关的公网IP对象数组。
     * @param PublicIpAddressSet 绑定NAT网关的公网IP对象数组。
     */
    public void setPublicIpAddressSet(NatGatewayAddress [] PublicIpAddressSet) {
        this.PublicIpAddressSet = PublicIpAddressSet;
    }

    /**
     * 获取NAT网关网络状态。“AVAILABLE”:运行中, “UNAVAILABLE”:不可用, “INSUFFICIENT”:欠费停服。
     * @return NetworkState NAT网关网络状态。“AVAILABLE”:运行中, “UNAVAILABLE”:不可用, “INSUFFICIENT”:欠费停服。
     */
    public String getNetworkState() {
        return this.NetworkState;
    }

    /**
     * 设置NAT网关网络状态。“AVAILABLE”:运行中, “UNAVAILABLE”:不可用, “INSUFFICIENT”:欠费停服。
     * @param NetworkState NAT网关网络状态。“AVAILABLE”:运行中, “UNAVAILABLE”:不可用, “INSUFFICIENT”:欠费停服。
     */
    public void setNetworkState(String NetworkState) {
        this.NetworkState = NetworkState;
    }

    /**
     * 获取NAT网关的端口转发规则。
     * @return DestinationIpPortTranslationNatRuleSet NAT网关的端口转发规则。
     */
    public DestinationIpPortTranslationNatRule [] getDestinationIpPortTranslationNatRuleSet() {
        return this.DestinationIpPortTranslationNatRuleSet;
    }

    /**
     * 设置NAT网关的端口转发规则。
     * @param DestinationIpPortTranslationNatRuleSet NAT网关的端口转发规则。
     */
    public void setDestinationIpPortTranslationNatRuleSet(DestinationIpPortTranslationNatRule [] DestinationIpPortTranslationNatRuleSet) {
        this.DestinationIpPortTranslationNatRuleSet = DestinationIpPortTranslationNatRuleSet;
    }

    /**
     * 获取VPC实例ID。
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取NAT网关所在的可用区。
     * @return Zone NAT网关所在的可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置NAT网关所在的可用区。
     * @param Zone NAT网关所在的可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayId", this.NatGatewayId);
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxConcurrentConnection", this.MaxConcurrentConnection);
        this.setParamArrayObj(map, prefix + "PublicIpAddressSet.", this.PublicIpAddressSet);
        this.setParamSimple(map, prefix + "NetworkState", this.NetworkState);
        this.setParamArrayObj(map, prefix + "DestinationIpPortTranslationNatRuleSet.", this.DestinationIpPortTranslationNatRuleSet);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

