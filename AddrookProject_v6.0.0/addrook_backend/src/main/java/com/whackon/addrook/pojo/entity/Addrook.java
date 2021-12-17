package com.whackon.addrook.pojo.entity;

import com.whackon.base.pojo.entity.BaseEntity;

/**
 * <b>个人通讯录系统 - 通讯录实体信息</b>
 *
 * @author user
 * @date 2021/12/17
 * @version 6.0.0
 */
public class Addrook extends BaseEntity {
	private static final long serialVersionUID = -9122237176216013201L;
	private Long id;                        // 主键
	private String name;                    // 姓名
	private String cellphone;               // 手机号码
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
