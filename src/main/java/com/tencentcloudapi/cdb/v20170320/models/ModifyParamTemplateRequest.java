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

public class ModifyParamTemplateRequest  extends AbstractModel{

    /**
    * 模板 ID。
    */
    @SerializedName("TemplateId")
    @Expose
    private Integer TemplateId;

    /**
    * 模板名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模板描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 参数列表。
    */
    @SerializedName("ParamList")
    @Expose
    private Parameter [] ParamList;

    /**
     * 获取模板 ID。
     * @return TemplateId 模板 ID。
     */
    public Integer getTemplateId() {
        return this.TemplateId;
    }

    /**
     * 设置模板 ID。
     * @param TemplateId 模板 ID。
     */
    public void setTemplateId(Integer TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * 获取模板名称。
     * @return Name 模板名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置模板名称。
     * @param Name 模板名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取模板描述。
     * @return Description 模板描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置模板描述。
     * @param Description 模板描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取参数列表。
     * @return ParamList 参数列表。
     */
    public Parameter [] getParamList() {
        return this.ParamList;
    }

    /**
     * 设置参数列表。
     * @param ParamList 参数列表。
     */
    public void setParamList(Parameter [] ParamList) {
        this.ParamList = ParamList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArrayObj(map, prefix + "ParamList.", this.ParamList);

    }
}

