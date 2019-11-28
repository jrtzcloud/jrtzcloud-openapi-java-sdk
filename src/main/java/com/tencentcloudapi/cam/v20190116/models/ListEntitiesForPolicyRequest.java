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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEntitiesForPolicyRequest  extends AbstractModel{

    /**
    * 策略 id
    */
    @SerializedName("PolicyId")
    @Expose
    private Long PolicyId;

    /**
    * 页码，默认值是 1，从 1 开始
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页大小，默认值是 20
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * 可取值 'All'、'User'、'Group' 和 'Role'，'All' 表示获取所有实体类型，'User' 表示只获取子账号，'Group' 表示只获取用户组，'Role' 表示只获取角色，默认取 'All'
    */
    @SerializedName("EntityFilter")
    @Expose
    private String EntityFilter;

    /**
     * 获取策略 id
     * @return PolicyId 策略 id
     */
    public Long getPolicyId() {
        return this.PolicyId;
    }

    /**
     * 设置策略 id
     * @param PolicyId 策略 id
     */
    public void setPolicyId(Long PolicyId) {
        this.PolicyId = PolicyId;
    }

    /**
     * 获取页码，默认值是 1，从 1 开始
     * @return Page 页码，默认值是 1，从 1 开始
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * 设置页码，默认值是 1，从 1 开始
     * @param Page 页码，默认值是 1，从 1 开始
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * 获取每页大小，默认值是 20
     * @return Rp 每页大小，默认值是 20
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * 设置每页大小，默认值是 20
     * @param Rp 每页大小，默认值是 20
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * 获取可取值 'All'、'User'、'Group' 和 'Role'，'All' 表示获取所有实体类型，'User' 表示只获取子账号，'Group' 表示只获取用户组，'Role' 表示只获取角色，默认取 'All'
     * @return EntityFilter 可取值 'All'、'User'、'Group' 和 'Role'，'All' 表示获取所有实体类型，'User' 表示只获取子账号，'Group' 表示只获取用户组，'Role' 表示只获取角色，默认取 'All'
     */
    public String getEntityFilter() {
        return this.EntityFilter;
    }

    /**
     * 设置可取值 'All'、'User'、'Group' 和 'Role'，'All' 表示获取所有实体类型，'User' 表示只获取子账号，'Group' 表示只获取用户组，'Role' 表示只获取角色，默认取 'All'
     * @param EntityFilter 可取值 'All'、'User'、'Group' 和 'Role'，'All' 表示获取所有实体类型，'User' 表示只获取子账号，'Group' 表示只获取用户组，'Role' 表示只获取角色，默认取 'All'
     */
    public void setEntityFilter(String EntityFilter) {
        this.EntityFilter = EntityFilter;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyId", this.PolicyId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "EntityFilter", this.EntityFilter);

    }
}

