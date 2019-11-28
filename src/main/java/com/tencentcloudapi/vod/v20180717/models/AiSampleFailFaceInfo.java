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

public class AiSampleFailFaceInfo  extends AbstractModel{

    /**
    * 对应入参 FaceContents 中错误图片下标，从 0 开始。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
    * 错误码，取值：
<li>0：成功；</li>
<li>其他：失败。</li>
    */
    @SerializedName("ErrCode")
    @Expose
    private Long ErrCode;

    /**
    * 错误描述。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * 获取对应入参 FaceContents 中错误图片下标，从 0 开始。
     * @return Index 对应入参 FaceContents 中错误图片下标，从 0 开始。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * 设置对应入参 FaceContents 中错误图片下标，从 0 开始。
     * @param Index 对应入参 FaceContents 中错误图片下标，从 0 开始。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    /**
     * 获取错误码，取值：
<li>0：成功；</li>
<li>其他：失败。</li>
     * @return ErrCode 错误码，取值：
<li>0：成功；</li>
<li>其他：失败。</li>
     */
    public Long getErrCode() {
        return this.ErrCode;
    }

    /**
     * 设置错误码，取值：
<li>0：成功；</li>
<li>其他：失败。</li>
     * @param ErrCode 错误码，取值：
<li>0：成功；</li>
<li>其他：失败。</li>
     */
    public void setErrCode(Long ErrCode) {
        this.ErrCode = ErrCode;
    }

    /**
     * 获取错误描述。
     * @return Message 错误描述。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置错误描述。
     * @param Message 错误描述。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Index", this.Index);
        this.setParamSimple(map, prefix + "ErrCode", this.ErrCode);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

