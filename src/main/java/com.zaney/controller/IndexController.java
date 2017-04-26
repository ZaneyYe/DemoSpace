package com.zaney.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yzy on 2016/9/24.
 *
 * @email mia5121@163.com
 */
@RequestMapping("/")
@Controller
public class IndexController {

	@RequestMapping("/index")
	public String toIndex(){
		return "/index";
	}

	@RequestMapping("/msgboard")
	public String toMsgBoard() {
		return "/board";
	}
}
