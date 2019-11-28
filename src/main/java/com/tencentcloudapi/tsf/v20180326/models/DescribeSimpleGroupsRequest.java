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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSimpleGroupsRequest  extends AbstractModel{

    /**
    * 部署组ID列表，不填写时查询全量
    */
    @SerializedName("GroupIdList")
    @Expose
    private String [] GroupIdList;

    /**
    * 应用ID，不填写时查询全量
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 集群ID，不填写时查询全量
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间ID，不填写时查询全量
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 每页条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 起始偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 部署组ID，不填写时查询全量
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 模糊查询，部署组名称，不填写时查询全量
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
     * 获取部署组ID列表，不填写时查询全量
     * @return GroupIdList 部署组ID列表，不填写时查询全量
     */
    public String [] getGroupIdList() {
        return this.GroupIdList;
    }

    /**
     * 设置部署组ID列表，不填写时查询全量
     * @param GroupIdList 部署组ID列表，不填写时查询全量
     */
    public void setGroupIdList(String [] GroupIdList) {
        this.GroupIdList = GroupIdList;
    }

    /**
     * 获取应用ID，不填写时查询全量
     * @return ApplicationId 应用ID，不填写时查询全量
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置应用ID，不填写时查询全量
     * @param ApplicationId 应用ID，不填写时查询全量
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取集群ID，不填写时查询全量
     * @return ClusterId 集群ID，不填写时查询全量
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID，不填写时查询全量
     * @param ClusterId 集群ID，不填写时查询全量
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取命名空间ID，不填写时查询全量
     * @return NamespaceId 命名空间ID，不填写时查询全量
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * 设置命名空间ID，不填写时查询全量
     * @param NamespaceId 命名空间ID，不填写时查询全量
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * 获取每页条数
     * @return Limit 每页条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置每页条数
     * @param Limit 每页条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取起始偏移量
     * @return Offset 起始偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置起始偏移量
     * @param Offset 起始偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取部署组ID，不填写时查询全量
     * @return GroupId 部署组ID，不填写时查询全量
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置部署组ID，不填写时查询全量
     * @param GroupId 部署组ID，不填写时查询全量
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 获取模糊查询，部署组名称，不填写时查询全量
     * @return SearchWord 模糊查询，部署组名称，不填写时查询全量
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * 设置模糊查询，部署组名称，不填写时查询全量
     * @param SearchWord 模糊查询，部署组名称，不填写时查询全量
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "GroupIdList.", this.GroupIdList);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);

    }
}

