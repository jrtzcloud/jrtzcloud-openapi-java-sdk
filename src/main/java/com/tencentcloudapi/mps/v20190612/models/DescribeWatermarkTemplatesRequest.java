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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeWatermarkTemplatesRequest  extends AbstractModel{

    /**
    * 水印模板唯一标识过滤条件，数组长度限制：100。
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * 水印类型过滤条件，可选值：
<li>image：图片水印；</li>
<li>text：文字水印。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数
<li>默认值：10；</li>
<li>最大值：100。</li>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * 获取水印模板唯一标识过滤条件，数组长度限制：100。
     * @return Definitions 水印模板唯一标识过滤条件，数组长度限制：100。
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * 设置水印模板唯一标识过滤条件，数组长度限制：100。
     * @param Definitions 水印模板唯一标识过滤条件，数组长度限制：100。
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
    }

    /**
     * 获取水印类型过滤条件，可选值：
<li>image：图片水印；</li>
<li>text：文字水印。</li>
     * @return Type 水印类型过滤条件，可选值：
<li>image：图片水印；</li>
<li>text：文字水印。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置水印类型过滤条件，可选值：
<li>image：图片水印；</li>
<li>text：文字水印。</li>
     * @param Type 水印类型过滤条件，可选值：
<li>image：图片水印；</li>
<li>text：文字水印。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取分页偏移量，默认值：0。
     * @return Offset 分页偏移量，默认值：0。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页偏移量，默认值：0。
     * @param Offset 分页偏移量，默认值：0。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回记录条数
<li>默认值：10；</li>
<li>最大值：100。</li>
     * @return Limit 返回记录条数
<li>默认值：10；</li>
<li>最大值：100。</li>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回记录条数
<li>默认值：10；</li>
<li>最大值：100。</li>
     * @param Limit 返回记录条数
<li>默认值：10；</li>
<li>最大值：100。</li>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

