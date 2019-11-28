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

public class AiReviewPoliticalTaskOutput  extends AbstractModel{

    /**
    * 视频涉政评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Confidence")
    @Expose
    private Float Confidence;

    /**
    * 涉政结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 视频鉴政结果标签，取值范围：
<li>politician：政治人物。</li>
<li>violation_photo：违规图标。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 有涉政嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaContentReviewPoliticalSegmentItem [] SegmentSet;

    /**
     * 获取视频涉政评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Confidence 视频涉政评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置视频涉政评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Confidence 视频涉政评分，分值为0到100。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfidence(Float Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取涉政结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @return Suggestion 涉政结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * 设置涉政结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Suggestion 涉政结果建议，取值范围：
<li>pass。</li>
<li>review。</li>
<li>block。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * 获取视频鉴政结果标签，取值范围：
<li>politician：政治人物。</li>
<li>violation_photo：违规图标。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @return Label 视频鉴政结果标签，取值范围：
<li>politician：政治人物。</li>
<li>violation_photo：违规图标。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * 设置视频鉴政结果标签，取值范围：
<li>politician：政治人物。</li>
<li>violation_photo：违规图标。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Label 视频鉴政结果标签，取值范围：
<li>politician：政治人物。</li>
<li>violation_photo：违规图标。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * 获取有涉政嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SegmentSet 有涉政嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaContentReviewPoliticalSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * 设置有涉政嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentSet 有涉政嫌疑的视频片段列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentSet(MediaContentReviewPoliticalSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

