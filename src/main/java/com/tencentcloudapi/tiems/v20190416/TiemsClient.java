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
package com.tencentcloudapi.tiems.v20190416;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tiems.v20190416.models.*;

public class TiemsClient extends AbstractClient{
    private static String endpoint = "tiems.tencentcloudapi.com";
    private static String version = "2019-04-16";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public TiemsClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public TiemsClient(Credential credential, String region, ClientProfile profile) {
        super(TiemsClient.endpoint, TiemsClient.version, credential, region, profile);
    }

    /**
     *创建任务
     * @param req CreateJobRequest
     * @return CreateJobResponse
     * @throws TencentCloudSDKException
     */
    public CreateJobResponse CreateJob(CreateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建运行环境
     * @param req CreateRuntimeRequest
     * @return CreateRuntimeResponse
     * @throws TencentCloudSDKException
     */
    public CreateRuntimeResponse CreateRuntime(CreateRuntimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRuntimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateRuntimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateRuntime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建服务
     * @param req CreateServiceRequest
     * @return CreateServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceResponse CreateService(CreateServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建服务配置
     * @param req CreateServiceConfigRequest
     * @return CreateServiceConfigResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceConfigResponse CreateServiceConfig(CreateServiceConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateServiceConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateServiceConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除任务
     * @param req DeleteJobRequest
     * @return DeleteJobResponse
     * @throws TencentCloudSDKException
     */
    public DeleteJobResponse DeleteJob(DeleteJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除运行环境
     * @param req DeleteRuntimeRequest
     * @return DeleteRuntimeResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRuntimeResponse DeleteRuntime(DeleteRuntimeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRuntimeResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteRuntimeResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteRuntime"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除服务
     * @param req DeleteServiceRequest
     * @return DeleteServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceResponse DeleteService(DeleteServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除服务配置
     * @param req DeleteServiceConfigRequest
     * @return DeleteServiceConfigResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceConfigResponse DeleteServiceConfig(DeleteServiceConfigRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceConfigResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteServiceConfigResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteServiceConfig"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取节点列表
     * @param req DescribeInstancesRequest
     * @return DescribeInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeInstancesResponse DescribeInstances(DescribeInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述服务运行环境
     * @param req DescribeRuntimesRequest
     * @return DescribeRuntimesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRuntimesResponse DescribeRuntimes(DescribeRuntimesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRuntimesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRuntimesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRuntimes"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述服务配置
     * @param req DescribeServiceConfigsRequest
     * @return DescribeServiceConfigsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceConfigsResponse DescribeServiceConfigs(DescribeServiceConfigsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceConfigsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServiceConfigsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServiceConfigs"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *描述服务
     * @param req DescribeServicesRequest
     * @return DescribeServicesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServicesResponse DescribeServices(DescribeServicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServicesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeServicesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeServices"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *暴露服务
     * @param req ExposeServiceRequest
     * @return ExposeServiceResponse
     * @throws TencentCloudSDKException
     */
    public ExposeServiceResponse ExposeService(ExposeServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ExposeServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ExposeServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ExposeService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新任务
     * @param req UpdateJobRequest
     * @return UpdateJobResponse
     * @throws TencentCloudSDKException
     */
    public UpdateJobResponse UpdateJob(UpdateJobRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateJobResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateJobResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateJob"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *更新服务
     * @param req UpdateServiceRequest
     * @return UpdateServiceResponse
     * @throws TencentCloudSDKException
     */
    public UpdateServiceResponse UpdateService(UpdateServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateServiceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateServiceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "UpdateService"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
