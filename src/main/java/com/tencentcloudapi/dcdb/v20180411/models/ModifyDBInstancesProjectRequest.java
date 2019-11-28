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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDBInstancesProjectRequest  extends AbstractModel{

    /**
    * 待修改的实例ID列表。实例 ID 形如：dcdbt-ow728lmc。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 要分配的项目 ID，可以通过 DescribeProjects 查询项目列表接口获取。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
     * 获取待修改的实例ID列表。实例 ID 形如：dcdbt-ow728lmc。
     * @return InstanceIds 待修改的实例ID列表。实例 ID 形如：dcdbt-ow728lmc。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置待修改的实例ID列表。实例 ID 形如：dcdbt-ow728lmc。
     * @param InstanceIds 待修改的实例ID列表。实例 ID 形如：dcdbt-ow728lmc。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取要分配的项目 ID，可以通过 DescribeProjects 查询项目列表接口获取。
     * @return ProjectId 要分配的项目 ID，可以通过 DescribeProjects 查询项目列表接口获取。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置要分配的项目 ID，可以通过 DescribeProjects 查询项目列表接口获取。
     * @param ProjectId 要分配的项目 ID，可以通过 DescribeProjects 查询项目列表接口获取。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);

    }
}

