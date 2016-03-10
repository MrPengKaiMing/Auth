package com.mingge.service;

import java.util.List;

import com.mingge.sys.auth.model.User;


public interface IUserService {
	public User reg(User user);

	/**
	 * 用户登录
	 * 
	 * @param user
	 *            用户信息
	 * @return User
	 */
	public User login(User user);

	public List<User> findAll();
	//public EasyuiDataGridJson datagrid(EasyuiDataGrid dg, User user);

	public List<User> combobox(String q);

	public User add(User user);

	public User edit(User user);

	public void del(String ids);

	public void editUsersRole(String userIds, String roleId);

	public User getUserInfo(User user);

	public User editUserInfo(User user);
}
