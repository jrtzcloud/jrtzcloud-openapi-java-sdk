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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DictInfo  extends AbstractModel{

    /**
    * 词典键值
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 词典名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 词典大小，单位B
    */
    @SerializedName("Size")
    @Expose
    private Integer Size;

    /**
     * 获取词典键值
     * @return Key 词典键值
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * 设置词典键值
     * @param Key 词典键值
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * 获取词典名称
     * @return Name 词典名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置词典名称
     * @param Name 词典名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取词典大小，单位B
     * @return Size 词典大小，单位B
     */
    public Integer getSize() {
        return this.Size;
    }

    /**
     * 设置词典大小，单位B
     * @param Size 词典大小，单位B
     */
    public void setSize(Integer Size) {
        this.Size = Size;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

