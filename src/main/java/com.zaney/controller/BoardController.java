package com.zaney.controller;

import com.zaney.service.BoardService;
import com.zaney.util.HtmlUtil;
import com.zaney.vo.BoardMsg;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yzy on 2017/4/26.
 * email: mia5121@163.com
 * 留言板功能：
 * 记录留言信息，并发送邮件给我进行通知
 */
@Controller
@RequestMapping("/board")
public class BoardController {

	private static final Logger LOGGER = Logger.getLogger(BoardController.class);

	@Autowired
	private BoardService boardService;

	@RequestMapping("/saveMsg.do")
	public void saveBoarddMsg(BoardMsg msg) {
		LOGGER.info("保存留言板信息： msg :" + msg.getEmail());
		if (StringUtils.isNotBlank(msg.getMsg())) {
			msg.setMsg(HtmlUtil.escapeHtml(msg.getMsg()));
		}
		boardService.saveBoardMsg(msg);
	}
}