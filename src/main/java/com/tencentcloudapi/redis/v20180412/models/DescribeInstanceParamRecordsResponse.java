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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstanceParamRecordsResponse  extends AbstractModel{

    /**
    * 总的修改历史记录数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 修改历史记录信息。
    */
    @SerializedName("InstanceParamHistory")
    @Expose
    private InstanceParamHistory [] InstanceParamHistory;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取总的修改历史记录数。
     * @return TotalCount 总的修改历史记录数。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置总的修改历史记录数。
     * @param TotalCount 总的修改历史记录数。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取修改历史记录信息。
     * @return InstanceParamHistory 修改历史记录信息。
     */
    public InstanceParamHistory [] getInstanceParamHistory() {
        return this.InstanceParamHistory;
    }

    /**
     * 设置修改历史记录信息。
     * @param InstanceParamHistory 修改历史记录信息。
     */
    public void setInstanceParamHistory(InstanceParamHistory [] InstanceParamHistory) {
        this.InstanceParamHistory = InstanceParamHistory;
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
        this.setParamArrayObj(map, prefix + "InstanceParamHistory.", this.InstanceParamHistory);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

