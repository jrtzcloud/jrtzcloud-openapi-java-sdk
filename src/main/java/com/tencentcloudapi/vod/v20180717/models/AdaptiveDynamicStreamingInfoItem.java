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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AdaptiveDynamicStreamingInfoItem  extends AbstractModel{

    /**
    * 转自适应码流规格。
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * 打包格式，可能为 hls 和 dash 两种。
    */
    @SerializedName("Package")
    @Expose
    private String Package;

    /**
    * 加密类型。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * 播放地址。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * 获取转自适应码流规格。
     * @return Definition 转自适应码流规格。
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置转自适应码流规格。
     * @param Definition 转自适应码流规格。
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取打包格式，可能为 hls 和 dash 两种。
     * @return Package 打包格式，可能为 hls 和 dash 两种。
     */
    public String getPackage() {
        return this.Package;
    }

    /**
     * 设置打包格式，可能为 hls 和 dash 两种。
     * @param Package 打包格式，可能为 hls 和 dash 两种。
     */
    public void setPackage(String Package) {
        this.Package = Package;
    }

    /**
     * 获取加密类型。
     * @return DrmType 加密类型。
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * 设置加密类型。
     * @param DrmType 加密类型。
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * 获取播放地址。
     * @return Url 播放地址。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置播放地址。
     * @param Url 播放地址。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "Package", this.Package);
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

