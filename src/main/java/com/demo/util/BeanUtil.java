package com.demo.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by yzy on 2017/6/17.
 * email: mia5121@163.com
 */
@Configuration
public class BeanUtil {

	@Bean
	public ThreadPoolExecutor newThreadPoolExcutor() {
		return new ThreadPoolExecutor(16, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
	}


}
