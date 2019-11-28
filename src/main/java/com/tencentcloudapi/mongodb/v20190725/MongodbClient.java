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
package com.tencentcloudapi.mongodb.v20190725;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.mongodb.v20190725.models.*;

public class MongodbClient extends AbstractClient{
    private static String endpoint = "mongodb.tencentcloudapi.com";
    private static String version = "2019-07-25";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public MongodbClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public MongodbClient(Credential credential, String region, ClientProfile profile) {
        super(MongodbClient.endpoint, MongodbClient.version, credential, region, profile);
    }

    /**
     *本接口(AssignProject)用于指定云数据库实例的所属项目。

     * @param req AssignProjectRequest
     * @return AssignProjectResponse
     * @throws TencentCloudSDKException
     */
    public AssignProjectResponse AssignProject(AssignProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignProjectResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssignProjectResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssignProject"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateDBInstance)用于创建包年包月的MongoDB云数据库实例。接口支持的售卖规格，可从查询云数据库的售卖规格（DescribeSpecInfo）获取。
     * @param req CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceResponse CreateDBInstance(CreateDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(CreateDBInstanceHour)用于创建按量计费的MongoDB云数据库实例。
     * @param req CreateDBInstanceHourRequest
     * @return CreateDBInstanceHourResponse
     * @throws TencentCloudSDKException
     */
    public CreateDBInstanceHourResponse CreateDBInstanceHour(CreateDBInstanceHourRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDBInstanceHourResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDBInstanceHourResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateDBInstanceHour"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeBackupAccess）用于获取备份文件的下载授权，具体的备份文件信息可通过查询实例备份列表（DescribeDBBackups）接口获取
     * @param req DescribeBackupAccessRequest
     * @return DescribeBackupAccessResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBackupAccessResponse DescribeBackupAccess(DescribeBackupAccessRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBackupAccessResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeBackupAccessResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeBackupAccess"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeClientConnections)用于查询实例客户端连接信息，包括连接IP和连接数量。目前只支持3.2版本的MongoDB实例。
     * @param req DescribeClientConnectionsRequest
     * @return DescribeClientConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientConnectionsResponse DescribeClientConnections(DescribeClientConnectionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClientConnectionsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClientConnectionsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClientConnections"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（DescribeDBBackups）用于查询实例备份列表，目前只支持7天内的备份查询。
     * @param req DescribeDBBackupsRequest
     * @return DescribeDBBackupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBBackupsResponse DescribeDBBackups(DescribeDBBackupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBBackupsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBBackupsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBBackups"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeDBInstances)用于查询云数据库实例列表，支持通过项目ID、实例ID、实例状态等过滤条件来筛选实例。支持查询主实例、灾备实例和只读实例信息列表。
     * @param req DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDBInstancesResponse DescribeDBInstances(DescribeDBInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDBInstancesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDBInstancesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeDBInstances"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(DescribeSpecInfo)用于查询实例的售卖规格。
     * @param req DescribeSpecInfoRequest
     * @return DescribeSpecInfoResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSpecInfoResponse DescribeSpecInfo(DescribeSpecInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSpecInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSpecInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSpecInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(IsolateDBInstance)用于隔离MongoDB云数据库按量计费实例。隔离后实例保留在回收站中，不能再写入数据。隔离一定时间后，实例会彻底删除，回收站保存时间请参考按量计费的服务条款。在隔离中的按量计费实例无法恢复，请谨慎操作。
     * @param req IsolateDBInstanceRequest
     * @return IsolateDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public IsolateDBInstanceResponse IsolateDBInstance(IsolateDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<IsolateDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<IsolateDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "IsolateDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(ModifyDBInstanceSpec)用于调整MongoDB云数据库实例配置。接口支持的售卖规格，可从查询云数据库的售卖规格（DescribeSpecInfo）获取。
     * @param req ModifyDBInstanceSpecRequest
     * @return ModifyDBInstanceSpecResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDBInstanceSpecResponse ModifyDBInstanceSpec(ModifyDBInstanceSpecRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDBInstanceSpecResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyDBInstanceSpecResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyDBInstanceSpec"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(OfflineIsolatedInstances)用于立即下线隔离状态的云数据库实例。进行操作的实例状态必须为隔离状态。
     * @param req OfflineIsolatedDBInstanceRequest
     * @return OfflineIsolatedDBInstanceResponse
     * @throws TencentCloudSDKException
     */
    public OfflineIsolatedDBInstanceResponse OfflineIsolatedDBInstance(OfflineIsolatedDBInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<OfflineIsolatedDBInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<OfflineIsolatedDBInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "OfflineIsolatedDBInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口(RenameInstance)用于修改云数据库实例的名称。
     * @param req RenameInstanceRequest
     * @return RenameInstanceResponse
     * @throws TencentCloudSDKException
     */
    public RenameInstanceResponse RenameInstance(RenameInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenameInstanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RenameInstanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RenameInstance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
