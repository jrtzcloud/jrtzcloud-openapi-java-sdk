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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyIdlFilesResponse  extends AbstractModel{

    /**
    * 本次上传校验所有的Idl文件信息列表
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
    * 读取Idl描述文件后解析出的合法表数量，不包含已经创建的表
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 读取Idl描述文件后解析出的合法表列表，不包含已经创建的表
    */
    @SerializedName("TableInfos")
    @Expose
    private ParsedTableInfo [] TableInfos;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取本次上传校验所有的Idl文件信息列表
     * @return IdlFiles 本次上传校验所有的Idl文件信息列表
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * 设置本次上传校验所有的Idl文件信息列表
     * @param IdlFiles 本次上传校验所有的Idl文件信息列表
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * 获取读取Idl描述文件后解析出的合法表数量，不包含已经创建的表
     * @return TotalCount 读取Idl描述文件后解析出的合法表数量，不包含已经创建的表
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置读取Idl描述文件后解析出的合法表数量，不包含已经创建的表
     * @param TotalCount 读取Idl描述文件后解析出的合法表数量，不包含已经创建的表
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取读取Idl描述文件后解析出的合法表列表，不包含已经创建的表
     * @return TableInfos 读取Idl描述文件后解析出的合法表列表，不包含已经创建的表
     */
    public ParsedTableInfo [] getTableInfos() {
        return this.TableInfos;
    }

    /**
     * 设置读取Idl描述文件后解析出的合法表列表，不包含已经创建的表
     * @param TableInfos 读取Idl描述文件后解析出的合法表列表，不包含已经创建的表
     */
    public void setTableInfos(ParsedTableInfo [] TableInfos) {
        this.TableInfos = TableInfos;
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
        this.setParamArrayObj(map, prefix + "IdlFiles.", this.IdlFiles);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "TableInfos.", this.TableInfos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

