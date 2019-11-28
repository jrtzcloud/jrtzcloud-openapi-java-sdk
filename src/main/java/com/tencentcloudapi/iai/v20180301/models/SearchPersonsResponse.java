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
package com.tencentcloudapi.iai.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchPersonsResponse  extends AbstractModel{

    /**
    * 识别结果。
    */
    @SerializedName("Results")
    @Expose
    private Result [] Results;

    /**
    * 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
    */
    @SerializedName("PersonNum")
    @Expose
    private Long PersonNum;

    /**
    * 人脸识别所用的算法模型版本。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaceModelVersion")
    @Expose
    private String FaceModelVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取识别结果。
     * @return Results 识别结果。
     */
    public Result [] getResults() {
        return this.Results;
    }

    /**
     * 设置识别结果。
     * @param Results 识别结果。
     */
    public void setResults(Result [] Results) {
        this.Results = Results;
    }

    /**
     * 获取搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     * @return PersonNum 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     */
    public Long getPersonNum() {
        return this.PersonNum;
    }

    /**
     * 设置搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     * @param PersonNum 搜索的人员库中包含的人员数。若输入图片中所有人脸均不符合质量要求，则返回0。
     */
    public void setPersonNum(Long PersonNum) {
        this.PersonNum = PersonNum;
    }

    /**
     * 获取人脸识别所用的算法模型版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @return FaceModelVersion 人脸识别所用的算法模型版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFaceModelVersion() {
        return this.FaceModelVersion;
    }

    /**
     * 设置人脸识别所用的算法模型版本。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaceModelVersion 人脸识别所用的算法模型版本。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaceModelVersion(String FaceModelVersion) {
        this.FaceModelVersion = FaceModelVersion;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "PersonNum", this.PersonNum);
        this.setParamSimple(map, prefix + "FaceModelVersion", this.FaceModelVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

