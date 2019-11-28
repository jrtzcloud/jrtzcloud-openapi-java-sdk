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
package com.tencentcloudapi.bri.v20190328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBRIRequest  extends AbstractModel{

    /**
    * 业务风险情报请求体
    */
    @SerializedName("RequestData")
    @Expose
    private BRIRequest RequestData;

    /**
    * 客户用于计费的资源Id
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * 获取业务风险情报请求体
     * @return RequestData 业务风险情报请求体
     */
    public BRIRequest getRequestData() {
        return this.RequestData;
    }

    /**
     * 设置业务风险情报请求体
     * @param RequestData 业务风险情报请求体
     */
    public void setRequestData(BRIRequest RequestData) {
        this.RequestData = RequestData;
    }

    /**
     * 获取客户用于计费的资源Id
     * @return ResourceId 客户用于计费的资源Id
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * 设置客户用于计费的资源Id
     * @param ResourceId 客户用于计费的资源Id
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "RequestData.", this.RequestData);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

