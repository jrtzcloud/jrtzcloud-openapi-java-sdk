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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLicenseResponse  extends AbstractModel{

    /**
    * Base64 编码的许可证二进制数据。
    */
    @SerializedName("License")
    @Expose
    private String License;

    /**
    * 加密内容的内容ID
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取Base64 编码的许可证二进制数据。
     * @return License Base64 编码的许可证二进制数据。
     */
    public String getLicense() {
        return this.License;
    }

    /**
     * 设置Base64 编码的许可证二进制数据。
     * @param License Base64 编码的许可证二进制数据。
     */
    public void setLicense(String License) {
        this.License = License;
    }

    /**
     * 获取加密内容的内容ID
     * @return ContentId 加密内容的内容ID
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * 设置加密内容的内容ID
     * @param ContentId 加密内容的内容ID
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
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
        this.setParamSimple(map, prefix + "License", this.License);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

