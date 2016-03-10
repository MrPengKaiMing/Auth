package com.mingge.sys.auth.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.mingge.common.BaseModel;

/**
 * 用户主体
 * @author Mr.Peng
 *
 */

@Entity(name="t_user")
public class User extends BaseModel implements Principal{
	private final static String PRINCIPAL_TYPE="user";
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	@Column(name="nickname")
	private String nickName;
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;
	@Column(name="status")
	private Integer status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	
}
