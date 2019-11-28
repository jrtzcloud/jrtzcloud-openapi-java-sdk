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
package com.tencentcloudapi.sts.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AssumeRoleWithSAMLResponse  extends AbstractModel{

    /**
    * 对象里面包含 Token，TmpSecretId，TmpSecretKey 三元组
    */
    @SerializedName("Credentials")
    @Expose
    private Credentials Credentials;

    /**
    * 证书无效的时间，返回 Unix 时间戳，精确到秒
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Integer ExpiredTime;

    /**
    * 证书无效的时间，以 ISO8601 格式的 UTC 时间表示
    */
    @SerializedName("Expiration")
    @Expose
    private String Expiration;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取对象里面包含 Token，TmpSecretId，TmpSecretKey 三元组
     * @return Credentials 对象里面包含 Token，TmpSecretId，TmpSecretKey 三元组
     */
    public Credentials getCredentials() {
        return this.Credentials;
    }

    /**
     * 设置对象里面包含 Token，TmpSecretId，TmpSecretKey 三元组
     * @param Credentials 对象里面包含 Token，TmpSecretId，TmpSecretKey 三元组
     */
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * 获取证书无效的时间，返回 Unix 时间戳，精确到秒
     * @return ExpiredTime 证书无效的时间，返回 Unix 时间戳，精确到秒
     */
    public Integer getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * 设置证书无效的时间，返回 Unix 时间戳，精确到秒
     * @param ExpiredTime 证书无效的时间，返回 Unix 时间戳，精确到秒
     */
    public void setExpiredTime(Integer ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * 获取证书无效的时间，以 ISO8601 格式的 UTC 时间表示
     * @return Expiration 证书无效的时间，以 ISO8601 格式的 UTC 时间表示
     */
    public String getExpiration() {
        return this.Expiration;
    }

    /**
     * 设置证书无效的时间，以 ISO8601 格式的 UTC 时间表示
     * @param Expiration 证书无效的时间，以 ISO8601 格式的 UTC 时间表示
     */
    public void setExpiration(String Expiration) {
        this.Expiration = Expiration;
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
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "Expiration", this.Expiration);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

