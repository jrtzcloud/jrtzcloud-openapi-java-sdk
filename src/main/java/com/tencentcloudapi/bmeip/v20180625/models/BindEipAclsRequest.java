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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindEipAclsRequest  extends AbstractModel{

    /**
    * 待关联的 EIP 与 ACL关系列表
    */
    @SerializedName("EipIdAclIdList")
    @Expose
    private EipAclMap [] EipIdAclIdList;

    /**
     * 获取待关联的 EIP 与 ACL关系列表
     * @return EipIdAclIdList 待关联的 EIP 与 ACL关系列表
     */
    public EipAclMap [] getEipIdAclIdList() {
        return this.EipIdAclIdList;
    }

    /**
     * 设置待关联的 EIP 与 ACL关系列表
     * @param EipIdAclIdList 待关联的 EIP 与 ACL关系列表
     */
    public void setEipIdAclIdList(EipAclMap [] EipIdAclIdList) {
        this.EipIdAclIdList = EipIdAclIdList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "EipIdAclIdList.", this.EipIdAclIdList);

    }
}

