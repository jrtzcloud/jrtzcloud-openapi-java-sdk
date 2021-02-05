package com.jrtzcloudapi.riskwarn.v20200521.models;

import com.google.gson.JsonArray;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;
import java.util.List;

public class DescribeResponse extends AbstractModel {
    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    @SerializedName("Fields")
    @Expose
    private List<String> Fields;

    @SerializedName("Data")
    @Expose
    private List<JsonArray> Data;

    @SerializedName("Pages")
    @Expose
    private Integer Pages;

    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    @SerializedName("Total")
    @Expose
    private Integer Total;

    @SerializedName("Size")
    @Expose
    private Integer Size;

    @SerializedName("PageNo")
    @Expose
    private Integer PageNo;

    @SerializedName("NextPage")
    @Expose
    private Integer NextPage;

    @SerializedName("LastPage")
    @Expose
    private Boolean LastPage;

    @SerializedName("HasNextPage")
    @Expose
    private Boolean HasNextPage;

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "Fields", this.Fields);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "Pages", this.Pages);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "NextPage", this.NextPage);
        this.setParamSimple(map, prefix + "LastPage", this.LastPage);
        this.setParamSimple(map, prefix + "HasNextPage", this.HasNextPage);
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

    public List<String> getFields() {
        return Fields;
    }

    public void setFields(List<String> fields) {
        Fields = fields;
    }

    public List<JsonArray> getData() {
        return Data;
    }

    public void setData(List<JsonArray> data) {
        Data = data;
    }

    public Integer getPages() {
        return Pages;
    }

    public void setPages(Integer pages) {
        Pages = pages;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setTotal(Integer total) {
        Total = total;
    }

    public Integer getSize() {
        return Size;
    }

    public void setSize(Integer size) {
        Size = size;
    }

    public Integer getPageNo() {
        return PageNo;
    }

    public void setPageNo(Integer pageNo) {
        PageNo = pageNo;
    }

    public Integer getNextPage() {
        return NextPage;
    }

    public void setNextPage(Integer nextPage) {
        NextPage = nextPage;
    }

    public Boolean getLastPage() {
        return LastPage;
    }

    public void setLastPage(Boolean lastPage) {
        LastPage = lastPage;
    }

    public Boolean getHasNextPage() {
        return HasNextPage;
    }

    public void setHasNextPage(Boolean hasNextPage) {
        HasNextPage = hasNextPage;
    }
}
