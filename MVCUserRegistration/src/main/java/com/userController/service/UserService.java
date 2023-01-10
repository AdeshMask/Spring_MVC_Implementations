package com.userController.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userController.dao.UserDao;
import com.userController.entity.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public int createUser(User user) {
		Integer id =(Integer) this.userDao.saveUser(user);
		return id;
	}
}
