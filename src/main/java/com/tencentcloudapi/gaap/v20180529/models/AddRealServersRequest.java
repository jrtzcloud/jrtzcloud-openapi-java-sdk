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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddRealServersRequest  extends AbstractModel{

    /**
    * 源站对应的项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Long ProjectId;

    /**
    * 源站对应的IP或域名
    */
    @SerializedName("RealServerIP")
    @Expose
    private String [] RealServerIP;

    /**
    * 源站名称
    */
    @SerializedName("RealServerName")
    @Expose
    private String RealServerName;

    /**
    * 标签列表
    */
    @SerializedName("TagSet")
    @Expose
    private TagPair [] TagSet;

    /**
     * 获取源站对应的项目ID
     * @return ProjectId 源站对应的项目ID
     */
    public Long getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置源站对应的项目ID
     * @param ProjectId 源站对应的项目ID
     */
    public void setProjectId(Long ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取源站对应的IP或域名
     * @return RealServerIP 源站对应的IP或域名
     */
    public String [] getRealServerIP() {
        return this.RealServerIP;
    }

    /**
     * 设置源站对应的IP或域名
     * @param RealServerIP 源站对应的IP或域名
     */
    public void setRealServerIP(String [] RealServerIP) {
        this.RealServerIP = RealServerIP;
    }

    /**
     * 获取源站名称
     * @return RealServerName 源站名称
     */
    public String getRealServerName() {
        return this.RealServerName;
    }

    /**
     * 设置源站名称
     * @param RealServerName 源站名称
     */
    public void setRealServerName(String RealServerName) {
        this.RealServerName = RealServerName;
    }

    /**
     * 获取标签列表
     * @return TagSet 标签列表
     */
    public TagPair [] getTagSet() {
        return this.TagSet;
    }

    /**
     * 设置标签列表
     * @param TagSet 标签列表
     */
    public void setTagSet(TagPair [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "RealServerIP.", this.RealServerIP);
        this.setParamSimple(map, prefix + "RealServerName", this.RealServerName);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);

    }
}

