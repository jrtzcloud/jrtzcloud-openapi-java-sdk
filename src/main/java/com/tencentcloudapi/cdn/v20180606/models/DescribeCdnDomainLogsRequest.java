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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCdnDomainLogsRequest  extends AbstractModel{

    /**
    * 指定域名查询
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 开始时间，如 2019-09-04 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，如 2019-09-04 12:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 分页查询偏移量，默认为 0 （第一页）
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 分页查询限制数目，默认为 100，最大为 1000
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 指定区域下载日志
mainland：获取境内加速日志包下载链接
overseas：获取境外加速日志包下载链接
global：同时获取境内、境外加速日志包下载链接（分开打包）
不指定时默认为 mainland
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * 获取指定域名查询
     * @return Domain 指定域名查询
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置指定域名查询
     * @param Domain 指定域名查询
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取开始时间，如 2019-09-04 00:00:00
     * @return StartTime 开始时间，如 2019-09-04 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间，如 2019-09-04 00:00:00
     * @param StartTime 开始时间，如 2019-09-04 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间，如 2019-09-04 12:00:00
     * @return EndTime 结束时间，如 2019-09-04 12:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间，如 2019-09-04 12:00:00
     * @param EndTime 结束时间，如 2019-09-04 12:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取分页查询偏移量，默认为 0 （第一页）
     * @return Offset 分页查询偏移量，默认为 0 （第一页）
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页查询偏移量，默认为 0 （第一页）
     * @param Offset 分页查询偏移量，默认为 0 （第一页）
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取分页查询限制数目，默认为 100，最大为 1000
     * @return Limit 分页查询限制数目，默认为 100，最大为 1000
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页查询限制数目，默认为 100，最大为 1000
     * @param Limit 分页查询限制数目，默认为 100，最大为 1000
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取指定区域下载日志
mainland：获取境内加速日志包下载链接
overseas：获取境外加速日志包下载链接
global：同时获取境内、境外加速日志包下载链接（分开打包）
不指定时默认为 mainland
     * @return Area 指定区域下载日志
mainland：获取境内加速日志包下载链接
overseas：获取境外加速日志包下载链接
global：同时获取境内、境外加速日志包下载链接（分开打包）
不指定时默认为 mainland
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * 设置指定区域下载日志
mainland：获取境内加速日志包下载链接
overseas：获取境外加速日志包下载链接
global：同时获取境内、境外加速日志包下载链接（分开打包）
不指定时默认为 mainland
     * @param Area 指定区域下载日志
mainland：获取境内加速日志包下载链接
overseas：获取境外加速日志包下载链接
global：同时获取境内、境外加速日志包下载链接（分开打包）
不指定时默认为 mainland
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

