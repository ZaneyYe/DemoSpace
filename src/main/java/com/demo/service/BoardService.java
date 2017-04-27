package com.demo.service;

import com.demo.vo.BoardMsgVo;

/**
 * Created by yzy on 2017/4/26.
 * email: mia5121@163.com
 * 留言板接口
 */
public interface BoardService {
	//保存留言板信息
	void saveBoardMsg(BoardMsgVo msg);
}
