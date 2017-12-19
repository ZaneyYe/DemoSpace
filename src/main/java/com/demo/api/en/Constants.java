package com.demo.api.en;

import com.demo.util.ConfigUtil;

/**
 * Created by yzy on 2017/08/14 上午 10:11.
 * email: mia5121@163.com
 */
public interface Constants {

	String uploadBasePath = "http://192.168.43.3:80/var/www/html/image/";

	String localShowPath = ConfigUtil.getConfigValue("localShowPath");

	String localUploadPath = ConfigUtil.getConfigValue("localUploadPath");

	String REDIS_ARTICLE_KEY = "article_detail_";

}
