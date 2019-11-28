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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FairPlayPemDigestInfo  extends AbstractModel{

    /**
    * fairplay 私钥pem id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FairPlayPemId")
    @Expose
    private Integer FairPlayPemId;

    /**
    * 私钥的优先级。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Integer Priority;

    /**
    * 私钥的md5 信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5Pem")
    @Expose
    private String Md5Pem;

    /**
    * ASK的md5信息。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5Ask")
    @Expose
    private String Md5Ask;

    /**
    * 私钥解密密钥的md5值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Md5PemDecryptKey")
    @Expose
    private String Md5PemDecryptKey;

    /**
     * 获取fairplay 私钥pem id。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FairPlayPemId fairplay 私钥pem id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getFairPlayPemId() {
        return this.FairPlayPemId;
    }

    /**
     * 设置fairplay 私钥pem id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FairPlayPemId fairplay 私钥pem id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFairPlayPemId(Integer FairPlayPemId) {
        this.FairPlayPemId = FairPlayPemId;
    }

    /**
     * 获取私钥的优先级。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Priority 私钥的优先级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getPriority() {
        return this.Priority;
    }

    /**
     * 设置私钥的优先级。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 私钥的优先级。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Integer Priority) {
        this.Priority = Priority;
    }

    /**
     * 获取私钥的md5 信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Md5Pem 私钥的md5 信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5Pem() {
        return this.Md5Pem;
    }

    /**
     * 设置私钥的md5 信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5Pem 私钥的md5 信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5Pem(String Md5Pem) {
        this.Md5Pem = Md5Pem;
    }

    /**
     * 获取ASK的md5信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Md5Ask ASK的md5信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5Ask() {
        return this.Md5Ask;
    }

    /**
     * 设置ASK的md5信息。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5Ask ASK的md5信息。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5Ask(String Md5Ask) {
        this.Md5Ask = Md5Ask;
    }

    /**
     * 获取私钥解密密钥的md5值。
注意：此字段可能返回 null，表示取不到有效值。
     * @return Md5PemDecryptKey 私钥解密密钥的md5值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMd5PemDecryptKey() {
        return this.Md5PemDecryptKey;
    }

    /**
     * 设置私钥解密密钥的md5值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Md5PemDecryptKey 私钥解密密钥的md5值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMd5PemDecryptKey(String Md5PemDecryptKey) {
        this.Md5PemDecryptKey = Md5PemDecryptKey;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FairPlayPemId", this.FairPlayPemId);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "Md5Pem", this.Md5Pem);
        this.setParamSimple(map, prefix + "Md5Ask", this.Md5Ask);
        this.setParamSimple(map, prefix + "Md5PemDecryptKey", this.Md5PemDecryptKey);

    }
}

