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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LivenessCompareResponse  extends AbstractModel{

    /**
    * 验证通过后的视频最佳截图照片，照片为BASE64编码后的值，jpg格式。
    */
    @SerializedName("BestFrameBase64")
    @Expose
    private String BestFrameBase64;

    /**
    * 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）。
    */
    @SerializedName("Sim")
    @Expose
    private Float Sim;

    /**
    * 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 业务错误描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取验证通过后的视频最佳截图照片，照片为BASE64编码后的值，jpg格式。
     * @return BestFrameBase64 验证通过后的视频最佳截图照片，照片为BASE64编码后的值，jpg格式。
     */
    public String getBestFrameBase64() {
        return this.BestFrameBase64;
    }

    /**
     * 设置验证通过后的视频最佳截图照片，照片为BASE64编码后的值，jpg格式。
     * @param BestFrameBase64 验证通过后的视频最佳截图照片，照片为BASE64编码后的值，jpg格式。
     */
    public void setBestFrameBase64(String BestFrameBase64) {
        this.BestFrameBase64 = BestFrameBase64;
    }

    /**
     * 获取相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）。
     * @return Sim 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）。
     */
    public Float getSim() {
        return this.Sim;
    }

    /**
     * 设置相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）。
     * @param Sim 相似度，取值范围 [0.00, 100.00]。推荐相似度大于等于70时可判断为同一人，可根据具体场景自行调整阈值（阈值70的误通过率为千分之一，阈值80的误通过率是万分之一）。
     */
    public void setSim(Float Sim) {
        this.Sim = Sim;
    }

    /**
     * 获取业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
     * @return Result 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * 设置业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
     * @param Result 业务错误码，成功情况返回Success, 错误情况请参考下方错误码 列表中FailedOperation部分
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * 获取业务错误描述
     * @return Description 业务错误描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置业务错误描述
     * @param Description 业务错误描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
        this.setParamSimple(map, prefix + "BestFrameBase64", this.BestFrameBase64);
        this.setParamSimple(map, prefix + "Sim", this.Sim);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

