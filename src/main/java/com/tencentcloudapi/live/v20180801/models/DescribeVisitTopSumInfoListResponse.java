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

public class DescribeVisitTopSumInfoListResponse  extends AbstractModel{

    /**
    * 页号，
范围是[1,1000]，
默认值是1。
    */
    @SerializedName("PageNum")
    @Expose
    private Integer PageNum;

    /**
    * 每页个数，范围是[1,1000]，
默认值是20。
    */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
    * 峰值指标，可选值包括”Domain”，”StreamId”。
    */
    @SerializedName("TopIndex")
    @Expose
    private String TopIndex;

    /**
    * 排序指标，可选值包括” AvgFluxPerSecond”，”TotalRequest”（默认）,“TotalFlux”。
    */
    @SerializedName("OrderParam")
    @Expose
    private String OrderParam;

    /**
    * 记录总数。
    */
    @SerializedName("TotalNum")
    @Expose
    private Integer TotalNum;

    /**
    * 记录总页数。
    */
    @SerializedName("TotalPage")
    @Expose
    private Integer TotalPage;

    /**
    * 数据内容。
    */
    @SerializedName("DataInfoList")
    @Expose
    private PlaySumStatInfo [] DataInfoList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取页号，
范围是[1,1000]，
默认值是1。
     * @return PageNum 页号，
范围是[1,1000]，
默认值是1。
     */
    public Integer getPageNum() {
        return this.PageNum;
    }

    /**
     * 设置页号，
范围是[1,1000]，
默认值是1。
     * @param PageNum 页号，
范围是[1,1000]，
默认值是1。
     */
    public void setPageNum(Integer PageNum) {
        this.PageNum = PageNum;
    }

    /**
     * 获取每页个数，范围是[1,1000]，
默认值是20。
     * @return PageSize 每页个数，范围是[1,1000]，
默认值是20。
     */
    public Integer getPageSize() {
        return this.PageSize;
    }

    /**
     * 设置每页个数，范围是[1,1000]，
默认值是20。
     * @param PageSize 每页个数，范围是[1,1000]，
默认值是20。
     */
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    /**
     * 获取峰值指标，可选值包括”Domain”，”StreamId”。
     * @return TopIndex 峰值指标，可选值包括”Domain”，”StreamId”。
     */
    public String getTopIndex() {
        return this.TopIndex;
    }

    /**
     * 设置峰值指标，可选值包括”Domain”，”StreamId”。
     * @param TopIndex 峰值指标，可选值包括”Domain”，”StreamId”。
     */
    public void setTopIndex(String TopIndex) {
        this.TopIndex = TopIndex;
    }

    /**
     * 获取排序指标，可选值包括” AvgFluxPerSecond”，”TotalRequest”（默认）,“TotalFlux”。
     * @return OrderParam 排序指标，可选值包括” AvgFluxPerSecond”，”TotalRequest”（默认）,“TotalFlux”。
     */
    public String getOrderParam() {
        return this.OrderParam;
    }

    /**
     * 设置排序指标，可选值包括” AvgFluxPerSecond”，”TotalRequest”（默认）,“TotalFlux”。
     * @param OrderParam 排序指标，可选值包括” AvgFluxPerSecond”，”TotalRequest”（默认）,“TotalFlux”。
     */
    public void setOrderParam(String OrderParam) {
        this.OrderParam = OrderParam;
    }

    /**
     * 获取记录总数。
     * @return TotalNum 记录总数。
     */
    public Integer getTotalNum() {
        return this.TotalNum;
    }

    /**
     * 设置记录总数。
     * @param TotalNum 记录总数。
     */
    public void setTotalNum(Integer TotalNum) {
        this.TotalNum = TotalNum;
    }

    /**
     * 获取记录总页数。
     * @return TotalPage 记录总页数。
     */
    public Integer getTotalPage() {
        return this.TotalPage;
    }

    /**
     * 设置记录总页数。
     * @param TotalPage 记录总页数。
     */
    public void setTotalPage(Integer TotalPage) {
        this.TotalPage = TotalPage;
    }

    /**
     * 获取数据内容。
     * @return DataInfoList 数据内容。
     */
    public PlaySumStatInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * 设置数据内容。
     * @param DataInfoList 数据内容。
     */
    public void setDataInfoList(PlaySumStatInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
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
        this.setParamSimple(map, prefix + "PageNum", this.PageNum);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TopIndex", this.TopIndex);
        this.setParamSimple(map, prefix + "OrderParam", this.OrderParam);
        this.setParamSimple(map, prefix + "TotalNum", this.TotalNum);
        this.setParamSimple(map, prefix + "TotalPage", this.TotalPage);
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

