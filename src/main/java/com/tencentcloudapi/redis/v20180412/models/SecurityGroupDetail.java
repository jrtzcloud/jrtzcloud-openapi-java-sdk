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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupDetail  extends AbstractModel{

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 安全组Id
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
    * 安全组标记
    */
    @SerializedName("SecurityGroupRemark")
    @Expose
    private String SecurityGroupRemark;

    /**
    * 安全组入站规则
    */
    @SerializedName("InboundRule")
    @Expose
    private SecurityGroupsInboundAndOutbound [] InboundRule;

    /**
    * 安全组出站规则
    */
    @SerializedName("OutboundRule")
    @Expose
    private SecurityGroupsInboundAndOutbound [] OutboundRule;

    /**
     * 获取项目Id
     * @return ProjectId 项目Id
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
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
     * 获取安全组Id
     * @return SecurityGroupId 安全组Id
     */
    public String getSecurityGroupId() {
        return this.SecurityGroupId;
    }

    /**
     * 设置安全组Id
     * @param SecurityGroupId 安全组Id
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
     * 获取安全组标记
     * @return SecurityGroupRemark 安全组标记
     */
    public String getSecurityGroupRemark() {
        return this.SecurityGroupRemark;
    }

    /**
     * 设置安全组标记
     * @param SecurityGroupRemark 安全组标记
     */
    public void setSecurityGroupRemark(String SecurityGroupRemark) {
        this.SecurityGroupRemark = SecurityGroupRemark;
    }

    /**
     * 获取安全组入站规则
     * @return InboundRule 安全组入站规则
     */
    public SecurityGroupsInboundAndOutbound [] getInboundRule() {
        return this.InboundRule;
    }

    /**
     * 设置安全组入站规则
     * @param InboundRule 安全组入站规则
     */
    public void setInboundRule(SecurityGroupsInboundAndOutbound [] InboundRule) {
        this.InboundRule = InboundRule;
    }

    /**
     * 获取安全组出站规则
     * @return OutboundRule 安全组出站规则
     */
    public SecurityGroupsInboundAndOutbound [] getOutboundRule() {
        return this.OutboundRule;
    }

    /**
     * 设置安全组出站规则
     * @param OutboundRule 安全组出站规则
     */
    public void setOutboundRule(SecurityGroupsInboundAndOutbound [] OutboundRule) {
        this.OutboundRule = OutboundRule;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "SecurityGroupId", this.SecurityGroupId);
        this.setParamSimple(map, prefix + "SecurityGroupName", this.SecurityGroupName);
        this.setParamSimple(map, prefix + "SecurityGroupRemark", this.SecurityGroupRemark);
        this.setParamArrayObj(map, prefix + "InboundRule.", this.InboundRule);
        this.setParamArrayObj(map, prefix + "OutboundRule.", this.OutboundRule);

    }
}

