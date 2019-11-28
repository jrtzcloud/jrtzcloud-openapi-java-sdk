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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BankCardVerificationRequest  extends AbstractModel{

    /**
    * 开户证件号，与CertType参数的证件类型一致，如：身份证，则传入身份证号。
    */
    @SerializedName("IdCard")
    @Expose
    private String IdCard;

    /**
    * 姓名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 银行卡
    */
    @SerializedName("BankCard")
    @Expose
    private String BankCard;

    /**
    * 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。
目前默认：0 身份证，其他证件类型需求可以联系小助手faceid001确认。
    */
    @SerializedName("CertType")
    @Expose
    private Integer CertType;

    /**
     * 获取开户证件号，与CertType参数的证件类型一致，如：身份证，则传入身份证号。
     * @return IdCard 开户证件号，与CertType参数的证件类型一致，如：身份证，则传入身份证号。
     */
    public String getIdCard() {
        return this.IdCard;
    }

    /**
     * 设置开户证件号，与CertType参数的证件类型一致，如：身份证，则传入身份证号。
     * @param IdCard 开户证件号，与CertType参数的证件类型一致，如：身份证，则传入身份证号。
     */
    public void setIdCard(String IdCard) {
        this.IdCard = IdCard;
    }

    /**
     * 获取姓名
     * @return Name 姓名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置姓名
     * @param Name 姓名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取银行卡
     * @return BankCard 银行卡
     */
    public String getBankCard() {
        return this.BankCard;
    }

    /**
     * 设置银行卡
     * @param BankCard 银行卡
     */
    public void setBankCard(String BankCard) {
        this.BankCard = BankCard;
    }

    /**
     * 获取证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。
目前默认：0 身份证，其他证件类型需求可以联系小助手faceid001确认。
     * @return CertType 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。
目前默认：0 身份证，其他证件类型需求可以联系小助手faceid001确认。
     */
    public Integer getCertType() {
        return this.CertType;
    }

    /**
     * 设置证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。
目前默认：0 身份证，其他证件类型需求可以联系小助手faceid001确认。
     * @param CertType 证件类型，请确认该证件为开户时使用的证件类型，未用于开户的证件信息不支持验证。
目前默认：0 身份证，其他证件类型需求可以联系小助手faceid001确认。
     */
    public void setCertType(Integer CertType) {
        this.CertType = CertType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IdCard", this.IdCard);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "BankCard", this.BankCard);
        this.setParamSimple(map, prefix + "CertType", this.CertType);

    }
}

