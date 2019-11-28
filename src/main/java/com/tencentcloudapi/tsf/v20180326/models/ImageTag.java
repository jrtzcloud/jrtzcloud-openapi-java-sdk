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

public class ImageTag  extends AbstractModel{

    /**
    * 仓库名
    */
    @SerializedName("RepoName")
    @Expose
    private String RepoName;

    /**
    * 版本名称
    */
    @SerializedName("TagName")
    @Expose
    private String TagName;

    /**
    * 版本ID
    */
    @SerializedName("TagId")
    @Expose
    private String TagId;

    /**
    * 镜像ID
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 大小
    */
    @SerializedName("Size")
    @Expose
    private String Size;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 镜像制作者
    */
    @SerializedName("Author")
    @Expose
    private String Author;

    /**
    * CPU架构
    */
    @SerializedName("Architecture")
    @Expose
    private String Architecture;

    /**
    * Docker客户端版本
    */
    @SerializedName("DockerVersion")
    @Expose
    private String DockerVersion;

    /**
    * 操作系统
    */
    @SerializedName("Os")
    @Expose
    private String Os;

    /**
    * push时间
    */
    @SerializedName("PushTime")
    @Expose
    private String PushTime;

    /**
    * 单位为字节
    */
    @SerializedName("SizeByte")
    @Expose
    private Long SizeByte;

    /**
     * 获取仓库名
     * @return RepoName 仓库名
     */
    public String getRepoName() {
        return this.RepoName;
    }

    /**
     * 设置仓库名
     * @param RepoName 仓库名
     */
    public void setRepoName(String RepoName) {
        this.RepoName = RepoName;
    }

    /**
     * 获取版本名称
     * @return TagName 版本名称
     */
    public String getTagName() {
        return this.TagName;
    }

    /**
     * 设置版本名称
     * @param TagName 版本名称
     */
    public void setTagName(String TagName) {
        this.TagName = TagName;
    }

    /**
     * 获取版本ID
     * @return TagId 版本ID
     */
    public String getTagId() {
        return this.TagId;
    }

    /**
     * 设置版本ID
     * @param TagId 版本ID
     */
    public void setTagId(String TagId) {
        this.TagId = TagId;
    }

    /**
     * 获取镜像ID
     * @return ImageId 镜像ID
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * 设置镜像ID
     * @param ImageId 镜像ID
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * 获取大小
     * @return Size 大小
     */
    public String getSize() {
        return this.Size;
    }

    /**
     * 设置大小
     * @param Size 大小
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * 获取创建时间
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * 设置创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * 获取更新时间
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取镜像制作者
     * @return Author 镜像制作者
     */
    public String getAuthor() {
        return this.Author;
    }

    /**
     * 设置镜像制作者
     * @param Author 镜像制作者
     */
    public void setAuthor(String Author) {
        this.Author = Author;
    }

    /**
     * 获取CPU架构
     * @return Architecture CPU架构
     */
    public String getArchitecture() {
        return this.Architecture;
    }

    /**
     * 设置CPU架构
     * @param Architecture CPU架构
     */
    public void setArchitecture(String Architecture) {
        this.Architecture = Architecture;
    }

    /**
     * 获取Docker客户端版本
     * @return DockerVersion Docker客户端版本
     */
    public String getDockerVersion() {
        return this.DockerVersion;
    }

    /**
     * 设置Docker客户端版本
     * @param DockerVersion Docker客户端版本
     */
    public void setDockerVersion(String DockerVersion) {
        this.DockerVersion = DockerVersion;
    }

    /**
     * 获取操作系统
     * @return Os 操作系统
     */
    public String getOs() {
        return this.Os;
    }

    /**
     * 设置操作系统
     * @param Os 操作系统
     */
    public void setOs(String Os) {
        this.Os = Os;
    }

    /**
     * 获取push时间
     * @return PushTime push时间
     */
    public String getPushTime() {
        return this.PushTime;
    }

    /**
     * 设置push时间
     * @param PushTime push时间
     */
    public void setPushTime(String PushTime) {
        this.PushTime = PushTime;
    }

    /**
     * 获取单位为字节
     * @return SizeByte 单位为字节
     */
    public Long getSizeByte() {
        return this.SizeByte;
    }

    /**
     * 设置单位为字节
     * @param SizeByte 单位为字节
     */
    public void setSizeByte(Long SizeByte) {
        this.SizeByte = SizeByte;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RepoName", this.RepoName);
        this.setParamSimple(map, prefix + "TagName", this.TagName);
        this.setParamSimple(map, prefix + "TagId", this.TagId);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Author", this.Author);
        this.setParamSimple(map, prefix + "Architecture", this.Architecture);
        this.setParamSimple(map, prefix + "DockerVersion", this.DockerVersion);
        this.setParamSimple(map, prefix + "Os", this.Os);
        this.setParamSimple(map, prefix + "PushTime", this.PushTime);
        this.setParamSimple(map, prefix + "SizeByte", this.SizeByte);

    }
}

