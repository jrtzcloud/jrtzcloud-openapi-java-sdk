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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseACLResponse  extends AbstractModel{

    /**
    * 权限标签。取值范围：
<li> READONLY：所有用户可读，仅创建者和管理员可写</li>
<li> PRIVATE：仅创建者及管理员可读写</li>
<li> ADMINWRITE：所有用户可读，仅管理员可写</li>
<li> ADMINONLY：仅管理员可读写</li>
    */
    @SerializedName("AclTag")
    @Expose
    private String AclTag;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取权限标签。取值范围：
<li> READONLY：所有用户可读，仅创建者和管理员可写</li>
<li> PRIVATE：仅创建者及管理员可读写</li>
<li> ADMINWRITE：所有用户可读，仅管理员可写</li>
<li> ADMINONLY：仅管理员可读写</li>
     * @return AclTag 权限标签。取值范围：
<li> READONLY：所有用户可读，仅创建者和管理员可写</li>
<li> PRIVATE：仅创建者及管理员可读写</li>
<li> ADMINWRITE：所有用户可读，仅管理员可写</li>
<li> ADMINONLY：仅管理员可读写</li>
     */
    public String getAclTag() {
        return this.AclTag;
    }

    /**
     * 设置权限标签。取值范围：
<li> READONLY：所有用户可读，仅创建者和管理员可写</li>
<li> PRIVATE：仅创建者及管理员可读写</li>
<li> ADMINWRITE：所有用户可读，仅管理员可写</li>
<li> ADMINONLY：仅管理员可读写</li>
     * @param AclTag 权限标签。取值范围：
<li> READONLY：所有用户可读，仅创建者和管理员可写</li>
<li> PRIVATE：仅创建者及管理员可读写</li>
<li> ADMINWRITE：所有用户可读，仅管理员可写</li>
<li> ADMINONLY：仅管理员可读写</li>
     */
    public void setAclTag(String AclTag) {
        this.AclTag = AclTag;
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
        this.setParamSimple(map, prefix + "AclTag", this.AclTag);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

