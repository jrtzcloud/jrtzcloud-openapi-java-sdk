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

public class SubAppIdInfo  extends AbstractModel{

    /**
    * 子应用 ID。
    */
    @SerializedName("SubAppId")
    @Expose
    private Long SubAppId;

    /**
    * 子应用名称。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子应用简介。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 子应用创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 子应用状态，有效值：
<li>On：启用；</li>
<li>Off：停用。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * 获取子应用 ID。
     * @return SubAppId 子应用 ID。
     */
    public Long getSubAppId() {
        return this.SubAppId;
    }

    /**
     * 设置子应用 ID。
     * @param SubAppId 子应用 ID。
     */
    public void setSubAppId(Long SubAppId) {
        this.SubAppId = SubAppId;
    }

    /**
     * 获取子应用名称。
     * @return Name 子应用名称。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置子应用名称。
     * @param Name 子应用名称。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取子应用简介。
     * @return Description 子应用简介。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置子应用简介。
     * @param Description 子应用简介。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取子应用创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @return CreateTime 子应用创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置子应用创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     * @param CreateTime 子应用创建时间，采用 [ISO 日期格式](https://cloud.tencent.com/document/product/266/11732#iso-.E6.97.A5.E6.9C.9F.E6.A0.BC.E5.BC.8F)。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取子应用状态，有效值：
<li>On：启用；</li>
<li>Off：停用。</li>
     * @return Status 子应用状态，有效值：
<li>On：启用；</li>
<li>Off：停用。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置子应用状态，有效值：
<li>On：启用；</li>
<li>Off：停用。</li>
     * @param Status 子应用状态，有效值：
<li>On：启用；</li>
<li>Off：停用。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubAppId", this.SubAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

