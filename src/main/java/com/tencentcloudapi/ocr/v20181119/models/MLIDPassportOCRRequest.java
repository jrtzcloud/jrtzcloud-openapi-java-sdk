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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MLIDPassportOCRRequest  extends AbstractModel{

    /**
    * 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
    */
    @SerializedName("ImageBase64")
    @Expose
    private String ImageBase64;

    /**
    * 是否返回图片
    */
    @SerializedName("RetImage")
    @Expose
    private Boolean RetImage;

    /**
     * 获取图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
     * @return ImageBase64 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
     */
    public String getImageBase64() {
        return this.ImageBase64;
    }

    /**
     * 设置图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
     * @param ImageBase64 图片的 Base64 值。
支持的图片格式：PNG、JPG、JPEG，暂不支持 GIF 格式。
支持的图片大小：所下载图片经Base64编码后不超过 3M。图片下载时间不超过 3 秒。
     */
    public void setImageBase64(String ImageBase64) {
        this.ImageBase64 = ImageBase64;
    }

    /**
     * 获取是否返回图片
     * @return RetImage 是否返回图片
     */
    public Boolean getRetImage() {
        return this.RetImage;
    }

    /**
     * 设置是否返回图片
     * @param RetImage 是否返回图片
     */
    public void setRetImage(Boolean RetImage) {
        this.RetImage = RetImage;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ImageBase64", this.ImageBase64);
        this.setParamSimple(map, prefix + "RetImage", this.RetImage);

    }
}

