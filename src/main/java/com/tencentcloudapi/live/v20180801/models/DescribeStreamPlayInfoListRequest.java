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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamPlayInfoListRequest  extends AbstractModel{

    /**
    * 开始时间，北京时间，格式为yyyy-mm-dd HH:MM:SS，
当前时间 和 开始时间 间隔不超过30天。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间，北京时间，格式为yyyy-mm-dd HH:MM:SS，
结束时间 和 开始时间  必须在同一天内。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 播放域名，
若不填，则为查询所有播放域名的在线流数据。
    */
    @SerializedName("PlayDomain")
    @Expose
    private String PlayDomain;

    /**
    * 流名称，精确匹配。
若不填，则为查询总体播放数据。
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 推流路径，与推流和播放地址中的AppName保持一致，默认为live。精确匹配，不支持。
若不填，则为查询总体播放数据。
注意：按AppName查询，需要联系客服同学提单支持。
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
     * 获取开始时间，北京时间，格式为yyyy-mm-dd HH:MM:SS，
当前时间 和 开始时间 间隔不超过30天。
     * @return StartTime 开始时间，北京时间，格式为yyyy-mm-dd HH:MM:SS，
当前时间 和 开始时间 间隔不超过30天。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始时间，北京时间，格式为yyyy-mm-dd HH:MM:SS，
当前时间 和 开始时间 间隔不超过30天。
     * @param StartTime 开始时间，北京时间，格式为yyyy-mm-dd HH:MM:SS，
当前时间 和 开始时间 间隔不超过30天。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间，北京时间，格式为yyyy-mm-dd HH:MM:SS，
结束时间 和 开始时间  必须在同一天内。
     * @return EndTime 结束时间，北京时间，格式为yyyy-mm-dd HH:MM:SS，
结束时间 和 开始时间  必须在同一天内。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间，北京时间，格式为yyyy-mm-dd HH:MM:SS，
结束时间 和 开始时间  必须在同一天内。
     * @param EndTime 结束时间，北京时间，格式为yyyy-mm-dd HH:MM:SS，
结束时间 和 开始时间  必须在同一天内。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取播放域名，
若不填，则为查询所有播放域名的在线流数据。
     * @return PlayDomain 播放域名，
若不填，则为查询所有播放域名的在线流数据。
     */
    public String getPlayDomain() {
        return this.PlayDomain;
    }

    /**
     * 设置播放域名，
若不填，则为查询所有播放域名的在线流数据。
     * @param PlayDomain 播放域名，
若不填，则为查询所有播放域名的在线流数据。
     */
    public void setPlayDomain(String PlayDomain) {
        this.PlayDomain = PlayDomain;
    }

    /**
     * 获取流名称，精确匹配。
若不填，则为查询总体播放数据。
     * @return StreamName 流名称，精确匹配。
若不填，则为查询总体播放数据。
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * 设置流名称，精确匹配。
若不填，则为查询总体播放数据。
     * @param StreamName 流名称，精确匹配。
若不填，则为查询总体播放数据。
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * 获取推流路径，与推流和播放地址中的AppName保持一致，默认为live。精确匹配，不支持。
若不填，则为查询总体播放数据。
注意：按AppName查询，需要联系客服同学提单支持。
     * @return AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为live。精确匹配，不支持。
若不填，则为查询总体播放数据。
注意：按AppName查询，需要联系客服同学提单支持。
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置推流路径，与推流和播放地址中的AppName保持一致，默认为live。精确匹配，不支持。
若不填，则为查询总体播放数据。
注意：按AppName查询，需要联系客服同学提单支持。
     * @param AppName 推流路径，与推流和播放地址中的AppName保持一致，默认为live。精确匹配，不支持。
若不填，则为查询总体播放数据。
注意：按AppName查询，需要联系客服同学提单支持。
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "PlayDomain", this.PlayDomain);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "AppName", this.AppName);

    }
}

