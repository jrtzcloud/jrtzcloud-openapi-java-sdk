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

public class NetworkInterface  extends AbstractModel{

    /**
    * 弹性网卡实例ID，例如：eni-f1xjkw1b。
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * 弹性网卡名称。
    */
    @SerializedName("NetworkInterfaceName")
    @Expose
    private String NetworkInterfaceName;

    /**
    * 弹性网卡描述。
    */
    @SerializedName("NetworkInterfaceDescription")
    @Expose
    private String NetworkInterfaceDescription;

    /**
    * 子网实例ID。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 绑定的安全组。
    */
    @SerializedName("GroupSet")
    @Expose
    private String [] GroupSet;

    /**
    * 是否是主网卡。
    */
    @SerializedName("Primary")
    @Expose
    private Boolean Primary;

    /**
    * MAC地址。
    */
    @SerializedName("MacAddress")
    @Expose
    private String MacAddress;

    /**
    * 弹性网卡状态：
<li>`PENDING`：创建中</li>
<li>`AVAILABLE`：可用的</li>
<li>`ATTACHING`：绑定中</li>
<li>`DETACHING`：解绑中</li>
<li>`DELETING`：删除中</li>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 内网IP信息。
    */
    @SerializedName("PrivateIpAddressSet")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddressSet;

    /**
    * 绑定的云服务器对象。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Attachment")
    @Expose
    private NetworkInterfaceAttachment Attachment;

    /**
    * 可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * `IPv6`地址列表。
    */
    @SerializedName("Ipv6AddressSet")
    @Expose
    private Ipv6Address [] Ipv6AddressSet;

    /**
    * 标签键值对。
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
     * 获取弹性网卡实例ID，例如：eni-f1xjkw1b。
     * @return NetworkInterfaceId 弹性网卡实例ID，例如：eni-f1xjkw1b。
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * 设置弹性网卡实例ID，例如：eni-f1xjkw1b。
     * @param NetworkInterfaceId 弹性网卡实例ID，例如：eni-f1xjkw1b。
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * 获取弹性网卡名称。
     * @return NetworkInterfaceName 弹性网卡名称。
     */
    public String getNetworkInterfaceName() {
        return this.NetworkInterfaceName;
    }

    /**
     * 设置弹性网卡名称。
     * @param NetworkInterfaceName 弹性网卡名称。
     */
    public void setNetworkInterfaceName(String NetworkInterfaceName) {
        this.NetworkInterfaceName = NetworkInterfaceName;
    }

    /**
     * 获取弹性网卡描述。
     * @return NetworkInterfaceDescription 弹性网卡描述。
     */
    public String getNetworkInterfaceDescription() {
        return this.NetworkInterfaceDescription;
    }

    /**
     * 设置弹性网卡描述。
     * @param NetworkInterfaceDescription 弹性网卡描述。
     */
    public void setNetworkInterfaceDescription(String NetworkInterfaceDescription) {
        this.NetworkInterfaceDescription = NetworkInterfaceDescription;
    }

    /**
     * 获取子网实例ID。
     * @return SubnetId 子网实例ID。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网实例ID。
     * @param SubnetId 子网实例ID。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
     * 获取绑定的安全组。
     * @return GroupSet 绑定的安全组。
     */
    public String [] getGroupSet() {
        return this.GroupSet;
    }

    /**
     * 设置绑定的安全组。
     * @param GroupSet 绑定的安全组。
     */
    public void setGroupSet(String [] GroupSet) {
        this.GroupSet = GroupSet;
    }

    /**
     * 获取是否是主网卡。
     * @return Primary 是否是主网卡。
     */
    public Boolean getPrimary() {
        return this.Primary;
    }

    /**
     * 设置是否是主网卡。
     * @param Primary 是否是主网卡。
     */
    public void setPrimary(Boolean Primary) {
        this.Primary = Primary;
    }

    /**
     * 获取MAC地址。
     * @return MacAddress MAC地址。
     */
    public String getMacAddress() {
        return this.MacAddress;
    }

    /**
     * 设置MAC地址。
     * @param MacAddress MAC地址。
     */
    public void setMacAddress(String MacAddress) {
        this.MacAddress = MacAddress;
    }

    /**
     * 获取弹性网卡状态：
<li>`PENDING`：创建中</li>
<li>`AVAILABLE`：可用的</li>
<li>`ATTACHING`：绑定中</li>
<li>`DETACHING`：解绑中</li>
<li>`DELETING`：删除中</li>
     * @return State 弹性网卡状态：
<li>`PENDING`：创建中</li>
<li>`AVAILABLE`：可用的</li>
<li>`ATTACHING`：绑定中</li>
<li>`DETACHING`：解绑中</li>
<li>`DELETING`：删除中</li>
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置弹性网卡状态：
<li>`PENDING`：创建中</li>
<li>`AVAILABLE`：可用的</li>
<li>`ATTACHING`：绑定中</li>
<li>`DETACHING`：解绑中</li>
<li>`DELETING`：删除中</li>
     * @param State 弹性网卡状态：
<li>`PENDING`：创建中</li>
<li>`AVAILABLE`：可用的</li>
<li>`ATTACHING`：绑定中</li>
<li>`DETACHING`：解绑中</li>
<li>`DELETING`：删除中</li>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取内网IP信息。
     * @return PrivateIpAddressSet 内网IP信息。
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddressSet() {
        return this.PrivateIpAddressSet;
    }

    /**
     * 设置内网IP信息。
     * @param PrivateIpAddressSet 内网IP信息。
     */
    public void setPrivateIpAddressSet(PrivateIpAddressSpecification [] PrivateIpAddressSet) {
        this.PrivateIpAddressSet = PrivateIpAddressSet;
    }

    /**
     * 获取绑定的云服务器对象。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Attachment 绑定的云服务器对象。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NetworkInterfaceAttachment getAttachment() {
        return this.Attachment;
    }

    /**
     * 设置绑定的云服务器对象。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Attachment 绑定的云服务器对象。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAttachment(NetworkInterfaceAttachment Attachment) {
        this.Attachment = Attachment;
    }

    /**
     * 获取可用区。
     * @return Zone 可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区。
     * @param Zone 可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取创建时间。
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取`IPv6`地址列表。
     * @return Ipv6AddressSet `IPv6`地址列表。
     */
    public Ipv6Address [] getIpv6AddressSet() {
        return this.Ipv6AddressSet;
    }

    /**
     * 设置`IPv6`地址列表。
     * @param Ipv6AddressSet `IPv6`地址列表。
     */
    public void setIpv6AddressSet(Ipv6Address [] Ipv6AddressSet) {
        this.Ipv6AddressSet = Ipv6AddressSet;
    }

    /**
     * 获取标签键值对。
     * @return TagSet 标签键值对。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * 设置标签键值对。
     * @param TagSet 标签键值对。
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "NetworkInterfaceName", this.NetworkInterfaceName);
        this.setParamSimple(map, prefix + "NetworkInterfaceDescription", this.NetworkInterfaceDescription);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "GroupSet.", this.GroupSet);
        this.setParamSimple(map, prefix + "Primary", this.Primary);
        this.setParamSimple(map, prefix + "MacAddress", this.MacAddress);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "PrivateIpAddressSet.", this.PrivateIpAddressSet);
        this.setParamObj(map, prefix + "Attachment.", this.Attachment);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamArrayObj(map, prefix + "Ipv6AddressSet.", this.Ipv6AddressSet);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

