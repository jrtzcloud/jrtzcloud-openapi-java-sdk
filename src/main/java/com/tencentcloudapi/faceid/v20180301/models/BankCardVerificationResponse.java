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

public class BankCardVerificationResponse  extends AbstractModel{

    /**
    * 认证结果码
收费结果码：
'0': '认证通过'
'-1': '认证未通过'
'-5': '持卡人信息有误'
'-6': '未开通无卡支付'
'-7': '此卡被没收'
'-8': '无效卡号'
'-9': '此卡无对应发卡行'
'-10': '该卡未初始化或睡眠卡'
'-11': '作弊卡、吞卡'
'-12': '此卡已挂失'
'-13': '该卡已过期'
'-14': '受限制的卡'
'-15': '密码错误次数超限'
'-16': '发卡行不支持此交易'
不收费结果码：
'-2': '姓名校验不通过'
'-3': '身份证号码有误'
'-4': '银行卡号码有误'
'-17': '服务繁忙'
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 认证结果信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取认证结果码
收费结果码：
'0': '认证通过'
'-1': '认证未通过'
'-5': '持卡人信息有误'
'-6': '未开通无卡支付'
'-7': '此卡被没收'
'-8': '无效卡号'
'-9': '此卡无对应发卡行'
'-10': '该卡未初始化或睡眠卡'
'-11': '作弊卡、吞卡'
'-12': '此卡已挂失'
'-13': '该卡已过期'
'-14': '受限制的卡'
'-15': '密码错误次数超限'
'-16': '发卡行不支持此交易'
不收费结果码：
'-2': '姓名校验不通过'
'-3': '身份证号码有误'
'-4': '银行卡号码有误'
'-17': '服务繁忙'
     * @return Result 认证结果码
收费结果码：
'0': '认证通过'
'-1': '认证未通过'
'-5': '持卡人信息有误'
'-6': '未开通无卡支付'
'-7': '此卡被没收'
'-8': '无效卡号'
'-9': '此卡无对应发卡行'
'-10': '该卡未初始化或睡眠卡'
'-11': '作弊卡、吞卡'
'-12': '此卡已挂失'
'-13': '该卡已过期'
'-14': '受限制的卡'
'-15': '密码错误次数超限'
'-16': '发卡行不支持此交易'
不收费结果码：
'-2': '姓名校验不通过'
'-3': '身份证号码有误'
'-4': '银行卡号码有误'
'-17': '服务繁忙'
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * 设置认证结果码
收费结果码：
'0': '认证通过'
'-1': '认证未通过'
'-5': '持卡人信息有误'
'-6': '未开通无卡支付'
'-7': '此卡被没收'
'-8': '无效卡号'
'-9': '此卡无对应发卡行'
'-10': '该卡未初始化或睡眠卡'
'-11': '作弊卡、吞卡'
'-12': '此卡已挂失'
'-13': '该卡已过期'
'-14': '受限制的卡'
'-15': '密码错误次数超限'
'-16': '发卡行不支持此交易'
不收费结果码：
'-2': '姓名校验不通过'
'-3': '身份证号码有误'
'-4': '银行卡号码有误'
'-17': '服务繁忙'
     * @param Result 认证结果码
收费结果码：
'0': '认证通过'
'-1': '认证未通过'
'-5': '持卡人信息有误'
'-6': '未开通无卡支付'
'-7': '此卡被没收'
'-8': '无效卡号'
'-9': '此卡无对应发卡行'
'-10': '该卡未初始化或睡眠卡'
'-11': '作弊卡、吞卡'
'-12': '此卡已挂失'
'-13': '该卡已过期'
'-14': '受限制的卡'
'-15': '密码错误次数超限'
'-16': '发卡行不支持此交易'
不收费结果码：
'-2': '姓名校验不通过'
'-3': '身份证号码有误'
'-4': '银行卡号码有误'
'-17': '服务繁忙'
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * 获取认证结果信息。
     * @return Description 认证结果信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置认证结果信息。
     * @param Description 认证结果信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

