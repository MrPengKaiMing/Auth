package com.mingge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mingge.dao.UserDao;
import com.mingge.sys.auth.model.User;

@Service
public class UserService implements IUserService{
	@Autowired
private UserDao<User> userDao;

	public User reg(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> combobox(String q) {
		// TODO Auto-generated method stub
		return null;
	}

	public User add(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User edit(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public void del(String ids) {
		// TODO Auto-generated method stub
		
	}

	public void editUsersRole(String userIds, String roleId) {
		// TODO Auto-generated method stub
		
	}

	public User getUserInfo(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public User editUserInfo(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> findAll() {
		String hql="from t_user";
		return userDao.findAll(hql);
	}
    


}
