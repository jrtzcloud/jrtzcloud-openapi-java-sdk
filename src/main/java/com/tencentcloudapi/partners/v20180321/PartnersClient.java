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
package com.tencentcloudapi.partners.v20180321;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.partners.v20180321.models.*;

public class PartnersClient extends AbstractClient{
    private static String endpoint = "partners.tencentcloudapi.com";
    private static String version = "2018-03-21";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public PartnersClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public PartnersClient(Credential credential, String region, ClientProfile profile) {
        super(PartnersClient.endpoint, PartnersClient.version, credential, region, profile);
    }

    /**
     *代理商支付订单接口，支持自付/代付
     * @param req AgentPayDealsRequest
     * @return AgentPayDealsResponse
     * @throws TencentCloudSDKException
     */
    public AgentPayDealsResponse AgentPayDeals(AgentPayDealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AgentPayDealsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AgentPayDealsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AgentPayDeals"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为合作伙伴提供转账给客户能力。仅支持合作伙伴为自己名下客户转账。
     * @param req AgentTransferMoneyRequest
     * @return AgentTransferMoneyResponse
     * @throws TencentCloudSDKException
     */
    public AgentTransferMoneyResponse AgentTransferMoney(AgentTransferMoneyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AgentTransferMoneyResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AgentTransferMoneyResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AgentTransferMoney"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可以审核其名下申请中代客
     * @param req AuditApplyClientRequest
     * @return AuditApplyClientResponse
     * @throws TencentCloudSDKException
     */
    public AuditApplyClientResponse AuditApplyClient(AuditApplyClientRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AuditApplyClientResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AuditApplyClientResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AuditApplyClient"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *合作伙伴为客户创建强代付关系
     * @param req CreatePayRelationForClientRequest
     * @return CreatePayRelationForClientResponse
     * @throws TencentCloudSDKException
     */
    public CreatePayRelationForClientResponse CreatePayRelationForClient(CreatePayRelationForClientRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePayRelationForClientResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePayRelationForClientResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePayRelationForClient"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询已审核客户列表
     * @param req DescribeAgentAuditedClientsRequest
     * @return DescribeAgentAuditedClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentAuditedClientsResponse DescribeAgentAuditedClients(DescribeAgentAuditedClientsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentAuditedClientsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentAuditedClientsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentAuditedClients"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可查询自己及名下代客所有业务明细
     * @param req DescribeAgentBillsRequest
     * @return DescribeAgentBillsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentBillsResponse DescribeAgentBills(DescribeAgentBillsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentBillsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentBillsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentBills"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可查询自己名下待审核客户列表
     * @param req DescribeAgentClientsRequest
     * @return DescribeAgentClientsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentClientsResponse DescribeAgentClients(DescribeAgentClientsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentClientsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentClientsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentClients"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *供超大型代理商（代客数量>=3000 ）拉取缓存的全量客户订单。
     * @param req DescribeAgentDealsCacheRequest
     * @return DescribeAgentDealsCacheResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentDealsCacheResponse DescribeAgentDealsCache(DescribeAgentDealsCacheRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentDealsCacheResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentDealsCacheResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentDealsCache"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *可以查询代理商代付的所有订单
     * @param req DescribeAgentPayDealsRequest
     * @return DescribeAgentPayDealsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAgentPayDealsResponse DescribeAgentPayDeals(DescribeAgentPayDealsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAgentPayDealsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeAgentPayDealsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeAgentPayDeals"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为合作伙伴提供查询客户余额能力。调用者必须是合作伙伴，只能查询自己名下客户余额
     * @param req DescribeClientBalanceRequest
     * @return DescribeClientBalanceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClientBalanceResponse DescribeClientBalance(DescribeClientBalanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClientBalanceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeClientBalanceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeClientBalance"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可查询自己名下全部返佣信息
     * @param req DescribeRebateInfosRequest
     * @return DescribeRebateInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRebateInfosResponse DescribeRebateInfos(DescribeRebateInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRebateInfosResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeRebateInfosResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeRebateInfos"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商查询名下业务员列表信息
     * @param req DescribeSalesmansRequest
     * @return DescribeSalesmansResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSalesmansResponse DescribeSalesmans(DescribeSalesmansRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSalesmansResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeSalesmansResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DescribeSalesmans"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *代理商可以对名下客户添加备注、修改备注
     * @param req ModifyClientRemarkRequest
     * @return ModifyClientRemarkResponse
     * @throws TencentCloudSDKException
     */
    public ModifyClientRemarkResponse ModifyClientRemark(ModifyClientRemarkRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyClientRemarkResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyClientRemarkResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyClientRemark"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *合作伙伴为客户消除强代付关系
     * @param req RemovePayRelationForClientRequest
     * @return RemovePayRelationForClientResponse
     * @throws TencentCloudSDKException
     */
    public RemovePayRelationForClientResponse RemovePayRelationForClient(RemovePayRelationForClientRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemovePayRelationForClientResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RemovePayRelationForClientResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RemovePayRelationForClient"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
