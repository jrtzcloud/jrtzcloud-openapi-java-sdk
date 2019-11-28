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
package com.tencentcloudapi.tiia.v20190529;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.tiia.v20190529.models.*;

public class TiiaClient extends AbstractClient{
    private static String endpoint = "tiia.tencentcloudapi.com";
    private static String version = "2019-05-29";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public TiiaClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public TiiaClient(Credential credential, String region, ClientProfile profile) {
        super(TiiaClient.endpoint, TiiaClient.version, credential, region, profile);
    }

    /**
     *评估输入图片在视觉上的质量，从多个方面评估，并同时给出综合的、客观的清晰度评分，和主观的美观度评分。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req AssessQualityRequest
     * @return AssessQualityResponse
     * @throws TencentCloudSDKException
     */
    public AssessQualityResponse AssessQuality(AssessQualityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssessQualityResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AssessQualityResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AssessQuality"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据输入的裁剪比例，智能判断一张图片的最佳裁剪区域，确保原图的主体区域不受影响。

可以自动裁剪图片，适应不同平台、设备的展示要求，避免简单拉伸带来的变形。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req CropImageRequest
     * @return CropImageResponse
     * @throws TencentCloudSDKException
     */
    public CropImageResponse CropImage(CropImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CropImageResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CropImageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CropImage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传入一张图片，可以识别图片中包含的人物是否为公众人物，如果是，输出人物的姓名、基本信息、脸部坐标。

支持识别一张图片中存在的多个人脸，针对每个人脸，会给出与之最相似的公众人物。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectCelebrityRequest
     * @return DetectCelebrityResponse
     * @throws TencentCloudSDKException
     */
    public DetectCelebrityResponse DetectCelebrity(DetectCelebrityRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectCelebrityResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectCelebrityResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectCelebrity"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *输入一张图片，返回AI针对一张图片是否是恶心的一系列判断值。

通过恶心图片识别, 可以判断一张图片是否令人恶心, 同时给出它属于的潜在类别, 让您能够过滤掉使人不愉快的图片。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectDisgustRequest
     * @return DetectDisgustResponse
     * @throws TencentCloudSDKException
     */
    public DetectDisgustResponse DetectDisgust(DetectDisgustRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectDisgustResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectDisgustResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectDisgust"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *图像标签利用深度学习技术、海量训练数据，可以对图片进行智能分类、物体识别等。

目前支持8个大类、六十多个子类、数千个标签。涵盖各种日常场景、动植物、物品、美食、卡证等。具体分类请见图像分析常见问题功能和限制部分（https://cloud.tencent.com/document/product/865/17629 ）

图像标签提供三个版本供选择：

• 摄像头版：针对搜索、手机摄像头照片进行优化，涵盖大量卡证、日常物品、二维码条形码。

• 相册版：针对手机相册、网盘进行优化，去除相册和网盘中不常见的标签，针对相册常见图片类型（人像、日常活动、日常物品等）识别效果更好。

• 网络版：针对网络图片进行优化，涵盖标签更多，满足长尾识别需求。

每个产品的图像类型都有独特性，建议在接入初期，对三个版本进行对比评估后选择合适的版本使用。

为了方便使用、减少图片传输次数，图像标签包装成多合一接口，实际上是多个服务。

图像标签按照服务的实际使用数量进行收费。例如一张图片同时调用相册版、摄像头版两个服务，那么此次调用按照两次计费。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectLabelRequest
     * @return DetectLabelResponse
     * @throws TencentCloudSDKException
     */
    public DetectLabelResponse DetectLabel(DetectLabelRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectLabelResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectLabelResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectLabel"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *可以识别输入的图片中是否包含不良行为，例如打架斗殴、赌博、抽烟等，可以应用于广告图、直播截图、短视频截图等审核，减少不良行为对平台内容质量的影响，维护健康向上的互联网环境。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectMisbehaviorRequest
     * @return DetectMisbehaviorResponse
     * @throws TencentCloudSDKException
     */
    public DetectMisbehaviorResponse DetectMisbehavior(DetectMisbehaviorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectMisbehaviorResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectMisbehaviorResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectMisbehavior"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口支持识别图片中包含的商品，能够输出商品的品类名称、类别，还可以输出商品在图片中的位置。支持一张图片多个商品的识别。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectProductRequest
     * @return DetectProductResponse
     * @throws TencentCloudSDKException
     */
    public DetectProductResponse DetectProduct(DetectProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectProductResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectProductResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectProduct"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *传入一张图片，输出清晰度提升后的图片。

可以消除图片有损压缩导致的噪声，和使用滤镜、拍摄失焦导致的模糊。让图片的边缘和细节更加清晰自然。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req EnhanceImageRequest
     * @return EnhanceImageResponse
     * @throws TencentCloudSDKException
     */
    public EnhanceImageResponse EnhanceImage(EnhanceImageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnhanceImageResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<EnhanceImageResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "EnhanceImage"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *图像审核包含鉴黄、政治敏感识别、暴恐识别、图文审核等服务。

• 鉴黄：识别图片中是否存在涉黄内容，将图片分为正常、性感、色情三类，并输出分类的置信度。

• 政治敏感识别：识别图片中是否存在政治人物、政治恶搞、著名政治事件照片等内容。

• 暴恐识别：识别图片中的暴力恐怖元素，例如武器、管制刀具、血腥、恐怖主义等。

• 图文审核：结合OCR、NLP和二维码识别算法，分析图片中的文字是否违规，或是否存在二维码等营销内容，并输出违规内容的类别（涉黄、涉政、谩骂、广告营销、暴恐等）。

为了方便使用、减少图片传输次数，图像审核包装成多合一接口，实际上是多个服务。

图像审核根据服务的调用次数收费。例如一张图片同时调用鉴黄、图文审核两个服务，那么此次调用按照两次计费。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req ImageModerationRequest
     * @return ImageModerationResponse
     * @throws TencentCloudSDKException
     */
    public ImageModerationResponse ImageModeration(ImageModerationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ImageModerationResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ImageModerationResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ImageModeration"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *腾讯云车辆属性识别可对汽车车身及车辆属性进行检测与识别，目前支持11种车身颜色、20多种车型、300多种品牌、4000多种车系+年款的识别，同时支持对车标的位置进行检测。
>     
- 公共参数中的签名方式必须指定为V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req RecognizeCarRequest
     * @return RecognizeCarResponse
     * @throws TencentCloudSDKException
     */
    public RecognizeCarResponse RecognizeCar(RecognizeCarRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RecognizeCarResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<RecognizeCarResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "RecognizeCar"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
