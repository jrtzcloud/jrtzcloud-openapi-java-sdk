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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WaterPrintKey  extends AbstractModel{

    /**
    * 水印KeyID
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 水印Key值
    */
    @SerializedName("KeyContent")
    @Expose
    private String KeyContent;

    /**
    * 水印Key的版本号
    */
    @SerializedName("KeyVersion")
    @Expose
    private String KeyVersion;

    /**
    * 是否开启，取值[0（没有开启），1（已开启）]
    */
    @SerializedName("OpenStatus")
    @Expose
    private Long OpenStatus;

    /**
    * 秘钥生成时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * 获取水印KeyID
     * @return KeyId 水印KeyID
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * 设置水印KeyID
     * @param KeyId 水印KeyID
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * 获取水印Key值
     * @return KeyContent 水印Key值
     */
    public String getKeyContent() {
        return this.KeyContent;
    }

    /**
     * 设置水印Key值
     * @param KeyContent 水印Key值
     */
    public void setKeyContent(String KeyContent) {
        this.KeyContent = KeyContent;
    }

    /**
     * 获取水印Key的版本号
     * @return KeyVersion 水印Key的版本号
     */
    public String getKeyVersion() {
        return this.KeyVersion;
    }

    /**
     * 设置水印Key的版本号
     * @param KeyVersion 水印Key的版本号
     */
    public void setKeyVersion(String KeyVersion) {
        this.KeyVersion = KeyVersion;
    }

    /**
     * 获取是否开启，取值[0（没有开启），1（已开启）]
     * @return OpenStatus 是否开启，取值[0（没有开启），1（已开启）]
     */
    public Long getOpenStatus() {
        return this.OpenStatus;
    }

    /**
     * 设置是否开启，取值[0（没有开启），1（已开启）]
     * @param OpenStatus 是否开启，取值[0（没有开启），1（已开启）]
     */
    public void setOpenStatus(Long OpenStatus) {
        this.OpenStatus = OpenStatus;
    }

    /**
     * 获取秘钥生成时间
     * @return CreateTime 秘钥生成时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置秘钥生成时间
     * @param CreateTime 秘钥生成时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "KeyContent", this.KeyContent);
        this.setParamSimple(map, prefix + "KeyVersion", this.KeyVersion);
        this.setParamSimple(map, prefix + "OpenStatus", this.OpenStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

