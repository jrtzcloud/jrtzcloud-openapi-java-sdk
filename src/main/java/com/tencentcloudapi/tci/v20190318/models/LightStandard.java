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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LightStandard  extends AbstractModel{

    /**
    * 光照名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 范围
    */
    @SerializedName("Range")
    @Expose
    private Float [] Range;

    /**
     * 获取光照名称
     * @return Name 光照名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置光照名称
     * @param Name 光照名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取范围
     * @return Range 范围
     */
    public Float [] getRange() {
        return this.Range;
    }

    /**
     * 设置范围
     * @param Range 范围
     */
    public void setRange(Float [] Range) {
        this.Range = Range;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamArraySimple(map, prefix + "Range.", this.Range);

    }
}

