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

public class DescribeConfigSummaryRequest  extends AbstractModel{

    /**
    * 应用ID，不传入时查询全量
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 查询关键字，模糊查询：应用名称，配置项名称，不传入时查询全量
    */
    @SerializedName("SearchWord")
    @Expose
    private String SearchWord;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 每页条数，默认为20
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * 获取应用ID，不传入时查询全量
     * @return ApplicationId 应用ID，不传入时查询全量
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置应用ID，不传入时查询全量
     * @param ApplicationId 应用ID，不传入时查询全量
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取查询关键字，模糊查询：应用名称，配置项名称，不传入时查询全量
     * @return SearchWord 查询关键字，模糊查询：应用名称，配置项名称，不传入时查询全量
     */
    public String getSearchWord() {
        return this.SearchWord;
    }

    /**
     * 设置查询关键字，模糊查询：应用名称，配置项名称，不传入时查询全量
     * @param SearchWord 查询关键字，模糊查询：应用名称，配置项名称，不传入时查询全量
     */
    public void setSearchWord(String SearchWord) {
        this.SearchWord = SearchWord;
    }

    /**
     * 获取偏移量，默认为0
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取每页条数，默认为20
     * @return Limit 每页条数，默认为20
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置每页条数，默认为20
     * @param Limit 每页条数，默认为20
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "SearchWord", this.SearchWord);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

