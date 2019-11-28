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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddUserRequest  extends AbstractModel{

    /**
    * 子用户用户名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子用户备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 子用户是否可以登录控制台。传0子用户无法登录控制台，传1子用户可以登录控制台。
    */
    @SerializedName("ConsoleLogin")
    @Expose
    private Long ConsoleLogin;

    /**
    * 是否生成子用户密钥。传0不生成子用户密钥，传1生成子用户密钥。
    */
    @SerializedName("UseApi")
    @Expose
    private Long UseApi;

    /**
    * 子用户控制台登录密码，若未进行密码规则设置则默认密码规则为8位以上同时包含大写小字母、数字和特殊字符。只有可以登录控制台时才有效，如果传空并且上面指定允许登录控制台，则自动生成随机密码，随机密码规则为32位包含大写小字母、数字和特殊字符。
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 子用户是否要在下次登录时重置密码。传0子用户下次登录控制台不需重置密码，传1子用户下次登录控制台需要重置密码。
    */
    @SerializedName("NeedResetPassword")
    @Expose
    private Long NeedResetPassword;

    /**
    * 手机号
    */
    @SerializedName("PhoneNum")
    @Expose
    private String PhoneNum;

    /**
    * 区号
    */
    @SerializedName("CountryCode")
    @Expose
    private String CountryCode;

    /**
    * 邮箱
    */
    @SerializedName("Email")
    @Expose
    private String Email;

    /**
     * 获取子用户用户名
     * @return Name 子用户用户名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置子用户用户名
     * @param Name 子用户用户名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取子用户备注
     * @return Remark 子用户备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * 设置子用户备注
     * @param Remark 子用户备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * 获取子用户是否可以登录控制台。传0子用户无法登录控制台，传1子用户可以登录控制台。
     * @return ConsoleLogin 子用户是否可以登录控制台。传0子用户无法登录控制台，传1子用户可以登录控制台。
     */
    public Long getConsoleLogin() {
        return this.ConsoleLogin;
    }

    /**
     * 设置子用户是否可以登录控制台。传0子用户无法登录控制台，传1子用户可以登录控制台。
     * @param ConsoleLogin 子用户是否可以登录控制台。传0子用户无法登录控制台，传1子用户可以登录控制台。
     */
    public void setConsoleLogin(Long ConsoleLogin) {
        this.ConsoleLogin = ConsoleLogin;
    }

    /**
     * 获取是否生成子用户密钥。传0不生成子用户密钥，传1生成子用户密钥。
     * @return UseApi 是否生成子用户密钥。传0不生成子用户密钥，传1生成子用户密钥。
     */
    public Long getUseApi() {
        return this.UseApi;
    }

    /**
     * 设置是否生成子用户密钥。传0不生成子用户密钥，传1生成子用户密钥。
     * @param UseApi 是否生成子用户密钥。传0不生成子用户密钥，传1生成子用户密钥。
     */
    public void setUseApi(Long UseApi) {
        this.UseApi = UseApi;
    }

    /**
     * 获取子用户控制台登录密码，若未进行密码规则设置则默认密码规则为8位以上同时包含大写小字母、数字和特殊字符。只有可以登录控制台时才有效，如果传空并且上面指定允许登录控制台，则自动生成随机密码，随机密码规则为32位包含大写小字母、数字和特殊字符。
     * @return Password 子用户控制台登录密码，若未进行密码规则设置则默认密码规则为8位以上同时包含大写小字母、数字和特殊字符。只有可以登录控制台时才有效，如果传空并且上面指定允许登录控制台，则自动生成随机密码，随机密码规则为32位包含大写小字母、数字和特殊字符。
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置子用户控制台登录密码，若未进行密码规则设置则默认密码规则为8位以上同时包含大写小字母、数字和特殊字符。只有可以登录控制台时才有效，如果传空并且上面指定允许登录控制台，则自动生成随机密码，随机密码规则为32位包含大写小字母、数字和特殊字符。
     * @param Password 子用户控制台登录密码，若未进行密码规则设置则默认密码规则为8位以上同时包含大写小字母、数字和特殊字符。只有可以登录控制台时才有效，如果传空并且上面指定允许登录控制台，则自动生成随机密码，随机密码规则为32位包含大写小字母、数字和特殊字符。
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取子用户是否要在下次登录时重置密码。传0子用户下次登录控制台不需重置密码，传1子用户下次登录控制台需要重置密码。
     * @return NeedResetPassword 子用户是否要在下次登录时重置密码。传0子用户下次登录控制台不需重置密码，传1子用户下次登录控制台需要重置密码。
     */
    public Long getNeedResetPassword() {
        return this.NeedResetPassword;
    }

    /**
     * 设置子用户是否要在下次登录时重置密码。传0子用户下次登录控制台不需重置密码，传1子用户下次登录控制台需要重置密码。
     * @param NeedResetPassword 子用户是否要在下次登录时重置密码。传0子用户下次登录控制台不需重置密码，传1子用户下次登录控制台需要重置密码。
     */
    public void setNeedResetPassword(Long NeedResetPassword) {
        this.NeedResetPassword = NeedResetPassword;
    }

    /**
     * 获取手机号
     * @return PhoneNum 手机号
     */
    public String getPhoneNum() {
        return this.PhoneNum;
    }

    /**
     * 设置手机号
     * @param PhoneNum 手机号
     */
    public void setPhoneNum(String PhoneNum) {
        this.PhoneNum = PhoneNum;
    }

    /**
     * 获取区号
     * @return CountryCode 区号
     */
    public String getCountryCode() {
        return this.CountryCode;
    }

    /**
     * 设置区号
     * @param CountryCode 区号
     */
    public void setCountryCode(String CountryCode) {
        this.CountryCode = CountryCode;
    }

    /**
     * 获取邮箱
     * @return Email 邮箱
     */
    public String getEmail() {
        return this.Email;
    }

    /**
     * 设置邮箱
     * @param Email 邮箱
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "ConsoleLogin", this.ConsoleLogin);
        this.setParamSimple(map, prefix + "UseApi", this.UseApi);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "NeedResetPassword", this.NeedResetPassword);
        this.setParamSimple(map, prefix + "PhoneNum", this.PhoneNum);
        this.setParamSimple(map, prefix + "CountryCode", this.CountryCode);
        this.setParamSimple(map, prefix + "Email", this.Email);

    }
}

