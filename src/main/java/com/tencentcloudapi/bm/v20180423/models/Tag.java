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

public class Tag  extends AbstractModel{

    /**
    * 标签键
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 标签键对应的值
    */
    @SerializedName("TagValues")
    @Expose
    private String [] TagValues;

    /**
     * 获取标签键
     * @return TagKey 标签键
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * 设置标签键
     * @param TagKey 标签键
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * 获取标签键对应的值
     * @return TagValues 标签键对应的值
     */
    public String [] getTagValues() {
        return this.TagValues;
    }

    /**
     * 设置标签键对应的值
     * @param TagValues 标签键对应的值
     */
    public void setTagValues(String [] TagValues) {
        this.TagValues = TagValues;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamArraySimple(map, prefix + "TagValues.", this.TagValues);

    }
}

