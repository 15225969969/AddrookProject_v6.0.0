package com.whackon.base.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

/**
 * <b>系统分页视图信息</b>
 *
 * @author user
 * @date 2021/12/17
 * @since 1.0.0
 * @version 6.0.0
 */
@ApiModel(value = "系统分页视图信息")
public class PageVO<E extends BaseVO> implements Serializable {
	private static final long serialVersionUID = -2817165863999247924L;
	@ApiModelProperty(value = "当前页码")
	private Integer pageNum;                        // 当前页码
	@ApiModelProperty(value = "每页显示数量")
	private Integer pageSize;                       // 每页显示数量
	@ApiModelProperty(value = "分页列表")
	private List<E> list;                           // 分页列表
	@ApiModelProperty(value = "总条数")
	private Long totalSize;                         // 总条数
	@ApiModelProperty(value = "总页数")
	private Long totalPages;                        // 总页数

	public PageVO() {}

	public PageVO(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = 1;
		}

		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = 10;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}

	public Long getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
}
