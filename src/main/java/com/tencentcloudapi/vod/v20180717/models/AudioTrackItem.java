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

public class AudioTrackItem  extends AbstractModel{

    /**
    * 音频素材的媒体文件来源。可以是点播的文件 ID，也可以是其它文件的 URL。
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
    */
    @SerializedName("SourceMediaStartTime")
    @Expose
    private Float SourceMediaStartTime;

    /**
    * 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 对音频片段进行的操作，如音量调节等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioOperations")
    @Expose
    private AudioTransform [] AudioOperations;

    /**
     * 获取音频素材的媒体文件来源。可以是点播的文件 ID，也可以是其它文件的 URL。
     * @return SourceMedia 音频素材的媒体文件来源。可以是点播的文件 ID，也可以是其它文件的 URL。
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * 设置音频素材的媒体文件来源。可以是点播的文件 ID，也可以是其它文件的 URL。
     * @param SourceMedia 音频素材的媒体文件来源。可以是点播的文件 ID，也可以是其它文件的 URL。
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * 获取音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
     * @return SourceMediaStartTime 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
     */
    public Float getSourceMediaStartTime() {
        return this.SourceMediaStartTime;
    }

    /**
     * 设置音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
     * @param SourceMediaStartTime 音频片段取自素材文件的起始时间，单位为秒。0 表示从素材开始位置截取。默认为0。
     */
    public void setSourceMediaStartTime(Float SourceMediaStartTime) {
        this.SourceMediaStartTime = SourceMediaStartTime;
    }

    /**
     * 获取音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
     * @return Duration 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * 设置音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
     * @param Duration 音频片段的时长，单位为秒。默认和素材本身长度一致，表示截取全部素材。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取对音频片段进行的操作，如音量调节等。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AudioOperations 对音频片段进行的操作，如音量调节等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioTransform [] getAudioOperations() {
        return this.AudioOperations;
    }

    /**
     * 设置对音频片段进行的操作，如音量调节等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioOperations 对音频片段进行的操作，如音量调节等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAudioOperations(AudioTransform [] AudioOperations) {
        this.AudioOperations = AudioOperations;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceMedia", this.SourceMedia);
        this.setParamSimple(map, prefix + "SourceMediaStartTime", this.SourceMediaStartTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamArrayObj(map, prefix + "AudioOperations.", this.AudioOperations);

    }
}

