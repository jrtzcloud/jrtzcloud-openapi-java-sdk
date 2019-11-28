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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeletePersonFromGroupRequest  extends AbstractModel{

    /**
    * 人员ID
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 人员库ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
     * 获取人员ID
     * @return PersonId 人员ID
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置人员ID
     * @param PersonId 人员ID
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取人员库ID
     * @return GroupId 人员库ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置人员库ID
     * @param GroupId 人员库ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);

    }
}

