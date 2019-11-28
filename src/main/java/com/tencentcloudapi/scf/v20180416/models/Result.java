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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Result  extends AbstractModel{

    /**
    * 表示执行过程中的日志输出，异步调用返回为空
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 表示执行函数的返回，异步调用返回为空
    */
    @SerializedName("RetMsg")
    @Expose
    private String RetMsg;

    /**
    * 表示执行函数的错误返回信息，异步调用返回为空
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
    * 执行函数时的内存大小，单位为Byte，异步调用返回为空
    */
    @SerializedName("MemUsage")
    @Expose
    private Integer MemUsage;

    /**
    * 表示执行函数的耗时，单位是毫秒，异步调用返回为空
    */
    @SerializedName("Duration")
    @Expose
    private Float Duration;

    /**
    * 表示函数的计费耗时，单位是毫秒，异步调用返回为空
    */
    @SerializedName("BillDuration")
    @Expose
    private Integer BillDuration;

    /**
    * 此次函数执行的Id
    */
    @SerializedName("FunctionRequestId")
    @Expose
    private String FunctionRequestId;

    /**
    * 0为正确，异步调用返回为空
    */
    @SerializedName("InvokeResult")
    @Expose
    private Integer InvokeResult;

    /**
     * 获取表示执行过程中的日志输出，异步调用返回为空
     * @return Log 表示执行过程中的日志输出，异步调用返回为空
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * 设置表示执行过程中的日志输出，异步调用返回为空
     * @param Log 表示执行过程中的日志输出，异步调用返回为空
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * 获取表示执行函数的返回，异步调用返回为空
     * @return RetMsg 表示执行函数的返回，异步调用返回为空
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * 设置表示执行函数的返回，异步调用返回为空
     * @param RetMsg 表示执行函数的返回，异步调用返回为空
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
    }

    /**
     * 获取表示执行函数的错误返回信息，异步调用返回为空
     * @return ErrMsg 表示执行函数的错误返回信息，异步调用返回为空
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * 设置表示执行函数的错误返回信息，异步调用返回为空
     * @param ErrMsg 表示执行函数的错误返回信息，异步调用返回为空
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * 获取执行函数时的内存大小，单位为Byte，异步调用返回为空
     * @return MemUsage 执行函数时的内存大小，单位为Byte，异步调用返回为空
     */
    public Integer getMemUsage() {
        return this.MemUsage;
    }

    /**
     * 设置执行函数时的内存大小，单位为Byte，异步调用返回为空
     * @param MemUsage 执行函数时的内存大小，单位为Byte，异步调用返回为空
     */
    public void setMemUsage(Integer MemUsage) {
        this.MemUsage = MemUsage;
    }

    /**
     * 获取表示执行函数的耗时，单位是毫秒，异步调用返回为空
     * @return Duration 表示执行函数的耗时，单位是毫秒，异步调用返回为空
     */
    public Float getDuration() {
        return this.Duration;
    }

    /**
     * 设置表示执行函数的耗时，单位是毫秒，异步调用返回为空
     * @param Duration 表示执行函数的耗时，单位是毫秒，异步调用返回为空
     */
    public void setDuration(Float Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取表示函数的计费耗时，单位是毫秒，异步调用返回为空
     * @return BillDuration 表示函数的计费耗时，单位是毫秒，异步调用返回为空
     */
    public Integer getBillDuration() {
        return this.BillDuration;
    }

    /**
     * 设置表示函数的计费耗时，单位是毫秒，异步调用返回为空
     * @param BillDuration 表示函数的计费耗时，单位是毫秒，异步调用返回为空
     */
    public void setBillDuration(Integer BillDuration) {
        this.BillDuration = BillDuration;
    }

    /**
     * 获取此次函数执行的Id
     * @return FunctionRequestId 此次函数执行的Id
     */
    public String getFunctionRequestId() {
        return this.FunctionRequestId;
    }

    /**
     * 设置此次函数执行的Id
     * @param FunctionRequestId 此次函数执行的Id
     */
    public void setFunctionRequestId(String FunctionRequestId) {
        this.FunctionRequestId = FunctionRequestId;
    }

    /**
     * 获取0为正确，异步调用返回为空
     * @return InvokeResult 0为正确，异步调用返回为空
     */
    public Integer getInvokeResult() {
        return this.InvokeResult;
    }

    /**
     * 设置0为正确，异步调用返回为空
     * @param InvokeResult 0为正确，异步调用返回为空
     */
    public void setInvokeResult(Integer InvokeResult) {
        this.InvokeResult = InvokeResult;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "RetMsg", this.RetMsg);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);
        this.setParamSimple(map, prefix + "MemUsage", this.MemUsage);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "BillDuration", this.BillDuration);
        this.setParamSimple(map, prefix + "FunctionRequestId", this.FunctionRequestId);
        this.setParamSimple(map, prefix + "InvokeResult", this.InvokeResult);

    }
}

