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
import com.jrtzcloudapi.blten.v20191119.models.DescribeAssetAllocationParamRequest;
import com.jrtzcloudapi.blten.v20191119.models.DescribeAssetAllocationParamResponse;
import com.jrtzcloudapi.common.AbstractClient2;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;

import java.lang.reflect.Type;

public class BltenClient extends AbstractClient2 {
    private static String endpoint = "blten.jrtzcloud.cn";
    private static String version = "2019-11-19";


    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public BltenClient(Credential credential, String region, String path) {
        this(credential, region, new ClientProfile(), path);
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public BltenClient(Credential credential, String region, ClientProfile profile, String path) {
        super(BltenClient.endpoint, BltenClient.version, credential, region, profile,  path);
    }

    /**
     * 获取资产配置参数信息
     */
    public DescribeAssetAllocationParamResponse DescribeAssetAllocationParam(DescribeAssetAllocationParamRequest req) throws JrtzCloudSDKException {
        DescribeAssetAllocationParamResponse rsp = null;
        try {
            Type type = new TypeToken<DescribeAssetAllocationParamResponse>() {
            }.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "DescribeAssetAllocationParam"), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }



}
