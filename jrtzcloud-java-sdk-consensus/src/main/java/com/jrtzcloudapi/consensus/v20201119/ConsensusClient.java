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
package com.jrtzcloudapi.consensus.v20201119;

import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.jrtzcloudapi.common.AbstractClient;
import com.jrtzcloudapi.common.Credential;
import com.jrtzcloudapi.common.exception.JrtzCloudSDKException;
import com.jrtzcloudapi.common.profile.ClientProfile;
import com.jrtzcloudapi.consensus.v20201119.models.*;

import java.lang.reflect.Type;

public class ConsensusClient extends AbstractClient {
    private static String endpoint = "dataapi.investoday.net";
    private static String version = "2019-11-19";

    private static final String DEFAULT_REGION = "ap-shenzhen";
    private static final String DESCRIBE_IND_FRCST_ANAEM_PATH = "/consensus/ind-frcst-anaem";


    /**
     * 构造client
     * @param credential 认证信息实例
     */
    public ConsensusClient(Credential credential) {
        this(credential, DEFAULT_REGION, new ClientProfile());
    }
    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public ConsensusClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param profile 配置实例
     */
    public ConsensusClient(Credential credential, ClientProfile profile) {
        super(ConsensusClient.endpoint, ConsensusClient.version, credential, DEFAULT_REGION, profile);
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public ConsensusClient(Credential credential, String region, ClientProfile profile) {
        super(ConsensusClient.endpoint, ConsensusClient.version, credential, region, profile);
    }
    /**
     * 查询分析师动能
     */
    public DescribeResponse DescribeIndFrcstAnaem(DescribeIndFrcstAnaemRequest req) throws JrtzCloudSDKException {
        DescribeResponse rsp = null;
        try {
            Type type = new TypeToken<DescribeResponse>(){}.getType();
            rsp  = gson.fromJson(this.internalRequest(req, "DescribeIndFrcstAnaem", DESCRIBE_IND_FRCST_ANAEM_PATH), type);
        } catch (JsonSyntaxException e) {
            throw new JrtzCloudSDKException(e.getMessage());
        }
        return rsp;
    }

}
