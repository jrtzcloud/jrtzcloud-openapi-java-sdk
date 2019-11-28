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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Snapshot  extends AbstractModel{

    /**
    * 快照ID。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 快照所在的位置。
    */
    @SerializedName("Placement")
    @Expose
    private Placement Placement;

    /**
    * 创建此快照的云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
    */
    @SerializedName("DiskUsage")
    @Expose
    private String DiskUsage;

    /**
    * 创建此快照的云硬盘ID。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
    * 创建此快照的云硬盘大小，单位GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Integer DiskSize;

    /**
    * 快照的状态。取值范围：<br><li>NORMAL：正常<br><li>CREATING：创建中<br><li>ROLLBACKING：回滚中<br><li>COPYING_FROM_REMOTE：跨地域复制快照拷贝中。
    */
    @SerializedName("SnapshotState")
    @Expose
    private String SnapshotState;

    /**
    * 快照名称，用户自定义的快照别名。调用[ModifySnapshotAttribute](/document/product/362/15650)可修改此字段。
    */
    @SerializedName("SnapshotName")
    @Expose
    private String SnapshotName;

    /**
    * 快照创建进度百分比，快照创建成功后此字段恒为100。
    */
    @SerializedName("Percent")
    @Expose
    private Integer Percent;

    /**
    * 快照的创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 快照到期时间。如果快照为永久保留，此字段为空。
    */
    @SerializedName("DeadlineTime")
    @Expose
    private String DeadlineTime;

    /**
    * 是否为加密盘创建的快照。取值范围：<br><li>true：该快照为加密盘创建的<br><li>false:非加密盘创建的快照。
    */
    @SerializedName("Encrypt")
    @Expose
    private Boolean Encrypt;

    /**
    * 是否为永久快照。取值范围：<br><li>true：永久快照<br><li>false：非永久快照。
    */
    @SerializedName("IsPermanent")
    @Expose
    private Boolean IsPermanent;

    /**
    * 快照正在跨地域复制的目的地域，默认取值为[]。
    */
    @SerializedName("CopyingToRegions")
    @Expose
    private String [] CopyingToRegions;

    /**
    * 是否为跨地域复制的快照。取值范围：<br><li>true：表示为跨地域复制的快照。<br><li>false:本地域的快照。
    */
    @SerializedName("CopyFromRemote")
    @Expose
    private Boolean CopyFromRemote;

    /**
    * 快照关联的镜像列表。
    */
    @SerializedName("Images")
    @Expose
    private Image [] Images;

    /**
    * 快照关联的镜像个数。
    */
    @SerializedName("ImageCount")
    @Expose
    private Integer ImageCount;

    /**
    * 快照类型，目前该项取值可以为PRIVATE_SNAPSHOT或者SHARED_SNAPSHOT
    */
    @SerializedName("SnapshotType")
    @Expose
    private String SnapshotType;

    /**
    * 快照当前被共享数
    */
    @SerializedName("ShareReference")
    @Expose
    private Integer ShareReference;

    /**
     * 获取快照ID。
     * @return SnapshotId 快照ID。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * 设置快照ID。
     * @param SnapshotId 快照ID。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * 获取快照所在的位置。
     * @return Placement 快照所在的位置。
     */
    public Placement getPlacement() {
        return this.Placement;
    }

    /**
     * 设置快照所在的位置。
     * @param Placement 快照所在的位置。
     */
    public void setPlacement(Placement Placement) {
        this.Placement = Placement;
    }

    /**
     * 获取创建此快照的云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     * @return DiskUsage 创建此快照的云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     */
    public String getDiskUsage() {
        return this.DiskUsage;
    }

    /**
     * 设置创建此快照的云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     * @param DiskUsage 创建此快照的云硬盘类型。取值范围：<br><li>SYSTEM_DISK：系统盘<br><li>DATA_DISK：数据盘。
     */
    public void setDiskUsage(String DiskUsage) {
        this.DiskUsage = DiskUsage;
    }

    /**
     * 获取创建此快照的云硬盘ID。
     * @return DiskId 创建此快照的云硬盘ID。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * 设置创建此快照的云硬盘ID。
     * @param DiskId 创建此快照的云硬盘ID。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * 获取创建此快照的云硬盘大小，单位GB。
     * @return DiskSize 创建此快照的云硬盘大小，单位GB。
     */
    public Integer getDiskSize() {
        return this.DiskSize;
    }

    /**
     * 设置创建此快照的云硬盘大小，单位GB。
     * @param DiskSize 创建此快照的云硬盘大小，单位GB。
     */
    public void setDiskSize(Integer DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * 获取快照的状态。取值范围：<br><li>NORMAL：正常<br><li>CREATING：创建中<br><li>ROLLBACKING：回滚中<br><li>COPYING_FROM_REMOTE：跨地域复制快照拷贝中。
     * @return SnapshotState 快照的状态。取值范围：<br><li>NORMAL：正常<br><li>CREATING：创建中<br><li>ROLLBACKING：回滚中<br><li>COPYING_FROM_REMOTE：跨地域复制快照拷贝中。
     */
    public String getSnapshotState() {
        return this.SnapshotState;
    }

    /**
     * 设置快照的状态。取值范围：<br><li>NORMAL：正常<br><li>CREATING：创建中<br><li>ROLLBACKING：回滚中<br><li>COPYING_FROM_REMOTE：跨地域复制快照拷贝中。
     * @param SnapshotState 快照的状态。取值范围：<br><li>NORMAL：正常<br><li>CREATING：创建中<br><li>ROLLBACKING：回滚中<br><li>COPYING_FROM_REMOTE：跨地域复制快照拷贝中。
     */
    public void setSnapshotState(String SnapshotState) {
        this.SnapshotState = SnapshotState;
    }

    /**
     * 获取快照名称，用户自定义的快照别名。调用[ModifySnapshotAttribute](/document/product/362/15650)可修改此字段。
     * @return SnapshotName 快照名称，用户自定义的快照别名。调用[ModifySnapshotAttribute](/document/product/362/15650)可修改此字段。
     */
    public String getSnapshotName() {
        return this.SnapshotName;
    }

    /**
     * 设置快照名称，用户自定义的快照别名。调用[ModifySnapshotAttribute](/document/product/362/15650)可修改此字段。
     * @param SnapshotName 快照名称，用户自定义的快照别名。调用[ModifySnapshotAttribute](/document/product/362/15650)可修改此字段。
     */
    public void setSnapshotName(String SnapshotName) {
        this.SnapshotName = SnapshotName;
    }

    /**
     * 获取快照创建进度百分比，快照创建成功后此字段恒为100。
     * @return Percent 快照创建进度百分比，快照创建成功后此字段恒为100。
     */
    public Integer getPercent() {
        return this.Percent;
    }

    /**
     * 设置快照创建进度百分比，快照创建成功后此字段恒为100。
     * @param Percent 快照创建进度百分比，快照创建成功后此字段恒为100。
     */
    public void setPercent(Integer Percent) {
        this.Percent = Percent;
    }

    /**
     * 获取快照的创建时间。
     * @return CreateTime 快照的创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置快照的创建时间。
     * @param CreateTime 快照的创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取快照到期时间。如果快照为永久保留，此字段为空。
     * @return DeadlineTime 快照到期时间。如果快照为永久保留，此字段为空。
     */
    public String getDeadlineTime() {
        return this.DeadlineTime;
    }

    /**
     * 设置快照到期时间。如果快照为永久保留，此字段为空。
     * @param DeadlineTime 快照到期时间。如果快照为永久保留，此字段为空。
     */
    public void setDeadlineTime(String DeadlineTime) {
        this.DeadlineTime = DeadlineTime;
    }

    /**
     * 获取是否为加密盘创建的快照。取值范围：<br><li>true：该快照为加密盘创建的<br><li>false:非加密盘创建的快照。
     * @return Encrypt 是否为加密盘创建的快照。取值范围：<br><li>true：该快照为加密盘创建的<br><li>false:非加密盘创建的快照。
     */
    public Boolean getEncrypt() {
        return this.Encrypt;
    }

    /**
     * 设置是否为加密盘创建的快照。取值范围：<br><li>true：该快照为加密盘创建的<br><li>false:非加密盘创建的快照。
     * @param Encrypt 是否为加密盘创建的快照。取值范围：<br><li>true：该快照为加密盘创建的<br><li>false:非加密盘创建的快照。
     */
    public void setEncrypt(Boolean Encrypt) {
        this.Encrypt = Encrypt;
    }

    /**
     * 获取是否为永久快照。取值范围：<br><li>true：永久快照<br><li>false：非永久快照。
     * @return IsPermanent 是否为永久快照。取值范围：<br><li>true：永久快照<br><li>false：非永久快照。
     */
    public Boolean getIsPermanent() {
        return this.IsPermanent;
    }

    /**
     * 设置是否为永久快照。取值范围：<br><li>true：永久快照<br><li>false：非永久快照。
     * @param IsPermanent 是否为永久快照。取值范围：<br><li>true：永久快照<br><li>false：非永久快照。
     */
    public void setIsPermanent(Boolean IsPermanent) {
        this.IsPermanent = IsPermanent;
    }

    /**
     * 获取快照正在跨地域复制的目的地域，默认取值为[]。
     * @return CopyingToRegions 快照正在跨地域复制的目的地域，默认取值为[]。
     */
    public String [] getCopyingToRegions() {
        return this.CopyingToRegions;
    }

    /**
     * 设置快照正在跨地域复制的目的地域，默认取值为[]。
     * @param CopyingToRegions 快照正在跨地域复制的目的地域，默认取值为[]。
     */
    public void setCopyingToRegions(String [] CopyingToRegions) {
        this.CopyingToRegions = CopyingToRegions;
    }

    /**
     * 获取是否为跨地域复制的快照。取值范围：<br><li>true：表示为跨地域复制的快照。<br><li>false:本地域的快照。
     * @return CopyFromRemote 是否为跨地域复制的快照。取值范围：<br><li>true：表示为跨地域复制的快照。<br><li>false:本地域的快照。
     */
    public Boolean getCopyFromRemote() {
        return this.CopyFromRemote;
    }

    /**
     * 设置是否为跨地域复制的快照。取值范围：<br><li>true：表示为跨地域复制的快照。<br><li>false:本地域的快照。
     * @param CopyFromRemote 是否为跨地域复制的快照。取值范围：<br><li>true：表示为跨地域复制的快照。<br><li>false:本地域的快照。
     */
    public void setCopyFromRemote(Boolean CopyFromRemote) {
        this.CopyFromRemote = CopyFromRemote;
    }

    /**
     * 获取快照关联的镜像列表。
     * @return Images 快照关联的镜像列表。
     */
    public Image [] getImages() {
        return this.Images;
    }

    /**
     * 设置快照关联的镜像列表。
     * @param Images 快照关联的镜像列表。
     */
    public void setImages(Image [] Images) {
        this.Images = Images;
    }

    /**
     * 获取快照关联的镜像个数。
     * @return ImageCount 快照关联的镜像个数。
     */
    public Integer getImageCount() {
        return this.ImageCount;
    }

    /**
     * 设置快照关联的镜像个数。
     * @param ImageCount 快照关联的镜像个数。
     */
    public void setImageCount(Integer ImageCount) {
        this.ImageCount = ImageCount;
    }

    /**
     * 获取快照类型，目前该项取值可以为PRIVATE_SNAPSHOT或者SHARED_SNAPSHOT
     * @return SnapshotType 快照类型，目前该项取值可以为PRIVATE_SNAPSHOT或者SHARED_SNAPSHOT
     */
    public String getSnapshotType() {
        return this.SnapshotType;
    }

    /**
     * 设置快照类型，目前该项取值可以为PRIVATE_SNAPSHOT或者SHARED_SNAPSHOT
     * @param SnapshotType 快照类型，目前该项取值可以为PRIVATE_SNAPSHOT或者SHARED_SNAPSHOT
     */
    public void setSnapshotType(String SnapshotType) {
        this.SnapshotType = SnapshotType;
    }

    /**
     * 获取快照当前被共享数
     * @return ShareReference 快照当前被共享数
     */
    public Integer getShareReference() {
        return this.ShareReference;
    }

    /**
     * 设置快照当前被共享数
     * @param ShareReference 快照当前被共享数
     */
    public void setShareReference(Integer ShareReference) {
        this.ShareReference = ShareReference;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamObj(map, prefix + "Placement.", this.Placement);
        this.setParamSimple(map, prefix + "DiskUsage", this.DiskUsage);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "SnapshotState", this.SnapshotState);
        this.setParamSimple(map, prefix + "SnapshotName", this.SnapshotName);
        this.setParamSimple(map, prefix + "Percent", this.Percent);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DeadlineTime", this.DeadlineTime);
        this.setParamSimple(map, prefix + "Encrypt", this.Encrypt);
        this.setParamSimple(map, prefix + "IsPermanent", this.IsPermanent);
        this.setParamArraySimple(map, prefix + "CopyingToRegions.", this.CopyingToRegions);
        this.setParamSimple(map, prefix + "CopyFromRemote", this.CopyFromRemote);
        this.setParamArrayObj(map, prefix + "Images.", this.Images);
        this.setParamSimple(map, prefix + "ImageCount", this.ImageCount);
        this.setParamSimple(map, prefix + "SnapshotType", this.SnapshotType);
        this.setParamSimple(map, prefix + "ShareReference", this.ShareReference);

    }
}

