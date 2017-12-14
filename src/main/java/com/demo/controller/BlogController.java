package com.demo.controller;

import com.demo.service.ArticleService;
import com.demo.util.ConvertUtils;
import com.demo.util.DateFormatUtil;
import com.demo.vo.BlogArticleVo;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

/**
 * Created by yezhangyuan on 2017-12-14.
 *
 * @author yezhangyuan
 */
@Controller
@RequestMapping(value = "/blog")
public class BlogController {

	private static final Logger LOGGER = LoggerFactory.getLogger(BlogController.class);

	@Autowired
	private ArticleService articleService;


	@RequestMapping(value = "/queryBlog", method = RequestMethod.GET)
	public String queryArticle(@Param("blogId") String blogId, Map<String, Object> dataMap) {
		LOGGER.info("query blog, id:{}", blogId);
		if (StringUtils.isBlank(blogId)) {
			LOGGER.warn("query blogId, blogId is null");
			return "prev_article";
		}
		BlogArticleVo blogArticleVo = articleService.queryArticle(Integer.valueOf(blogId));
		if (blogArticleVo != null) {
			String showArticle = ConvertUtils.convertHtml(blogArticleVo.getArticle());
			String localCreateTime = DateFormatUtil.dateToString(blogArticleVo.getCreattime(), DateFormatUtil.DEFAULT_SHOW_ART_TIME);
			dataMap.put("createTimeShow", localCreateTime);
			dataMap.put("title", blogArticleVo.getTitle());
			dataMap.put("summary", blogArticleVo.getSummary());
			dataMap.put("showArticle", showArticle);
		}
		return "prev_article";
	}


}
