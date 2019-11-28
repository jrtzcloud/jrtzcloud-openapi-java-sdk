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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeIp6TranslatorsResponse  extends AbstractModel{

    /**
    * 符合过滤条件的IPV6转换实例数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 符合过滤条件的IPV6转换实例详细信息
    */
    @SerializedName("Ip6TranslatorSet")
    @Expose
    private Ip6Translator [] Ip6TranslatorSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取符合过滤条件的IPV6转换实例数量。
     * @return TotalCount 符合过滤条件的IPV6转换实例数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合过滤条件的IPV6转换实例数量。
     * @param TotalCount 符合过滤条件的IPV6转换实例数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取符合过滤条件的IPV6转换实例详细信息
     * @return Ip6TranslatorSet 符合过滤条件的IPV6转换实例详细信息
     */
    public Ip6Translator [] getIp6TranslatorSet() {
        return this.Ip6TranslatorSet;
    }

    /**
     * 设置符合过滤条件的IPV6转换实例详细信息
     * @param Ip6TranslatorSet 符合过滤条件的IPV6转换实例详细信息
     */
    public void setIp6TranslatorSet(Ip6Translator [] Ip6TranslatorSet) {
        this.Ip6TranslatorSet = Ip6TranslatorSet;
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
        this.setParamArrayObj(map, prefix + "Ip6TranslatorSet.", this.Ip6TranslatorSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

