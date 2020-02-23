package com.wzx.service;

import java.util.List;

import com.wzx.pojo.Comment;

public interface CommentService {
	List<Comment> selByTime1(Comment comment);
	List<Comment> selByTime2(Comment comment);
	List<Comment> selByHot(Comment comment);
	
	int addComment(Comment comment);
	
	int delComment(Comment comment);
}
