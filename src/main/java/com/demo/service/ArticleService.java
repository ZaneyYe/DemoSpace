package com.demo.service;

import com.demo.vo.BlogArticleVo;

import java.util.List;

/**
 * Created by yezhangyuan on 2017-12-14.
 *
 * @author yezhangyuan
 */
public interface ArticleService {
	/**
	 * 首页显示几篇文章
	 * @param start
	 * @param limit
	 * @return
	 */
	List<BlogArticleVo> queryShowFour(Integer start,Integer limit);

	/**
	 * 根据博客id查询博客文章
	 * @param blogId
	 * @return
	 */
	BlogArticleVo queryArticle(Integer blogId);


}
