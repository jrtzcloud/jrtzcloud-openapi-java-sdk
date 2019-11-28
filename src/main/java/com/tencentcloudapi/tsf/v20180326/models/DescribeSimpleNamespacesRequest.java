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

public class DescribeSimpleNamespacesRequest  extends AbstractModel{

    /**
    * 命名空间ID列表，不传入时查询全量
    */
    @SerializedName("NamespaceIdList")
    @Expose
    private String [] NamespaceIdList;

    /**
    * 集群ID，不传入时查询全量
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

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
    * 命名空间ID，不传入时查询全量
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 查询资源类型列表
    */
    @SerializedName("NamespaceResourceTypeList")
    @Expose
    private String [] NamespaceResourceTypeList;

    /**
    * 通过id和name进行过滤
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 查询的命名空间类型列表
    */
    @SerializedName("NamespaceTypeList")
    @Expose
    private String [] NamespaceTypeList;

    /**
     * 获取命名空间ID列表，不传入时查询全量
     * @return NamespaceIdList 命名空间ID列表，不传入时查询全量
     */
    public String [] getNamespaceIdList() {
        return this.NamespaceIdList;
    }

    /**
     * 设置命名空间ID列表，不传入时查询全量
     * @param NamespaceIdList 命名空间ID列表，不传入时查询全量
     */
    public void setNamespaceIdList(String [] NamespaceIdList) {
        this.NamespaceIdList = NamespaceIdList;
    }

    /**
     * 获取集群ID，不传入时查询全量
     * @return ClusterId 集群ID，不传入时查询全量
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID，不传入时查询全量
     * @param ClusterId 集群ID，不传入时查询全量
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
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
     * 获取命名空间ID，不传入时查询全量
     * @return NamespaceId 命名空间ID，不传入时查询全量
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * 设置命名空间ID，不传入时查询全量
     * @param NamespaceId 命名空间ID，不传入时查询全量
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * 获取查询资源类型列表
     * @return NamespaceResourceTypeList 查询资源类型列表
     */
    public String [] getNamespaceResourceTypeList() {
        return this.NamespaceResourceTypeList;
    }

    /**
     * 设置查询资源类型列表
     * @param NamespaceResourceTypeList 查询资源类型列表
     */
    public void setNamespaceResourceTypeList(String [] NamespaceResourceTypeList) {
        this.NamespaceResourceTypeList = NamespaceResourceTypeList;
    }

    /**
     * 获取通过id和name进行过滤
     * @return SearchWord 通过id和name进行过滤
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * 设置通过id和name进行过滤
     * @param SearchWord 通过id和name进行过滤
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * 获取查询的命名空间类型列表
     * @return NamespaceTypeList 查询的命名空间类型列表
     */
    public String [] getNamespaceTypeList() {
        return this.NamespaceTypeList;
    }

    /**
     * 设置查询的命名空间类型列表
     * @param NamespaceTypeList 查询的命名空间类型列表
     */
    public void setNamespaceTypeList(String [] NamespaceTypeList) {
        this.NamespaceTypeList = NamespaceTypeList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NamespaceIdList.", this.NamespaceIdList);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamArraySimple(map, prefix + "NamespaceResourceTypeList.", this.NamespaceResourceTypeList);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamArraySimple(map, prefix + "NamespaceTypeList.", this.NamespaceTypeList);

    }
}

