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

public class AllocateAddressesResponse  extends AbstractModel{

    /**
    * 申请到的 EIP 的唯一 ID 列表。
    */
    @SerializedName("AddressSet")
    @Expose
    private String [] AddressSet;

    /**
    * 异步任务TaskId。可以使用[DescribeTaskResult](https://cloud.tencent.com/document/api/215/36271)接口查询任务状态。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取申请到的 EIP 的唯一 ID 列表。
     * @return AddressSet 申请到的 EIP 的唯一 ID 列表。
     */
    public String [] getAddressSet() {
        return this.AddressSet;
    }

    /**
     * 设置申请到的 EIP 的唯一 ID 列表。
     * @param AddressSet 申请到的 EIP 的唯一 ID 列表。
     */
    public void setAddressSet(String [] AddressSet) {
        this.AddressSet = AddressSet;
    }

    /**
     * 获取异步任务TaskId。可以使用[DescribeTaskResult](https://cloud.tencent.com/document/api/215/36271)接口查询任务状态。
     * @return TaskId 异步任务TaskId。可以使用[DescribeTaskResult](https://cloud.tencent.com/document/api/215/36271)接口查询任务状态。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置异步任务TaskId。可以使用[DescribeTaskResult](https://cloud.tencent.com/document/api/215/36271)接口查询任务状态。
     * @param TaskId 异步任务TaskId。可以使用[DescribeTaskResult](https://cloud.tencent.com/document/api/215/36271)接口查询任务状态。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
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
        this.setParamArraySimple(map, prefix + "AddressSet.", this.AddressSet);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

