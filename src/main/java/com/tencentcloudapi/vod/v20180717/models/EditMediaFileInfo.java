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

public class EditMediaFileInfo  extends AbstractModel{

    /**
    * 视频的 ID。
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 视频剪辑的起始偏移时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTimeOffset")
    @Expose
    private Float StartTimeOffset;

    /**
    * 视频剪辑的起始结束时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndTimeOffset")
    @Expose
    private Float EndTimeOffset;

    /**
     * 获取视频的 ID。
     * @return FileId 视频的 ID。
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * 设置视频的 ID。
     * @param FileId 视频的 ID。
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

    /**
     * 获取视频剪辑的起始偏移时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @return StartTimeOffset 视频剪辑的起始偏移时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getStartTimeOffset() {
        return this.StartTimeOffset;
    }

    /**
     * 设置视频剪辑的起始偏移时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTimeOffset 视频剪辑的起始偏移时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTimeOffset(Float StartTimeOffset) {
        this.StartTimeOffset = StartTimeOffset;
    }

    /**
     * 获取视频剪辑的起始结束时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @return EndTimeOffset 视频剪辑的起始结束时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getEndTimeOffset() {
        return this.EndTimeOffset;
    }

    /**
     * 设置视频剪辑的起始结束时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndTimeOffset 视频剪辑的起始结束时间偏移，单位：秒。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndTimeOffset(Float EndTimeOffset) {
        this.EndTimeOffset = EndTimeOffset;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "StartTimeOffset", this.StartTimeOffset);
        this.setParamSimple(map, prefix + "EndTimeOffset", this.EndTimeOffset);

    }
}

