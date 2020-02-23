package com.wzx.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wzx.pojo.Comment;
import com.wzx.service.ArticleService;
import com.wzx.service.CommentService;

@Controller
@RequestMapping("comment")
public class CommentController {

	@Resource
	private CommentService commentServiceImpl;
	
	@Resource
	private ArticleService articleServiceImpl;

	// 最新
	@RequestMapping("showtime1")
	@ResponseBody
	public MappingJacksonValue show(Comment comment, String callback) {
		List<Comment> list = commentServiceImpl.selByTime1(comment);
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}

	// 最早
	@RequestMapping("showtime2")
	@ResponseBody
	public MappingJacksonValue show2(Comment comment, String callback) {
		List<Comment> list = commentServiceImpl.selByTime2(comment);
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}

	// 人气
	@RequestMapping("showhot")
	@ResponseBody
	public MappingJacksonValue show3(Comment comment, String callback) {
		List<Comment> list = commentServiceImpl.selByHot(comment);
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}

	@RequestMapping("add")
	@ResponseBody
	public String add(Comment comment, String callback) {
		int result = commentServiceImpl.addComment(comment);
		return callback + "([{\"code\":" + result + "}])";
	}

	@RequestMapping("del")
	@ResponseBody
	public String del(Comment comment, String callback) {
		int result = commentServiceImpl.delComment(comment);
		return callback + "([{\"code\":" + result + "}])";
	}
}
