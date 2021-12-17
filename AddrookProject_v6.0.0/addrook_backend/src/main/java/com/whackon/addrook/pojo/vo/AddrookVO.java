package com.whackon.addrook.pojo.vo;

import com.whackon.base.pojo.vo.BaseVO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * <b>个人通讯录系统 - 通讯录视图信息</b>
 *
 * @author user
 * @date 2021/12/17
 * @version 6.0.0
 */
@ApiModel(value = "个人通讯录系统 - 通讯录视图信息")
public class AddrookVO extends BaseVO {
	private static final long serialVersionUID = -2795498966812471626L;
	@ApiModelProperty(value = "主键")
	private Long id;                        // 主键
	@ApiModelProperty(value = "姓名")
	@NotNull(message = "未填写姓名")
	private String name;                    // 姓名
	@ApiModelProperty(value = "手机号码")
	@NotNull(message = "未填写手机号码")
	@Pattern(regexp = "1[0-9]{10}", message = "手机号码格式错误")
	private String cellphone;               // 手机号码
	@ApiModelProperty(value = "联系地址")
	private String address;                 // 联系地址
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
