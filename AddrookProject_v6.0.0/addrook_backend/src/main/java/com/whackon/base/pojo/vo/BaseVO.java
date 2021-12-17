package com.whackon.base.pojo.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>基础视图信息</b>
 *
 * @author user
 * @date 2021/12/16
 * @since 1.0.0
 * @version 6.0.0
 */
public class BaseVO implements Serializable {
	private static final long serialVersionUID = 5927967554557750239L;
	@ApiModelProperty(value = "系统状态：0-禁用，1-启用")
	private String status;                      // 系统状态：0-禁用，1-启用
	@ApiModelProperty(value = "创建时间")
	private Date createTime;                    // 创建时间
	@ApiModelProperty(value = "修改时间")
	private Date modifiedTime;                  // 修改时间

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
