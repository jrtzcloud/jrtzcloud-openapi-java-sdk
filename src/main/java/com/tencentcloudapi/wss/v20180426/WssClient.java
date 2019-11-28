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
package com.tencentcloudapi.wss.v20180426;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.wss.v20180426.models.*;

public class WssClient extends AbstractClient{
    private static String endpoint = "wss.tencentcloudapi.com";
    private static String version = "2018-04-26";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public WssClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public WssClient(Credential credential, String region, ClientProfile profile) {
        super(WssClient.endpoint, WssClient.version, credential, region, profile);
    }

    /**
     *本接口（DeleteCert）用于删除证书。
     * @param req DeleteCertRequest
     * @return DeleteCertResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCertResponse DeleteCert(DeleteCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeCertList)用于获取证书列表。
     * @param req DescribeCertListRequest
     * @return DescribeCertListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCertListResponse DescribeCertList(DescribeCertListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCertListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeCertListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeCertList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UploadCert）用于上传证书。
     * @param req UploadCertRequest
     * @return UploadCertResponse
     * @throws TencentCloudSDKException
     */
    public UploadCertResponse UploadCert(UploadCertRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadCertResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UploadCertResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UploadCert"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
