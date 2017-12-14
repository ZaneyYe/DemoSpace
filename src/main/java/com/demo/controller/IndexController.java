package com.demo.controller;

import com.demo.service.ArticleService;
import com.demo.vo.BlogArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by yzy on 2016/9/24.
 *
 * @email mia5121@163.com
 */
@RequestMapping("/")
@Controller
public class IndexController {

	@Autowired
	private ArticleService articleService;

	@RequestMapping("/index")
	public String toIndex(HttpServletRequest request, Map<String,Object> dataMap) {
		List<BlogArticleVo> blogArticleVoList = articleService.queryShowFour(0,4);
		dataMap.put("showBlogs",blogArticleVoList);
		return "/index";
	}

	@RequestMapping("/msgboard")
	public String toMsgBoard() {
		return "/board";
	}


}
