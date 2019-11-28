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

public class CreateNamespaceRequest  extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 命名空间名称
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 命名空间描述
    */
    @SerializedName("NamespaceDesc")
    @Expose
    private String NamespaceDesc;

    /**
    * 命名空间资源类型(默认值为DEF)
    */
    @SerializedName("NamespaceResourceType")
    @Expose
    private String NamespaceResourceType;

    /**
     * 获取集群ID
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取命名空间名称
     * @return NamespaceName 命名空间名称
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * 设置命名空间名称
     * @param NamespaceName 命名空间名称
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * 获取命名空间描述
     * @return NamespaceDesc 命名空间描述
     */
    public String getNamespaceDesc() {
        return this.NamespaceDesc;
    }

    /**
     * 设置命名空间描述
     * @param NamespaceDesc 命名空间描述
     */
    public void setNamespaceDesc(String NamespaceDesc) {
        this.NamespaceDesc = NamespaceDesc;
    }

    /**
     * 获取命名空间资源类型(默认值为DEF)
     * @return NamespaceResourceType 命名空间资源类型(默认值为DEF)
     */
    public String getNamespaceResourceType() {
        return this.NamespaceResourceType;
    }

    /**
     * 设置命名空间资源类型(默认值为DEF)
     * @param NamespaceResourceType 命名空间资源类型(默认值为DEF)
     */
    public void setNamespaceResourceType(String NamespaceResourceType) {
        this.NamespaceResourceType = NamespaceResourceType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "NamespaceDesc", this.NamespaceDesc);
        this.setParamSimple(map, prefix + "NamespaceResourceType", this.NamespaceResourceType);

    }
}

