package com.demo.api.po;

public class BoardMsg {
	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column board_msg.id
	 *
	 * @mbg.generated
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column board_msg.name
	 *
	 * @mbg.generated
	 */
	private String name;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column board_msg.email
	 *
	 * @mbg.generated
	 */
	private String email;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column board_msg.phone
	 *
	 * @mbg.generated
	 */
	private String phone;

	/**
	 * This field was generated by MyBatis Generator.
	 * This field corresponds to the database column board_msg.message
	 *
	 * @mbg.generated
	 */
	private String message;

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column board_msg.id
	 *
	 * @return the value of board_msg.id
	 * @mbg.generated
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column board_msg.id
	 *
	 * @param id the value for board_msg.id
	 * @mbg.generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column board_msg.name
	 *
	 * @return the value of board_msg.name
	 * @mbg.generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column board_msg.name
	 *
	 * @param name the value for board_msg.name
	 * @mbg.generated
	 */
	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column board_msg.email
	 *
	 * @return the value of board_msg.email
	 * @mbg.generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column board_msg.email
	 *
	 * @param email the value for board_msg.email
	 * @mbg.generated
	 */
	public void setEmail(String email) {
		this.email = email == null ? null : email.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column board_msg.phone
	 *
	 * @return the value of board_msg.phone
	 * @mbg.generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column board_msg.phone
	 *
	 * @param phone the value for board_msg.phone
	 * @mbg.generated
	 */
	public void setPhone(String phone) {
		this.phone = phone == null ? null : phone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method returns the value of the database column board_msg.message
	 *
	 * @return the value of board_msg.message
	 * @mbg.generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method sets the value of the database column board_msg.message
	 *
	 * @param message the value for board_msg.message
	 * @mbg.generated
	 */
	public void setMessage(String message) {
		this.message = message == null ? null : message.trim();
	}

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", name=").append(name);
		sb.append(", email=").append(email);
		sb.append(", phone=").append(phone);
		sb.append(", message=").append(message);
		sb.append("]");
		return sb.toString();
	}
}