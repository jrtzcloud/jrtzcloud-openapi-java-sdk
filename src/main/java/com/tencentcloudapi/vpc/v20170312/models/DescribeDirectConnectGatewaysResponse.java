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

public class DescribeDirectConnectGatewaysResponse  extends AbstractModel{

    /**
    * 符合条件的对象数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 专线网关对象数组。
    */
    @SerializedName("DirectConnectGatewaySet")
    @Expose
    private DirectConnectGateway [] DirectConnectGatewaySet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取符合条件的对象数。
     * @return TotalCount 符合条件的对象数。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置符合条件的对象数。
     * @param TotalCount 符合条件的对象数。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取专线网关对象数组。
     * @return DirectConnectGatewaySet 专线网关对象数组。
     */
    public DirectConnectGateway [] getDirectConnectGatewaySet() {
        return this.DirectConnectGatewaySet;
    }

    /**
     * 设置专线网关对象数组。
     * @param DirectConnectGatewaySet 专线网关对象数组。
     */
    public void setDirectConnectGatewaySet(DirectConnectGateway [] DirectConnectGatewaySet) {
        this.DirectConnectGatewaySet = DirectConnectGatewaySet;
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
        this.setParamArrayObj(map, prefix + "DirectConnectGatewaySet.", this.DirectConnectGatewaySet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

