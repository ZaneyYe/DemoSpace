package com.demo.dao.mbg;

import com.demo.api.po.BoardMsg;
import com.demo.api.po.BoardMsgExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BoardMsgMapper {
	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	long countByExample(BoardMsgExample example);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	int deleteByExample(BoardMsgExample example);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	int insert(BoardMsg record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	int insertSelective(BoardMsg record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	List<BoardMsg> selectByExampleWithBLOBs(BoardMsgExample example);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	List<BoardMsg> selectByExample(BoardMsgExample example);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	BoardMsg selectByPrimaryKey(Integer id);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	int updateByExampleSelective(@Param("record") BoardMsg record, @Param("example") BoardMsgExample example);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	int updateByExampleWithBLOBs(@Param("record") BoardMsg record, @Param("example") BoardMsgExample example);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	int updateByExample(@Param("record") BoardMsg record, @Param("example") BoardMsgExample example);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeySelective(BoardMsg record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKeyWithBLOBs(BoardMsg record);

	/**
	 * This method was generated by MyBatis Generator.
	 * This method corresponds to the database table board_msg
	 *
	 * @mbg.generated
	 */
	int updateByPrimaryKey(BoardMsg record);
}