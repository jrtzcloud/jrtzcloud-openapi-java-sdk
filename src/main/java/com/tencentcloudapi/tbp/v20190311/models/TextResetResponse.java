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
package com.tencentcloudapi.tbp.v20190311.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextResetResponse  extends AbstractModel{

    /**
    * 当前会话状态，取值："START"/"COUTINUE"/"COMPLETE"。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DialogStatus")
    @Expose
    private String DialogStatus;

    /**
    * 匹配到的机器人名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BotName")
    @Expose
    private String BotName;

    /**
    * 匹配到的意图名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntentName")
    @Expose
    private String IntentName;

    /**
    * 槽位信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SlotInfoList")
    @Expose
    private SlotInfo [] SlotInfoList;

    /**
    * 原始的用户说法。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputText")
    @Expose
    private String InputText;

    /**
    * 透传字段，由用户自定义的WebService服务返回。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionAttributes")
    @Expose
    private String SessionAttributes;

    /**
    * 机器人对话的应答文本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResponseText")
    @Expose
    private String ResponseText;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取当前会话状态，取值："START"/"COUTINUE"/"COMPLETE"。
注意：此字段可能返回 null，表示取不到有效值。
     * @return DialogStatus 当前会话状态，取值："START"/"COUTINUE"/"COMPLETE"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDialogStatus() {
        return this.DialogStatus;
    }

    /**
     * 设置当前会话状态，取值："START"/"COUTINUE"/"COMPLETE"。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DialogStatus 当前会话状态，取值："START"/"COUTINUE"/"COMPLETE"。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDialogStatus(String DialogStatus) {
        this.DialogStatus = DialogStatus;
    }

    /**
     * 获取匹配到的机器人名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return BotName 匹配到的机器人名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBotName() {
        return this.BotName;
    }

    /**
     * 设置匹配到的机器人名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param BotName 匹配到的机器人名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBotName(String BotName) {
        this.BotName = BotName;
    }

    /**
     * 获取匹配到的意图名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @return IntentName 匹配到的意图名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntentName() {
        return this.IntentName;
    }

    /**
     * 设置匹配到的意图名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntentName 匹配到的意图名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntentName(String IntentName) {
        this.IntentName = IntentName;
    }

    /**
     * 获取槽位信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SlotInfoList 槽位信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SlotInfo [] getSlotInfoList() {
        return this.SlotInfoList;
    }

    /**
     * 设置槽位信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SlotInfoList 槽位信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlotInfoList(SlotInfo [] SlotInfoList) {
        this.SlotInfoList = SlotInfoList;
    }

    /**
     * 获取原始的用户说法。
注意：此字段可能返回 null，表示取不到有效值。
     * @return InputText 原始的用户说法。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInputText() {
        return this.InputText;
    }

    /**
     * 设置原始的用户说法。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputText 原始的用户说法。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputText(String InputText) {
        this.InputText = InputText;
    }

    /**
     * 获取透传字段，由用户自定义的WebService服务返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @return SessionAttributes 透传字段，由用户自定义的WebService服务返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionAttributes() {
        return this.SessionAttributes;
    }

    /**
     * 设置透传字段，由用户自定义的WebService服务返回。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionAttributes 透传字段，由用户自定义的WebService服务返回。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionAttributes(String SessionAttributes) {
        this.SessionAttributes = SessionAttributes;
    }

    /**
     * 获取机器人对话的应答文本。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ResponseText 机器人对话的应答文本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResponseText() {
        return this.ResponseText;
    }

    /**
     * 设置机器人对话的应答文本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResponseText 机器人对话的应答文本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResponseText(String ResponseText) {
        this.ResponseText = ResponseText;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DialogStatus", this.DialogStatus);
        this.setParamSimple(map, prefix + "BotName", this.BotName);
        this.setParamSimple(map, prefix + "IntentName", this.IntentName);
        this.setParamArrayObj(map, prefix + "SlotInfoList.", this.SlotInfoList);
        this.setParamSimple(map, prefix + "InputText", this.InputText);
        this.setParamSimple(map, prefix + "SessionAttributes", this.SessionAttributes);
        this.setParamSimple(map, prefix + "ResponseText", this.ResponseText);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

