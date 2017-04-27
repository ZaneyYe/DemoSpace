package com.demo.vo;

/**
 * Created by yzy on 2017/4/26.
 * email: mia5121@163.com
 */
public class BoardMsgVo {

	private String name;
	private String email;
	private String phone;
	private String msg;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "BoardMsg{" +
				"name='" + name + '\'' +
				", email='" + email + '\'' +
				", phone='" + phone + '\'' +
				", msg='" + msg + '\'' +
				'}';
	}
}
