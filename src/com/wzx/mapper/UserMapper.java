package com.wzx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wzx.pojo.User;

public interface UserMapper {
	@Select("select * from user where username=#{username} and password=#{password}")
	List<User> selByUser(User user);
	
	@Insert("insert into user(username,password,age) values(#{username},#{password},#{age})")
	int insUser(User user);
	
	@Select("select * from user where username=#{username}")
	List<User> selByUserName(User user);
	
	@Update("update user set password=#{password} , age=#{age} where username=#{username}")
	int updataUser(User user);
	
	@Select("select * from user where username=#{username}")
	List<User> selByUser2(User user);
	
}
