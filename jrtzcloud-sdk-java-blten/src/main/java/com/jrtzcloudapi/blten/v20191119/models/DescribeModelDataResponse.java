package com.jrtzcloudapi.blten.v20191119.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.blten.v20191119.models.entity.Instances;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribeModelDataResponse extends AbstractModel {
    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;
    /**
     * 总共条数
     */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;
    /**
     * 示例集合
     */
    @SerializedName("Instances")
    @Expose
    private Instances Instances;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamObj(map, prefix + "TotalCount", this.Instances);
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String requestId) {
        RequestId = requestId;
    }

    public Integer getTotalCount() {
        return TotalCount;
    }

    public void setTotalCount(Integer totalCount) {
        TotalCount = totalCount;
    }

    public Instances getInstances() {
        return Instances;
    }

    public void setInstances(Instances instances) {
        Instances = instances;
    }
}
