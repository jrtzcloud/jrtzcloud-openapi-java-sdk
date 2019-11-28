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
package com.tencentcloudapi.cis.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter  extends AbstractModel{

    /**
    * 过滤字段，可选值 - Zone，VpcId，InstanceName
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 过滤值列表
    */
    @SerializedName("ValueList")
    @Expose
    private String [] ValueList;

    /**
     * 获取过滤字段，可选值 - Zone，VpcId，InstanceName
     * @return Name 过滤字段，可选值 - Zone，VpcId，InstanceName
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置过滤字段，可选值 - Zone，VpcId，InstanceName
     * @param Name 过滤字段，可选值 - Zone，VpcId，InstanceName
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取过滤值列表
     * @return ValueList 过滤值列表
     */
    public String [] getValueList() {
        return this.ValueList;
    }

    /**
     * 设置过滤值列表
     * @param ValueList 过滤值列表
     */
    public void setValueList(String [] ValueList) {
        this.ValueList = ValueList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "ValueList.", this.ValueList);

    }
}

