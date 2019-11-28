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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroup  extends AbstractModel{

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 创建时间，时间格式：yyyy-mm-dd hh:mm:ss
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 入站规则
    */
    @SerializedName("Inbound")
    @Expose
    private Inbound [] Inbound;

    /**
    * 出站规则
    */
    @SerializedName("Outbound")
    @Expose
    private Outbound [] Outbound;

    /**
    * 安全组ID
    */
    @SerializedName("SecurityGroupId")
    @Expose
    private String SecurityGroupId;

    /**
    * 安全组名称
    */
    @SerializedName("SecurityGroupName")
    @Expose
    private String SecurityGroupName;

    /**
    * 安全组备注
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

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
     * 获取创建时间，时间格式：yyyy-mm-dd hh:mm:ss
     * @return CreateTime 创建时间，时间格式：yyyy-mm-dd hh:mm:ss
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间，时间格式：yyyy-mm-dd hh:mm:ss
     * @param CreateTime 创建时间，时间格式：yyyy-mm-dd hh:mm:ss
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取入站规则
     * @return Inbound 入站规则
     */
    public Inbound [] getInbound() {
        return this.Inbound;
    }

    /**
     * 设置入站规则
     * @param Inbound 入站规则
     */
    public void setInbound(Inbound [] Inbound) {
        this.Inbound = Inbound;
    }

    /**
     * 获取出站规则
     * @return Outbound 出站规则
     */
    public Outbound [] getOutbound() {
        return this.Outbound;
    }

    /**
     * 设置出站规则
     * @param Outbound 出站规则
     */
    public void setOutbound(Outbound [] Outbound) {
        this.Outbound = Outbound;
    }

    /**
     * 获取安全组ID
     * @return SecurityGroupId 安全组ID
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * 设置安全组ID
     * @param SecurityGroupId 安全组ID
     */
    public void setSecurityGroupId(String SecurityGroupId) {
        this.SecurityGroupId = SecurityGroupId;
    }

    /**
     * 获取安全组名称
     * @return SecurityGroupName 安全组名称
     */
    public String getSecurityGroupName() {
        return this.SecurityGroupName;
    }

    /**
     * 设置安全组名称
     * @param SecurityGroupName 安全组名称
     */
    public void setSecurityGroupName(String SecurityGroupName) {
        this.SecurityGroupName = SecurityGroupName;
    }

    /**
     * 获取安全组备注
     * @return SecurityGroupRemark 安全组备注
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * 设置安全组备注
     * @param SecurityGroupRemark 安全组备注
     */
    public void setSecurityGroupRemark(String SecurityGroupRemark) {
        this.SecurityGroupRemark = SecurityGroupRemark;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamArrayObj(map, prefix + "Inbound.", this.Inbound);
        this.setParamArrayObj(map, prefix + "Outbound.", this.Outbound);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupRemark", this.SecurityGroupRemark);

    }
}

