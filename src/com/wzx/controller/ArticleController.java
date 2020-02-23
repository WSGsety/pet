package com.wzx.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wzx.pojo.Article;
import com.wzx.pojo.User;
import com.wzx.service.ArticleService;

@Controller
@RequestMapping("article")
public class ArticleController {

	
	@Resource
	private ArticleService articleServiceImpl;
	
	@RequestMapping("show")
	@ResponseBody
	public MappingJacksonValue show(String callback){
		List<Article> list = articleServiceImpl.showFour();
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}
	
	@RequestMapping("showone")
	@ResponseBody
	public MappingJacksonValue show1(Article article,String callback){
		List<Article> list = articleServiceImpl.showOne(article);
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}
	
	@RequestMapping("show2")
	@ResponseBody
	public MappingJacksonValue show2(User user,String callback){
		List<Article> list = articleServiceImpl.showByName(user);
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}
	
//	@RequestMapping("list/showall")
//	@ResponseBody
//	public MappingJacksonValue show3(String callback){
//		List<Article> list = articleServiceImpl.showAll();
//		MappingJacksonValue mjv = new MappingJacksonValue(list);
//		mjv.setJsonpFunction(callback);
//		return mjv;
//	}
	
	@RequestMapping("showpage")
	@ResponseBody
	public MappingJacksonValue show4(int page,int rows,String callback){
		MappingJacksonValue mjv = new MappingJacksonValue(articleServiceImpl.show(page, rows));
		mjv.setJsonpFunction(callback);
		return mjv;
	}
}
