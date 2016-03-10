package com.mingge.common;

import java.util.Date;

import javax.persistence.Column;

public class BaseModel {
	@Column(name="createtm")
	private Date createTm;
	@Column(name="updateTm")
	private Date updateTm;
	private String createUser;
	private String updateUser;
	public Date getCreateTm() {
		return createTm;
	}
	public void setCreateTm(Date createTm) {
		this.createTm = createTm;
	}
	public Date getUpdateTm() {
		return updateTm;
	}
	public void setUpdateTm(Date updateTm) {
		this.updateTm = updateTm;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
}
