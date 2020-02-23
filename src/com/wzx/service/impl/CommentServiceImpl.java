package com.wzx.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wzx.mapper.CommentMapper;
import com.wzx.pojo.Comment;
import com.wzx.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService{

	@Resource
	private CommentMapper commentMapper;
	
	@Override
	public List<Comment> selByTime1(Comment comment) {
		return commentMapper.selByTime1(comment);
	}
	
	@Override
	public List<Comment> selByTime2(Comment comment) {
		return commentMapper.selByTime2(comment);
	}
	
	@Override
	public List<Comment> selByHot(Comment comment) {
		return commentMapper.selByHot(comment);
	}

	@Override
	public int addComment(Comment comment) {
		return commentMapper.insComment(comment);
	}

	@Override
	public int delComment(Comment comment) {
		return commentMapper.delComment(comment);
	}

}
