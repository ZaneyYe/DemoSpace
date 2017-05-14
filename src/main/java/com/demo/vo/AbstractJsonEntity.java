package com.demo.vo;

import com.demo.api.en.StatusInfo;

/**
 * Created by yzy on 2017/4/28.
 * email: mia5121@163.com
 */
public class AbstractJsonEntity {
	// 状态代码
	protected String code = StatusInfo.REQUEST_SUCCESS;
	// 消息内容
	protected String message = StatusInfo.REQUEST_SUCCESS_MSG;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
