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

public class VideoTrackItem  extends AbstractModel{

    /**
    * 视频片段的媒体素材来源，可以是点播的文件 ID，或者是其它文件的 URL。
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * 视频片段取自素材文件的起始时间，单位为秒。默认为0。
    */
    @SerializedName("SourceMediaStartTime")
    @Expose
    private Float SourceMediaStartTime;

    /**
    * 视频片段时长，单位为秒。默认取视频素材本身长度，表示截取全部素材。如果源文件是图片，Duration需要大于0。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 视频原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值 ：Center。
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * 视频片段原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布口宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认值：0px。
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * 视频片段原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认值：0px。
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * 视频片段的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%；
</li><li>当字符串以 px 结尾，表示视频片段 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 对图像进行的操作，如图像旋转等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageOperations")
    @Expose
    private ImageTransform [] ImageOperations;

    /**
    * 对音频进行操作，如静音等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AudioOperations")
    @Expose
    private AudioTransform [] AudioOperations;

    /**
     * 获取视频片段的媒体素材来源，可以是点播的文件 ID，或者是其它文件的 URL。
     * @return SourceMedia 视频片段的媒体素材来源，可以是点播的文件 ID，或者是其它文件的 URL。
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * 设置视频片段的媒体素材来源，可以是点播的文件 ID，或者是其它文件的 URL。
     * @param SourceMedia 视频片段的媒体素材来源，可以是点播的文件 ID，或者是其它文件的 URL。
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * 获取视频片段取自素材文件的起始时间，单位为秒。默认为0。
     * @return SourceMediaStartTime 视频片段取自素材文件的起始时间，单位为秒。默认为0。
     */
    public Float getSourceMediaStartTime() {
        return this.SourceMediaStartTime;
    }

    /**
     * 设置视频片段取自素材文件的起始时间，单位为秒。默认为0。
     * @param SourceMediaStartTime 视频片段取自素材文件的起始时间，单位为秒。默认为0。
     */
    public void setSourceMediaStartTime(Float SourceMediaStartTime) {
        this.SourceMediaStartTime = SourceMediaStartTime;
    }

    /**
     * 获取视频片段时长，单位为秒。默认取视频素材本身长度，表示截取全部素材。如果源文件是图片，Duration需要大于0。
     * @return Duration 视频片段时长，单位为秒。默认取视频素材本身长度，表示截取全部素材。如果源文件是图片，Duration需要大于0。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * 设置视频片段时长，单位为秒。默认取视频素材本身长度，表示截取全部素材。如果源文件是图片，Duration需要大于0。
     * @param Duration 视频片段时长，单位为秒。默认取视频素材本身长度，表示截取全部素材。如果源文件是图片，Duration需要大于0。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取视频原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值 ：Center。
     * @return CoordinateOrigin 视频原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值 ：Center。
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * 设置视频原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值 ：Center。
     * @param CoordinateOrigin 视频原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值 ：Center。
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * 获取视频片段原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布口宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认值：0px。
     * @return XPos 视频片段原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布口宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认值：0px。
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * 设置视频片段原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布口宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认值：0px。
     * @param XPos 视频片段原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布口宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 XPos 单位为像素，如 100px 表示 XPos 为100像素。</li>
默认值：0px。
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * 获取视频片段原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认值：0px。
     * @return YPos 视频片段原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认值：0px。
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * 设置视频片段原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认值：0px。
     * @param YPos 视频片段原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 YPos 单位为像素，如 100px 表示 YPos 为100像素。</li>
默认值：0px。
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * 获取视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     * @return Width 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * 设置视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     * @param Width 视频片段的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示视频片段 Width 单位为像素，如 100px 表示 Width 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * 获取视频片段的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%；
</li><li>当字符串以 px 结尾，表示视频片段 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     * @return Height 视频片段的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%；
</li><li>当字符串以 px 结尾，表示视频片段 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * 设置视频片段的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%；
</li><li>当字符串以 px 结尾，表示视频片段 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     * @param Height 视频片段的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示视频片段 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%；
</li><li>当字符串以 px 结尾，表示视频片段 Height 单位为像素，如 100px 表示 Height 为100像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取视频素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * 获取对图像进行的操作，如图像旋转等。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ImageOperations 对图像进行的操作，如图像旋转等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageTransform [] getImageOperations() {
        return this.ImageOperations;
    }

    /**
     * 设置对图像进行的操作，如图像旋转等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageOperations 对图像进行的操作，如图像旋转等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageOperations(ImageTransform [] ImageOperations) {
        this.ImageOperations = ImageOperations;
    }

    /**
     * 获取对音频进行操作，如静音等。
注意：此字段可能返回 null，表示取不到有效值。
     * @return AudioOperations 对音频进行操作，如静音等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AudioTransform [] getAudioOperations() {
        return this.AudioOperations;
    }

    /**
     * 设置对音频进行操作，如静音等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AudioOperations 对音频进行操作，如静音等。
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
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArrayObj(map, prefix + "ImageOperations.", this.ImageOperations);
        this.setParamArrayObj(map, prefix + "AudioOperations.", this.AudioOperations);

    }
}

