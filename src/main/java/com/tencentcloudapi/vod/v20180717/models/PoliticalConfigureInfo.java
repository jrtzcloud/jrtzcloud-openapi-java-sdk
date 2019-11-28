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

public class PoliticalConfigureInfo  extends AbstractModel{

    /**
    * 画面鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImgReviewInfo")
    @Expose
    private PoliticalImgReviewTemplateInfo ImgReviewInfo;

    /**
    * 语音鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private PoliticalAsrReviewTemplateInfo AsrReviewInfo;

    /**
    * 文本鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private PoliticalOcrReviewTemplateInfo OcrReviewInfo;

    /**
     * 获取画面鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ImgReviewInfo 画面鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PoliticalImgReviewTemplateInfo getImgReviewInfo() {
        return this.ImgReviewInfo;
    }

    /**
     * 设置画面鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImgReviewInfo 画面鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImgReviewInfo(PoliticalImgReviewTemplateInfo ImgReviewInfo) {
        this.ImgReviewInfo = ImgReviewInfo;
    }

    /**
     * 获取语音鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AsrReviewInfo 语音鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PoliticalAsrReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * 设置语音鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrReviewInfo 语音鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrReviewInfo(PoliticalAsrReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * 获取文本鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return OcrReviewInfo 文本鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PoliticalOcrReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * 设置文本鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrReviewInfo 文本鉴政控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrReviewInfo(PoliticalOcrReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ImgReviewInfo.", this.ImgReviewInfo);
        this.setParamObj(map, prefix + "AsrReviewInfo.", this.AsrReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

