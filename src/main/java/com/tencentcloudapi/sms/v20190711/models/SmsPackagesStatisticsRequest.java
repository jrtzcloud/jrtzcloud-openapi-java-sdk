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
package com.tencentcloudapi.sms.v20190711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmsPackagesStatisticsRequest  extends AbstractModel{

    /**
    * 最大上限
注：目前固定设置为0
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量
注：目前固定设置为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 需要拉取的套餐包个数
    */
    @SerializedName("NumberOfPullPackages")
    @Expose
    private Long NumberOfPullPackages;

    /**
    * 短信SdkAppid在[短信控制台](https://console.cloud.tencent.com/sms/smslist) 添加应用后生成的实际SdkAppid,示例如1400006666。
    */
    @SerializedName("SmsSdkAppid")
    @Expose
    private String SmsSdkAppid;

    /**
     * 获取最大上限
注：目前固定设置为0
     * @return Limit 最大上限
注：目前固定设置为0
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置最大上限
注：目前固定设置为0
     * @param Limit 最大上限
注：目前固定设置为0
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取偏移量
注：目前固定设置为0
     * @return Offset 偏移量
注：目前固定设置为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
注：目前固定设置为0
     * @param Offset 偏移量
注：目前固定设置为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取需要拉取的套餐包个数
     * @return NumberOfPullPackages 需要拉取的套餐包个数
     */
    public Long getNumberOfPullPackages() {
        return this.NumberOfPullPackages;
    }

    /**
     * 设置需要拉取的套餐包个数
     * @param NumberOfPullPackages 需要拉取的套餐包个数
     */
    public void setNumberOfPullPackages(Long NumberOfPullPackages) {
        this.NumberOfPullPackages = NumberOfPullPackages;
    }

    /**
     * 获取短信SdkAppid在[短信控制台](https://console.cloud.tencent.com/sms/smslist) 添加应用后生成的实际SdkAppid,示例如1400006666。
     * @return SmsSdkAppid 短信SdkAppid在[短信控制台](https://console.cloud.tencent.com/sms/smslist) 添加应用后生成的实际SdkAppid,示例如1400006666。
     */
    public String getSmsSdkAppid() {
        return this.SmsSdkAppid;
    }

    /**
     * 设置短信SdkAppid在[短信控制台](https://console.cloud.tencent.com/sms/smslist) 添加应用后生成的实际SdkAppid,示例如1400006666。
     * @param SmsSdkAppid 短信SdkAppid在[短信控制台](https://console.cloud.tencent.com/sms/smslist) 添加应用后生成的实际SdkAppid,示例如1400006666。
     */
    public void setSmsSdkAppid(String SmsSdkAppid) {
        this.SmsSdkAppid = SmsSdkAppid;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "NumberOfPullPackages", this.NumberOfPullPackages);
        this.setParamSimple(map, prefix + "SmsSdkAppid", this.SmsSdkAppid);

    }
}

