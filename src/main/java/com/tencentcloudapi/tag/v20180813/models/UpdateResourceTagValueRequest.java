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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateResourceTagValueRequest  extends AbstractModel{

    /**
    * 资源关联的标签键
    */
    @SerializedName("TagKey")
    @Expose
    private String TagKey;

    /**
    * 修改后的标签值
    */
    @SerializedName("TagValue")
    @Expose
    private String TagValue;

    /**
    * 资源的六段式描述
    */
    @SerializedName("Resource")
    @Expose
    private String Resource;

    /**
     * 获取资源关联的标签键
     * @return TagKey 资源关联的标签键
     */
    public String getTagKey() {
        return this.TagKey;
    }

    /**
     * 设置资源关联的标签键
     * @param TagKey 资源关联的标签键
     */
    public void setTagKey(String TagKey) {
        this.TagKey = TagKey;
    }

    /**
     * 获取修改后的标签值
     * @return TagValue 修改后的标签值
     */
    public String getTagValue() {
        return this.TagValue;
    }

    /**
     * 设置修改后的标签值
     * @param TagValue 修改后的标签值
     */
    public void setTagValue(String TagValue) {
        this.TagValue = TagValue;
    }

    /**
     * 获取资源的六段式描述
     * @return Resource 资源的六段式描述
     */
    public String getResource() {
        return this.Resource;
    }

    /**
     * 设置资源的六段式描述
     * @param Resource 资源的六段式描述
     */
    public void setResource(String Resource) {
        this.Resource = Resource;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TagKey", this.TagKey);
        this.setParamSimple(map, prefix + "TagValue", this.TagValue);
        this.setParamSimple(map, prefix + "Resource", this.Resource);

    }
}

