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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesStatusResponse  extends AbstractModel{

    /**
    * 符合条件的实例状态数量。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * [实例状态](https://cloud.tencent.com/document/api/213/15738) 列表。
    */
    @SerializedName("InstanceStatusSet")
    @Expose
    private InstanceStatus [] InstanceStatusSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取符合条件的实例状态数量。
     * @return TotalCount 符合条件的实例状态数量。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合条件的实例状态数量。
     * @param TotalCount 符合条件的实例状态数量。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取[实例状态](https://cloud.tencent.com/document/api/213/15738) 列表。
     * @return InstanceStatusSet [实例状态](https://cloud.tencent.com/document/api/213/15738) 列表。
     */
    public InstanceStatus [] getInstanceStatusSet() {
        return this.InstanceStatusSet;
    }

    /**
     * 设置[实例状态](https://cloud.tencent.com/document/api/213/15738) 列表。
     * @param InstanceStatusSet [实例状态](https://cloud.tencent.com/document/api/213/15738) 列表。
     */
    public void setInstanceStatusSet(InstanceStatus [] InstanceStatusSet) {
        this.InstanceStatusSet = InstanceStatusSet;
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
        this.setParamArrayObj(map, prefix + "InstanceStatusSet.", this.InstanceStatusSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

