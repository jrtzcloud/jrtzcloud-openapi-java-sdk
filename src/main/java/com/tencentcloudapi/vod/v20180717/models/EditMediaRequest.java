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

public class EditMediaRequest  extends AbstractModel{

    /**
    * 输入视频的类型，可以取的值为  File，Stream 两种。
    */
    @SerializedName("InputType")
    @Expose
    private String InputType;

    /**
    * 输入的视频文件信息，当 InputType 为 File 时必填。
    */
    @SerializedName("FileInfos")
    @Expose
    private EditMediaFileInfo [] FileInfos;

    /**
    * 输入的流信息，当 InputType 为 Stream 时必填。
    */
    @SerializedName("StreamInfos")
    @Expose
    private EditMediaStreamInfo [] StreamInfos;

    /**
    * 编辑模板 ID，取值有 10，20，不填代表使用 10 模板。
<li>10：拼接时，以分辨率最高的输入为基准；</li>
<li>20：拼接时，以码率最高的输入为基准；</li>
    */
    @SerializedName("Definition")
    @Expose
    private Long Definition;

    /**
    * [任务流模板](/document/product/266/11700#.E4.BB.BB.E5.8A.A1.E6.B5.81.E6.A8.A1.E6.9D.BF)名字，如果要对生成的新视频执行任务流时填写。
    */
    @SerializedName("ProcedureName")
    @Expose
    private String ProcedureName;

    /**
    * 编辑后生成的文件配置。
    */
    @SerializedName("OutputConfig")
    @Expose
    private EditMediaOutputConfig OutputConfig;

    /**
    * 标识来源上下文，用于透传用户请求信息，在EditMediaComplete回调和任务流状态变更回调将返回该字段值，最长 1000个字符。
    */
    @SerializedName("SessionContext")
    @Expose
    private String SessionContext;

    /**
    * 用于任务去重的识别码，如果一天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
    */
    @SerializedName("SessionId")
    @Expose
    private String SessionId;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * 获取输入视频的类型，可以取的值为  File，Stream 两种。
     * @return InputType 输入视频的类型，可以取的值为  File，Stream 两种。
     */
    public String getInputType() {
        return this.InputType;
    }

    /**
     * 设置输入视频的类型，可以取的值为  File，Stream 两种。
     * @param InputType 输入视频的类型，可以取的值为  File，Stream 两种。
     */
    public void setInputType(String InputType) {
        this.InputType = InputType;
    }

    /**
     * 获取输入的视频文件信息，当 InputType 为 File 时必填。
     * @return FileInfos 输入的视频文件信息，当 InputType 为 File 时必填。
     */
    public EditMediaFileInfo [] getFileInfos() {
        return this.FileInfos;
    }

    /**
     * 设置输入的视频文件信息，当 InputType 为 File 时必填。
     * @param FileInfos 输入的视频文件信息，当 InputType 为 File 时必填。
     */
    public void setFileInfos(EditMediaFileInfo [] FileInfos) {
        this.FileInfos = FileInfos;
    }

    /**
     * 获取输入的流信息，当 InputType 为 Stream 时必填。
     * @return StreamInfos 输入的流信息，当 InputType 为 Stream 时必填。
     */
    public EditMediaStreamInfo [] getStreamInfos() {
        return this.StreamInfos;
    }

    /**
     * 设置输入的流信息，当 InputType 为 Stream 时必填。
     * @param StreamInfos 输入的流信息，当 InputType 为 Stream 时必填。
     */
    public void setStreamInfos(EditMediaStreamInfo [] StreamInfos) {
        this.StreamInfos = StreamInfos;
    }

    /**
     * 获取编辑模板 ID，取值有 10，20，不填代表使用 10 模板。
<li>10：拼接时，以分辨率最高的输入为基准；</li>
<li>20：拼接时，以码率最高的输入为基准；</li>
     * @return Definition 编辑模板 ID，取值有 10，20，不填代表使用 10 模板。
<li>10：拼接时，以分辨率最高的输入为基准；</li>
<li>20：拼接时，以码率最高的输入为基准；</li>
     */
    public Long getDefinition() {
        return this.Definition;
    }

    /**
     * 设置编辑模板 ID，取值有 10，20，不填代表使用 10 模板。
<li>10：拼接时，以分辨率最高的输入为基准；</li>
<li>20：拼接时，以码率最高的输入为基准；</li>
     * @param Definition 编辑模板 ID，取值有 10，20，不填代表使用 10 模板。
<li>10：拼接时，以分辨率最高的输入为基准；</li>
<li>20：拼接时，以码率最高的输入为基准；</li>
     */
    public void setDefinition(Long Definition) {
        this.Definition = Definition;
    }

    /**
     * 获取[任务流模板](/document/product/266/11700#.E4.BB.BB.E5.8A.A1.E6.B5.81.E6.A8.A1.E6.9D.BF)名字，如果要对生成的新视频执行任务流时填写。
     * @return ProcedureName [任务流模板](/document/product/266/11700#.E4.BB.BB.E5.8A.A1.E6.B5.81.E6.A8.A1.E6.9D.BF)名字，如果要对生成的新视频执行任务流时填写。
     */
    public String getProcedureName() {
        return this.ProcedureName;
    }

    /**
     * 设置[任务流模板](/document/product/266/11700#.E4.BB.BB.E5.8A.A1.E6.B5.81.E6.A8.A1.E6.9D.BF)名字，如果要对生成的新视频执行任务流时填写。
     * @param ProcedureName [任务流模板](/document/product/266/11700#.E4.BB.BB.E5.8A.A1.E6.B5.81.E6.A8.A1.E6.9D.BF)名字，如果要对生成的新视频执行任务流时填写。
     */
    public void setProcedureName(String ProcedureName) {
        this.ProcedureName = ProcedureName;
    }

    /**
     * 获取编辑后生成的文件配置。
     * @return OutputConfig 编辑后生成的文件配置。
     */
    public EditMediaOutputConfig getOutputConfig() {
        return this.OutputConfig;
    }

    /**
     * 设置编辑后生成的文件配置。
     * @param OutputConfig 编辑后生成的文件配置。
     */
    public void setOutputConfig(EditMediaOutputConfig OutputConfig) {
        this.OutputConfig = OutputConfig;
    }

    /**
     * 获取标识来源上下文，用于透传用户请求信息，在EditMediaComplete回调和任务流状态变更回调将返回该字段值，最长 1000个字符。
     * @return SessionContext 标识来源上下文，用于透传用户请求信息，在EditMediaComplete回调和任务流状态变更回调将返回该字段值，最长 1000个字符。
     */
    public String getSessionContext() {
        return this.SessionContext;
    }

    /**
     * 设置标识来源上下文，用于透传用户请求信息，在EditMediaComplete回调和任务流状态变更回调将返回该字段值，最长 1000个字符。
     * @param SessionContext 标识来源上下文，用于透传用户请求信息，在EditMediaComplete回调和任务流状态变更回调将返回该字段值，最长 1000个字符。
     */
    public void setSessionContext(String SessionContext) {
        this.SessionContext = SessionContext;
    }

    /**
     * 获取用于任务去重的识别码，如果一天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @return SessionId 用于任务去重的识别码，如果一天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public String getSessionId() {
        return this.SessionId;
    }

    /**
     * 设置用于任务去重的识别码，如果一天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     * @param SessionId 用于任务去重的识别码，如果一天内曾有过相同的识别码的请求，则本次的请求会返回错误。最长 50 个字符，不带或者带空字符串表示不做去重。
     */
    public void setSessionId(String SessionId) {
        this.SessionId = SessionId;
    }

    /**
     * 获取点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * 设置点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InputType", this.InputType);
        this.setParamArrayObj(map, prefix + "FileInfos.", this.FileInfos);
        this.setParamArrayObj(map, prefix + "StreamInfos.", this.StreamInfos);
        this.setParamSimple(map, prefix + "Definition", this.Definition);
        this.setParamSimple(map, prefix + "ProcedureName", this.ProcedureName);
        this.setParamObj(map, prefix + "OutputConfig.", this.OutputConfig);
        this.setParamSimple(map, prefix + "SessionContext", this.SessionContext);
        this.setParamSimple(map, prefix + "SessionId", this.SessionId);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

