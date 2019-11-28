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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EstateCertOCRResponse  extends AbstractModel{

    /**
    * 权利人
    */
    @SerializedName("Obligee")
    @Expose
    private String Obligee;

    /**
    * 共有情况
    */
    @SerializedName("Ownership")
    @Expose
    private String Ownership;

    /**
    * 坐落
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 不动产单元号
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 权利类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 权利性质
    */
    @SerializedName("Property")
    @Expose
    private String Property;

    /**
    * 用途
    */
    @SerializedName("Usage")
    @Expose
    private String Usage;

    /**
    * 面积
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
    * 使用期限
    */
    @SerializedName("Term")
    @Expose
    private String Term;

    /**
    * 权利其他状况，多行会用换行符\n连接。
    */
    @SerializedName("Other")
    @Expose
    private String Other;

    /**
    * 图片旋转角度
    */
    @SerializedName("Angle")
    @Expose
    private Float Angle;

    /**
    * 不动产权号
    */
    @SerializedName("Number")
    @Expose
    private String Number;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取权利人
     * @return Obligee 权利人
     */
    public String getObligee() {
        return this.Obligee;
    }

    /**
     * 设置权利人
     * @param Obligee 权利人
     */
    public void setObligee(String Obligee) {
        this.Obligee = Obligee;
    }

    /**
     * 获取共有情况
     * @return Ownership 共有情况
     */
    public String getOwnership() {
        return this.Ownership;
    }

    /**
     * 设置共有情况
     * @param Ownership 共有情况
     */
    public void setOwnership(String Ownership) {
        this.Ownership = Ownership;
    }

    /**
     * 获取坐落
     * @return Location 坐落
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * 设置坐落
     * @param Location 坐落
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * 获取不动产单元号
     * @return Unit 不动产单元号
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * 设置不动产单元号
     * @param Unit 不动产单元号
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * 获取权利类型
     * @return Type 权利类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置权利类型
     * @param Type 权利类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取权利性质
     * @return Property 权利性质
     */
    public String getProperty() {
        return this.Property;
    }

    /**
     * 设置权利性质
     * @param Property 权利性质
     */
    public void setProperty(String Property) {
        this.Property = Property;
    }

    /**
     * 获取用途
     * @return Usage 用途
     */
    public String getUsage() {
        return this.Usage;
    }

    /**
     * 设置用途
     * @param Usage 用途
     */
    public void setUsage(String Usage) {
        this.Usage = Usage;
    }

    /**
     * 获取面积
     * @return Area 面积
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * 设置面积
     * @param Area 面积
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    /**
     * 获取使用期限
     * @return Term 使用期限
     */
    public String getTerm() {
        return this.Term;
    }

    /**
     * 设置使用期限
     * @param Term 使用期限
     */
    public void setTerm(String Term) {
        this.Term = Term;
    }

    /**
     * 获取权利其他状况，多行会用换行符\n连接。
     * @return Other 权利其他状况，多行会用换行符\n连接。
     */
    public String getOther() {
        return this.Other;
    }

    /**
     * 设置权利其他状况，多行会用换行符\n连接。
     * @param Other 权利其他状况，多行会用换行符\n连接。
     */
    public void setOther(String Other) {
        this.Other = Other;
    }

    /**
     * 获取图片旋转角度
     * @return Angle 图片旋转角度
     */
    public Float getAngle() {
        return this.Angle;
    }

    /**
     * 设置图片旋转角度
     * @param Angle 图片旋转角度
     */
    public void setAngle(Float Angle) {
        this.Angle = Angle;
    }

    /**
     * 获取不动产权号
     * @return Number 不动产权号
     */
    public String getNumber() {
        return this.Number;
    }

    /**
     * 设置不动产权号
     * @param Number 不动产权号
     */
    public void setNumber(String Number) {
        this.Number = Number;
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
        this.setParamSimple(map, prefix + "Obligee", this.Obligee);
        this.setParamSimple(map, prefix + "Ownership", this.Ownership);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Property", this.Property);
        this.setParamSimple(map, prefix + "Usage", this.Usage);
        this.setParamSimple(map, prefix + "Area", this.Area);
        this.setParamSimple(map, prefix + "Term", this.Term);
        this.setParamSimple(map, prefix + "Other", this.Other);
        this.setParamSimple(map, prefix + "Angle", this.Angle);
        this.setParamSimple(map, prefix + "Number", this.Number);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

