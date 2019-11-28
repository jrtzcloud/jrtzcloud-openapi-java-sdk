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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAppRequest  extends AbstractModel{

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 腾讯云项目id，默认为0，表示默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 需要支持的引擎列表，取值android, ios, unity, cocos, unreal, windows。默认全选。
    */
    @SerializedName("EngineList")
    @Expose
    private String [] EngineList;

    /**
    * 服务区域列表，取值: mainland(大陆地区), sa(南美), eu(欧洲), oc(澳洲), me(中东)。默认全选。
    */
    @SerializedName("RegionList")
    @Expose
    private String [] RegionList;

    /**
    * 实时语音服务配置数据
    */
    @SerializedName("RealtimeSpeechConf")
    @Expose
    private RealtimeSpeechConf RealtimeSpeechConf;

    /**
    * 语音消息及转文本服务配置数据
    */
    @SerializedName("VoiceMessageConf")
    @Expose
    private VoiceMessageConf VoiceMessageConf;

    /**
    * 语音分析服务配置数据
    */
    @SerializedName("VoiceFilterConf")
    @Expose
    private VoiceFilterConf VoiceFilterConf;

    /**
    * 需要添加的标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
     * 获取应用名称
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取腾讯云项目id，默认为0，表示默认项目
     * @return ProjectId 腾讯云项目id，默认为0，表示默认项目
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置腾讯云项目id，默认为0，表示默认项目
     * @param ProjectId 腾讯云项目id，默认为0，表示默认项目
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取需要支持的引擎列表，取值android, ios, unity, cocos, unreal, windows。默认全选。
     * @return EngineList 需要支持的引擎列表，取值android, ios, unity, cocos, unreal, windows。默认全选。
     */
    public String [] getEngineList() {
        return this.EngineList;
    }

    /**
     * 设置需要支持的引擎列表，取值android, ios, unity, cocos, unreal, windows。默认全选。
     * @param EngineList 需要支持的引擎列表，取值android, ios, unity, cocos, unreal, windows。默认全选。
     */
    public void setEngineList(String [] EngineList) {
        this.EngineList = EngineList;
    }

    /**
     * 获取服务区域列表，取值: mainland(大陆地区), sa(南美), eu(欧洲), oc(澳洲), me(中东)。默认全选。
     * @return RegionList 服务区域列表，取值: mainland(大陆地区), sa(南美), eu(欧洲), oc(澳洲), me(中东)。默认全选。
     */
    public String [] getRegionList() {
        return this.RegionList;
    }

    /**
     * 设置服务区域列表，取值: mainland(大陆地区), sa(南美), eu(欧洲), oc(澳洲), me(中东)。默认全选。
     * @param RegionList 服务区域列表，取值: mainland(大陆地区), sa(南美), eu(欧洲), oc(澳洲), me(中东)。默认全选。
     */
    public void setRegionList(String [] RegionList) {
        this.RegionList = RegionList;
    }

    /**
     * 获取实时语音服务配置数据
     * @return RealtimeSpeechConf 实时语音服务配置数据
     */
    public RealtimeSpeechConf getRealtimeSpeechConf() {
        return this.RealtimeSpeechConf;
    }

    /**
     * 设置实时语音服务配置数据
     * @param RealtimeSpeechConf 实时语音服务配置数据
     */
    public void setRealtimeSpeechConf(RealtimeSpeechConf RealtimeSpeechConf) {
        this.RealtimeSpeechConf = RealtimeSpeechConf;
    }

    /**
     * 获取语音消息及转文本服务配置数据
     * @return VoiceMessageConf 语音消息及转文本服务配置数据
     */
    public VoiceMessageConf getVoiceMessageConf() {
        return this.VoiceMessageConf;
    }

    /**
     * 设置语音消息及转文本服务配置数据
     * @param VoiceMessageConf 语音消息及转文本服务配置数据
     */
    public void setVoiceMessageConf(VoiceMessageConf VoiceMessageConf) {
        this.VoiceMessageConf = VoiceMessageConf;
    }

    /**
     * 获取语音分析服务配置数据
     * @return VoiceFilterConf 语音分析服务配置数据
     */
    public VoiceFilterConf getVoiceFilterConf() {
        return this.VoiceFilterConf;
    }

    /**
     * 设置语音分析服务配置数据
     * @param VoiceFilterConf 语音分析服务配置数据
     */
    public void setVoiceFilterConf(VoiceFilterConf VoiceFilterConf) {
        this.VoiceFilterConf = VoiceFilterConf;
    }

    /**
     * 获取需要添加的标签列表
     * @return Tags 需要添加的标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * 设置需要添加的标签列表
     * @param Tags 需要添加的标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "EngineList.", this.EngineList);
        this.setParamArraySimple(map, prefix + "RegionList.", this.RegionList);
        this.setParamObj(map, prefix + "RealtimeSpeechConf.", this.RealtimeSpeechConf);
        this.setParamObj(map, prefix + "VoiceMessageConf.", this.VoiceMessageConf);
        this.setParamObj(map, prefix + "VoiceFilterConf.", this.VoiceFilterConf);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

