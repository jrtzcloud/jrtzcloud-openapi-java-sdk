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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartitionInfo  extends AbstractModel{

    /**
    * 分区名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 分区大小
    */
    @SerializedName("Size")
    @Expose
    private Integer Size;

    /**
     * 获取分区名称
     * @return Name 分区名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置分区名称
     * @param Name 分区名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取分区大小
     * @return Size 分区大小
     */
    public Integer getSize() {
        return this.Size;
    }

    /**
     * 设置分区大小
     * @param Size 分区大小
     */
    public void setSize(Integer Size) {
        this.Size = Size;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

