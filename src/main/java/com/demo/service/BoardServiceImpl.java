package com.demo.service;

import com.demo.api.po.BoardMsg;
import com.demo.dao.customer.BoardMsgDao;
import com.demo.vo.BoardMsgVo;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by yzy on 2017/4/26.
 * email: mia5121@163.com
 */
@Service
public class BoardServiceImpl implements BoardService {

	private static final Logger LOGGER = Logger.getLogger(BoardServiceImpl.class);

	@Autowired
	private BoardMsgDao boardMsgDao;

	/**
	 * 保存留言簿信息
	 *
	 * @param msg
	 */
	@Override
	public void saveBoardMsg(BoardMsgVo msg) {
		if (StringUtils.isBlank(msg.getMsg())) {
			throw new RuntimeException("留言簿信息不能为空！");
		}
		BoardMsg boardMsg = new BoardMsg();
		boardMsg.setName(msg.getName());
		boardMsg.setEmail(msg.getEmail());
		boardMsg.setPhone(msg.getPhone());
		boardMsg.setMessage(msg.getMsg());
		boardMsg.setCreatetime(new Date());
		boardMsg.setUpdatetime(new Date());
		boardMsgDao.insertSelective(boardMsg);
	}

}
