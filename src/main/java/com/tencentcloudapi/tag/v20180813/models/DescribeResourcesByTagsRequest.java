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
package com.tencentcloudapi.tag.v20180813.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourcesByTagsRequest  extends AbstractModel{

    /**
    * 标签过滤数组
    */
    @SerializedName("TagFilters")
    @Expose
    private TagFilter [] TagFilters;

    /**
    * 创建标签者uin
    */
    @SerializedName("CreateUin")
    @Expose
    private Long CreateUin;

    /**
    * 数据偏移量，默认为 0, 必须为Limit参数的整数倍
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页大小，默认为 15
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 资源前缀
    */
    @SerializedName("ResourcePrefix")
    @Expose
    private String ResourcePrefix;

    /**
    * 资源唯一标记
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 资源所在地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
    * 业务类型
    */
    @SerializedName("ServiceType")
    @Expose
    private String ServiceType;

    /**
     * 获取标签过滤数组
     * @return TagFilters 标签过滤数组
     */
    public TagFilter [] getTagFilters() {
        return this.TagFilters;
    }

    /**
     * 设置标签过滤数组
     * @param TagFilters 标签过滤数组
     */
    public void setTagFilters(TagFilter [] TagFilters) {
        this.TagFilters = TagFilters;
    }

    /**
     * 获取创建标签者uin
     * @return CreateUin 创建标签者uin
     */
    public Long getCreateUin() {
        return this.CreateUin;
    }

    /**
     * 设置创建标签者uin
     * @param CreateUin 创建标签者uin
     */
    public void setCreateUin(Long CreateUin) {
        this.CreateUin = CreateUin;
    }

    /**
     * 获取数据偏移量，默认为 0, 必须为Limit参数的整数倍
     * @return Offset 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置数据偏移量，默认为 0, 必须为Limit参数的整数倍
     * @param Offset 数据偏移量，默认为 0, 必须为Limit参数的整数倍
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取每页大小，默认为 15
     * @return Limit 每页大小，默认为 15
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置每页大小，默认为 15
     * @param Limit 每页大小，默认为 15
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取资源前缀
     * @return ResourcePrefix 资源前缀
     */
    public String getResourcePrefix() {
        return this.ResourcePrefix;
    }

    /**
     * 设置资源前缀
     * @param ResourcePrefix 资源前缀
     */
    public void setResourcePrefix(String ResourcePrefix) {
        this.ResourcePrefix = ResourcePrefix;
    }

    /**
     * 获取资源唯一标记
     * @return ResourceId 资源唯一标记
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * 设置资源唯一标记
     * @param ResourceId 资源唯一标记
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * 获取资源所在地域
     * @return ResourceRegion 资源所在地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * 设置资源所在地域
     * @param ResourceRegion 资源所在地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    /**
     * 获取业务类型
     * @return ServiceType 业务类型
     */
    public String getServiceType() {
        return this.ServiceType;
    }

    /**
     * 设置业务类型
     * @param ServiceType 业务类型
     */
    public void setServiceType(String ServiceType) {
        this.ServiceType = ServiceType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TagFilters.", this.TagFilters);
        this.setParamSimple(map, prefix + "CreateUin", this.CreateUin);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ResourcePrefix", this.ResourcePrefix);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);

    }
}

