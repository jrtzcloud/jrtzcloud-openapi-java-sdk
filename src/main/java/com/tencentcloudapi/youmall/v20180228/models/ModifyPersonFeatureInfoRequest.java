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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyPersonFeatureInfoRequest  extends AbstractModel{

    /**
    * 集团ID
    */
    @SerializedName("CompanyId")
    @Expose
    private String CompanyId;

    /**
    * 需要修改的顾客id
    */
    @SerializedName("PersonId")
    @Expose
    private Integer PersonId;

    /**
    * 图片BASE编码
    */
    @SerializedName("Picture")
    @Expose
    private String Picture;

    /**
    * 图片名称（尽量不要重复）
    */
    @SerializedName("PictureName")
    @Expose
    private String PictureName;

    /**
    * 人物类型，仅能操作黑白名单顾客（1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
    */
    @SerializedName("PersonType")
    @Expose
    private Integer PersonType;

    /**
    * 店铺ID，如果不填表示操作集团身份库
    */
    @SerializedName("ShopId")
    @Expose
    private Integer ShopId;

    /**
     * 获取集团ID
     * @return CompanyId 集团ID
     */
    public String getCompanyId() {
        return this.CompanyId;
    }

    /**
     * 设置集团ID
     * @param CompanyId 集团ID
     */
    public void setCompanyId(String CompanyId) {
        this.CompanyId = CompanyId;
    }

    /**
     * 获取需要修改的顾客id
     * @return PersonId 需要修改的顾客id
     */
    public Integer getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置需要修改的顾客id
     * @param PersonId 需要修改的顾客id
     */
    public void setPersonId(Integer PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取图片BASE编码
     * @return Picture 图片BASE编码
     */
    public String getPicture() {
        return this.Picture;
    }

    /**
     * 设置图片BASE编码
     * @param Picture 图片BASE编码
     */
    public void setPicture(String Picture) {
        this.Picture = Picture;
    }

    /**
     * 获取图片名称（尽量不要重复）
     * @return PictureName 图片名称（尽量不要重复）
     */
    public String getPictureName() {
        return this.PictureName;
    }

    /**
     * 设置图片名称（尽量不要重复）
     * @param PictureName 图片名称（尽量不要重复）
     */
    public void setPictureName(String PictureName) {
        this.PictureName = PictureName;
    }

    /**
     * 获取人物类型，仅能操作黑白名单顾客（1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     * @return PersonType 人物类型，仅能操作黑白名单顾客（1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     */
    public Integer getPersonType() {
        return this.PersonType;
    }

    /**
     * 设置人物类型，仅能操作黑白名单顾客（1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     * @param PersonType 人物类型，仅能操作黑白名单顾客（1 白名单，2 表示黑名单，101表示集团白名单，102表示集团黑名单）
     */
    public void setPersonType(Integer PersonType) {
        this.PersonType = PersonType;
    }

    /**
     * 获取店铺ID，如果不填表示操作集团身份库
     * @return ShopId 店铺ID，如果不填表示操作集团身份库
     */
    public Integer getShopId() {
        return this.ShopId;
    }

    /**
     * 设置店铺ID，如果不填表示操作集团身份库
     * @param ShopId 店铺ID，如果不填表示操作集团身份库
     */
    public void setShopId(Integer ShopId) {
        this.ShopId = ShopId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CompanyId", this.CompanyId);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "Picture", this.Picture);
        this.setParamSimple(map, prefix + "PictureName", this.PictureName);
        this.setParamSimple(map, prefix + "PersonType", this.PersonType);
        this.setParamSimple(map, prefix + "ShopId", this.ShopId);

    }
}

