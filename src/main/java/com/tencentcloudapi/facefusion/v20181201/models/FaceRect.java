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
package com.tencentcloudapi.facefusion.v20181201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceRect  extends AbstractModel{

    /**
    * 人脸框左上角横坐标。
    */
    @SerializedName("X")
    @Expose
    private Integer X;

    /**
    * 人脸框左上角纵坐标。
    */
    @SerializedName("Y")
    @Expose
    private Integer Y;

    /**
    * 人脸框宽度。
    */
    @SerializedName("Width")
    @Expose
    private Integer Width;

    /**
    * 人脸框高度。
    */
    @SerializedName("Height")
    @Expose
    private Integer Height;

    /**
     * 获取人脸框左上角横坐标。
     * @return X 人脸框左上角横坐标。
     */
    public Integer getX() {
        return this.X;
    }

    /**
     * 设置人脸框左上角横坐标。
     * @param X 人脸框左上角横坐标。
     */
    public void setX(Integer X) {
        this.X = X;
    }

    /**
     * 获取人脸框左上角纵坐标。
     * @return Y 人脸框左上角纵坐标。
     */
    public Integer getY() {
        return this.Y;
    }

    /**
     * 设置人脸框左上角纵坐标。
     * @param Y 人脸框左上角纵坐标。
     */
    public void setY(Integer Y) {
        this.Y = Y;
    }

    /**
     * 获取人脸框宽度。
     * @return Width 人脸框宽度。
     */
    public Integer getWidth() {
        return this.Width;
    }

    /**
     * 设置人脸框宽度。
     * @param Width 人脸框宽度。
     */
    public void setWidth(Integer Width) {
        this.Width = Width;
    }

    /**
     * 获取人脸框高度。
     * @return Height 人脸框高度。
     */
    public Integer getHeight() {
        return this.Height;
    }

    /**
     * 设置人脸框高度。
     * @param Height 人脸框高度。
     */
    public void setHeight(Integer Height) {
        this.Height = Height;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "X", this.X);
        this.setParamSimple(map, prefix + "Y", this.Y);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);

    }
}

