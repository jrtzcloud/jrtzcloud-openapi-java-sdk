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

public class DescribeAIRecognitionTemplatesRequest  extends AbstractModel{

    /**
    * 视频内容识别模板唯一标识过滤条件，数组长度限制：10。
    */
    @SerializedName("Definitions")
    @Expose
    private Long [] Definitions;

    /**
    * 分页偏移量，默认值：0。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回记录条数，默认值：10，最大值：50。
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * 获取视频内容识别模板唯一标识过滤条件，数组长度限制：10。
     * @return Definitions 视频内容识别模板唯一标识过滤条件，数组长度限制：10。
     */
    public Long [] getDefinitions() {
        return this.Definitions;
    }

    /**
     * 设置视频内容识别模板唯一标识过滤条件，数组长度限制：10。
     * @param Definitions 视频内容识别模板唯一标识过滤条件，数组长度限制：10。
     */
    public void setDefinitions(Long [] Definitions) {
        this.Definitions = Definitions;
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
     * 获取返回记录条数，默认值：10，最大值：50。
     * @return Limit 返回记录条数，默认值：10，最大值：50。
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回记录条数，默认值：10，最大值：50。
     * @param Limit 返回记录条数，默认值：10，最大值：50。
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Definitions.", this.Definitions);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

