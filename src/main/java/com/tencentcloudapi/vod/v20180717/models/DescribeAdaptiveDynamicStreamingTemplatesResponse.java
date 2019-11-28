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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAdaptiveDynamicStreamingTemplatesResponse  extends AbstractModel{

    /**
    * 符合过滤条件的记录总数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 转自适应码流模板详情列表。
    */
    @SerializedName("AdaptiveDynamicStreamingTemplateSet")
    @Expose
    private AdaptiveDynamicStreamingTemplate [] AdaptiveDynamicStreamingTemplateSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取符合过滤条件的记录总数。
     * @return TotalCount 符合过滤条件的记录总数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合过滤条件的记录总数。
     * @param TotalCount 符合过滤条件的记录总数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取转自适应码流模板详情列表。
     * @return AdaptiveDynamicStreamingTemplateSet 转自适应码流模板详情列表。
     */
    public AdaptiveDynamicStreamingTemplate [] getAdaptiveDynamicStreamingTemplateSet() {
        return this.AdaptiveDynamicStreamingTemplateSet;
    }

    /**
     * 设置转自适应码流模板详情列表。
     * @param AdaptiveDynamicStreamingTemplateSet 转自适应码流模板详情列表。
     */
    public void setAdaptiveDynamicStreamingTemplateSet(AdaptiveDynamicStreamingTemplate [] AdaptiveDynamicStreamingTemplateSet) {
        this.AdaptiveDynamicStreamingTemplateSet = AdaptiveDynamicStreamingTemplateSet;
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
        this.setParamArrayObj(map, prefix + "AdaptiveDynamicStreamingTemplateSet.", this.AdaptiveDynamicStreamingTemplateSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

