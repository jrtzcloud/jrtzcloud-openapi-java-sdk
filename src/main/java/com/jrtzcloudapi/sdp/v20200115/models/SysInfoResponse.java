package com.jrtzcloudapi.sdp.v20200115.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class SysInfoResponse extends AbstractModel {

    @SerializedName("displayName")
    @Expose
    private String displayName;

    @SerializedName("timeZone")
    @Expose
    private String timeZone;

    @SerializedName("time")
    @Expose
    private String time;

    @SerializedName("version")
    @Expose
    private String version;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "displayName", this.displayName);
        this.setParamSimple(map, prefix + "timeZone", this.timeZone);
        this.setParamSimple(map, prefix + "time", this.time);
        this.setParamSimple(map, prefix + "version", this.version);
    }
}
