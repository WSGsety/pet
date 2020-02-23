package com.wzx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.wzx.pojo.Comment;

public interface CommentMapper {
	
	
	//最新
	@Select("select * from comment where articleid=#{articleid} order by id desc limit 0,5")
	List<Comment> selByTime1(Comment comment);
	
	//最早
	@Select("select * from comment where articleid=#{articleid} order by id limit 0,5")
	List<Comment> selByTime2(Comment comment);
	
	//最火
	@Select("select * from comment where articleid=#{articleid} order by hot desc limit 0,5")
	List<Comment> selByHot(Comment comment);
	
	@Insert("insert into comment(articleid,comment,username,photo) values(#{articleid},#{comment},#{username},#{photo})")
	int insComment(Comment comment);
	
	@Delete("delete from comment where id=#{id}")
	int delComment(Comment comment);
}
