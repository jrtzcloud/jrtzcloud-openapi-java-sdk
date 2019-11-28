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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBInstance  extends AbstractModel{

    /**
    * 实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * SubnetId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例ID
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 实例名称
    */
    @SerializedName("DBInstanceName")
    @Expose
    private String DBInstanceName;

    /**
    * 实例状态
    */
    @SerializedName("DBInstanceStatus")
    @Expose
    private String DBInstanceStatus;

    /**
    * 实例分配的内存大小，单位：GB
    */
    @SerializedName("DBInstanceMemory")
    @Expose
    private Integer DBInstanceMemory;

    /**
    * 实例分配的存储空间大小，单位：GB
    */
    @SerializedName("DBInstanceStorage")
    @Expose
    private Integer DBInstanceStorage;

    /**
    * 实例分配的CPU数量，单位：个
    */
    @SerializedName("DBInstanceCpu")
    @Expose
    private Integer DBInstanceCpu;

    /**
    * 售卖规格ID
    */
    @SerializedName("DBInstanceClass")
    @Expose
    private String DBInstanceClass;

    /**
    * 实例类型，类型有：1、primary（主实例）；2、readonly（只读实例）；3、guard（灾备实例）；4、temp（临时实例）
    */
    @SerializedName("DBInstanceType")
    @Expose
    private String DBInstanceType;

    /**
    * 实例版本，目前只支持standard（双机高可用版, 一主一从）
    */
    @SerializedName("DBInstanceVersion")
    @Expose
    private String DBInstanceVersion;

    /**
    * 实例DB字符集
    */
    @SerializedName("DBCharset")
    @Expose
    private String DBCharset;

    /**
    * PostgreSQL内核版本
    */
    @SerializedName("DBVersion")
    @Expose
    private String DBVersion;

    /**
    * 实例创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例执行最后一次更新的时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 实例到期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 实例隔离时间
    */
    @SerializedName("IsolatedTime")
    @Expose
    private String IsolatedTime;

    /**
    * 计费模式，1、prepaid（包年包月,预付费）；2、postpaid（按量计费，后付费）
    */
    @SerializedName("PayType")
    @Expose
    private String PayType;

    /**
    * 是否自动续费，1：自动续费，0：不自动续费
    */
    @SerializedName("AutoRenew")
    @Expose
    private Integer AutoRenew;

    /**
    * 实例网络连接信息
    */
    @SerializedName("DBInstanceNetInfo")
    @Expose
    private DBInstanceNetInfo [] DBInstanceNetInfo;

    /**
     * 获取实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段
     * @return Region 实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段
     * @param Region 实例所属地域，如: ap-guangzhou，对应RegionSet的Region字段
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段
     * @return Zone 实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段
     * @param Zone 实例所属可用区， 如：ap-guangzhou-3，对应ZoneSet的Zone字段
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取项目ID
     * @return ProjectId 项目ID
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取私有网络ID
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取SubnetId
     * @return SubnetId SubnetId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置SubnetId
     * @param SubnetId SubnetId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取实例ID
     * @return DBInstanceId 实例ID
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * 设置实例ID
     * @param DBInstanceId 实例ID
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * 获取实例名称
     * @return DBInstanceName 实例名称
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * 设置实例名称
     * @param DBInstanceName 实例名称
     */
    public void setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
    }

    /**
     * 获取实例状态
     * @return DBInstanceStatus 实例状态
     */
    public String getDBInstanceStatus() {
        return this.DBInstanceStatus;
    }

    /**
     * 设置实例状态
     * @param DBInstanceStatus 实例状态
     */
    public void setDBInstanceStatus(String DBInstanceStatus) {
        this.DBInstanceStatus = DBInstanceStatus;
    }

    /**
     * 获取实例分配的内存大小，单位：GB
     * @return DBInstanceMemory 实例分配的内存大小，单位：GB
     */
    public Integer getDBInstanceMemory() {
        return this.DBInstanceMemory;
    }

    /**
     * 设置实例分配的内存大小，单位：GB
     * @param DBInstanceMemory 实例分配的内存大小，单位：GB
     */
    public void setDBInstanceMemory(Integer DBInstanceMemory) {
        this.DBInstanceMemory = DBInstanceMemory;
    }

    /**
     * 获取实例分配的存储空间大小，单位：GB
     * @return DBInstanceStorage 实例分配的存储空间大小，单位：GB
     */
    public Integer getDBInstanceStorage() {
        return this.DBInstanceStorage;
    }

    /**
     * 设置实例分配的存储空间大小，单位：GB
     * @param DBInstanceStorage 实例分配的存储空间大小，单位：GB
     */
    public void setDBInstanceStorage(Integer DBInstanceStorage) {
        this.DBInstanceStorage = DBInstanceStorage;
    }

    /**
     * 获取实例分配的CPU数量，单位：个
     * @return DBInstanceCpu 实例分配的CPU数量，单位：个
     */
    public Integer getDBInstanceCpu() {
        return this.DBInstanceCpu;
    }

    /**
     * 设置实例分配的CPU数量，单位：个
     * @param DBInstanceCpu 实例分配的CPU数量，单位：个
     */
    public void setDBInstanceCpu(Integer DBInstanceCpu) {
        this.DBInstanceCpu = DBInstanceCpu;
    }

    /**
     * 获取售卖规格ID
     * @return DBInstanceClass 售卖规格ID
     */
    public String getDBInstanceClass() {
        return this.DBInstanceClass;
    }

    /**
     * 设置售卖规格ID
     * @param DBInstanceClass 售卖规格ID
     */
    public void setDBInstanceClass(String DBInstanceClass) {
        this.DBInstanceClass = DBInstanceClass;
    }

    /**
     * 获取实例类型，类型有：1、primary（主实例）；2、readonly（只读实例）；3、guard（灾备实例）；4、temp（临时实例）
     * @return DBInstanceType 实例类型，类型有：1、primary（主实例）；2、readonly（只读实例）；3、guard（灾备实例）；4、temp（临时实例）
     */
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    /**
     * 设置实例类型，类型有：1、primary（主实例）；2、readonly（只读实例）；3、guard（灾备实例）；4、temp（临时实例）
     * @param DBInstanceType 实例类型，类型有：1、primary（主实例）；2、readonly（只读实例）；3、guard（灾备实例）；4、temp（临时实例）
     */
    public void setDBInstanceType(String DBInstanceType) {
        this.DBInstanceType = DBInstanceType;
    }

    /**
     * 获取实例版本，目前只支持standard（双机高可用版, 一主一从）
     * @return DBInstanceVersion 实例版本，目前只支持standard（双机高可用版, 一主一从）
     */
    public String getDBInstanceVersion() {
        return this.DBInstanceVersion;
    }

    /**
     * 设置实例版本，目前只支持standard（双机高可用版, 一主一从）
     * @param DBInstanceVersion 实例版本，目前只支持standard（双机高可用版, 一主一从）
     */
    public void setDBInstanceVersion(String DBInstanceVersion) {
        this.DBInstanceVersion = DBInstanceVersion;
    }

    /**
     * 获取实例DB字符集
     * @return DBCharset 实例DB字符集
     */
    public String getDBCharset() {
        return this.DBCharset;
    }

    /**
     * 设置实例DB字符集
     * @param DBCharset 实例DB字符集
     */
    public void setDBCharset(String DBCharset) {
        this.DBCharset = DBCharset;
    }

    /**
     * 获取PostgreSQL内核版本
     * @return DBVersion PostgreSQL内核版本
     */
    public String getDBVersion() {
        return this.DBVersion;
    }

    /**
     * 设置PostgreSQL内核版本
     * @param DBVersion PostgreSQL内核版本
     */
    public void setDBVersion(String DBVersion) {
        this.DBVersion = DBVersion;
    }

    /**
     * 获取实例创建时间
     * @return CreateTime 实例创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置实例创建时间
     * @param CreateTime 实例创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取实例执行最后一次更新的时间
     * @return UpdateTime 实例执行最后一次更新的时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置实例执行最后一次更新的时间
     * @param UpdateTime 实例执行最后一次更新的时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取实例到期时间
     * @return ExpireTime 实例到期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * 设置实例到期时间
     * @param ExpireTime 实例到期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * 获取实例隔离时间
     * @return IsolatedTime 实例隔离时间
     */
    public String getIsolatedTime() {
        return this.IsolatedTime;
    }

    /**
     * 设置实例隔离时间
     * @param IsolatedTime 实例隔离时间
     */
    public void setIsolatedTime(String IsolatedTime) {
        this.IsolatedTime = IsolatedTime;
    }

    /**
     * 获取计费模式，1、prepaid（包年包月,预付费）；2、postpaid（按量计费，后付费）
     * @return PayType 计费模式，1、prepaid（包年包月,预付费）；2、postpaid（按量计费，后付费）
     */
    public String getPayType() {
        return this.PayType;
    }

    /**
     * 设置计费模式，1、prepaid（包年包月,预付费）；2、postpaid（按量计费，后付费）
     * @param PayType 计费模式，1、prepaid（包年包月,预付费）；2、postpaid（按量计费，后付费）
     */
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    /**
     * 获取是否自动续费，1：自动续费，0：不自动续费
     * @return AutoRenew 是否自动续费，1：自动续费，0：不自动续费
     */
    public Integer getAutoRenew() {
        return this.AutoRenew;
    }

    /**
     * 设置是否自动续费，1：自动续费，0：不自动续费
     * @param AutoRenew 是否自动续费，1：自动续费，0：不自动续费
     */
    public void setAutoRenew(Integer AutoRenew) {
        this.AutoRenew = AutoRenew;
    }

    /**
     * 获取实例网络连接信息
     * @return DBInstanceNetInfo 实例网络连接信息
     */
    public DBInstanceNetInfo [] getDBInstanceNetInfo() {
        return this.DBInstanceNetInfo;
    }

    /**
     * 设置实例网络连接信息
     * @param DBInstanceNetInfo 实例网络连接信息
     */
    public void setDBInstanceNetInfo(DBInstanceNetInfo [] DBInstanceNetInfo) {
        this.DBInstanceNetInfo = DBInstanceNetInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "DBInstanceName", this.DBInstanceName);
        this.setParamSimple(map, prefix + "DBInstanceStatus", this.DBInstanceStatus);
        this.setParamSimple(map, prefix + "DBInstanceMemory", this.DBInstanceMemory);
        this.setParamSimple(map, prefix + "DBInstanceStorage", this.DBInstanceStorage);
        this.setParamSimple(map, prefix + "DBInstanceCpu", this.DBInstanceCpu);
        this.setParamSimple(map, prefix + "DBInstanceClass", this.DBInstanceClass);
        this.setParamSimple(map, prefix + "DBInstanceType", this.DBInstanceType);
        this.setParamSimple(map, prefix + "DBInstanceVersion", this.DBInstanceVersion);
        this.setParamSimple(map, prefix + "DBCharset", this.DBCharset);
        this.setParamSimple(map, prefix + "DBVersion", this.DBVersion);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolatedTime", this.IsolatedTime);
        this.setParamSimple(map, prefix + "PayType", this.PayType);
        this.setParamSimple(map, prefix + "AutoRenew", this.AutoRenew);
        this.setParamArrayObj(map, prefix + "DBInstanceNetInfo.", this.DBInstanceNetInfo);

    }
}

