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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HourTrafficInfoDetail  extends AbstractModel{

    /**
    * 小时 取值为：0，1，2，3，4，5，6，7，8，9，10，11，12，13，14，15，16，17，18，19，20，21，22，23
    */
    @SerializedName("Hour")
    @Expose
    private Integer Hour;

    /**
    * 分时客流量
    */
    @SerializedName("HourTrafficTotalCount")
    @Expose
    private Integer HourTrafficTotalCount;

    /**
     * 获取小时 取值为：0，1，2，3，4，5，6，7，8，9，10，11，12，13，14，15，16，17，18，19，20，21，22，23
     * @return Hour 小时 取值为：0，1，2，3，4，5，6，7，8，9，10，11，12，13，14，15，16，17，18，19，20，21，22，23
     */
    public Integer getHour() {
        return this.Hour;
    }

    /**
     * 设置小时 取值为：0，1，2，3，4，5，6，7，8，9，10，11，12，13，14，15，16，17，18，19，20，21，22，23
     * @param Hour 小时 取值为：0，1，2，3，4，5，6，7，8，9，10，11，12，13，14，15，16，17，18，19，20，21，22，23
     */
    public void setHour(Integer Hour) {
        this.Hour = Hour;
    }

    /**
     * 获取分时客流量
     * @return HourTrafficTotalCount 分时客流量
     */
    public Integer getHourTrafficTotalCount() {
        return this.HourTrafficTotalCount;
    }

    /**
     * 设置分时客流量
     * @param HourTrafficTotalCount 分时客流量
     */
    public void setHourTrafficTotalCount(Integer HourTrafficTotalCount) {
        this.HourTrafficTotalCount = HourTrafficTotalCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Hour", this.Hour);
        this.setParamSimple(map, prefix + "HourTrafficTotalCount", this.HourTrafficTotalCount);

    }
}

