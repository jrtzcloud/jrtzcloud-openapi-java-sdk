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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteFaceRequest  extends AbstractModel{

    /**
    * 人脸标识符数组
    */
    @SerializedName("FaceIdSet")
    @Expose
    private String [] FaceIdSet;

    /**
    * 人员唯一标识符
    */
    @SerializedName("PersonId")
    @Expose
    private String PersonId;

    /**
    * 人员库唯一标识符
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
     * 获取人脸标识符数组
     * @return FaceIdSet 人脸标识符数组
     */
    public String [] getFaceIdSet() {
        return this.FaceIdSet;
    }

    /**
     * 设置人脸标识符数组
     * @param FaceIdSet 人脸标识符数组
     */
    public void setFaceIdSet(String [] FaceIdSet) {
        this.FaceIdSet = FaceIdSet;
    }

    /**
     * 获取人员唯一标识符
     * @return PersonId 人员唯一标识符
     */
    public String getPersonId() {
        return this.PersonId;
    }

    /**
     * 设置人员唯一标识符
     * @param PersonId 人员唯一标识符
     */
    public void setPersonId(String PersonId) {
        this.PersonId = PersonId;
    }

    /**
     * 获取人员库唯一标识符
     * @return LibraryId 人员库唯一标识符
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * 设置人员库唯一标识符
     * @param LibraryId 人员库唯一标识符
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "FaceIdSet.", this.FaceIdSet);
        this.setParamSimple(map, prefix + "PersonId", this.PersonId);
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);

    }
}

