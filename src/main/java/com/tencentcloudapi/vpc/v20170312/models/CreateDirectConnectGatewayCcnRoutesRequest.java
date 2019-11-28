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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDirectConnectGatewayCcnRoutesRequest  extends AbstractModel{

    /**
    * 专线网关ID，形如：dcg-prpqlmg1
    */
    @SerializedName("DirectConnectGatewayId")
    @Expose
    private String DirectConnectGatewayId;

    /**
    * 需要连通的IDC网段列表
    */
    @SerializedName("Routes")
    @Expose
    private DirectConnectGatewayCcnRoute [] Routes;

    /**
     * 获取专线网关ID，形如：dcg-prpqlmg1
     * @return DirectConnectGatewayId 专线网关ID，形如：dcg-prpqlmg1
     */
    public String getDirectConnectGatewayId() {
        return this.DirectConnectGatewayId;
    }

    /**
     * 设置专线网关ID，形如：dcg-prpqlmg1
     * @param DirectConnectGatewayId 专线网关ID，形如：dcg-prpqlmg1
     */
    public void setDirectConnectGatewayId(String DirectConnectGatewayId) {
        this.DirectConnectGatewayId = DirectConnectGatewayId;
    }

    /**
     * 获取需要连通的IDC网段列表
     * @return Routes 需要连通的IDC网段列表
     */
    public DirectConnectGatewayCcnRoute [] getRoutes() {
        return this.Routes;
    }

    /**
     * 设置需要连通的IDC网段列表
     * @param Routes 需要连通的IDC网段列表
     */
    public void setRoutes(DirectConnectGatewayCcnRoute [] Routes) {
        this.Routes = Routes;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectGatewayId", this.DirectConnectGatewayId);
        this.setParamArrayObj(map, prefix + "Routes.", this.Routes);

    }
}

