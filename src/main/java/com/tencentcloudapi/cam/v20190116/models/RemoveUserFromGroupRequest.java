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

public class RemoveUserFromGroupRequest  extends AbstractModel{

    /**
    * 要删除的用户 UID和用户组 ID对应数组
    */
    @SerializedName("Info")
    @Expose
    private GroupIdOfUidInfo [] Info;

    /**
     * 获取要删除的用户 UID和用户组 ID对应数组
     * @return Info 要删除的用户 UID和用户组 ID对应数组
     */
    public GroupIdOfUidInfo [] getInfo() {
        return this.Info;
    }

    /**
     * 设置要删除的用户 UID和用户组 ID对应数组
     * @param Info 要删除的用户 UID和用户组 ID对应数组
     */
    public void setInfo(GroupIdOfUidInfo [] Info) {
        this.Info = Info;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Info.", this.Info);

    }
}

