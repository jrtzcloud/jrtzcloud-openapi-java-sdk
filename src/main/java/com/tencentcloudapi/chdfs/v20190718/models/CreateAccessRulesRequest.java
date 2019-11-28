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
package com.tencentcloudapi.chdfs.v20190718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateAccessRulesRequest  extends AbstractModel{

    /**
    * 多个权限规则，上限为10
    */
    @SerializedName("AccessRules")
    @Expose
    private AccessRule [] AccessRules;

    /**
    * 权限组ID
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
     * 获取多个权限规则，上限为10
     * @return AccessRules 多个权限规则，上限为10
     */
    public AccessRule [] getAccessRules() {
        return this.AccessRules;
    }

    /**
     * 设置多个权限规则，上限为10
     * @param AccessRules 多个权限规则，上限为10
     */
    public void setAccessRules(AccessRule [] AccessRules) {
        this.AccessRules = AccessRules;
    }

    /**
     * 获取权限组ID
     * @return AccessGroupId 权限组ID
     */
    public String getAccessGroupId() {
        return this.AccessGroupId;
    }

    /**
     * 设置权限组ID
     * @param AccessGroupId 权限组ID
     */
    public void setAccessGroupId(String AccessGroupId) {
        this.AccessGroupId = AccessGroupId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AccessRules.", this.AccessRules);
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);

    }
}

