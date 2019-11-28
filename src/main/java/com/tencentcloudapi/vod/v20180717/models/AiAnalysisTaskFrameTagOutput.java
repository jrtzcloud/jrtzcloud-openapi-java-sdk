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

public class AiAnalysisTaskFrameTagOutput  extends AbstractModel{

    /**
    * 视频按帧标签列表。
    */
    @SerializedName("SegmentSet")
    @Expose
    private MediaAiAnalysisFrameTagSegmentItem [] SegmentSet;

    /**
     * 获取视频按帧标签列表。
     * @return SegmentSet 视频按帧标签列表。
     */
    public MediaAiAnalysisFrameTagSegmentItem [] getSegmentSet() {
        return this.SegmentSet;
    }

    /**
     * 设置视频按帧标签列表。
     * @param SegmentSet 视频按帧标签列表。
     */
    public void setSegmentSet(MediaAiAnalysisFrameTagSegmentItem [] SegmentSet) {
        this.SegmentSet = SegmentSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SegmentSet.", this.SegmentSet);

    }
}

