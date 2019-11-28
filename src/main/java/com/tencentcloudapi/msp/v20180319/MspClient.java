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
package com.tencentcloudapi.msp.v20180319;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.msp.v20180319.models.*;

public class MspClient extends AbstractClient{
    private static String endpoint = "msp.tencentcloudapi.com";
    private static String version = "2018-03-19";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public MspClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public MspClient(Credential credential, String region, ClientProfile profile) {
        super(MspClient.endpoint, MspClient.version, credential, region, profile);
    }

    /**
     *取消注册迁移任务
     * @param req DeregisterMigrationTaskRequest
     * @return DeregisterMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DeregisterMigrationTaskResponse DeregisterMigrationTask(DeregisterMigrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeregisterMigrationTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeregisterMigrationTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeregisterMigrationTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定迁移任务详情
     * @param req DescribeMigrationTaskRequest
     * @return DescribeMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeMigrationTaskResponse DescribeMigrationTask(DescribeMigrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeMigrationTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeMigrationTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeMigrationTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取迁移项目名称列表
     * @param req ListMigrationProjectRequest
     * @return ListMigrationProjectResponse
     * @throws TencentCloudSDKException
     */
    public ListMigrationProjectResponse ListMigrationProject(ListMigrationProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListMigrationProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListMigrationProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListMigrationProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取迁移任务列表
     * @param req ListMigrationTaskRequest
     * @return ListMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public ListMigrationTaskResponse ListMigrationTask(ListMigrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListMigrationTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ListMigrationTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ListMigrationTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更改迁移任务所属项目
     * @param req ModifyMigrationTaskBelongToProjectRequest
     * @return ModifyMigrationTaskBelongToProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationTaskBelongToProjectResponse ModifyMigrationTaskBelongToProject(ModifyMigrationTaskBelongToProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrationTaskBelongToProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrationTaskBelongToProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyMigrationTaskBelongToProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新迁移任务状态
     * @param req ModifyMigrationTaskStatusRequest
     * @return ModifyMigrationTaskStatusResponse
     * @throws TencentCloudSDKException
     */
    public ModifyMigrationTaskStatusResponse ModifyMigrationTaskStatus(ModifyMigrationTaskStatusRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyMigrationTaskStatusResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyMigrationTaskStatusResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyMigrationTaskStatus"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *注册迁移任务
     * @param req RegisterMigrationTaskRequest
     * @return RegisterMigrationTaskResponse
     * @throws TencentCloudSDKException
     */
    public RegisterMigrationTaskResponse RegisterMigrationTask(RegisterMigrationTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RegisterMigrationTaskResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RegisterMigrationTaskResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RegisterMigrationTask"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
