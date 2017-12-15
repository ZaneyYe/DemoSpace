package com.demo.interceptor;

import org.aopalliance.intercept.Joinpoint;
import org.apache.log4j.Logger;

/**
 * Created by yzy on 2017/5/15.
 * email: mia5121@163.com
 */
public class ExceptionLogAspect {

	private static final Logger LOGGER = Logger.getLogger(ExceptionLogAspect.class);

	//异常通知
	public void afterThrowing(Joinpoint joinPoint, Throwable ex) {
		//记录异常
		LOGGER.error(joinPoint.toString() + "方法发生异常" + ex.getClass().getName(), ex);
	}
}
