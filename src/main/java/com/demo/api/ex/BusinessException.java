package com.demo.api.ex;

/**
 * Created by yzy on 2017/4/28.
 * email: mia5121@163.com
 * 业务性异常
 */
public class BusinessException extends RuntimeException {
	/**
	 * 异常信息code
	 */
	private String errorCode;
	/**
	 * 异常信息
	 */
	private String message;

	public BusinessException() {
	}

	public BusinessException(String errorCode) {
		this.errorCode = errorCode;
	}

	public BusinessException(String errorCode, String message) {
		this.errorCode = errorCode;
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	@Override
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
