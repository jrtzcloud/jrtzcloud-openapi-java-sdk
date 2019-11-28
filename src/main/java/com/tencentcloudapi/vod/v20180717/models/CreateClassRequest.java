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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClassRequest  extends AbstractModel{

    /**
    * 父类 ID，一级分类填写 -1。
    */
    @SerializedName("ParentId")
    @Expose
    private Long ParentId;

    /**
    * 分类名称，长度限制：1-64 个字符。
    */
    @SerializedName("ClassName")
    @Expose
    private String ClassName;

    /**
    * 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
     * 获取父类 ID，一级分类填写 -1。
     * @return ParentId 父类 ID，一级分类填写 -1。
     */
    public Long getParentId() {
        return this.ParentId;
    }

    /**
     * 设置父类 ID，一级分类填写 -1。
     * @param ParentId 父类 ID，一级分类填写 -1。
     */
    public void setParentId(Long ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * 获取分类名称，长度限制：1-64 个字符。
     * @return ClassName 分类名称，长度限制：1-64 个字符。
     */
    public String getClassName() {
        return this.ClassName;
    }

    /**
     * 设置分类名称，长度限制：1-64 个字符。
     * @param ClassName 分类名称，长度限制：1-64 个字符。
     */
    public void setClassName(String ClassName) {
        this.ClassName = ClassName;
    }

    /**
     * 获取点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @return SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * 设置点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     * @param SubAppId 点播[子应用](/document/product/266/14574) ID。如果要访问子应用中的资源，则将该字段填写为子应用 ID；否则无需填写该字段。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "ClassName", this.ClassName);
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);

    }
}

