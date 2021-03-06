/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Investoday company. All Rights Reserved.
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
package com.jrtzcloudapi.blten.v20191119;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.jrtzcloudapi.blten.v20191119.models.*;
import com.jrtzcloudapi.common.AbstractClient;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;

import java.lang.reflect.Type;

public class BltenClient extends AbstractClient {
    private static String endpoint = "blten.jrtzcloud.cn";
    private static String version = "2019-11-19";

    private static final String DEFAULT_REGION = "ap-shenzhen";
    private static final String CREATE_PROJECT_PATH = "/blten/projects";
    private static final String DESCRIBE_MODEL_DATA_PATH = "/blten/model-data/projects/";
    private static final String PROJECT_ID_PATH= "/blten/projects/";


    /**
     * 构造client
     * @param credential 认证信息实例
     */
    public BltenClient(Credential credential) {
        this(credential, DEFAULT_REGION, new ClientProfile());
    }
    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public BltenClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param profile 配置实例
     */
    public BltenClient(Credential credential, ClientProfile profile) {
        super(BltenClient.endpoint, BltenClient.version, credential, DEFAULT_REGION, profile);
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public BltenClient(Credential credential, String region, ClientProfile profile) {
        super(BltenClient.endpoint, BltenClient.version, credential, region, profile);
    }
    /**
     * 查询模型数据
     */
    public DescribeModelDataResponse DescribeModelData(DescribeModelDataRequest req) throws JrtzCloudSDKException {
        DescribeModelDataResponse rsp = null;
        try {
            Type type = new TypeToken<DescribeModelDataResponse>(){}.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "DescribeModelData", DESCRIBE_MODEL_DATA_PATH + req.getProjectId()), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }
    /**
     * 根据 ProjectId 查询用户自定义模型
     */
    public ProjectResponse DescribeProject(DescribeProjectRequest req) throws JrtzCloudSDKException {
        ProjectResponse rsp = null;
        try {
            Type type = new TypeToken<ProjectResponse>(){}.getType();
            rsp  = gson.fromJson(this.internalGetRequest("DescribeProject", PROJECT_ID_PATH + req.getProjectId()), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }
    /**
     * 创建用户自定义模型
     */
    public ProjectResponse CreateProject(CreateProjectRequest req) throws JrtzCloudSDKException {
        ProjectResponse rsp = null;
        try {
            Type type = new TypeToken<ProjectResponse>(){}.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "CreateProject", CREATE_PROJECT_PATH), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }
    /**
     * 替换用户自定义模型
     */
    public ProjectResponse ReplaceProject(ReplaceProjectRequest req) throws JrtzCloudSDKException {
        ProjectResponse rsp = null;
        try {
            Type type = new TypeToken<ProjectResponse>(){}.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "ReplaceProject", PROJECT_ID_PATH + req.getProjectId()), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }
    /**
     * 修改用户自定义模型
     */
    public ProjectResponse PatchProject(PatchProjectRequest req) throws JrtzCloudSDKException {
        ProjectResponse rsp = null;
        try {
            Type type = new TypeToken<ProjectResponse>(){}.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "PatchProject", PROJECT_ID_PATH + req.getProjectId()), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }



}
