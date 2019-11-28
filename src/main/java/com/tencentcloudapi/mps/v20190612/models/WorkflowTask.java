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

public class WorkflowTask  extends AbstractModel{

    /**
    * 视频处理任务 ID。
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 已弃用，请使用各个具体任务的 ErrCode。
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 已弃用，请使用各个具体任务的 Message。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 视频处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputInfo")
    @Expose
    private MediaInputInfo InputInfo;

    /**
    * 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetaData")
    @Expose
    private MediaMetaData MetaData;

    /**
    * 视频处理任务的执行状态与结果。
    */
    @SerializedName("MediaProcessResultSet")
    @Expose
    private MediaProcessTaskResult [] MediaProcessResultSet;

    /**
    * 视频内容审核任务的执行状态与结果。
    */
    @SerializedName("AiContentReviewResultSet")
    @Expose
    private AiContentReviewResult [] AiContentReviewResultSet;

    /**
    * 视频内容识别任务的执行状态与结果。
    */
    @SerializedName("AiRecognitionResultSet")
    @Expose
    private AiRecognitionResult [] AiRecognitionResultSet;

    /**
     * 获取视频处理任务 ID。
     * @return TaskId 视频处理任务 ID。
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * 设置视频处理任务 ID。
     * @param TaskId 视频处理任务 ID。
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * 获取任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     * @return Status 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     * @param Status 任务流状态，取值：
<li>PROCESSING：处理中；</li>
<li>FINISH：已完成。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取已弃用，请使用各个具体任务的 ErrCode。
     * @return ErrCode 已弃用，请使用各个具体任务的 ErrCode。
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * 设置已弃用，请使用各个具体任务的 ErrCode。
     * @param ErrCode 已弃用，请使用各个具体任务的 ErrCode。
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * 获取已弃用，请使用各个具体任务的 Message。
     * @return Message 已弃用，请使用各个具体任务的 Message。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置已弃用，请使用各个具体任务的 Message。
     * @param Message 已弃用，请使用各个具体任务的 Message。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取视频处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return InputInfo 视频处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInputInfo getInputInfo() {
        return this.InputInfo;
    }

    /**
     * 设置视频处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputInfo 视频处理的目标文件信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputInfo(MediaInputInfo InputInfo) {
        this.InputInfo = InputInfo;
    }

    /**
     * 获取原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MetaData 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaMetaData getMetaData() {
        return this.MetaData;
    }

    /**
     * 设置原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetaData 原始视频的元信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetaData(MediaMetaData MetaData) {
        this.MetaData = MetaData;
    }

    /**
     * 获取视频处理任务的执行状态与结果。
     * @return MediaProcessResultSet 视频处理任务的执行状态与结果。
     */
    public MediaProcessTaskResult [] getMediaProcessResultSet() {
        return this.MediaProcessResultSet;
    }

    /**
     * 设置视频处理任务的执行状态与结果。
     * @param MediaProcessResultSet 视频处理任务的执行状态与结果。
     */
    public void setMediaProcessResultSet(MediaProcessTaskResult [] MediaProcessResultSet) {
        this.MediaProcessResultSet = MediaProcessResultSet;
    }

    /**
     * 获取视频内容审核任务的执行状态与结果。
     * @return AiContentReviewResultSet 视频内容审核任务的执行状态与结果。
     */
    public AiContentReviewResult [] getAiContentReviewResultSet() {
        return this.AiContentReviewResultSet;
    }

    /**
     * 设置视频内容审核任务的执行状态与结果。
     * @param AiContentReviewResultSet 视频内容审核任务的执行状态与结果。
     */
    public void setAiContentReviewResultSet(AiContentReviewResult [] AiContentReviewResultSet) {
        this.AiContentReviewResultSet = AiContentReviewResultSet;
    }

    /**
     * 获取视频内容识别任务的执行状态与结果。
     * @return AiRecognitionResultSet 视频内容识别任务的执行状态与结果。
     */
    public AiRecognitionResult [] getAiRecognitionResultSet() {
        return this.AiRecognitionResultSet;
    }

    /**
     * 设置视频内容识别任务的执行状态与结果。
     * @param AiRecognitionResultSet 视频内容识别任务的执行状态与结果。
     */
    public void setAiRecognitionResultSet(AiRecognitionResult [] AiRecognitionResultSet) {
        this.AiRecognitionResultSet = AiRecognitionResultSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamObj(map, prefix + "InputInfo.", this.InputInfo);
        this.setParamObj(map, prefix + "MetaData.", this.MetaData);
        this.setParamArrayObj(map, prefix + "MediaProcessResultSet.", this.MediaProcessResultSet);
        this.setParamArrayObj(map, prefix + "AiContentReviewResultSet.", this.AiContentReviewResultSet);
        this.setParamArrayObj(map, prefix + "AiRecognitionResultSet.", this.AiRecognitionResultSet);

    }
}

