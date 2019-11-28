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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamDayPlayInfoListRequest  extends AbstractModel{

    /**
    * 日期，
格式：YYYY-mm-dd。
    */
    @SerializedName("DayTime")
    @Expose
    private String DayTime;

    /**
    * 播放域名。
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * 页号，范围[1,10]，默认值是1。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 每页个数，范围[100,1000]，默认值是1000。
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
     * 获取日期，
格式：YYYY-mm-dd。
     * @return DayTime 日期，
格式：YYYY-mm-dd。
     */
    public String getDayTime() {
        return this.DayTime;
    }

    /**
     * 设置日期，
格式：YYYY-mm-dd。
     * @param DayTime 日期，
格式：YYYY-mm-dd。
     */
    public void setDayTime(String DayTime) {
        this.DayTime = DayTime;
    }

    /**
     * 获取播放域名。
     * @return PlayDomain 播放域名。
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * 设置播放域名。
     * @param PlayDomain 播放域名。
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * 获取页号，范围[1,10]，默认值是1。
     * @return PageNum 页号，范围[1,10]，默认值是1。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * 设置页号，范围[1,10]，默认值是1。
     * @param PageNum 页号，范围[1,10]，默认值是1。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * 获取每页个数，范围[100,1000]，默认值是1000。
     * @return PageSize 每页个数，范围[100,1000]，默认值是1000。
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置每页个数，范围[100,1000]，默认值是1000。
     * @param PageSize 每页个数，范围[100,1000]，默认值是1000。
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DayTime", this.DayTime);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

