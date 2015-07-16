package com.netease.esp.cosplay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.netease.esp.cosplay.dao.UserDAO;
import com.netease.esp.cosplay.model.User;
import com.netease.esp.cosplay.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	public User selectUserByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
