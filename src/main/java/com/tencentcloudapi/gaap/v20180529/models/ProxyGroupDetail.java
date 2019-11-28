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

public class ProxyGroupDetail  extends AbstractModel{

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 通道组中通道数量
    */
    @SerializedName("ProxyNum")
    @Expose
    private Long ProxyNum;

    /**
    * 通道组状态：
0 正常运行
1 创建中
4 销毁中
11 迁移中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 归属Uin
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 创建Uin
    */
    @SerializedName("CreateUin")
    @Expose
    private String CreateUin;

    /**
    * 通道名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 通道组域名解析默认IP
    */
    @SerializedName("DnsDefaultIp")
    @Expose
    private String DnsDefaultIp;

    /**
    * 通道组域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 目标地域
    */
    @SerializedName("RealServerRegionInfo")
    @Expose
    private RegionDetail RealServerRegionInfo;

    /**
    * 是否老通道组，2018-08-03之前创建的通道组为老通道组
    */
    @SerializedName("IsOldGroup")
    @Expose
    private Boolean IsOldGroup;

    /**
    * 通道组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取通道组中通道数量
     * @return ProxyNum 通道组中通道数量
     */
    public Long getProxyNum() {
        return this.ProxyNum;
    }

    /**
     * 设置通道组中通道数量
     * @param ProxyNum 通道组中通道数量
     */
    public void setProxyNum(Long ProxyNum) {
        this.ProxyNum = ProxyNum;
    }

    /**
     * 获取通道组状态：
0 正常运行
1 创建中
4 销毁中
11 迁移中
     * @return Status 通道组状态：
0 正常运行
1 创建中
4 销毁中
11 迁移中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * 设置通道组状态：
0 正常运行
1 创建中
4 销毁中
11 迁移中
     * @param Status 通道组状态：
0 正常运行
1 创建中
4 销毁中
11 迁移中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * 获取归属Uin
     * @return OwnerUin 归属Uin
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * 设置归属Uin
     * @param OwnerUin 归属Uin
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * 获取创建Uin
     * @return CreateUin 创建Uin
     */
    public String getCreateUin() {
        return this.CreateUin;
    }

    /**
     * 设置创建Uin
     * @param CreateUin 创建Uin
     */
    public void setCreateUin(String CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * 获取通道名称
     * @return GroupName 通道名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * 设置通道名称
     * @param GroupName 通道名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * 获取通道组域名解析默认IP
     * @return DnsDefaultIp 通道组域名解析默认IP
     */
    public String getDnsDefaultIp() {
        return this.DnsDefaultIp;
    }

    /**
     * 设置通道组域名解析默认IP
     * @param DnsDefaultIp 通道组域名解析默认IP
     */
    public void setDnsDefaultIp(String DnsDefaultIp) {
        this.DnsDefaultIp = DnsDefaultIp;
    }

    /**
     * 获取通道组域名
注意：此字段可能返回 null，表示取不到有效值。
     * @return Domain 通道组域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置通道组域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 通道组域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取目标地域
     * @return RealServerRegionInfo 目标地域
     */
    public RegionDetail getRealServerRegionInfo() {
        return this.RealServerRegionInfo;
    }

    /**
     * 设置目标地域
     * @param RealServerRegionInfo 目标地域
     */
    public void setRealServerRegionInfo(RegionDetail RealServerRegionInfo) {
        this.RealServerRegionInfo = RealServerRegionInfo;
    }

    /**
     * 获取是否老通道组，2018-08-03之前创建的通道组为老通道组
     * @return IsOldGroup 是否老通道组，2018-08-03之前创建的通道组为老通道组
     */
    public Boolean getIsOldGroup() {
        return this.IsOldGroup;
    }

    /**
     * 设置是否老通道组，2018-08-03之前创建的通道组为老通道组
     * @param IsOldGroup 是否老通道组，2018-08-03之前创建的通道组为老通道组
     */
    public void setIsOldGroup(Boolean IsOldGroup) {
        this.IsOldGroup = IsOldGroup;
    }

    /**
     * 获取通道组ID
     * @return GroupId 通道组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置通道组ID
     * @param GroupId 通道组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 获取标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @return TagSet 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * 设置标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ProxyNum", this.ProxyNum);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "DnsDefaultIp", this.DnsDefaultIp);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamObj(map, prefix + "RealServerRegionInfo.", this.RealServerRegionInfo);
        this.setParamSimple(map, prefix + "IsOldGroup", this.IsOldGroup);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

