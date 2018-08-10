package com.web.backend.exception;

/**
 * 业务异常基类
 * 
 * @author franp
 */
public class BussinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	private String errorCode;
	private boolean isPageRequest;
	
	/**
	 * 默认为数据请求，错误码为 9999
	 * 
	 * @param message -- 错误信息
	 * @param cause -- 异常对象
	 */
	public BussinessException (String message) {
		this(false, message, "9999", null);
    }
	
	/**
	 * 默认为数据请求，错误码为 9999
	 * 
	 * @param message -- 错误信息
	 * @param cause -- 异常对象
	 */
	public BussinessException (String message, Throwable cause) {
		this(false, message, "9999", cause);
    }
	
	/**
	 * 自定义错误码的异常，默认为数据请求
	 * 
	 * @param message -- 错误信息
	 * @param errorCode -- 错误码
	 * @param cause -- 异常对象
	 */
	public BussinessException (String message, String errorCode, Throwable cause) {
        this(false, message, "9999", cause);
    }
	
	/**
	 * 自定义请求类型（数据还是页面），错误码为 9999 的异常
	 * 
	 * @param isPageRequest -- 是否是页面请求
	 * @param message -- 错误信息
	 * @param cause -- 异常对象
	 */
	public BussinessException (boolean isPageRequest, String message, Throwable cause) {
        this(isPageRequest, message, "9999", cause);
    }
	
	/**
	 * 自定义错误码，自定义请求类型的异常对象
	 * 
	 * @param isPageRequest -- 是否是页面请求
	 * @param message -- 错误信息
	 * @param errorCode -- 错误码
	 * @param cause -- 异常对象
	 */
	public BussinessException (boolean isPageRequest, String message, String errorCode, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
        this.isPageRequest = isPageRequest;
    }

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public boolean isPageRequest() {
		return isPageRequest;
	}

	public void setPageRequest(boolean isPageRequest) {
		this.isPageRequest = isPageRequest;
	}
}
