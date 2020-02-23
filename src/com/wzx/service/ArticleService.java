package com.wzx.service;

import java.util.List;

import com.wzx.pojo.Article;
import com.wzx.pojo.ShowPage;
import com.wzx.pojo.User;

public interface ArticleService {
	
	List<Article> showAll();
	List<Article> showFour();
	List<Article> showOne(Article article);
	List<Article> showByName(User user);
	ShowPage show(int page, int rows);
}
