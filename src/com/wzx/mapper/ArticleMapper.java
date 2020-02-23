package com.wzx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import com.wzx.pojo.Article;
import com.wzx.pojo.User;

public interface ArticleMapper {
	
	@Select("select * from article order by id desc")
	List<Article> selAll();
	
	@Select("select * from article order by id desc limit 0,4")
	List<Article> selFour();
	
	@Select("select * from article where id = #{id}")
	List<Article> selById(Article article);
	
	@Select("select * from article where username = #{username}")
	List<Article> selByUserName(User user);
	
	@Delete("delete from article where id=#{id}")
	int delArticle(Article article);
	
}
