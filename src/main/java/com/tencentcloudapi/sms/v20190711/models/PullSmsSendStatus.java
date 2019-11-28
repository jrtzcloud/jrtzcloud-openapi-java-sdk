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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PullSmsSendStatus  extends AbstractModel{

    /**
    * 用户实际接收到短信的时间
    */
    @SerializedName("UserReceiveTime")
    @Expose
    private String UserReceiveTime;

    /**
    * 国家（或地区）码
    */
    @SerializedName("NationCode")
    @Expose
    private String NationCode;

    /**
    * 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号
    */
    @SerializedName("PurePhoneNumber")
    @Expose
    private String PurePhoneNumber;

    /**
    * 手机号码，普通格式，示例如：13711112222
    */
    @SerializedName("PhoneNumber")
    @Expose
    private String PhoneNumber;

    /**
    * 本次发送标识 ID
    */
    @SerializedName("SerialNo")
    @Expose
    private String SerialNo;

    /**
    * 实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）
    */
    @SerializedName("ReportStatus")
    @Expose
    private String ReportStatus;

    /**
    * 用户接收短信状态描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * 获取用户实际接收到短信的时间
     * @return UserReceiveTime 用户实际接收到短信的时间
     */
    public String getUserReceiveTime() {
        return this.UserReceiveTime;
    }

    /**
     * 设置用户实际接收到短信的时间
     * @param UserReceiveTime 用户实际接收到短信的时间
     */
    public void setUserReceiveTime(String UserReceiveTime) {
        this.UserReceiveTime = UserReceiveTime;
    }

    /**
     * 获取国家（或地区）码
     * @return NationCode 国家（或地区）码
     */
    public String getNationCode() {
        return this.NationCode;
    }

    /**
     * 设置国家（或地区）码
     * @param NationCode 国家（或地区）码
     */
    public void setNationCode(String NationCode) {
        this.NationCode = NationCode;
    }

    /**
     * 获取手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号
     * @return PurePhoneNumber 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号
     */
    public String getPurePhoneNumber() {
        return this.PurePhoneNumber;
    }

    /**
     * 设置手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号
     * @param PurePhoneNumber 手机号码,e.164标准，+[国家或地区码][手机号] ，示例如：+8613711112222， 其中前面有一个+号 ，86为国家码，13711112222为手机号
     */
    public void setPurePhoneNumber(String PurePhoneNumber) {
        this.PurePhoneNumber = PurePhoneNumber;
    }

    /**
     * 获取手机号码，普通格式，示例如：13711112222
     * @return PhoneNumber 手机号码，普通格式，示例如：13711112222
     */
    public String getPhoneNumber() {
        return this.PhoneNumber;
    }

    /**
     * 设置手机号码，普通格式，示例如：13711112222
     * @param PhoneNumber 手机号码，普通格式，示例如：13711112222
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * 获取本次发送标识 ID
     * @return SerialNo 本次发送标识 ID
     */
    public String getSerialNo() {
        return this.SerialNo;
    }

    /**
     * 设置本次发送标识 ID
     * @param SerialNo 本次发送标识 ID
     */
    public void setSerialNo(String SerialNo) {
        this.SerialNo = SerialNo;
    }

    /**
     * 获取实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）
     * @return ReportStatus 实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）
     */
    public String getReportStatus() {
        return this.ReportStatus;
    }

    /**
     * 设置实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）
     * @param ReportStatus 实际是否收到短信接收状态，SUCCESS（成功）、FAIL（失败）
     */
    public void setReportStatus(String ReportStatus) {
        this.ReportStatus = ReportStatus;
    }

    /**
     * 获取用户接收短信状态描述
     * @return Description 用户接收短信状态描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置用户接收短信状态描述
     * @param Description 用户接收短信状态描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserReceiveTime", this.UserReceiveTime);
        this.setParamSimple(map, prefix + "NationCode", this.NationCode);
        this.setParamSimple(map, prefix + "PurePhoneNumber", this.PurePhoneNumber);
        this.setParamSimple(map, prefix + "PhoneNumber", this.PhoneNumber);
        this.setParamSimple(map, prefix + "SerialNo", this.SerialNo);
        this.setParamSimple(map, prefix + "ReportStatus", this.ReportStatus);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

