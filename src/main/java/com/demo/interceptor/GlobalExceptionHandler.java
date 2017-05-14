package com.demo.interceptor;

import com.demo.api.en.StatusInfo;
import com.demo.api.ex.BusinessException;
import com.demo.vo.ResponseEntity;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yzy on 2017/4/28.
 * email: mia5121@163.com
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger LOGGER = Logger.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public ResponseEntity<Void> handle(Exception ex) {
		LOGGER.error("", ex);
		ResponseEntity entity = new ResponseEntity();
		if (ex instanceof BusinessException) {
			entity.setCode(((BusinessException) ex).getErrorCode());
			entity.setMessage(((BusinessException) ex).getMessage());
		} else {
			entity.setCode(StatusInfo.REQUEST_FAILURE);
			entity.setMessage(StatusInfo.REQUEST_FAILURE_MSG);
		}
		return entity;
	}

}
