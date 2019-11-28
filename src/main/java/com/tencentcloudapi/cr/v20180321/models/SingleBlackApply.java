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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SingleBlackApply  extends AbstractModel{

    /**
    * 黑名单类型，01代表手机号码。
    */
    @SerializedName("BlackType")
    @Expose
    private String BlackType;

    /**
    * 操作类型，A为新增，D为删除。
    */
    @SerializedName("OperationType")
    @Expose
    private String OperationType;

    /**
    * 黑名单值，BlackType为01时，填写11位手机号码。
    */
    @SerializedName("BlackValue")
    @Expose
    private String BlackValue;

    /**
    * 备注。
    */
    @SerializedName("BlackDescription")
    @Expose
    private String BlackDescription;

    /**
    * 黑名单生效截止日期，格式为YYYY-MM-DD，不填默认为永久。
    */
    @SerializedName("BlackValidDate")
    @Expose
    private String BlackValidDate;

    /**
     * 获取黑名单类型，01代表手机号码。
     * @return BlackType 黑名单类型，01代表手机号码。
     */
    public String getBlackType() {
        return this.BlackType;
    }

    /**
     * 设置黑名单类型，01代表手机号码。
     * @param BlackType 黑名单类型，01代表手机号码。
     */
    public void setBlackType(String BlackType) {
        this.BlackType = BlackType;
    }

    /**
     * 获取操作类型，A为新增，D为删除。
     * @return OperationType 操作类型，A为新增，D为删除。
     */
    public String getOperationType() {
        return this.OperationType;
    }

    /**
     * 设置操作类型，A为新增，D为删除。
     * @param OperationType 操作类型，A为新增，D为删除。
     */
    public void setOperationType(String OperationType) {
        this.OperationType = OperationType;
    }

    /**
     * 获取黑名单值，BlackType为01时，填写11位手机号码。
     * @return BlackValue 黑名单值，BlackType为01时，填写11位手机号码。
     */
    public String getBlackValue() {
        return this.BlackValue;
    }

    /**
     * 设置黑名单值，BlackType为01时，填写11位手机号码。
     * @param BlackValue 黑名单值，BlackType为01时，填写11位手机号码。
     */
    public void setBlackValue(String BlackValue) {
        this.BlackValue = BlackValue;
    }

    /**
     * 获取备注。
     * @return BlackDescription 备注。
     */
    public String getBlackDescription() {
        return this.BlackDescription;
    }

    /**
     * 设置备注。
     * @param BlackDescription 备注。
     */
    public void setBlackDescription(String BlackDescription) {
        this.BlackDescription = BlackDescription;
    }

    /**
     * 获取黑名单生效截止日期，格式为YYYY-MM-DD，不填默认为永久。
     * @return BlackValidDate 黑名单生效截止日期，格式为YYYY-MM-DD，不填默认为永久。
     */
    public String getBlackValidDate() {
        return this.BlackValidDate;
    }

    /**
     * 设置黑名单生效截止日期，格式为YYYY-MM-DD，不填默认为永久。
     * @param BlackValidDate 黑名单生效截止日期，格式为YYYY-MM-DD，不填默认为永久。
     */
    public void setBlackValidDate(String BlackValidDate) {
        this.BlackValidDate = BlackValidDate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlackType", this.BlackType);
        this.setParamSimple(map, prefix + "OperationType", this.OperationType);
        this.setParamSimple(map, prefix + "BlackValue", this.BlackValue);
        this.setParamSimple(map, prefix + "BlackDescription", this.BlackDescription);
        this.setParamSimple(map, prefix + "BlackValidDate", this.BlackValidDate);

    }
}

