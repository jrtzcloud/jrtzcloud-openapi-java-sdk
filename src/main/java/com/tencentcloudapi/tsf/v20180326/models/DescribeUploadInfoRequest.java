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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUploadInfoRequest  extends AbstractModel{

    /**
    * 应用ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 程序包名
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * 程序包版本
    */
    @SerializedName("PkgVersion")
    @Expose
    private String PkgVersion;

    /**
    * 程序包类型
    */
    @SerializedName("PkgType")
    @Expose
    private String PkgType;

    /**
    * 程序包介绍
    */
    @SerializedName("PkgDesc")
    @Expose
    private String PkgDesc;

    /**
     * 获取应用ID
     * @return ApplicationId 应用ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置应用ID
     * @param ApplicationId 应用ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取程序包名
     * @return PkgName 程序包名
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * 设置程序包名
     * @param PkgName 程序包名
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * 获取程序包版本
     * @return PkgVersion 程序包版本
     */
    public String getPkgVersion() {
        return this.PkgVersion;
    }

    /**
     * 设置程序包版本
     * @param PkgVersion 程序包版本
     */
    public void setPkgVersion(String PkgVersion) {
        this.PkgVersion = PkgVersion;
    }

    /**
     * 获取程序包类型
     * @return PkgType 程序包类型
     */
    public String getPkgType() {
        return this.PkgType;
    }

    /**
     * 设置程序包类型
     * @param PkgType 程序包类型
     */
    public void setPkgType(String PkgType) {
        this.PkgType = PkgType;
    }

    /**
     * 获取程序包介绍
     * @return PkgDesc 程序包介绍
     */
    public String getPkgDesc() {
        return this.PkgDesc;
    }

    /**
     * 设置程序包介绍
     * @param PkgDesc 程序包介绍
     */
    public void setPkgDesc(String PkgDesc) {
        this.PkgDesc = PkgDesc;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "PkgVersion", this.PkgVersion);
        this.setParamSimple(map, prefix + "PkgType", this.PkgType);
        this.setParamSimple(map, prefix + "PkgDesc", this.PkgDesc);

    }
}

