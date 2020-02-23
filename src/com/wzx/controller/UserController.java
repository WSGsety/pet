package com.wzx.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wzx.pojo.User;
import com.wzx.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

	@Resource
	private UserService userServiceImpl;

	@RequestMapping("login")
	@ResponseBody
	public MappingJacksonValue show(User user, String callback) {
		List<User> list = userServiceImpl.login(user);
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}

	@RequestMapping("register")
	@ResponseBody
	public String show2(User user, String callback) {
		List<User> checkUser = userServiceImpl.checkUser(user);
//		if(checkUser.size()==0) {
//			int result = userServiceImpl.register(user);
//			return callback + "([{\"code\":" + result + "}])";
			return callback + "([{\"code\":" + "哈哈哈" + "}])";
//		}else {
//			return callback + "([{\"code\": 0 }])";
//		}
	}

	@RequestMapping("info")
	@ResponseBody
	public MappingJacksonValue show3(User user, String callback) {
		List<User> list = userServiceImpl.showInfo(user);
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}

	@RequestMapping("edit")
	@ResponseBody
	public String show4(User user, String callback) {
		int result = userServiceImpl.editByUser(user);
		return callback + "([{\"code\":" + result + "}])";
	}
}
