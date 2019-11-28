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
package com.tencentcloudapi.tbp.v20190627.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextResetRequest  extends AbstractModel{

    /**
    * 机器人标识，用于定义抽象机器人。
    */
    @SerializedName("BotId")
    @Expose
    private String BotId;

    /**
    * 机器人版本，取值"dev"或"release"，{调试版本：dev；线上版本：release}。
    */
    @SerializedName("BotEnv")
    @Expose
    private String BotEnv;

    /**
    * 终端标识，每个终端(或线程)对应一个，区分并发多用户。
    */
    @SerializedName("TerminalId")
    @Expose
    private String TerminalId;

    /**
    * 平台类型，{小程序：MiniProgram；小微：XiaoWei；公众号：OfficialAccount；企业微信: WXWork}。
    */
    @SerializedName("PlatformType")
    @Expose
    private String PlatformType;

    /**
    * 当PlatformType为微信公众号或企业微信时，传递对应微信公众号或企业微信的唯一标识
    */
    @SerializedName("PlatformId")
    @Expose
    private String PlatformId;

    /**
     * 获取机器人标识，用于定义抽象机器人。
     * @return BotId 机器人标识，用于定义抽象机器人。
     */
    public String getBotId() {
        return this.BotId;
    }

    /**
     * 设置机器人标识，用于定义抽象机器人。
     * @param BotId 机器人标识，用于定义抽象机器人。
     */
    public void setBotId(String BotId) {
        this.BotId = BotId;
    }

    /**
     * 获取机器人版本，取值"dev"或"release"，{调试版本：dev；线上版本：release}。
     * @return BotEnv 机器人版本，取值"dev"或"release"，{调试版本：dev；线上版本：release}。
     */
    public String getBotEnv() {
        return this.BotEnv;
    }

    /**
     * 设置机器人版本，取值"dev"或"release"，{调试版本：dev；线上版本：release}。
     * @param BotEnv 机器人版本，取值"dev"或"release"，{调试版本：dev；线上版本：release}。
     */
    public void setBotEnv(String BotEnv) {
        this.BotEnv = BotEnv;
    }

    /**
     * 获取终端标识，每个终端(或线程)对应一个，区分并发多用户。
     * @return TerminalId 终端标识，每个终端(或线程)对应一个，区分并发多用户。
     */
    public String getTerminalId() {
        return this.TerminalId;
    }

    /**
     * 设置终端标识，每个终端(或线程)对应一个，区分并发多用户。
     * @param TerminalId 终端标识，每个终端(或线程)对应一个，区分并发多用户。
     */
    public void setTerminalId(String TerminalId) {
        this.TerminalId = TerminalId;
    }

    /**
     * 获取平台类型，{小程序：MiniProgram；小微：XiaoWei；公众号：OfficialAccount；企业微信: WXWork}。
     * @return PlatformType 平台类型，{小程序：MiniProgram；小微：XiaoWei；公众号：OfficialAccount；企业微信: WXWork}。
     */
    public String getPlatformType() {
        return this.PlatformType;
    }

    /**
     * 设置平台类型，{小程序：MiniProgram；小微：XiaoWei；公众号：OfficialAccount；企业微信: WXWork}。
     * @param PlatformType 平台类型，{小程序：MiniProgram；小微：XiaoWei；公众号：OfficialAccount；企业微信: WXWork}。
     */
    public void setPlatformType(String PlatformType) {
        this.PlatformType = PlatformType;
    }

    /**
     * 获取当PlatformType为微信公众号或企业微信时，传递对应微信公众号或企业微信的唯一标识
     * @return PlatformId 当PlatformType为微信公众号或企业微信时，传递对应微信公众号或企业微信的唯一标识
     */
    public String getPlatformId() {
        return this.PlatformId;
    }

    /**
     * 设置当PlatformType为微信公众号或企业微信时，传递对应微信公众号或企业微信的唯一标识
     * @param PlatformId 当PlatformType为微信公众号或企业微信时，传递对应微信公众号或企业微信的唯一标识
     */
    public void setPlatformId(String PlatformId) {
        this.PlatformId = PlatformId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotId", this.BotId);
        this.setParamSimple(map, prefix + "BotEnv", this.BotEnv);
        this.setParamSimple(map, prefix + "TerminalId", this.TerminalId);
        this.setParamSimple(map, prefix + "PlatformType", this.PlatformType);
        this.setParamSimple(map, prefix + "PlatformId", this.PlatformId);

    }
}

