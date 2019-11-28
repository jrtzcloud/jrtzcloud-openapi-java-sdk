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

public class StickerTrackItem  extends AbstractModel{

    /**
    * 贴图素材的媒体文件来源。可以是点播的文件 ID，也可以是其它文件的 URL。
    */
    @SerializedName("SourceMedia")
    @Expose
    private String SourceMedia;

    /**
    * 贴图的持续时间，单位为秒。
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 贴图在轨道上的起始时间，单位为秒。
    */
    @SerializedName("StartTime")
    @Expose
    private Float StartTime;

    /**
    * 原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值：Center。
    */
    @SerializedName("CoordinateOrigin")
    @Expose
    private String CoordinateOrigin;

    /**
    * 贴图原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布宽度的 10%。</li><li>当字符串以 px 结尾，表示贴图 XPos 单位为像素，如 100px 表示 XPos 为 100 像素。</li>
默认值：0px。
    */
    @SerializedName("XPos")
    @Expose
    private String XPos;

    /**
    * 贴图原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 YPos 单位为像素，如 100px 表示 YPos 为 100 像素。</li>
默认值：0px。
    */
    @SerializedName("YPos")
    @Expose
    private String YPos;

    /**
    * 贴图的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取贴图素材本身的 Width、Height。</li>
<li>当 Width 为空0，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
    */
    @SerializedName("Width")
    @Expose
    private String Width;

    /**
    * 贴图的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 Height 单位为像素，如 100px 表示 Hieght 为 100 像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取贴图素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
    */
    @SerializedName("Height")
    @Expose
    private String Height;

    /**
    * 对贴图进行的操作，如图像旋转等。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageOperations")
    @Expose
    private ImageTransform [] ImageOperations;

    /**
     * 获取贴图素材的媒体文件来源。可以是点播的文件 ID，也可以是其它文件的 URL。
     * @return SourceMedia 贴图素材的媒体文件来源。可以是点播的文件 ID，也可以是其它文件的 URL。
     */
    public String getSourceMedia() {
        return this.SourceMedia;
    }

    /**
     * 设置贴图素材的媒体文件来源。可以是点播的文件 ID，也可以是其它文件的 URL。
     * @param SourceMedia 贴图素材的媒体文件来源。可以是点播的文件 ID，也可以是其它文件的 URL。
     */
    public void setSourceMedia(String SourceMedia) {
        this.SourceMedia = SourceMedia;
    }

    /**
     * 获取贴图的持续时间，单位为秒。
     * @return Duration 贴图的持续时间，单位为秒。
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * 设置贴图的持续时间，单位为秒。
     * @param Duration 贴图的持续时间，单位为秒。
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取贴图在轨道上的起始时间，单位为秒。
     * @return StartTime 贴图在轨道上的起始时间，单位为秒。
     */
    public Float getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置贴图在轨道上的起始时间，单位为秒。
     * @param StartTime 贴图在轨道上的起始时间，单位为秒。
     */
    public void setStartTime(Float StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值：Center。
     * @return CoordinateOrigin 原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值：Center。
     */
    public String getCoordinateOrigin() {
        return this.CoordinateOrigin;
    }

    /**
     * 设置原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值：Center。
     * @param CoordinateOrigin 原点位置，取值有：
<li>Center：坐标原点为中心位置，如画布中心。</li>
默认值：Center。
     */
    public void setCoordinateOrigin(String CoordinateOrigin) {
        this.CoordinateOrigin = CoordinateOrigin;
    }

    /**
     * 获取贴图原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布宽度的 10%。</li><li>当字符串以 px 结尾，表示贴图 XPos 单位为像素，如 100px 表示 XPos 为 100 像素。</li>
默认值：0px。
     * @return XPos 贴图原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布宽度的 10%。</li><li>当字符串以 px 结尾，表示贴图 XPos 单位为像素，如 100px 表示 XPos 为 100 像素。</li>
默认值：0px。
     */
    public String getXPos() {
        return this.XPos;
    }

    /**
     * 设置贴图原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布宽度的 10%。</li><li>当字符串以 px 结尾，表示贴图 XPos 单位为像素，如 100px 表示 XPos 为 100 像素。</li>
默认值：0px。
     * @param XPos 贴图原点距离画布原点的水平位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 XPos 为画布宽度指定百分比的位置，如 10% 表示 XPos 为画布宽度的 10%。</li><li>当字符串以 px 结尾，表示贴图 XPos 单位为像素，如 100px 表示 XPos 为 100 像素。</li>
默认值：0px。
     */
    public void setXPos(String XPos) {
        this.XPos = XPos;
    }

    /**
     * 获取贴图原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 YPos 单位为像素，如 100px 表示 YPos 为 100 像素。</li>
默认值：0px。
     * @return YPos 贴图原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 YPos 单位为像素，如 100px 表示 YPos 为 100 像素。</li>
默认值：0px。
     */
    public String getYPos() {
        return this.YPos;
    }

    /**
     * 设置贴图原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 YPos 单位为像素，如 100px 表示 YPos 为 100 像素。</li>
默认值：0px。
     * @param YPos 贴图原点距离画布原点的垂直位置。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 YPos 为画布高度指定百分比的位置，如 10% 表示 YPos 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 YPos 单位为像素，如 100px 表示 YPos 为 100 像素。</li>
默认值：0px。
     */
    public void setYPos(String YPos) {
        this.YPos = YPos;
    }

    /**
     * 获取贴图的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取贴图素材本身的 Width、Height。</li>
<li>当 Width 为空0，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     * @return Width 贴图的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取贴图素材本身的 Width、Height。</li>
<li>当 Width 为空0，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public String getWidth() {
        return this.Width;
    }

    /**
     * 设置贴图的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取贴图素材本身的 Width、Height。</li>
<li>当 Width 为空0，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     * @param Width 贴图的宽度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 Width 为画布宽度的百分比大小，如 10% 表示 Width 为画布宽度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 Width 单位为像素，如 100px 表示 Width 为 100 像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取贴图素材本身的 Width、Height。</li>
<li>当 Width 为空0，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public void setWidth(String Width) {
        this.Width = Width;
    }

    /**
     * 获取贴图的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 Height 单位为像素，如 100px 表示 Hieght 为 100 像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取贴图素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     * @return Height 贴图的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 Height 单位为像素，如 100px 表示 Hieght 为 100 像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取贴图素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public String getHeight() {
        return this.Height;
    }

    /**
     * 设置贴图的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 Height 单位为像素，如 100px 表示 Hieght 为 100 像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取贴图素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     * @param Height 贴图的高度。支持 %、px 两种格式：
<li>当字符串以 % 结尾，表示贴图 Height 为画布高度的百分比大小，如 10% 表示 Height 为画布高度的 10%。</li>
<li>当字符串以 px 结尾，表示贴图 Height 单位为像素，如 100px 表示 Hieght 为 100 像素。</li>
<li>当 Width、Height 均为空，则 Width 和 Height 取贴图素材本身的 Width、Height。</li>
<li>当 Width 为空，Height 非空，则 Width 按比例缩放</li>
<li>当 Width 非空，Height 为空，则 Height 按比例缩放。</li>
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }

    /**
     * 获取对贴图进行的操作，如图像旋转等。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ImageOperations 对贴图进行的操作，如图像旋转等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ImageTransform [] getImageOperations() {
        return this.ImageOperations;
    }

    /**
     * 设置对贴图进行的操作，如图像旋转等。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageOperations 对贴图进行的操作，如图像旋转等。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageOperations(ImageTransform [] ImageOperations) {
        this.ImageOperations = ImageOperations;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceMedia", this.SourceMedia);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "CoordinateOrigin", this.CoordinateOrigin);
        this.setParamSimple(map, prefix + "XPos", this.XPos);
        this.setParamSimple(map, prefix + "YPos", this.YPos);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamArrayObj(map, prefix + "ImageOperations.", this.ImageOperations);

    }
}

