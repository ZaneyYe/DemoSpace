package com.demo.vo;

/**
 * Created by yzy on 2017/4/28.
 * email: mia5121@163.com
 */
public class ResponseEntity<T> extends AbstractJsonEntity {

	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
