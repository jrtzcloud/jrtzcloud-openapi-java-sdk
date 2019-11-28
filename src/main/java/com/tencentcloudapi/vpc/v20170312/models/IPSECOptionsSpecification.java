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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPSECOptionsSpecification  extends AbstractModel{

    /**
    * 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBC-192', 'AES-CBC-256', 'DES-CBC', 'NULL'， 默认为AES-CBC-128
    */
    @SerializedName("EncryptAlgorithm")
    @Expose
    private String EncryptAlgorithm;

    /**
    * 认证算法：可选值：'MD5', 'SHA1'，默认为
    */
    @SerializedName("IntegrityAlgorith")
    @Expose
    private String IntegrityAlgorith;

    /**
    * IPsec SA lifetime(s)：单位秒，取值范围：180-604800
    */
    @SerializedName("IPSECSaLifetimeSeconds")
    @Expose
    private Integer IPSECSaLifetimeSeconds;

    /**
    * PFS：可选值：'NULL', 'DH-GROUP1', 'DH-GROUP2', 'DH-GROUP5', 'DH-GROUP14', 'DH-GROUP24'，默认为NULL
    */
    @SerializedName("PfsDhGroup")
    @Expose
    private String PfsDhGroup;

    /**
    * IPsec SA lifetime(KB)：单位KB，取值范围：2560-604800
    */
    @SerializedName("IPSECSaLifetimeTraffic")
    @Expose
    private Integer IPSECSaLifetimeTraffic;

    /**
     * 获取加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBC-192', 'AES-CBC-256', 'DES-CBC', 'NULL'， 默认为AES-CBC-128
     * @return EncryptAlgorithm 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBC-192', 'AES-CBC-256', 'DES-CBC', 'NULL'， 默认为AES-CBC-128
     */
    public String getEncryptAlgorithm() {
        return this.EncryptAlgorithm;
    }

    /**
     * 设置加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBC-192', 'AES-CBC-256', 'DES-CBC', 'NULL'， 默认为AES-CBC-128
     * @param EncryptAlgorithm 加密算法，可选值：'3DES-CBC', 'AES-CBC-128', 'AES-CBC-192', 'AES-CBC-256', 'DES-CBC', 'NULL'， 默认为AES-CBC-128
     */
    public void setEncryptAlgorithm(String EncryptAlgorithm) {
        this.EncryptAlgorithm = EncryptAlgorithm;
    }

    /**
     * 获取认证算法：可选值：'MD5', 'SHA1'，默认为
     * @return IntegrityAlgorith 认证算法：可选值：'MD5', 'SHA1'，默认为
     */
    public String getIntegrityAlgorith() {
        return this.IntegrityAlgorith;
    }

    /**
     * 设置认证算法：可选值：'MD5', 'SHA1'，默认为
     * @param IntegrityAlgorith 认证算法：可选值：'MD5', 'SHA1'，默认为
     */
    public void setIntegrityAlgorith(String IntegrityAlgorith) {
        this.IntegrityAlgorith = IntegrityAlgorith;
    }

    /**
     * 获取IPsec SA lifetime(s)：单位秒，取值范围：180-604800
     * @return IPSECSaLifetimeSeconds IPsec SA lifetime(s)：单位秒，取值范围：180-604800
     */
    public Integer getIPSECSaLifetimeSeconds() {
        return this.IPSECSaLifetimeSeconds;
    }

    /**
     * 设置IPsec SA lifetime(s)：单位秒，取值范围：180-604800
     * @param IPSECSaLifetimeSeconds IPsec SA lifetime(s)：单位秒，取值范围：180-604800
     */
    public void setIPSECSaLifetimeSeconds(Integer IPSECSaLifetimeSeconds) {
        this.IPSECSaLifetimeSeconds = IPSECSaLifetimeSeconds;
    }

    /**
     * 获取PFS：可选值：'NULL', 'DH-GROUP1', 'DH-GROUP2', 'DH-GROUP5', 'DH-GROUP14', 'DH-GROUP24'，默认为NULL
     * @return PfsDhGroup PFS：可选值：'NULL', 'DH-GROUP1', 'DH-GROUP2', 'DH-GROUP5', 'DH-GROUP14', 'DH-GROUP24'，默认为NULL
     */
    public String getPfsDhGroup() {
        return this.PfsDhGroup;
    }

    /**
     * 设置PFS：可选值：'NULL', 'DH-GROUP1', 'DH-GROUP2', 'DH-GROUP5', 'DH-GROUP14', 'DH-GROUP24'，默认为NULL
     * @param PfsDhGroup PFS：可选值：'NULL', 'DH-GROUP1', 'DH-GROUP2', 'DH-GROUP5', 'DH-GROUP14', 'DH-GROUP24'，默认为NULL
     */
    public void setPfsDhGroup(String PfsDhGroup) {
        this.PfsDhGroup = PfsDhGroup;
    }

    /**
     * 获取IPsec SA lifetime(KB)：单位KB，取值范围：2560-604800
     * @return IPSECSaLifetimeTraffic IPsec SA lifetime(KB)：单位KB，取值范围：2560-604800
     */
    public Integer getIPSECSaLifetimeTraffic() {
        return this.IPSECSaLifetimeTraffic;
    }

    /**
     * 设置IPsec SA lifetime(KB)：单位KB，取值范围：2560-604800
     * @param IPSECSaLifetimeTraffic IPsec SA lifetime(KB)：单位KB，取值范围：2560-604800
     */
    public void setIPSECSaLifetimeTraffic(Integer IPSECSaLifetimeTraffic) {
        this.IPSECSaLifetimeTraffic = IPSECSaLifetimeTraffic;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EncryptAlgorithm", this.EncryptAlgorithm);
        this.setParamSimple(map, prefix + "IntegrityAlgorith", this.IntegrityAlgorith);
        this.setParamSimple(map, prefix + "IPSECSaLifetimeSeconds", this.IPSECSaLifetimeSeconds);
        this.setParamSimple(map, prefix + "PfsDhGroup", this.PfsDhGroup);
        this.setParamSimple(map, prefix + "IPSECSaLifetimeTraffic", this.IPSECSaLifetimeTraffic);

    }
}

