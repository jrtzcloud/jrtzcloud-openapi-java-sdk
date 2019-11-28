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

public class UserDefineConfigureInfo  extends AbstractModel{

    /**
    * 用户自定义人物审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceReviewInfo")
    @Expose
    private UserDefineFaceReviewTemplateInfo FaceReviewInfo;

    /**
    * 用户自定义语音审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AsrReviewInfo")
    @Expose
    private UserDefineAsrTextReviewTemplateInfo AsrReviewInfo;

    /**
    * 用户自定义文本审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OcrReviewInfo")
    @Expose
    private UserDefineOcrTextReviewTemplateInfo OcrReviewInfo;

    /**
     * 获取用户自定义人物审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FaceReviewInfo 用户自定义人物审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserDefineFaceReviewTemplateInfo getFaceReviewInfo() {
        return this.FaceReviewInfo;
    }

    /**
     * 设置用户自定义人物审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceReviewInfo 用户自定义人物审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceReviewInfo(UserDefineFaceReviewTemplateInfo FaceReviewInfo) {
        this.FaceReviewInfo = FaceReviewInfo;
    }

    /**
     * 获取用户自定义语音审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AsrReviewInfo 用户自定义语音审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserDefineAsrTextReviewTemplateInfo getAsrReviewInfo() {
        return this.AsrReviewInfo;
    }

    /**
     * 设置用户自定义语音审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AsrReviewInfo 用户自定义语音审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAsrReviewInfo(UserDefineAsrTextReviewTemplateInfo AsrReviewInfo) {
        this.AsrReviewInfo = AsrReviewInfo;
    }

    /**
     * 获取用户自定义文本审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @return OcrReviewInfo 用户自定义文本审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public UserDefineOcrTextReviewTemplateInfo getOcrReviewInfo() {
        return this.OcrReviewInfo;
    }

    /**
     * 设置用户自定义文本审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OcrReviewInfo 用户自定义文本审核控制参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOcrReviewInfo(UserDefineOcrTextReviewTemplateInfo OcrReviewInfo) {
        this.OcrReviewInfo = OcrReviewInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FaceReviewInfo.", this.FaceReviewInfo);
        this.setParamObj(map, prefix + "AsrReviewInfo.", this.AsrReviewInfo);
        this.setParamObj(map, prefix + "OcrReviewInfo.", this.OcrReviewInfo);

    }
}

