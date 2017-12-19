package com.demo.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.log4j.Logger;

/**
 * Created by yzy on 2017/5/15.
 * email: mia5121@163.com
 * 记录方法运行时间
 */
public class TimeLogInterceptor implements MethodInterceptor {

	//日志记录器
	private static final Logger LOGGER = Logger.getLogger(TimeLogInterceptor.class);

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		//记录开始时间
		Long begin = System.currentTimeMillis();
		//执行目标方法
		Object result = invocation.proceed();
		//记录结束时间
		Long end = System.currentTimeMillis();
		//Log记录
		LOGGER.info(invocation.getMethod().getName() + "方法执行时间：" + (end - begin) + "毫秒");
		return result;
	}

}
