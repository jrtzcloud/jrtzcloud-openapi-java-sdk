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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeListenerRealServersResponse  extends AbstractModel{

    /**
    * 可绑定源站的个数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 源站信息列表
    */
    @SerializedName("RealServerSet")
    @Expose
    private RealServer [] RealServerSet;

    /**
    * 已绑定源站的个数
    */
    @SerializedName("BindRealServerTotalCount")
    @Expose
    private Long BindRealServerTotalCount;

    /**
    * 已绑定源站信息列表
    */
    @SerializedName("BindRealServerSet")
    @Expose
    private BindRealServer [] BindRealServerSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取可绑定源站的个数
     * @return TotalCount 可绑定源站的个数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置可绑定源站的个数
     * @param TotalCount 可绑定源站的个数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取源站信息列表
     * @return RealServerSet 源站信息列表
     */
    public RealServer [] getRealServerSet() {
        return this.RealServerSet;
    }

    /**
     * 设置源站信息列表
     * @param RealServerSet 源站信息列表
     */
    public void setRealServerSet(RealServer [] RealServerSet) {
        this.RealServerSet = RealServerSet;
    }

    /**
     * 获取已绑定源站的个数
     * @return BindRealServerTotalCount 已绑定源站的个数
     */
    public Long getBindRealServerTotalCount() {
        return this.BindRealServerTotalCount;
    }

    /**
     * 设置已绑定源站的个数
     * @param BindRealServerTotalCount 已绑定源站的个数
     */
    public void setBindRealServerTotalCount(Long BindRealServerTotalCount) {
        this.BindRealServerTotalCount = BindRealServerTotalCount;
    }

    /**
     * 获取已绑定源站信息列表
     * @return BindRealServerSet 已绑定源站信息列表
     */
    public BindRealServer [] getBindRealServerSet() {
        return this.BindRealServerSet;
    }

    /**
     * 设置已绑定源站信息列表
     * @param BindRealServerSet 已绑定源站信息列表
     */
    public void setBindRealServerSet(BindRealServer [] BindRealServerSet) {
        this.BindRealServerSet = BindRealServerSet;
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
        this.setParamArrayObj(map, prefix + "RealServerSet.", this.RealServerSet);
        this.setParamSimple(map, prefix + "BindRealServerTotalCount", this.BindRealServerTotalCount);
        this.setParamArrayObj(map, prefix + "BindRealServerSet.", this.BindRealServerSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

