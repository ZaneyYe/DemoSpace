package com.demo.service;

import com.demo.api.en.Constants;
import com.demo.api.po.BlogArticle;
import com.demo.dao.customer.BlogArticleDao;
import com.demo.proxy.JedisProxy;
import com.demo.util.ConvertUtils;
import com.demo.vo.BlogArticleVo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by yezhangyuan on 2017-12-14.
 *
 * @author yezhangyuan
 */
@Service
public class ArticleServiceImpl implements ArticleService {

	private static final Logger LOGGER = LoggerFactory.getLogger(ArticleServiceImpl.class);

	@Autowired
	private BlogArticleDao articleDao;

	@Autowired
	private JedisProxy jedisProxy;

	@Autowired
	private ObjectMapper objectMapper;

	@Override
	public List<BlogArticleVo> queryShowFour(Integer start, Integer limit) {
		if(start == null || limit == null){
			LOGGER.warn("queryShowBlogs args is null");
			return null;
		}
		List<BlogArticle> articleList = articleDao.queryShowBlogs(start,limit);
		if(CollectionUtils.isNotEmpty(articleList)){
			List<BlogArticleVo> articleVoList = ConvertUtils.copyPropertiesList(BlogArticleVo.class, articleList);
			return  articleVoList;
		}
		return null;
	}

	@Override
	public BlogArticleVo queryArticle(Integer blogId) {
		BlogArticle blogArticle = null;
		String article = jedisProxy.get(Constants.REDIS_ARTICLE_KEY + blogId);
		if (StringUtils.isNotBlank(article)) {
			try {
				blogArticle = objectMapper.readValue(article, BlogArticle.class);
			} catch (IOException e) {
				LOGGER.error("object mapper read occur error", e);
			}
		} else {
			blogArticle = articleDao.selectByPrimaryKey(Integer.valueOf(blogId));
			try {
				String jsonBlog = objectMapper.writeValueAsString(blogArticle);
				jedisProxy.set(Constants.REDIS_ARTICLE_KEY + blogId, jsonBlog);
			} catch (JsonProcessingException e) {
				LOGGER.error("object mapper write occur error", e);
			}
		}
		BlogArticleVo blogArticleVo = ConvertUtils.convertObject(blogArticle, BlogArticleVo.class);
		return blogArticleVo;
	}


}
