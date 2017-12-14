package com.demo.util;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.util.HtmlUtils;

/**
 * Created by yzy on 2017/4/26.
 * email: mia5121@163.com
 */
public class HtmlUtil {
	//校验html
	public final static String escapeHtml(String content) {
		if (StringUtils.isBlank(content)) {
			return "";
		}
//		content = content.replace("<", "&#60;");
//		content = content.replace(">", "&#62;");
//		content = content.replace("\"", "&#34;");
//		content = content.replace("'", "&#39;");
//		content = content.replaceAll("&(?![\\w#]+;|#\\d+)", "&#38;");
		content = HtmlUtils.htmlEscape(content);
		return content;
	}


}
