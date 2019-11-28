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
package com.tencentcloudapi.habo.v20181203.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartAnalyseResponse  extends AbstractModel{

    /**
    * 接口调用状态，1表示成功，非1表示失败
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 成功时返回success，失败时返回具体的失败原因
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 保留字段
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取接口调用状态，1表示成功，非1表示失败
     * @return Status 接口调用状态，1表示成功，非1表示失败
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置接口调用状态，1表示成功，非1表示失败
     * @param Status 接口调用状态，1表示成功，非1表示失败
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取成功时返回success，失败时返回具体的失败原因
     * @return Info 成功时返回success，失败时返回具体的失败原因
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * 设置成功时返回success，失败时返回具体的失败原因
     * @param Info 成功时返回success，失败时返回具体的失败原因
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * 获取保留字段
     * @return Data 保留字段
     */
    public String getData() {
        return this.Data;
    }

    /**
     * 设置保留字段
     * @param Data 保留字段
     */
    public void setData(String Data) {
        this.Data = Data;
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

