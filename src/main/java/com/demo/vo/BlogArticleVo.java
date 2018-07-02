package com.demo.vo;

import com.demo.api.en.ArticleType;
import com.demo.api.po.BlogArticle;
import com.demo.util.DateFormatUtil;
import com.demo.util.EncryptUtil;

/**
 * Created by yezhangyuan on 2017-12-14.
 *
 * @author yezhangyuan
 */
public class BlogArticleVo extends BlogArticle {

	public String getEncryptId(){
		//id 用des加密,并防止加号请求时候变空格
		return EncryptUtil.encryptDes(getId().toString()).replaceAll("\\+","%2B");
	}

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
