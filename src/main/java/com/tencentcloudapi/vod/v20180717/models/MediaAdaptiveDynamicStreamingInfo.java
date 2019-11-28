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

public class MediaAdaptiveDynamicStreamingInfo  extends AbstractModel{

    /**
    * 转自适应码流信息数组。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AdaptiveDynamicStreamingSet")
    @Expose
    private AdaptiveDynamicStreamingInfoItem [] AdaptiveDynamicStreamingSet;

    /**
     * 获取转自适应码流信息数组。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AdaptiveDynamicStreamingSet 转自适应码流信息数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AdaptiveDynamicStreamingInfoItem [] getAdaptiveDynamicStreamingSet() {
        return this.AdaptiveDynamicStreamingSet;
    }

    /**
     * 设置转自适应码流信息数组。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AdaptiveDynamicStreamingSet 转自适应码流信息数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAdaptiveDynamicStreamingSet(AdaptiveDynamicStreamingInfoItem [] AdaptiveDynamicStreamingSet) {
        this.AdaptiveDynamicStreamingSet = AdaptiveDynamicStreamingSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AdaptiveDynamicStreamingSet.", this.AdaptiveDynamicStreamingSet);

    }
}

