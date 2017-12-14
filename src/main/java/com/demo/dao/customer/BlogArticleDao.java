package com.demo.dao.customer;

import com.demo.api.po.BlogArticle;
import com.demo.dao.mbg.BlogArticleMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by yezhangyuan on 2017-12-14.
 *
 * @author yezhangyuan
 */
public interface BlogArticleDao extends BlogArticleMapper {
	/**
	 * 查询首页文章
	 * @param start
	 * @param limit
	 * @return
	 */
	List<BlogArticle> queryShowBlogs(@Param("start") Integer start, @Param("limit") Integer limit);


}
