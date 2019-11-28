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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateL4ListenersRequest  extends AbstractModel{

    /**
    * 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 监听器信息数组，可以创建多个监听器。目前一个负载均衡下面最多允许创建50个监听器
    */
    @SerializedName("ListenerSet")
    @Expose
    private CreateL4Listener [] ListenerSet;

    /**
     * 获取负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @return LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * 设置负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     * @param LoadBalancerId 负载均衡实例ID，可通过接口DescribeLoadBalancers查询。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * 获取监听器信息数组，可以创建多个监听器。目前一个负载均衡下面最多允许创建50个监听器
     * @return ListenerSet 监听器信息数组，可以创建多个监听器。目前一个负载均衡下面最多允许创建50个监听器
     */
    public CreateL4Listener [] getListenerSet() {
        return this.ListenerSet;
    }

    /**
     * 设置监听器信息数组，可以创建多个监听器。目前一个负载均衡下面最多允许创建50个监听器
     * @param ListenerSet 监听器信息数组，可以创建多个监听器。目前一个负载均衡下面最多允许创建50个监听器
     */
    public void setListenerSet(CreateL4Listener [] ListenerSet) {
        this.ListenerSet = ListenerSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamArrayObj(map, prefix + "ListenerSet.", this.ListenerSet);

    }
}

