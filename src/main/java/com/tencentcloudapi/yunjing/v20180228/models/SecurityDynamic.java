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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityDynamic  extends AbstractModel{

    /**
    * 云镜客户端UUID。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 安全事件发生事件。
    */
    @SerializedName("EventTime")
    @Expose
    private String EventTime;

    /**
    * 安全事件类型。
<li>MALWARE：木马事件</li>
<li>NON_LOCAL_LOGIN：异地登录</li>
<li>BRUTEATTACK_SUCCESS：密码破解成功</li>
<li>VUL：漏洞</li>
<li>BASELINE：安全基线</li>
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 安全事件消息。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * 获取云镜客户端UUID。
     * @return Uuid 云镜客户端UUID。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置云镜客户端UUID。
     * @param Uuid 云镜客户端UUID。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取安全事件发生事件。
     * @return EventTime 安全事件发生事件。
     */
    public String getEventTime() {
        return this.EventTime;
    }

    /**
     * 设置安全事件发生事件。
     * @param EventTime 安全事件发生事件。
     */
    public void setEventTime(String EventTime) {
        this.EventTime = EventTime;
    }

    /**
     * 获取安全事件类型。
<li>MALWARE：木马事件</li>
<li>NON_LOCAL_LOGIN：异地登录</li>
<li>BRUTEATTACK_SUCCESS：密码破解成功</li>
<li>VUL：漏洞</li>
<li>BASELINE：安全基线</li>
     * @return EventType 安全事件类型。
<li>MALWARE：木马事件</li>
<li>NON_LOCAL_LOGIN：异地登录</li>
<li>BRUTEATTACK_SUCCESS：密码破解成功</li>
<li>VUL：漏洞</li>
<li>BASELINE：安全基线</li>
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * 设置安全事件类型。
<li>MALWARE：木马事件</li>
<li>NON_LOCAL_LOGIN：异地登录</li>
<li>BRUTEATTACK_SUCCESS：密码破解成功</li>
<li>VUL：漏洞</li>
<li>BASELINE：安全基线</li>
     * @param EventType 安全事件类型。
<li>MALWARE：木马事件</li>
<li>NON_LOCAL_LOGIN：异地登录</li>
<li>BRUTEATTACK_SUCCESS：密码破解成功</li>
<li>VUL：漏洞</li>
<li>BASELINE：安全基线</li>
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * 获取安全事件消息。
     * @return Message 安全事件消息。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置安全事件消息。
     * @param Message 安全事件消息。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "EventTime", this.EventTime);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

