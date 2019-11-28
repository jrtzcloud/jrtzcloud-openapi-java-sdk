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
package com.tencentcloudapi.tav.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanFileHashResponse  extends AbstractModel{

    /**
    * 接口调用状态，成功返回200，失败返回400
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 接口调用描述信息，成功返回"scan success"，失败返回"scan error"
    */
    @SerializedName("Info")
    @Expose
    private String Info;

    /**
    * 云查实际结果信息，包括md5、return_state、virus_state、virus_name字符逗号间隔；        
return_state查询状态：-1/0代表失败、1/2代表成功；
virus_state文状件态：0文件不存在、1白、2黑、3未知、4感染性、5低可信白；
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取接口调用状态，成功返回200，失败返回400
     * @return Status 接口调用状态，成功返回200，失败返回400
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置接口调用状态，成功返回200，失败返回400
     * @param Status 接口调用状态，成功返回200，失败返回400
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取接口调用描述信息，成功返回"scan success"，失败返回"scan error"
     * @return Info 接口调用描述信息，成功返回"scan success"，失败返回"scan error"
     */
    public String getInfo() {
        return this.Info;
    }

    /**
     * 设置接口调用描述信息，成功返回"scan success"，失败返回"scan error"
     * @param Info 接口调用描述信息，成功返回"scan success"，失败返回"scan error"
     */
    public void setInfo(String Info) {
        this.Info = Info;
    }

    /**
     * 获取云查实际结果信息，包括md5、return_state、virus_state、virus_name字符逗号间隔；        
return_state查询状态：-1/0代表失败、1/2代表成功；
virus_state文状件态：0文件不存在、1白、2黑、3未知、4感染性、5低可信白；
     * @return Data 云查实际结果信息，包括md5、return_state、virus_state、virus_name字符逗号间隔；        
return_state查询状态：-1/0代表失败、1/2代表成功；
virus_state文状件态：0文件不存在、1白、2黑、3未知、4感染性、5低可信白；
     */
    public String getData() {
        return this.Data;
    }

    /**
     * 设置云查实际结果信息，包括md5、return_state、virus_state、virus_name字符逗号间隔；        
return_state查询状态：-1/0代表失败、1/2代表成功；
virus_state文状件态：0文件不存在、1白、2黑、3未知、4感染性、5低可信白；
     * @param Data 云查实际结果信息，包括md5、return_state、virus_state、virus_name字符逗号间隔；        
return_state查询状态：-1/0代表失败、1/2代表成功；
virus_state文状件态：0文件不存在、1白、2黑、3未知、4感染性、5低可信白；
     */
    public void setData(String Data) {
        this.Data = Data;
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Info", this.Info);
        this.setParamSimple(map, prefix + "Data", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

