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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBAccount  extends AbstractModel{

    /**
    * 用户名
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户可以从哪台主机登录（对应 MySQL 用户的 host 字段，UserName + Host 唯一标识一个用户，IP形式，IP段以%结尾；支持填入%；为空默认等于%）
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 用户备注信息
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 只读标记，0：否， 1：该账号的sql请求优先选择备机执行，备机不可用时选择主机执行，2：优先选择备机执行，备机不可用时操作失败。
    */
    @SerializedName("ReadOnly")
    @Expose
    private Integer ReadOnly;

    /**
    * 该字段对只读帐号有意义，表示选择主备延迟小于该值的备机
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DelayThresh")
    @Expose
    private Integer DelayThresh;

    /**
     * 获取用户名
     * @return UserName 用户名
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置用户名
     * @param UserName 用户名
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取用户可以从哪台主机登录（对应 MySQL 用户的 host 字段，UserName + Host 唯一标识一个用户，IP形式，IP段以%结尾；支持填入%；为空默认等于%）
     * @return Host 用户可以从哪台主机登录（对应 MySQL 用户的 host 字段，UserName + Host 唯一标识一个用户，IP形式，IP段以%结尾；支持填入%；为空默认等于%）
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * 设置用户可以从哪台主机登录（对应 MySQL 用户的 host 字段，UserName + Host 唯一标识一个用户，IP形式，IP段以%结尾；支持填入%；为空默认等于%）
     * @param Host 用户可以从哪台主机登录（对应 MySQL 用户的 host 字段，UserName + Host 唯一标识一个用户，IP形式，IP段以%结尾；支持填入%；为空默认等于%）
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * 获取用户备注信息
     * @return Description 用户备注信息
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置用户备注信息
     * @param Description 用户备注信息
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取最后更新时间
     * @return UpdateTime 最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置最后更新时间
     * @param UpdateTime 最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取只读标记，0：否， 1：该账号的sql请求优先选择备机执行，备机不可用时选择主机执行，2：优先选择备机执行，备机不可用时操作失败。
     * @return ReadOnly 只读标记，0：否， 1：该账号的sql请求优先选择备机执行，备机不可用时选择主机执行，2：优先选择备机执行，备机不可用时操作失败。
     */
    public Integer getReadOnly() {
        return this.ReadOnly;
    }

    /**
     * 设置只读标记，0：否， 1：该账号的sql请求优先选择备机执行，备机不可用时选择主机执行，2：优先选择备机执行，备机不可用时操作失败。
     * @param ReadOnly 只读标记，0：否， 1：该账号的sql请求优先选择备机执行，备机不可用时选择主机执行，2：优先选择备机执行，备机不可用时操作失败。
     */
    public void setReadOnly(Integer ReadOnly) {
        this.ReadOnly = ReadOnly;
    }

    /**
     * 获取该字段对只读帐号有意义，表示选择主备延迟小于该值的备机
注意：此字段可能返回 null，表示取不到有效值。
     * @return DelayThresh 该字段对只读帐号有意义，表示选择主备延迟小于该值的备机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getDelayThresh() {
        return this.DelayThresh;
    }

    /**
     * 设置该字段对只读帐号有意义，表示选择主备延迟小于该值的备机
注意：此字段可能返回 null，表示取不到有效值。
     * @param DelayThresh 该字段对只读帐号有意义，表示选择主备延迟小于该值的备机
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDelayThresh(Integer DelayThresh) {
        this.DelayThresh = DelayThresh;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "ReadOnly", this.ReadOnly);
        this.setParamSimple(map, prefix + "DelayThresh", this.DelayThresh);

    }
}

