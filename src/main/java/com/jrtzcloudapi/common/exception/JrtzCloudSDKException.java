/*
 * Copyright (c) 2018 THL A29 Limited, a Investoday company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package com.jrtzcloudapi.common.exception;

/**
 * 今日投资云api sdk异常类
 */
public class JrtzCloudSDKException extends Exception {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 请求Id,发起请求前的异常这个字段为空
	 */
	private String requestId;
	
	/**
	 * Error code, When API returns a failure, it must have an error code.
	 */
	private String errorCode;
    
	/**
	 * @param message 异常信息
	 */
    public JrtzCloudSDKException(String message) {
    	this(message, "");
    }
    
    /**
     * @param message 异常信息
     * @param requestId 请求id
     */
    public JrtzCloudSDKException(String message, String requestId) {
    	super(message);
    	this.requestId = requestId;
    }
    
    public JrtzCloudSDKException(String errorCode, String message, String requestId) {
        super(message);
        this.requestId = requestId;
        this.errorCode = errorCode;
    }
    
    /**
     * 获取请求id
     * @return requestId
     */
    public String getRequestId() {
    	return requestId;
    }
    
    /**
     * Get error code
     * @return A string represents error code
     */
    public String getErrorCode() {
        return errorCode;
    }
    
    /**
     * 格式化输出异常信息
     * @return 异常信息
     */
    public String toString() {
    	return "[JrtzCloudSDKException]" + "ErrorCode:" + this.getErrorCode() + " ErrorMessage:" + this.getMessage() + " RequestId:" + this.getRequestId();
    }
}
