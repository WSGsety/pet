package com.wzx.service;

import java.util.List;

import com.wzx.pojo.User;

public interface UserService {
	
	List<User> login(User user);
	
	int register(User user);
	
	List<User> showInfo(User user);
	
	int editByUser(User user);
	
	List<User> checkUser(User user);
}
