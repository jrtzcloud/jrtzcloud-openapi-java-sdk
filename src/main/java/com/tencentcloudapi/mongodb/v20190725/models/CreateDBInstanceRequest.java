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
package com.tencentcloudapi.mongodb.v20190725.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDBInstanceRequest  extends AbstractModel{

    /**
    * 每个副本集内节点个数，当前副本集节点数固定为3，分片从节点数可选，具体参照查询云数据库的售卖规格返回参数
    */
    @SerializedName("NodeNum")
    @Expose
    private Integer NodeNum;

    /**
    * 实例内存大小，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 实例硬盘大小，单位：GB
    */
    @SerializedName("Volume")
    @Expose
    private Integer Volume;

    /**
    * 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本
    */
    @SerializedName("MongoVersion")
    @Expose
    private String MongoVersion;

    /**
    * 实例数量, 最小值1，最大值为10
    */
    @SerializedName("GoodsNum")
    @Expose
    private Integer GoodsNum;

    /**
    * 实例所属区域名称，格式如：ap-guangzhou-2
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
    * 机器类型，HIO：高IO型；HIO10G：高IO万兆型
    */
    @SerializedName("MachineCode")
    @Expose
    private String MachineCode;

    /**
    * 实例类型，REPLSET-副本集，SHARD-分片集群
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数
    */
    @SerializedName("ReplicateSetNum")
    @Expose
    private Integer ReplicateSetNum;

    /**
    * 项目ID，不设置为默认项目
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 私有网络 ID，如果不传则默认选择基础网络，请使用 查询私有网络列表
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 查询子网列表
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例密码，不设置该参数则需要在创建完成后通过设置密码接口初始化实例密码。密码必须是8-16位字符，且至少包含字母、数字和字符 !@#%^*() 中的两种
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 实例标签信息
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * 自动续费标记，可选值为：0 - 不自动续费；1 - 自动续费。默认为不自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Integer AutoRenewFlag;

    /**
     * 获取每个副本集内节点个数，当前副本集节点数固定为3，分片从节点数可选，具体参照查询云数据库的售卖规格返回参数
     * @return NodeNum 每个副本集内节点个数，当前副本集节点数固定为3，分片从节点数可选，具体参照查询云数据库的售卖规格返回参数
     */
    public Integer getNodeNum() {
        return this.NodeNum;
    }

    /**
     * 设置每个副本集内节点个数，当前副本集节点数固定为3，分片从节点数可选，具体参照查询云数据库的售卖规格返回参数
     * @param NodeNum 每个副本集内节点个数，当前副本集节点数固定为3，分片从节点数可选，具体参照查询云数据库的售卖规格返回参数
     */
    public void setNodeNum(Integer NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * 获取实例内存大小，单位：GB
     * @return Memory 实例内存大小，单位：GB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置实例内存大小，单位：GB
     * @param Memory 实例内存大小，单位：GB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取实例硬盘大小，单位：GB
     * @return Volume 实例硬盘大小，单位：GB
     */
    public Integer getVolume() {
        return this.Volume;
    }

    /**
     * 设置实例硬盘大小，单位：GB
     * @param Volume 实例硬盘大小，单位：GB
     */
    public void setVolume(Integer Volume) {
        this.Volume = Volume;
    }

    /**
     * 获取版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本
     * @return MongoVersion 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本
     */
    public String getMongoVersion() {
        return this.MongoVersion;
    }

    /**
     * 设置版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本
     * @param MongoVersion 版本号，具体支持的售卖版本请参照查询云数据库的售卖规格（DescribeSpecInfo）返回结果。参数与版本对应关系是MONGO_3_WT：MongoDB 3.2 WiredTiger存储引擎版本，MONGO_3_ROCKS：MongoDB 3.2 RocksDB存储引擎版本，MONGO_36_WT：MongoDB 3.6 WiredTiger存储引擎版本
     */
    public void setMongoVersion(String MongoVersion) {
        this.MongoVersion = MongoVersion;
    }

    /**
     * 获取实例数量, 最小值1，最大值为10
     * @return GoodsNum 实例数量, 最小值1，最大值为10
     */
    public Integer getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * 设置实例数量, 最小值1，最大值为10
     * @param GoodsNum 实例数量, 最小值1，最大值为10
     */
    public void setGoodsNum(Integer GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * 获取实例所属区域名称，格式如：ap-guangzhou-2
     * @return Zone 实例所属区域名称，格式如：ap-guangzhou-2
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置实例所属区域名称，格式如：ap-guangzhou-2
     * @param Zone 实例所属区域名称，格式如：ap-guangzhou-2
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取实例时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     * @return Period 实例时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置实例时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     * @param Period 实例时长，单位：月，可选值包括 [1,2,3,4,5,6,7,8,9,10,11,12,24,36]
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 获取机器类型，HIO：高IO型；HIO10G：高IO万兆型
     * @return MachineCode 机器类型，HIO：高IO型；HIO10G：高IO万兆型
     */
    public String getMachineCode() {
        return this.MachineCode;
    }

    /**
     * 设置机器类型，HIO：高IO型；HIO10G：高IO万兆型
     * @param MachineCode 机器类型，HIO：高IO型；HIO10G：高IO万兆型
     */
    public void setMachineCode(String MachineCode) {
        this.MachineCode = MachineCode;
    }

    /**
     * 获取实例类型，REPLSET-副本集，SHARD-分片集群
     * @return ClusterType 实例类型，REPLSET-副本集，SHARD-分片集群
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * 设置实例类型，REPLSET-副本集，SHARD-分片集群
     * @param ClusterType 实例类型，REPLSET-副本集，SHARD-分片集群
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * 获取副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数
     * @return ReplicateSetNum 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数
     */
    public Integer getReplicateSetNum() {
        return this.ReplicateSetNum;
    }

    /**
     * 设置副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数
     * @param ReplicateSetNum 副本集个数，创建副本集实例时，该参数必须设置为1；创建分片实例时，具体参照查询云数据库的售卖规格返回参数
     */
    public void setReplicateSetNum(Integer ReplicateSetNum) {
        this.ReplicateSetNum = ReplicateSetNum;
    }

    /**
     * 获取项目ID，不设置为默认项目
     * @return ProjectId 项目ID，不设置为默认项目
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置项目ID，不设置为默认项目
     * @param ProjectId 项目ID，不设置为默认项目
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取私有网络 ID，如果不传则默认选择基础网络，请使用 查询私有网络列表
     * @return VpcId 私有网络 ID，如果不传则默认选择基础网络，请使用 查询私有网络列表
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络 ID，如果不传则默认选择基础网络，请使用 查询私有网络列表
     * @param VpcId 私有网络 ID，如果不传则默认选择基础网络，请使用 查询私有网络列表
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 查询子网列表
     * @return SubnetId 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 查询子网列表
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 查询子网列表
     * @param SubnetId 私有网络下的子网 ID，如果设置了 UniqVpcId，则 UniqSubnetId 必填，请使用 查询子网列表
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取实例密码，不设置该参数则需要在创建完成后通过设置密码接口初始化实例密码。密码必须是8-16位字符，且至少包含字母、数字和字符 !@#%^*() 中的两种
     * @return Password 实例密码，不设置该参数则需要在创建完成后通过设置密码接口初始化实例密码。密码必须是8-16位字符，且至少包含字母、数字和字符 !@#%^*() 中的两种
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置实例密码，不设置该参数则需要在创建完成后通过设置密码接口初始化实例密码。密码必须是8-16位字符，且至少包含字母、数字和字符 !@#%^*() 中的两种
     * @param Password 实例密码，不设置该参数则需要在创建完成后通过设置密码接口初始化实例密码。密码必须是8-16位字符，且至少包含字母、数字和字符 !@#%^*() 中的两种
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取实例标签信息
     * @return Tags 实例标签信息
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * 设置实例标签信息
     * @param Tags 实例标签信息
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取自动续费标记，可选值为：0 - 不自动续费；1 - 自动续费。默认为不自动续费
     * @return AutoRenewFlag 自动续费标记，可选值为：0 - 不自动续费；1 - 自动续费。默认为不自动续费
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * 设置自动续费标记，可选值为：0 - 不自动续费；1 - 自动续费。默认为不自动续费
     * @param AutoRenewFlag 自动续费标记，可选值为：0 - 不自动续费；1 - 自动续费。默认为不自动续费
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "MongoVersion", this.MongoVersion);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "MachineCode", this.MachineCode);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ReplicateSetNum", this.ReplicateSetNum);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);

    }
}

