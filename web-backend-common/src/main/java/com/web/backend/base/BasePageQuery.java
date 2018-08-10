/**
 * 2018年7月30日 created by franp
 */
package com.web.backend.base;

/**
 * @author {AB052634/康培亮}
 *
 */
public class BasePageQuery extends BaseQuery {

	private static final long serialVersionUID = 1L;

	protected int pageNum; // 页码
	protected int pageSize;// 页面尺寸

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}