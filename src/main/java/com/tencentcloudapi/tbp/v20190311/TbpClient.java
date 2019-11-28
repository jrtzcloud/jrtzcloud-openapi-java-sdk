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
package com.tencentcloudapi.tbp.v20190311;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tbp.v20190311.models.*;

public class TbpClient extends AbstractClient{
    private static String endpoint = "tbp.tencentcloudapi.com";
    private static String version = "2019-03-11";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public TbpClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public TbpClient(Credential credential, String region, ClientProfile profile) {
        super(TbpClient.endpoint, TbpClient.version, credential, region, profile);
    }

    /**
     *对当前机器人的会话状态进行复位
     * @param req ResetRequest
     * @return ResetResponse
     * @throws TencentCloudSDKException
     */
    public ResetResponse Reset(ResetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ResetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "Reset"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *接收调用侧的文本输入，返回应答文本。已废弃，推荐使用最新版TextProcess接口。
     * @param req TextProcessRequest
     * @return TextProcessResponse
     * @throws TencentCloudSDKException
     */
    public TextProcessResponse TextProcess(TextProcessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextProcessResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TextProcessResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TextProcess"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *会话重置接口。已废弃，推荐使用最新版TextReset接口。
     * @param req TextResetRequest
     * @return TextResetResponse
     * @throws TencentCloudSDKException
     */
    public TextResetResponse TextReset(TextResetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TextResetResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<TextResetResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "TextReset"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
