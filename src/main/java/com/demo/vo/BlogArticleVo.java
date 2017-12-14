package com.demo.vo;

import com.demo.api.en.ArticleType;
import com.demo.api.po.BlogArticle;
import com.demo.util.DateFormatUtil;

/**
 * Created by yezhangyuan on 2017-12-14.
 *
 * @author yezhangyuan
 */
public class BlogArticleVo extends BlogArticle {

	/**
	 * 返回类型名称
	 *
	 * @return
	 */
	public String getArticleTypeName() {
		if (getArticleType() == null) {
			return "";
		}
		return ArticleType.getTypeByid(getArticleType()).getName();
	}

	/**
	 * 返回创建时间
	 *
	 * @return
	 */
	public String getCreatTimeStr() {
		if (getCreattime() == null) {
			return "";
		}
		return DateFormatUtil.dateToString(getCreattime(), DateFormatUtil.DEFAULT_DATE_VIEW_DETAIL);
	}


}
