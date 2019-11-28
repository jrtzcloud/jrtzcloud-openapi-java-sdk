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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubmitImageTaskRequest  extends AbstractModel{

    /**
    * 输入分析对象内容，输入数据格式参考FileType参数释义
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 输入分析对象类型，picture：二进制图片的 base64 编码字符串，picture_url:图片地址，vod_url：视频地址，live_url：直播地址
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 任务控制选项
    */
    @SerializedName("Functions")
    @Expose
    private ImageTaskFunction Functions;

    /**
    * 光照标准列表
    */
    @SerializedName("LightStandardSet")
    @Expose
    private LightStandard [] LightStandardSet;

    /**
    * 抽帧的时间间隔，单位毫秒，默认值1000，保留字段，当前不支持填写。
    */
    @SerializedName("FrameInterval")
    @Expose
    private Long FrameInterval;

    /**
    * 查询人员库列表
    */
    @SerializedName("LibrarySet")
    @Expose
    private String [] LibrarySet;

    /**
    * 视频评估时间，单位秒，点播场景默认值为2小时（无法探测长度时）或完整视频，直播场景默认值为10分钟或直播提前结束
    */
    @SerializedName("MaxVideoDuration")
    @Expose
    private Long MaxVideoDuration;

    /**
    * 人脸识别中的相似度阈值，默认值为0.89，保留字段，当前不支持填写。
    */
    @SerializedName("SimThreshold")
    @Expose
    private Float SimThreshold;

    /**
     * 获取输入分析对象内容，输入数据格式参考FileType参数释义
     * @return FileContent 输入分析对象内容，输入数据格式参考FileType参数释义
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * 设置输入分析对象内容，输入数据格式参考FileType参数释义
     * @param FileContent 输入分析对象内容，输入数据格式参考FileType参数释义
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * 获取输入分析对象类型，picture：二进制图片的 base64 编码字符串，picture_url:图片地址，vod_url：视频地址，live_url：直播地址
     * @return FileType 输入分析对象类型，picture：二进制图片的 base64 编码字符串，picture_url:图片地址，vod_url：视频地址，live_url：直播地址
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * 设置输入分析对象类型，picture：二进制图片的 base64 编码字符串，picture_url:图片地址，vod_url：视频地址，live_url：直播地址
     * @param FileType 输入分析对象类型，picture：二进制图片的 base64 编码字符串，picture_url:图片地址，vod_url：视频地址，live_url：直播地址
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * 获取任务控制选项
     * @return Functions 任务控制选项
     */
    public ImageTaskFunction getFunctions() {
        return this.Functions;
    }

    /**
     * 设置任务控制选项
     * @param Functions 任务控制选项
     */
    public void setFunctions(ImageTaskFunction Functions) {
        this.Functions = Functions;
    }

    /**
     * 获取光照标准列表
     * @return LightStandardSet 光照标准列表
     */
    public LightStandard [] getLightStandardSet() {
        return this.LightStandardSet;
    }

    /**
     * 设置光照标准列表
     * @param LightStandardSet 光照标准列表
     */
    public void setLightStandardSet(LightStandard [] LightStandardSet) {
        this.LightStandardSet = LightStandardSet;
    }

    /**
     * 获取抽帧的时间间隔，单位毫秒，默认值1000，保留字段，当前不支持填写。
     * @return FrameInterval 抽帧的时间间隔，单位毫秒，默认值1000，保留字段，当前不支持填写。
     */
    public Long getFrameInterval() {
        return this.FrameInterval;
    }

    /**
     * 设置抽帧的时间间隔，单位毫秒，默认值1000，保留字段，当前不支持填写。
     * @param FrameInterval 抽帧的时间间隔，单位毫秒，默认值1000，保留字段，当前不支持填写。
     */
    public void setFrameInterval(Long FrameInterval) {
        this.FrameInterval = FrameInterval;
    }

    /**
     * 获取查询人员库列表
     * @return LibrarySet 查询人员库列表
     */
    public String [] getLibrarySet() {
        return this.LibrarySet;
    }

    /**
     * 设置查询人员库列表
     * @param LibrarySet 查询人员库列表
     */
    public void setLibrarySet(String [] LibrarySet) {
        this.LibrarySet = LibrarySet;
    }

    /**
     * 获取视频评估时间，单位秒，点播场景默认值为2小时（无法探测长度时）或完整视频，直播场景默认值为10分钟或直播提前结束
     * @return MaxVideoDuration 视频评估时间，单位秒，点播场景默认值为2小时（无法探测长度时）或完整视频，直播场景默认值为10分钟或直播提前结束
     */
    public Long getMaxVideoDuration() {
        return this.MaxVideoDuration;
    }

    /**
     * 设置视频评估时间，单位秒，点播场景默认值为2小时（无法探测长度时）或完整视频，直播场景默认值为10分钟或直播提前结束
     * @param MaxVideoDuration 视频评估时间，单位秒，点播场景默认值为2小时（无法探测长度时）或完整视频，直播场景默认值为10分钟或直播提前结束
     */
    public void setMaxVideoDuration(Long MaxVideoDuration) {
        this.MaxVideoDuration = MaxVideoDuration;
    }

    /**
     * 获取人脸识别中的相似度阈值，默认值为0.89，保留字段，当前不支持填写。
     * @return SimThreshold 人脸识别中的相似度阈值，默认值为0.89，保留字段，当前不支持填写。
     */
    public Float getSimThreshold() {
        return this.SimThreshold;
    }

    /**
     * 设置人脸识别中的相似度阈值，默认值为0.89，保留字段，当前不支持填写。
     * @param SimThreshold 人脸识别中的相似度阈值，默认值为0.89，保留字段，当前不支持填写。
     */
    public void setSimThreshold(Float SimThreshold) {
        this.SimThreshold = SimThreshold;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamObj(map, prefix + "Functions.", this.Functions);
        this.setParamArrayObj(map, prefix + "LightStandardSet.", this.LightStandardSet);
        this.setParamSimple(map, prefix + "FrameInterval", this.FrameInterval);
        this.setParamArraySimple(map, prefix + "LibrarySet.", this.LibrarySet);
        this.setParamSimple(map, prefix + "MaxVideoDuration", this.MaxVideoDuration);
        this.setParamSimple(map, prefix + "SimThreshold", this.SimThreshold);

    }
}

