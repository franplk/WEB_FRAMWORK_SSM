package com.web.backend.exception;

/**
 * 服务器异常类
 * 
 * @author franp
 */
public class ServerException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	private boolean isPageRequest;
	
	/**
	 * 服务器异常，默认为数据请求异常
	 * 
	 * @param cause -- 异常
	 */
	public ServerException (Throwable cause) {
        this(false, cause);
    }
	
	/**
	 * 服务器异常
	 * 
	 * @param isPageRequest -- 是否页面请求
	 * @param cause -- 异常
	 */
	public ServerException (boolean isPageRequest, Throwable cause) {
        super("服务器异常，请稍后再试", cause);
        this.isPageRequest = isPageRequest;
    }
	
	public boolean isPageRequest() {
		return isPageRequest;
	}

	public void setPageRequest(boolean isPageRequest) {
		this.isPageRequest = isPageRequest;
	}
}
