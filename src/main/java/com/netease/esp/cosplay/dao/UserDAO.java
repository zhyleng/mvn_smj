package com.netease.esp.cosplay.dao;

import org.springframework.dao.DataAccessException;

import com.netease.esp.cosplay.model.User;


public interface UserDAO {
	int insert(User user) throws DataAccessException;
}
