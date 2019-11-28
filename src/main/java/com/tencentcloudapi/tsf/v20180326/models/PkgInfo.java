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

public class PkgInfo  extends AbstractModel{

    /**
    * 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 程序包名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgName")
    @Expose
    private String PkgName;

    /**
    * 程序包类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgType")
    @Expose
    private String PkgType;

    /**
    * 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgVersion")
    @Expose
    private String PkgVersion;

    /**
    * 程序包描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgDesc")
    @Expose
    private String PkgDesc;

    /**
    * 上传时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadTime")
    @Expose
    private String UploadTime;

    /**
    * 程序包MD5
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 程序包状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PkgPubStatus")
    @Expose
    private Long PkgPubStatus;

    /**
     * 获取程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return PkgId 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * 设置程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgId 程序包ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * 获取程序包名
注意：此字段可能返回 null，表示取不到有效值。
     * @return PkgName 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgName() {
        return this.PkgName;
    }

    /**
     * 设置程序包名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgName 程序包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgName(String PkgName) {
        this.PkgName = PkgName;
    }

    /**
     * 获取程序包类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return PkgType 程序包类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgType() {
        return this.PkgType;
    }

    /**
     * 设置程序包类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgType 程序包类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgType(String PkgType) {
        this.PkgType = PkgType;
    }

    /**
     * 获取程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     * @return PkgVersion 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgVersion() {
        return this.PkgVersion;
    }

    /**
     * 设置程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgVersion 程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgVersion(String PkgVersion) {
        this.PkgVersion = PkgVersion;
    }

    /**
     * 获取程序包描述
注意：此字段可能返回 null，表示取不到有效值。
     * @return PkgDesc 程序包描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPkgDesc() {
        return this.PkgDesc;
    }

    /**
     * 设置程序包描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgDesc 程序包描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgDesc(String PkgDesc) {
        this.PkgDesc = PkgDesc;
    }

    /**
     * 获取上传时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return UploadTime 上传时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUploadTime() {
        return this.UploadTime;
    }

    /**
     * 设置上传时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadTime 上传时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadTime(String UploadTime) {
        this.UploadTime = UploadTime;
    }

    /**
     * 获取程序包MD5
注意：此字段可能返回 null，表示取不到有效值。
     * @return Md5 程序包MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * 设置程序包MD5
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5 程序包MD5
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * 获取程序包状态
注意：此字段可能返回 null，表示取不到有效值。
     * @return PkgPubStatus 程序包状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPkgPubStatus() {
        return this.PkgPubStatus;
    }

    /**
     * 设置程序包状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param PkgPubStatus 程序包状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPkgPubStatus(Long PkgPubStatus) {
        this.PkgPubStatus = PkgPubStatus;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgName", this.PkgName);
        this.setParamSimple(map, prefix + "PkgType", this.PkgType);
        this.setParamSimple(map, prefix + "PkgVersion", this.PkgVersion);
        this.setParamSimple(map, prefix + "PkgDesc", this.PkgDesc);
        this.setParamSimple(map, prefix + "UploadTime", this.UploadTime);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "PkgPubStatus", this.PkgPubStatus);

    }
}

