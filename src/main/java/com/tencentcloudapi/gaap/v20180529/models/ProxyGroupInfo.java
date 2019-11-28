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

public class ProxyGroupInfo  extends AbstractModel{

    /**
    * 通道组id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 通道组域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 通道组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 目标地域
    */
    @SerializedName("RealServerRegionInfo")
    @Expose
    private RegionDetail RealServerRegionInfo;

    /**
    * 通道组状态。
其中，
0，运行中；
1，创建中；
4，销毁中；
11，通道迁移中。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 标签列表。
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
     * 获取通道组id
     * @return GroupId 通道组id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置通道组id
     * @param GroupId 通道组id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
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
     * 获取通道组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return GroupName 通道组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * 设置通道组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 通道组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
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
     * 获取通道组状态。
其中，
0，运行中；
1，创建中；
4，销毁中；
11，通道迁移中。
     * @return Status 通道组状态。
其中，
0，运行中；
1，创建中；
4，销毁中；
11，通道迁移中。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置通道组状态。
其中，
0，运行中；
1，创建中；
4，销毁中；
11，通道迁移中。
     * @param Status 通道组状态。
其中，
0，运行中；
1，创建中；
4，销毁中；
11，通道迁移中。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取标签列表。
     * @return TagSet 标签列表。
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * 设置标签列表。
     * @param TagSet 标签列表。
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamObj(map, prefix + "RealServerRegionInfo.", this.RealServerRegionInfo);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

