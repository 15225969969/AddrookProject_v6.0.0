package com.whackon.base.exception;

import com.whackon.base.pojo.vo.ResponseVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * <b>系统全局异常信息处理类</b>
 * @author user
 * @date 2021/12/16
 * @since 1.0.0
 * @version 6.0.0
 */
@RestControllerAdvice("globalExceptionHandler")
public class GlobalExceptionHandler {
	// 当出现异常时，需要记录日志，那么创建 Logback 日志对象
	private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


	/**
	 * <b>全局异常处理</b>
	 * @param request
	 * @param response
	 * @param e
	 * @return
	 */
	public ResponseVO globalException(HttpServletRequest request, HttpServletResponse response, Exception e) {
		// 将错误信息记录到日志中
		logger.error(e.getMessage() + " : " + new Date(), e);
		// 产生异常视图信息返回给前端
		return ResponseVO.exceptionResponseVO(e);
	}
}
