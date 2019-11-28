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
package com.tencentcloudapi.tics.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TagType  extends AbstractModel{

    /**
    * 标签
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 标签对应的中文解释
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
     * 获取标签
     * @return Tag 标签
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * 设置标签
     * @param Tag 标签
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * 获取标签对应的中文解释
     * @return Desc 标签对应的中文解释
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * 设置标签对应的中文解释
     * @param Desc 标签对应的中文解释
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Desc", this.Desc);

    }
}

