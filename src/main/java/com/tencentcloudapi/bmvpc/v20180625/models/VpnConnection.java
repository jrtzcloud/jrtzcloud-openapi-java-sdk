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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VpnConnection  extends AbstractModel{

    /**
    * 通道实例ID。
    */
    @SerializedName("VpnConnectionId")
    @Expose
    private String VpnConnectionId;

    /**
    * 通道名称。
    */
    @SerializedName("VpnConnectionName")
    @Expose
    private String VpnConnectionName;

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * VPN网关实例ID。
    */
    @SerializedName("VpnGatewayId")
    @Expose
    private String VpnGatewayId;

    /**
    * 对端网关实例ID。
    */
    @SerializedName("CustomerGatewayId")
    @Expose
    private String CustomerGatewayId;

    /**
    * 预共享密钥。
    */
    @SerializedName("PreShareKey")
    @Expose
    private String PreShareKey;

    /**
    * 通道传输协议。
    */
    @SerializedName("VpnProto")
    @Expose
    private String VpnProto;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 通道的生产状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 通道连接状态
    */
    @SerializedName("NetStatus")
    @Expose
    private String NetStatus;

    /**
    * SPD。
    */
    @SerializedName("SecurityPolicyDatabaseSet")
    @Expose
    private SecurityPolicyDatabase [] SecurityPolicyDatabaseSet;

    /**
    * IKE选项。
    */
    @SerializedName("IKEOptionsSpecification")
    @Expose
    private IKEOptionsSpecification IKEOptionsSpecification;

    /**
    * IPSEC选项。
    */
    @SerializedName("IPSECOptionsSpecification")
    @Expose
    private IPSECOptionsSpecification IPSECOptionsSpecification;

    /**
    * 可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * VPC网段
    */
    @SerializedName("VpcCidrBlock")
    @Expose
    private String VpcCidrBlock;

    /**
    * VPC名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
     * 获取通道实例ID。
     * @return VpnConnectionId 通道实例ID。
     */
    public String getVpnConnectionId() {
        return this.VpnConnectionId;
    }

    /**
     * 设置通道实例ID。
     * @param VpnConnectionId 通道实例ID。
     */
    public void setVpnConnectionId(String VpnConnectionId) {
        this.VpnConnectionId = VpnConnectionId;
    }

    /**
     * 获取通道名称。
     * @return VpnConnectionName 通道名称。
     */
    public String getVpnConnectionName() {
        return this.VpnConnectionName;
    }

    /**
     * 设置通道名称。
     * @param VpnConnectionName 通道名称。
     */
    public void setVpnConnectionName(String VpnConnectionName) {
        this.VpnConnectionName = VpnConnectionName;
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
     * 获取VPN网关实例ID。
     * @return VpnGatewayId VPN网关实例ID。
     */
    public String getVpnGatewayId() {
        return this.VpnGatewayId;
    }

    /**
     * 设置VPN网关实例ID。
     * @param VpnGatewayId VPN网关实例ID。
     */
    public void setVpnGatewayId(String VpnGatewayId) {
        this.VpnGatewayId = VpnGatewayId;
    }

    /**
     * 获取对端网关实例ID。
     * @return CustomerGatewayId 对端网关实例ID。
     */
    public String getCustomerGatewayId() {
        return this.CustomerGatewayId;
    }

    /**
     * 设置对端网关实例ID。
     * @param CustomerGatewayId 对端网关实例ID。
     */
    public void setCustomerGatewayId(String CustomerGatewayId) {
        this.CustomerGatewayId = CustomerGatewayId;
    }

    /**
     * 获取预共享密钥。
     * @return PreShareKey 预共享密钥。
     */
    public String getPreShareKey() {
        return this.PreShareKey;
    }

    /**
     * 设置预共享密钥。
     * @param PreShareKey 预共享密钥。
     */
    public void setPreShareKey(String PreShareKey) {
        this.PreShareKey = PreShareKey;
    }

    /**
     * 获取通道传输协议。
     * @return VpnProto 通道传输协议。
     */
    public String getVpnProto() {
        return this.VpnProto;
    }

    /**
     * 设置通道传输协议。
     * @param VpnProto 通道传输协议。
     */
    public void setVpnProto(String VpnProto) {
        this.VpnProto = VpnProto;
    }

    /**
     * 获取创建时间。
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取通道的生产状态
     * @return State 通道的生产状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置通道的生产状态
     * @param State 通道的生产状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取通道连接状态
     * @return NetStatus 通道连接状态
     */
    public String getNetStatus() {
        return this.NetStatus;
    }

    /**
     * 设置通道连接状态
     * @param NetStatus 通道连接状态
     */
    public void setNetStatus(String NetStatus) {
        this.NetStatus = NetStatus;
    }

    /**
     * 获取SPD。
     * @return SecurityPolicyDatabaseSet SPD。
     */
    public SecurityPolicyDatabase [] getSecurityPolicyDatabaseSet() {
        return this.SecurityPolicyDatabaseSet;
    }

    /**
     * 设置SPD。
     * @param SecurityPolicyDatabaseSet SPD。
     */
    public void setSecurityPolicyDatabaseSet(SecurityPolicyDatabase [] SecurityPolicyDatabaseSet) {
        this.SecurityPolicyDatabaseSet = SecurityPolicyDatabaseSet;
    }

    /**
     * 获取IKE选项。
     * @return IKEOptionsSpecification IKE选项。
     */
    public IKEOptionsSpecification getIKEOptionsSpecification() {
        return this.IKEOptionsSpecification;
    }

    /**
     * 设置IKE选项。
     * @param IKEOptionsSpecification IKE选项。
     */
    public void setIKEOptionsSpecification(IKEOptionsSpecification IKEOptionsSpecification) {
        this.IKEOptionsSpecification = IKEOptionsSpecification;
    }

    /**
     * 获取IPSEC选项。
     * @return IPSECOptionsSpecification IPSEC选项。
     */
    public IPSECOptionsSpecification getIPSECOptionsSpecification() {
        return this.IPSECOptionsSpecification;
    }

    /**
     * 设置IPSEC选项。
     * @param IPSECOptionsSpecification IPSEC选项。
     */
    public void setIPSECOptionsSpecification(IPSECOptionsSpecification IPSECOptionsSpecification) {
        this.IPSECOptionsSpecification = IPSECOptionsSpecification;
    }

    /**
     * 获取可用区
     * @return Zone 可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区
     * @param Zone 可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取VPC网段
     * @return VpcCidrBlock VPC网段
     */
    public String getVpcCidrBlock() {
        return this.VpcCidrBlock;
    }

    /**
     * 设置VPC网段
     * @param VpcCidrBlock VPC网段
     */
    public void setVpcCidrBlock(String VpcCidrBlock) {
        this.VpcCidrBlock = VpcCidrBlock;
    }

    /**
     * 获取VPC名称
     * @return VpcName VPC名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * 设置VPC名称
     * @param VpcName VPC名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpnConnectionId", this.VpnConnectionId);
        this.setParamSimple(map, prefix + "VpnConnectionName", this.VpnConnectionName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpnGatewayId", this.VpnGatewayId);
        this.setParamSimple(map, prefix + "CustomerGatewayId", this.CustomerGatewayId);
        this.setParamSimple(map, prefix + "PreShareKey", this.PreShareKey);
        this.setParamSimple(map, prefix + "VpnProto", this.VpnProto);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "NetStatus", this.NetStatus);
        this.setParamArrayObj(map, prefix + "SecurityPolicyDatabaseSet.", this.SecurityPolicyDatabaseSet);
        this.setParamObj(map, prefix + "IKEOptionsSpecification.", this.IKEOptionsSpecification);
        this.setParamObj(map, prefix + "IPSECOptionsSpecification.", this.IPSECOptionsSpecification);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "VpcCidrBlock", this.VpcCidrBlock);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);

    }
}

