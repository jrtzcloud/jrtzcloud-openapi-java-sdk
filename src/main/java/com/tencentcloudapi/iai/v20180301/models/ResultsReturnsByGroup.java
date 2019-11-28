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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResultsReturnsByGroup  extends AbstractModel{

    /**
    * 检测出的人脸框位置。
    */
    @SerializedName("FaceRect")
    @Expose
    private FaceRect FaceRect;

    /**
    * 识别结果。
    */
    @SerializedName("GroupCandidates")
    @Expose
    private GroupCandidate [] GroupCandidates;

    /**
    * 检测出的人脸图片状态返回码。0 表示正常。 
-1601代表不符合图片质量控制要求，此时Candidate内容为空。
    */
    @SerializedName("RetCode")
    @Expose
    private Long RetCode;

    /**
     * 获取检测出的人脸框位置。
     * @return FaceRect 检测出的人脸框位置。
     */
    public FaceRect getFaceRect() {
        return this.FaceRect;
    }

    /**
     * 设置检测出的人脸框位置。
     * @param FaceRect 检测出的人脸框位置。
     */
    public void setFaceRect(FaceRect FaceRect) {
        this.FaceRect = FaceRect;
    }

    /**
     * 获取识别结果。
     * @return GroupCandidates 识别结果。
     */
    public GroupCandidate [] getGroupCandidates() {
        return this.GroupCandidates;
    }

    /**
     * 设置识别结果。
     * @param GroupCandidates 识别结果。
     */
    public void setGroupCandidates(GroupCandidate [] GroupCandidates) {
        this.GroupCandidates = GroupCandidates;
    }

    /**
     * 获取检测出的人脸图片状态返回码。0 表示正常。 
-1601代表不符合图片质量控制要求，此时Candidate内容为空。
     * @return RetCode 检测出的人脸图片状态返回码。0 表示正常。 
-1601代表不符合图片质量控制要求，此时Candidate内容为空。
     */
    public Long getRetCode() {
        return this.RetCode;
    }

    /**
     * 设置检测出的人脸图片状态返回码。0 表示正常。 
-1601代表不符合图片质量控制要求，此时Candidate内容为空。
     * @param RetCode 检测出的人脸图片状态返回码。0 表示正常。 
-1601代表不符合图片质量控制要求，此时Candidate内容为空。
     */
    public void setRetCode(Long RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FaceRect.", this.FaceRect);
        this.setParamArrayObj(map, prefix + "GroupCandidates.", this.GroupCandidates);
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);

    }
}

