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
package com.tencentcloudapi.cws.v20180312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSitesResponse  extends AbstractModel{

    /**
    * 新增站点数。
    */
    @SerializedName("Number")
    @Expose
    private Integer Number;

    /**
    * 站点数组
    */
    @SerializedName("Sites")
    @Expose
    private MiniSite [] Sites;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取新增站点数。
     * @return Number 新增站点数。
     */
    public Integer getNumber() {
        return this.Number;
    }

    /**
     * 设置新增站点数。
     * @param Number 新增站点数。
     */
    public void setNumber(Integer Number) {
        this.Number = Number;
    }

    /**
     * 获取站点数组
     * @return Sites 站点数组
     */
    public MiniSite [] getSites() {
        return this.Sites;
    }

    /**
     * 设置站点数组
     * @param Sites 站点数组
     */
    public void setSites(MiniSite [] Sites) {
        this.Sites = Sites;
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
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamArrayObj(map, prefix + "Sites.", this.Sites);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

