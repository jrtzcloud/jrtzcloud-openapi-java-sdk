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

public class ModifyAccessGroupRequest  extends AbstractModel{

    /**
    * 权限组ID
    */
    @SerializedName("AccessGroupId")
    @Expose
    private String AccessGroupId;

    /**
    * 权限组名称
    */
    @SerializedName("AccessGroupName")
    @Expose
    private String AccessGroupName;

    /**
    * 权限组描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

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
     * 获取权限组名称
     * @return AccessGroupName 权限组名称
     */
    public String getAccessGroupName() {
        return this.AccessGroupName;
    }

    /**
     * 设置权限组名称
     * @param AccessGroupName 权限组名称
     */
    public void setAccessGroupName(String AccessGroupName) {
        this.AccessGroupName = AccessGroupName;
    }

    /**
     * 获取权限组描述
     * @return Description 权限组描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置权限组描述
     * @param Description 权限组描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessGroupId", this.AccessGroupId);
        this.setParamSimple(map, prefix + "AccessGroupName", this.AccessGroupName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

