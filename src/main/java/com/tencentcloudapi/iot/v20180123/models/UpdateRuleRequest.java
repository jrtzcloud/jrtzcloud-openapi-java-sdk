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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateRuleRequest  extends AbstractModel{

    /**
    * 规则Id
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 查询
    */
    @SerializedName("Query")
    @Expose
    private RuleQuery Query;

    /**
    * 转发动作列表
    */
    @SerializedName("Actions")
    @Expose
    private Action [] Actions;

    /**
    * 数据类型（0：文本，1：二进制）
    */
    @SerializedName("DataType")
    @Expose
    private Integer DataType;

    /**
     * 获取规则Id
     * @return RuleId 规则Id
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置规则Id
     * @param RuleId 规则Id
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取名称
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取描述
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取查询
     * @return Query 查询
     */
    public RuleQuery getQuery() {
        return this.Query;
    }

    /**
     * 设置查询
     * @param Query 查询
     */
    public void setQuery(RuleQuery Query) {
        this.Query = Query;
    }

    /**
     * 获取转发动作列表
     * @return Actions 转发动作列表
     */
    public Action [] getActions() {
        return this.Actions;
    }

    /**
     * 设置转发动作列表
     * @param Actions 转发动作列表
     */
    public void setActions(Action [] Actions) {
        this.Actions = Actions;
    }

    /**
     * 获取数据类型（0：文本，1：二进制）
     * @return DataType 数据类型（0：文本，1：二进制）
     */
    public Integer getDataType() {
        return this.DataType;
    }

    /**
     * 设置数据类型（0：文本，1：二进制）
     * @param DataType 数据类型（0：文本，1：二进制）
     */
    public void setDataType(Integer DataType) {
        this.DataType = DataType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamObj(map, prefix + "Query.", this.Query);
        this.setParamArrayObj(map, prefix + "Actions.", this.Actions);
        this.setParamSimple(map, prefix + "DataType", this.DataType);

    }
}

