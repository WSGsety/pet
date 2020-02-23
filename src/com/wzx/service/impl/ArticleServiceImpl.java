package com.wzx.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wzx.mapper.ArticleMapper;
import com.wzx.pojo.Article;
import com.wzx.pojo.ShowPage;
import com.wzx.pojo.User;
import com.wzx.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	@Resource
	private ArticleMapper articleMapper;

	@Override
	public List<Article> showAll() {
		return articleMapper.selAll();
	}
	
	@Override
	public List<Article> showFour() {
		return articleMapper.selFour();
	}

	@Override
	public List<Article> showOne(Article article) {
		return articleMapper.selById(article);
	}

	@Override
	public List<Article> showByName(User user) {
		return articleMapper.selByUserName(user);
	}
	
	@Override
	public ShowPage show(int page, int rows) {
		PageHelper.startPage(page, rows);
		// 查询全部
		List<Article> list = articleMapper.selAll();
		//分页代码
		PageInfo<Article> pi = new PageInfo<>(list);
		
		ShowPage dataGrid = new ShowPage();
		dataGrid.setRows(pi.getList());
		dataGrid.setTotal(pi.getTotal());
		
		return dataGrid;
	}

}
