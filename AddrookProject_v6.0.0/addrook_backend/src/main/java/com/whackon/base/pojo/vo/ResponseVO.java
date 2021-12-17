package com.whackon.base.pojo.vo;

import com.whackon.base.pojo.enums.ResponseCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <b>系统响应视图信息</b>
 *
 * @author user
 * @date 2021/12/16
 * @since 1.0.0
 * @version 6.0.0
 */
@ApiModel("系统响应视图信息")
public class ResponseVO implements Serializable {
	private static final long serialVersionUID = 1786475614631586136L;
	@ApiModelProperty(value = "系统响应编码")
	private Integer code;                       // 系统响应编码
	@ApiModelProperty(value = "系统响应信息")
	private String message;                     // 系统响应信息
	@ApiModelProperty(value = "系统响应数据")
	private Object data;                        // 系统响应数据

	public ResponseVO(ResponseCode responseCode, String message, Object data){
		this.code = responseCode.getCode();
		this.message = message;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	/**
	 * <b>获得系统业务逻辑处理完毕，系统响应成功视图信息</b>
	 * @return
	 */
	public static ResponseVO successResponseVO() {
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS, ResponseCode.RESPONSE_SUCCESS.getRemark(), "");
	}

	/**
	 * <b>获得系统业务逻辑处理完毕，系统响应成功视图信息</b>
	 * @param message
	 * @return
	 */
	public static ResponseVO successResponseVO(String message) {
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS, message, "");
	}

	/**
	 * <b>获得获得系统业务逻辑处理完毕，系统响应成功视图信息</b>
	 * @param message
	 * @param data
	 * @return
	 */
	public static ResponseVO successResponseVO(String message, Object data) {
		return new ResponseVO(ResponseCode.RESPONSE_SUCCESS, message, data);
	}

	/**
	 * <b>获得未认证用户视图信息</b>
	 * @return
	 */
	public static ResponseVO unAuthResponseVO() {
		return new ResponseVO(ResponseCode.RESPONSE_UNAUTH, ResponseCode.RESPONSE_UNAUTH.getRemark(), "");
	}

	/**
	 * <b>获得系统业务逻辑处理错误视图信息</b>
	 * @param errorMessage
	 * @return
	 */
	public static ResponseVO errorResponseVO(String errorMessage) {
		return new ResponseVO(ResponseCode.RESPONSE_ERROR, errorMessage, "");
	}

	/**
	 * <b>获得系统处理响应异常视图信息</b>
	 * @param e
	 * @return
	 */
	public static ResponseVO exceptionResponseVO(Exception e) {
		return new ResponseVO(ResponseCode.RESPONSE_EXCEPTION, e.getMessage(), "");
	}
}
