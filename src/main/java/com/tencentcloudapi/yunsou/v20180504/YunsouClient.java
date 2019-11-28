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
package com.tencentcloudapi.yunsou.v20180504;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.yunsou.v20180504.models.*;

public class YunsouClient extends AbstractClient{
    private static String endpoint = "yunsou.tencentcloudapi.com";
    private static String version = "2018-05-04";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public YunsouClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public YunsouClient(Credential credential, String region, ClientProfile profile) {
        super(YunsouClient.endpoint, YunsouClient.version, credential, region, profile);
    }

    /**
     *上传云搜数据的API接口
     * @param req DataManipulationRequest
     * @return DataManipulationResponse
     * @throws TencentCloudSDKException
     */
    public DataManipulationResponse DataManipulation(DataManipulationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DataManipulationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DataManipulationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DataManipulation"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于检索云搜中的数据
     * @param req DataSearchRequest
     * @return DataSearchResponse
     * @throws TencentCloudSDKException
     */
    public DataSearchResponse DataSearch(DataSearchRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DataSearchResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DataSearchResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DataSearch"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
