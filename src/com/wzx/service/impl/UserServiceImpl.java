package com.wzx.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wzx.mapper.UserMapper;
import com.wzx.pojo.User;
import com.wzx.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Resource
	private UserMapper userMapper;

	@Override
	public List<User> login(User user) {
		return userMapper.selByUser(user);
	}

	@Override
	public int register(User user) {
		return userMapper.insUser(user);
	}

	@Override
	public List<User> showInfo(User user) {
		return userMapper.selByUserName(user);
	}

	@Override
	public int editByUser(User user) {
		return userMapper.updataUser(user);
	}

	@Override
	public List<User> checkUser(User user) {
		return userMapper.selByUser2(user);
	}

}
