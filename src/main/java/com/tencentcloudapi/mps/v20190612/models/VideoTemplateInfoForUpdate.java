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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoTemplateInfoForUpdate  extends AbstractModel{

    /**
    * 视频流的编码格式，可选值：
<li>libx264：H.264 编码</li>
<li>libx265：H.265 编码</li>
目前 H.265 编码必须指定分辨率，并且需要在 640*480 以内。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 视频帧率，取值范围：[0, 60]，单位：Hz。
当取值为 0，表示帧率和原始视频保持一致。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 视频流的码率，取值范围：0 和 [128, 35000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
默认值：black 。
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
     * 获取视频流的编码格式，可选值：
<li>libx264：H.264 编码</li>
<li>libx265：H.265 编码</li>
目前 H.265 编码必须指定分辨率，并且需要在 640*480 以内。
     * @return Codec 视频流的编码格式，可选值：
<li>libx264：H.264 编码</li>
<li>libx265：H.265 编码</li>
目前 H.265 编码必须指定分辨率，并且需要在 640*480 以内。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * 设置视频流的编码格式，可选值：
<li>libx264：H.264 编码</li>
<li>libx265：H.265 编码</li>
目前 H.265 编码必须指定分辨率，并且需要在 640*480 以内。
     * @param Codec 视频流的编码格式，可选值：
<li>libx264：H.264 编码</li>
<li>libx265：H.265 编码</li>
目前 H.265 编码必须指定分辨率，并且需要在 640*480 以内。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * 获取视频帧率，取值范围：[0, 60]，单位：Hz。
当取值为 0，表示帧率和原始视频保持一致。
     * @return Fps 视频帧率，取值范围：[0, 60]，单位：Hz。
当取值为 0，表示帧率和原始视频保持一致。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * 设置视频帧率，取值范围：[0, 60]，单位：Hz。
当取值为 0，表示帧率和原始视频保持一致。
     * @param Fps 视频帧率，取值范围：[0, 60]，单位：Hz。
当取值为 0，表示帧率和原始视频保持一致。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * 获取视频流的码率，取值范围：0 和 [128, 35000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
     * @return Bitrate 视频流的码率，取值范围：0 和 [128, 35000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * 设置视频流的码率，取值范围：0 和 [128, 35000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
     * @param Bitrate 视频流的码率，取值范围：0 和 [128, 35000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * 获取分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
     * @return ResolutionAdaptive 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * 设置分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
     * @param ResolutionAdaptive 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * 获取视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
     * @return Width 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * 设置视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
     * @param Width 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * 获取视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
     * @return Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * 设置视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
     * @param Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * 获取填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
默认值：black 。
     * @return FillType 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
默认值：black 。
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * 设置填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
默认值：black 。
     * @param FillType 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
<li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
默认值：black 。
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "FillType", this.FillType);

    }
}

