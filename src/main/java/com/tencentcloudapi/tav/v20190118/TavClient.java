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
package com.tencentcloudapi.tav.v20190118;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tav.v20190118.models.*;

public class TavClient extends AbstractClient{
    private static String endpoint = "tav.tencentcloudapi.com";
    private static String version = "2019-01-18";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public TavClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public TavClient(Credential credential, String region, ClientProfile profile) {
        super(TavClient.endpoint, TavClient.version, credential, region, profile);
    }

    /**
     *获取TAV本地引擎
     * @param req GetLocalEngineRequest
     * @return GetLocalEngineResponse
     * @throws TencentCloudSDKException
     */
    public GetLocalEngineResponse GetLocalEngine(GetLocalEngineRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLocalEngineResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetLocalEngineResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetLocalEngine"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *tav文件上传扫描结果查询
     * @param req GetScanResultRequest
     * @return GetScanResultResponse
     * @throws TencentCloudSDKException
     */
    public GetScanResultResponse GetScanResult(GetScanResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetScanResultResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetScanResultResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetScanResult"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *tav文件上传扫描
     * @param req ScanFileRequest
     * @return ScanFileResponse
     * @throws TencentCloudSDKException
     */
    public ScanFileResponse ScanFile(ScanFileRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanFileResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ScanFileResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ScanFile"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *通过文件哈希值获取文件黑白属性
     * @param req ScanFileHashRequest
     * @return ScanFileHashResponse
     * @throws TencentCloudSDKException
     */
    public ScanFileHashResponse ScanFileHash(ScanFileHashRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ScanFileHashResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ScanFileHashResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ScanFileHash"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
