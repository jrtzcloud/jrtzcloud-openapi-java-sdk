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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BashRule  extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 客户端ID
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 规则名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 危险等级(1: 高危 2:中危 3: 低危)
    */
    @SerializedName("Level")
    @Expose
    private Integer Level;

    /**
    * 正则表达式
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * 规则描述
    */
    @SerializedName("Decription")
    @Expose
    private String Decription;

    /**
    * 操作人
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 是否全局规则
    */
    @SerializedName("IsGlobal")
    @Expose
    private Integer IsGlobal;

    /**
    * 状态 (0: 有效 1: 无效)
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 主机IP
    */
    @SerializedName("Hostip")
    @Expose
    private String Hostip;

    /**
     * 获取规则ID
     * @return Id 规则ID
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置规则ID
     * @param Id 规则ID
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取客户端ID
     * @return Uuid 客户端ID
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置客户端ID
     * @param Uuid 客户端ID
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取规则名称
     * @return Name 规则名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置规则名称
     * @param Name 规则名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取危险等级(1: 高危 2:中危 3: 低危)
     * @return Level 危险等级(1: 高危 2:中危 3: 低危)
     */
    public Integer getLevel() {
        return this.Level;
    }

    /**
     * 设置危险等级(1: 高危 2:中危 3: 低危)
     * @param Level 危险等级(1: 高危 2:中危 3: 低危)
     */
    public void setLevel(Integer Level) {
        this.Level = Level;
    }

    /**
     * 获取正则表达式
     * @return Rule 正则表达式
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * 设置正则表达式
     * @param Rule 正则表达式
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * 获取规则描述
     * @return Decription 规则描述
     */
    public String getDecription() {
        return this.Decription;
    }

    /**
     * 设置规则描述
     * @param Decription 规则描述
     */
    public void setDecription(String Decription) {
        this.Decription = Decription;
    }

    /**
     * 获取操作人
     * @return Operator 操作人
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * 设置操作人
     * @param Operator 操作人
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * 获取是否全局规则
     * @return IsGlobal 是否全局规则
     */
    public Integer getIsGlobal() {
        return this.IsGlobal;
    }

    /**
     * 设置是否全局规则
     * @param IsGlobal 是否全局规则
     */
    public void setIsGlobal(Integer IsGlobal) {
        this.IsGlobal = IsGlobal;
    }

    /**
     * 获取状态 (0: 有效 1: 无效)
     * @return Status 状态 (0: 有效 1: 无效)
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置状态 (0: 有效 1: 无效)
     * @param Status 状态 (0: 有效 1: 无效)
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
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
     * 获取修改时间
     * @return ModifyTime 修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * 设置修改时间
     * @param ModifyTime 修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * 获取主机IP
     * @return Hostip 主机IP
     */
    public String getHostip() {
        return this.Hostip;
    }

    /**
     * 设置主机IP
     * @param Hostip 主机IP
     */
    public void setHostip(String Hostip) {
        this.Hostip = Hostip;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "Decription", this.Decription);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "IsGlobal", this.IsGlobal);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "Hostip", this.Hostip);

    }
}

