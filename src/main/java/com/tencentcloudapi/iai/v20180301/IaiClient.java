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
package com.tencentcloudapi.iai.v20180301;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iai.v20180301.models.*;

public class IaiClient extends AbstractClient{
    private static String endpoint = "iai.tencentcloudapi.com";
    private static String version = "2018-03-01";

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     */
    public IaiClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    /**
     * 构造client
     * @param credential 认证信息实例
     * @param region	产品地域
     * @param profile 配置实例
     */
    public IaiClient(Credential credential, String region, ClientProfile profile) {
        super(IaiClient.endpoint, IaiClient.version, credential, region, profile);
    }

    /**
     *对请求图片进行五官定位（也称人脸关键点定位），计算构成人脸轮廓的 90 个点，包括眉毛（左右各 8 点）、眼睛（左右各 8 点）、鼻子（13 点）、嘴巴（22 点）、脸型轮廓（21 点）、眼珠[或瞳孔]（2点）。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req AnalyzeFaceRequest
     * @return AnalyzeFaceResponse
     * @throws TencentCloudSDKException
     */
    public AnalyzeFaceResponse AnalyzeFace(AnalyzeFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AnalyzeFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<AnalyzeFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "AnalyzeFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *对两张图片中的人脸进行相似度比对，返回人脸相似度分数。

若您需要判断 “此人是否是某人”，即验证某张图片中的人是否是已知身份的某人，如常见的人脸登录场景，建议使用[人脸验证](https://cloud.tencent.com/document/product/867/32806)接口。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req CompareFaceRequest
     * @return CompareFaceResponse
     * @throws TencentCloudSDKException
     */
    public CompareFaceResponse CompareFace(CompareFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CompareFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CompareFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CompareFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将已存在于某人员库的人员复制到其他人员库，该人员的描述信息不会被复制。单个人员最多只能同时存在100个人员库中。
>     
- 注：若该人员创建时算法模型版本为2.0，复制到非2.0算法模型版本的Group中时，复制操作将会失败。
     * @param req CopyPersonRequest
     * @return CopyPersonResponse
     * @throws TencentCloudSDKException
     */
    public CopyPersonResponse CopyPerson(CopyPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CopyPersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CopyPersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CopyPerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *将一组人脸图片添加到一个人员中。一个人员最多允许包含 5 张图片。若该人员存在多个人员库中，所有人员库中该人员图片均会增加。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req CreateFaceRequest
     * @return CreateFaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateFaceResponse CreateFace(CreateFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于创建一个空的人员库，如果人员库已存在返回错误。可根据需要创建自定义描述字段，用于辅助描述该人员库下的人员信息。1个APPID下最多创建2万个人员库（Group）、最多包含1000万张人脸（Face），单个人员库（Group）最多包含100万张人脸（Face）。
     * @param req CreateGroupRequest
     * @return CreateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateGroupResponse CreateGroup(CreateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreateGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreateGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建人员，添加人脸、姓名、性别及其他相关信息。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req CreatePersonRequest
     * @return CreatePersonResponse
     * @throws TencentCloudSDKException
     */
    public CreatePersonResponse CreatePerson(CreatePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreatePersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<CreatePersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "CreatePerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除一个人员下的人脸图片。如果该人员只有一张人脸图片，则返回错误。
     * @param req DeleteFaceRequest
     * @return DeleteFaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFaceResponse DeleteFace(DeleteFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除该人员库及包含的所有的人员。同时，人员对应的所有人脸信息将被删除。若某人员同时存在多个人员库中，该人员不会被删除，但属于该人员库中的自定义描述字段信息会被删除，属于其他人员库的自定义描述字段信息不受影响。

>     
- 删除人员库的操作为异步执行，删除单张人脸时间约为10ms，即一小时内可以删除36万张。删除期间，无法向该人员库添加人员。
     * @param req DeleteGroupRequest
     * @return DeleteGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteGroupResponse DeleteGroup(DeleteGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeleteGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除该人员信息，此操作会导致所有人员库均删除此人员。同时，该人员的所有人脸信息将被删除。
     * @param req DeletePersonRequest
     * @return DeletePersonResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonResponse DeletePerson(DeletePersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *从某人员库中删除人员，此操作仅影响该人员库。若该人员仅存在于指定的人员库中，该人员将被删除，其所有的人脸信息也将被删除。
     * @param req DeletePersonFromGroupRequest
     * @return DeletePersonFromGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeletePersonFromGroupResponse DeletePersonFromGroup(DeletePersonFromGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeletePersonFromGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DeletePersonFromGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DeletePersonFromGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *检测给定图片中的人脸（Face）的位置、相应的面部属性和人脸质量信息，位置包括 (x，y，w，h)，面部属性包括性别（gender）、年龄（age）、表情（expression）、魅力（beauty）、眼镜（glass）、发型（hair）、口罩（mask）和姿态 (pitch，roll，yaw)，人脸质量信息包括整体质量分（score）、模糊分（sharpness）、光照分（brightness）和五官遮挡分（completeness）。

 
其中，人脸质量信息主要用于评价输入的人脸图片的质量。在使用人脸识别服务时，建议您对输入的人脸图片进行质量检测，提升后续业务处理的效果。该功能的应用场景包括：

1） 人员库[创建人员](https://cloud.tencent.com/document/product/867/32793)/[增加人脸](https://cloud.tencent.com/document/product/867/32795)：保证人员人脸信息的质量，便于后续的业务处理。

2） [人脸搜索](https://cloud.tencent.com/document/product/867/32798)：保证输入的图片质量，快速准确匹配到对应的人员。

3） [人脸验证](https://cloud.tencent.com/document/product/867/32806)：保证人脸信息的质量，避免明明是本人却认证不通过的情况。

4） [人脸融合](https://cloud.tencent.com/product/facefusion)：保证上传的人脸质量，人脸融合的效果更好。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。


     * @param req DetectFaceRequest
     * @return DetectFaceResponse
     * @throws TencentCloudSDKException
     */
    public DetectFaceResponse DetectFace(DetectFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对用户上传的静态图片进行人脸活体检测。与动态活体检测的区别是：静态活体检测中，用户不需要通过唇语或摇头眨眼等动作来识别。

静态活体检测适用于手机自拍的场景，或对防攻击要求不高的场景。如果对活体检测有更高安全性要求，请使用[人脸核身·云智慧眼](https://cloud.tencent.com/product/faceid)产品。

>     
- 图片的宽高比请接近3：4，不符合宽高比的图片返回的分值不具备参考意义。本接口适用于类手机自拍场景，非类手机自拍照返回的分值不具备参考意义。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req DetectLiveFaceRequest
     * @return DetectLiveFaceResponse
     * @throws TencentCloudSDKException
     */
    public DetectLiveFaceResponse DetectLiveFace(DetectLiveFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetectLiveFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<DetectLiveFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "DetectLiveFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取人员库列表。
     * @param req GetGroupListRequest
     * @return GetGroupListResponse
     * @throws TencentCloudSDKException
     */
    public GetGroupListResponse GetGroupList(GetGroupListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetGroupListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetGroupListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetGroupList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定人员的信息，包括姓名、性别、人脸等。
     * @param req GetPersonBaseInfoRequest
     * @return GetPersonBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonBaseInfoResponse GetPersonBaseInfo(GetPersonBaseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonBaseInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonBaseInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPersonBaseInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定人员的信息，包括加入的人员库、描述内容等。
     * @param req GetPersonGroupInfoRequest
     * @return GetPersonGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonGroupInfoResponse GetPersonGroupInfo(GetPersonGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonGroupInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonGroupInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPersonGroupInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定人员库中的人员列表。
     * @param req GetPersonListRequest
     * @return GetPersonListResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonListResponse GetPersonList(GetPersonListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonListResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonListResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPersonList"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取指定人员库中人员数量。
     * @param req GetPersonListNumRequest
     * @return GetPersonListNumResponse
     * @throws TencentCloudSDKException
     */
    public GetPersonListNumResponse GetPersonListNum(GetPersonListNumRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetPersonListNumResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<GetPersonListNumResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "GetPersonListNum"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改人员库名称、备注、自定义描述字段名称。
     * @param req ModifyGroupRequest
     * @return ModifyGroupResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGroupResponse ModifyGroup(ModifyGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改人员信息，包括名称、性别等。人员名称和性别修改会同步到包含该人员的所有人员库。
     * @param req ModifyPersonBaseInfoRequest
     * @return ModifyPersonBaseInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonBaseInfoResponse ModifyPersonBaseInfo(ModifyPersonBaseInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonBaseInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonBaseInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPersonBaseInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改指定人员库人员描述内容。
     * @param req ModifyPersonGroupInfoRequest
     * @return ModifyPersonGroupInfoResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPersonGroupInfoResponse ModifyPersonGroupInfo(ModifyPersonGroupInfoRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPersonGroupInfoResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyPersonGroupInfoResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "ModifyPersonGroupInfo"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对一张待识别的人脸图片，在一个或多个人员库中识别出最相似的 TopN 人员，识别结果按照相似度从大到小排序。单次搜索的人员库人脸总数量不得超过 100 万张。
此接口需与[人员库管理相关接口](https://cloud.tencent.com/document/product/867/32794)结合使用。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req SearchFacesRequest
     * @return SearchFacesResponse
     * @throws TencentCloudSDKException
     */
    public SearchFacesResponse SearchFaces(SearchFacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchFacesResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchFacesResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchFaces"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对一张待识别的人脸图片，在一个或多个人员库中识别出最相似的 TopN 人员，按照人员库的维度以人员相似度从大到小顺序排列。
此接口需与[人员库管理相关接口](https://cloud.tencent.com/document/product/867/32794)结合使用。
     * @param req SearchFacesReturnsByGroupRequest
     * @return SearchFacesReturnsByGroupResponse
     * @throws TencentCloudSDKException
     */
    public SearchFacesReturnsByGroupResponse SearchFacesReturnsByGroup(SearchFacesReturnsByGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchFacesReturnsByGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchFacesReturnsByGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchFacesReturnsByGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对一张待识别的人脸图片，在一个或多个人员库中识别出最相似的 TopN 人员，按照相似度从大到小排列。

本接口会将该人员（Person）下的所有人脸（Face）进行融合特征处理，即若某个 Person 下有4张 Face ，本接口会将4张 Face 的特征进行融合处理，生成对应这个 Person 的特征，使人员搜索（确定待识别的人脸图片是某人）更加准确。

人员搜索接口和人脸搜索接口的区别是：人脸搜索会比对该 Person 下所有 Face ，而人员搜索比对的是该 Person 的 Person 特征。
>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req SearchPersonsRequest
     * @return SearchPersonsResponse
     * @throws TencentCloudSDKException
     */
    public SearchPersonsResponse SearchPersons(SearchPersonsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchPersonsResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchPersonsResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchPersons"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于对一张待识别的人脸图片，在一个或多个人员库中识别出最相似的 TopN 人员，按照人员库的维度以人员相似度从大到小顺序排列。

本接口会将该人员（Person）下的所有人脸（Face）进行融合特征处理，即若某个Person下有4张 Face，本接口会将4张 Face 的特征进行融合处理，生成对应这个 Person 的特征，使人员搜索（确定待识别的人脸图片是某人员）更加准确。

人员搜索和人脸搜索的区别是：人脸搜索比对该 Person 下所有 Face ，而人员搜索比对的是该 Person 的 Person 特征。
     * @param req SearchPersonsReturnsByGroupRequest
     * @return SearchPersonsReturnsByGroupResponse
     * @throws TencentCloudSDKException
     */
    public SearchPersonsReturnsByGroupResponse SearchPersonsReturnsByGroup(SearchPersonsReturnsByGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchPersonsReturnsByGroupResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<SearchPersonsReturnsByGroupResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "SearchPersonsReturnsByGroup"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *给定一张人脸图片和一个 PersonId，判断图片中的人和 PersonId 对应的人是否为同一人。PersonId 请参考[人员库管理相关接口](https://cloud.tencent.com/document/product/867/32794)。 和[人脸比对](https://cloud.tencent.com/document/product/867/32802)接口不同的是，[人脸验证](https://cloud.tencent.com/document/product/867/32806)用于判断 “此人是否是此人”，“此人”的信息已存于人员库中，“此人”可能存在多张人脸图片；而[人脸比对](https://cloud.tencent.com/document/product/867/32802)用于判断两张人脸的相似度。

>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req VerifyFaceRequest
     * @return VerifyFaceResponse
     * @throws TencentCloudSDKException
     */
    public VerifyFaceResponse VerifyFace(VerifyFaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyFaceResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyFaceResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VerifyFace"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

    /**
     *给定一张人脸图片和一个 PersonId，判断图片中的人和 PersonId 对应的人是否为同一人。PersonId 请参考[人员库管理相关接口](https://cloud.tencent.com/document/product/867/32794)。
本接口会将该人员（Person）下的所有人脸（Face）进行融合特征处理，即若某个Person下有4张 Face，本接口会将4张 Face 的特征进行融合处理，生成对应这个 Person 的特征，使人员验证（确定待识别的人脸图片是某人员）更加准确。

 和人脸比对相关接口不同的是，人脸验证相关接口用于判断 “此人是否是此人”，“此人”的信息已存于人员库中，“此人”可能存在多张人脸图片；而人脸比对相关接口用于判断两张人脸的相似度。


>     
- 公共参数中的签名方式请使用V3版本，即配置SignatureMethod参数为TC3-HMAC-SHA256。
     * @param req VerifyPersonRequest
     * @return VerifyPersonResponse
     * @throws TencentCloudSDKException
     */
    public VerifyPersonResponse VerifyPerson(VerifyPersonRequest req) throws TencentCloudSDKException{
        JsonResponseModel<VerifyPersonResponse> rsp = null;
        try {
                Type type = new TypeToken<JsonResponseModel<VerifyPersonResponse>>() {
                }.getType();
                rsp  = gson.fromJson(this.internalRequest(req, "VerifyPerson"), type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException(e.getMessage());
        }
        return rsp.response;
    }

}
