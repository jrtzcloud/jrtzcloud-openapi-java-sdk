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

public class MediaAiAnalysisFrameTagItem  extends AbstractModel{

    /**
    * 按帧标签名称。
    */
    @SerializedName("Tag")
    @Expose
    private String Tag;

    /**
    * 按帧标签的可信度，取值范围是 0 到 100。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
     * 获取按帧标签名称。
     * @return Tag 按帧标签名称。
     */
    public String getTag() {
        return this.Tag;
    }

    /**
     * 设置按帧标签名称。
     * @param Tag 按帧标签名称。
     */
    public void setTag(String Tag) {
        this.Tag = Tag;
    }

    /**
     * 获取按帧标签的可信度，取值范围是 0 到 100。
     * @return Confidence 按帧标签的可信度，取值范围是 0 到 100。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置按帧标签的可信度，取值范围是 0 到 100。
     * @param Confidence 按帧标签的可信度，取值范围是 0 到 100。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tag", this.Tag);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);

    }
}

