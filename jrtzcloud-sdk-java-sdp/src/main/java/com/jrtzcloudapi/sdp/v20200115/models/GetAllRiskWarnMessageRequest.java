package com.jrtzcloudapi.sdp.v20200115.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class GetAllRiskWarnMessageRequest extends AbstractModel {

    /**
     * 消息对应日期，格式YYYY-MM-DD
     */
    @SerializedName("PubDt")
    @Expose
    private String PubDt;

    /**
     * 券商自定义扩展数据，留作备用
     */
    @SerializedName("ExtraData")
    @Expose
    private String ExtraData;

    /**
     * Get 消息对应日期，格式YYYY-MM-DD
     * @return 消息对应日期，格式YYYY-MM-DD
     */
    public String getPubDt() {
        return PubDt;
    }

    /**
     * Set 消息对应日期，格式YYYY-MM-DD
     * @param PubDt 消息对应日期，格式YYYY-MM-DD
     */
    public void setPubDt(String PubDt) {
        this.PubDt = PubDt;
    }

    /**
     * Get 券商自定义扩展数据，留作备用
     * @return 券商自定义扩展数据，留作备用
     */
    public String getExtraData() {
        return ExtraData;
    }

    /**
     * Set 券商自定义扩展数据，留作备用
     * @param ExtraData 券商自定义扩展数据，留作备用
     */
    public void setExtraData(String ExtraData) {
        this.ExtraData = ExtraData;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PubDt", this.PubDt);
        this.setParamSimple(map, prefix + "ExtraData", this.ExtraData);
    }
}
