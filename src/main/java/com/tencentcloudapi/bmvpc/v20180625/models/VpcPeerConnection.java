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

public class VpcPeerConnection  extends AbstractModel{

    /**
    * 本端VPC唯一ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 对端VPC唯一ID
    */
    @SerializedName("PeerVpcId")
    @Expose
    private String PeerVpcId;

    /**
    * 本端APPID
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 对端APPID
    */
    @SerializedName("PeerAppId")
    @Expose
    private String PeerAppId;

    /**
    * 对等连接唯一ID
    */
    @SerializedName("VpcPeerConnectionId")
    @Expose
    private String VpcPeerConnectionId;

    /**
    * 对等连接名称
    */
    @SerializedName("VpcPeerConnectionName")
    @Expose
    private String VpcPeerConnectionName;

    /**
    * 对等连接状态
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 本端VPC所属可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcZone")
    @Expose
    private String VpcZone;

    /**
    * 对端VPC所属可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeerVpcZone")
    @Expose
    private String PeerVpcZone;

    /**
    * 本端Uin
    */
    @SerializedName("Uin")
    @Expose
    private Long Uin;

    /**
    * 对端Uin
    */
    @SerializedName("PeerUin")
    @Expose
    private Long PeerUin;

    /**
    * 对等连接类型
    */
    @SerializedName("PeerType")
    @Expose
    private Long PeerType;

    /**
    * 对等连接带宽
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 本端VPC地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 对端VPC地域
    */
    @SerializedName("PeerRegion")
    @Expose
    private String PeerRegion;

    /**
    * 是否允许删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeleteFlag")
    @Expose
    private Long DeleteFlag;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * 获取本端VPC唯一ID
     * @return VpcId 本端VPC唯一ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置本端VPC唯一ID
     * @param VpcId 本端VPC唯一ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取对端VPC唯一ID
     * @return PeerVpcId 对端VPC唯一ID
     */
    public String getPeerVpcId() {
        return this.PeerVpcId;
    }

    /**
     * 设置对端VPC唯一ID
     * @param PeerVpcId 对端VPC唯一ID
     */
    public void setPeerVpcId(String PeerVpcId) {
        this.PeerVpcId = PeerVpcId;
    }

    /**
     * 获取本端APPID
     * @return AppId 本端APPID
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * 设置本端APPID
     * @param AppId 本端APPID
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取对端APPID
     * @return PeerAppId 对端APPID
     */
    public String getPeerAppId() {
        return this.PeerAppId;
    }

    /**
     * 设置对端APPID
     * @param PeerAppId 对端APPID
     */
    public void setPeerAppId(String PeerAppId) {
        this.PeerAppId = PeerAppId;
    }

    /**
     * 获取对等连接唯一ID
     * @return VpcPeerConnectionId 对等连接唯一ID
     */
    public String getVpcPeerConnectionId() {
        return this.VpcPeerConnectionId;
    }

    /**
     * 设置对等连接唯一ID
     * @param VpcPeerConnectionId 对等连接唯一ID
     */
    public void setVpcPeerConnectionId(String VpcPeerConnectionId) {
        this.VpcPeerConnectionId = VpcPeerConnectionId;
    }

    /**
     * 获取对等连接名称
     * @return VpcPeerConnectionName 对等连接名称
     */
    public String getVpcPeerConnectionName() {
        return this.VpcPeerConnectionName;
    }

    /**
     * 设置对等连接名称
     * @param VpcPeerConnectionName 对等连接名称
     */
    public void setVpcPeerConnectionName(String VpcPeerConnectionName) {
        this.VpcPeerConnectionName = VpcPeerConnectionName;
    }

    /**
     * 获取对等连接状态
     * @return State 对等连接状态
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置对等连接状态
     * @param State 对等连接状态
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取本端VPC所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @return VpcZone 本端VPC所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcZone() {
        return this.VpcZone;
    }

    /**
     * 设置本端VPC所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcZone 本端VPC所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcZone(String VpcZone) {
        this.VpcZone = VpcZone;
    }

    /**
     * 获取对端VPC所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @return PeerVpcZone 对端VPC所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPeerVpcZone() {
        return this.PeerVpcZone;
    }

    /**
     * 设置对端VPC所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeerVpcZone 对端VPC所属可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeerVpcZone(String PeerVpcZone) {
        this.PeerVpcZone = PeerVpcZone;
    }

    /**
     * 获取本端Uin
     * @return Uin 本端Uin
     */
    public Long getUin() {
        return this.Uin;
    }

    /**
     * 设置本端Uin
     * @param Uin 本端Uin
     */
    public void setUin(Long Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取对端Uin
     * @return PeerUin 对端Uin
     */
    public Long getPeerUin() {
        return this.PeerUin;
    }

    /**
     * 设置对端Uin
     * @param PeerUin 对端Uin
     */
    public void setPeerUin(Long PeerUin) {
        this.PeerUin = PeerUin;
    }

    /**
     * 获取对等连接类型
     * @return PeerType 对等连接类型
     */
    public Long getPeerType() {
        return this.PeerType;
    }

    /**
     * 设置对等连接类型
     * @param PeerType 对等连接类型
     */
    public void setPeerType(Long PeerType) {
        this.PeerType = PeerType;
    }

    /**
     * 获取对等连接带宽
     * @return Bandwidth 对等连接带宽
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * 设置对等连接带宽
     * @param Bandwidth 对等连接带宽
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * 获取本端VPC地域
     * @return Region 本端VPC地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置本端VPC地域
     * @param Region 本端VPC地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取对端VPC地域
     * @return PeerRegion 对端VPC地域
     */
    public String getPeerRegion() {
        return this.PeerRegion;
    }

    /**
     * 设置对端VPC地域
     * @param PeerRegion 对端VPC地域
     */
    public void setPeerRegion(String PeerRegion) {
        this.PeerRegion = PeerRegion;
    }

    /**
     * 获取是否允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @return DeleteFlag 是否允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDeleteFlag() {
        return this.DeleteFlag;
    }

    /**
     * 设置是否允许删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeleteFlag 是否允许删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeleteFlag(Long DeleteFlag) {
        this.DeleteFlag = DeleteFlag;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "PeerVpcId", this.PeerVpcId);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "PeerAppId", this.PeerAppId);
        this.setParamSimple(map, prefix + "VpcPeerConnectionId", this.VpcPeerConnectionId);
        this.setParamSimple(map, prefix + "VpcPeerConnectionName", this.VpcPeerConnectionName);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "VpcZone", this.VpcZone);
        this.setParamSimple(map, prefix + "PeerVpcZone", this.PeerVpcZone);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "PeerUin", this.PeerUin);
        this.setParamSimple(map, prefix + "PeerType", this.PeerType);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PeerRegion", this.PeerRegion);
        this.setParamSimple(map, prefix + "DeleteFlag", this.DeleteFlag);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

