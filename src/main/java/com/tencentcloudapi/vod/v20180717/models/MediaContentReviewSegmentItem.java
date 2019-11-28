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

public class MediaContentReviewSegmentItem  extends AbstractModel{

    /**
    * 嫌疑片段起始的偏移时间，单位：秒。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 嫌疑片段结束的偏移时间，单位：秒。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
    * 嫌疑片段涉黄分数。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 嫌疑片段鉴黄结果标签。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 嫌疑片段鉴黄结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 该字段已废弃，请使用 PicUrlExpireTime。
    */
    @SerializedName("PicUrlExpireTimeStamp")
    @Expose
    private Long PicUrlExpireTimeStamp;

    /**
    * 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("PicUrlExpireTime")
    @Expose
    private String PicUrlExpireTime;

    /**
     * 获取嫌疑片段起始的偏移时间，单位：秒。
     * @return StartTimeOffset 嫌疑片段起始的偏移时间，单位：秒。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * 设置嫌疑片段起始的偏移时间，单位：秒。
     * @param StartTimeOffset 嫌疑片段起始的偏移时间，单位：秒。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * 获取嫌疑片段结束的偏移时间，单位：秒。
     * @return EndTimeOffset 嫌疑片段结束的偏移时间，单位：秒。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * 设置嫌疑片段结束的偏移时间，单位：秒。
     * @param EndTimeOffset 嫌疑片段结束的偏移时间，单位：秒。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * 获取嫌疑片段涉黄分数。
     * @return Confidence 嫌疑片段涉黄分数。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置嫌疑片段涉黄分数。
     * @param Confidence 嫌疑片段涉黄分数。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取嫌疑片段鉴黄结果标签。
     * @return Label 嫌疑片段鉴黄结果标签。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * 设置嫌疑片段鉴黄结果标签。
     * @param Label 嫌疑片段鉴黄结果标签。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * 获取嫌疑片段鉴黄结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     * @return Suggestion 嫌疑片段鉴黄结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * 设置嫌疑片段鉴黄结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     * @param Suggestion 嫌疑片段鉴黄结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * 获取嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
     * @return Url 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * 设置嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
     * @param Url 嫌疑图片 URL （图片不会永久存储，到达
 PicUrlExpireTime 时间点后图片将被删除）。
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * 获取该字段已废弃，请使用 PicUrlExpireTime。
     * @return PicUrlExpireTimeStamp 该字段已废弃，请使用 PicUrlExpireTime。
     */
    public Long getPicUrlExpireTimeStamp() {
        return this.PicUrlExpireTimeStamp;
    }

    /**
     * 设置该字段已废弃，请使用 PicUrlExpireTime。
     * @param PicUrlExpireTimeStamp 该字段已废弃，请使用 PicUrlExpireTime。
     */
    public void setPicUrlExpireTimeStamp(Long PicUrlExpireTimeStamp) {
        this.PicUrlExpireTimeStamp = PicUrlExpireTimeStamp;
    }

    /**
     * 获取嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return PicUrlExpireTime 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getPicUrlExpireTime() {
        return this.PicUrlExpireTime;
    }

    /**
     * 设置嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param PicUrlExpireTime 嫌疑图片 URL 失效时间，使用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setPicUrlExpireTime(String PicUrlExpireTime) {
        this.PicUrlExpireTime = PicUrlExpireTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "PicUrlExpireTimeStamp", this.PicUrlExpireTimeStamp);
        this.setParamSimple(map, prefix + "PicUrlExpireTime", this.PicUrlExpireTime);

    }
}

