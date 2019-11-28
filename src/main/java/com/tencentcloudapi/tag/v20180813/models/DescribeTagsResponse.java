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

public class DescribeTagsResponse  extends AbstractModel{

    /**
    * 结果总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 数据位移偏量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页大小
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private TagWithDelete [] Tags;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取结果总数
     * @return TotalCount 结果总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置结果总数
     * @param TotalCount 结果总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取数据位移偏量
     * @return Offset 数据位移偏量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置数据位移偏量
     * @param Offset 数据位移偏量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取每页大小
     * @return Limit 每页大小
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置每页大小
     * @param Limit 每页大小
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取标签列表
     * @return Tags 标签列表
     */
    public TagWithDelete [] getTags() {
        return this.Tags;
    }

    /**
     * 设置标签列表
     * @param Tags 标签列表
     */
    public void setTags(TagWithDelete [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

