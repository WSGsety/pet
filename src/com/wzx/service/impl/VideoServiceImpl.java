package com.wzx.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wzx.mapper.VideoMapper;
import com.wzx.pojo.Video;
import com.wzx.service.VideoService;

@Service
public class VideoServiceImpl implements VideoService{

	@Resource
	private VideoMapper videoMapper;
	
	@Override
	public List<Video> showAll() {
		return videoMapper.selAll();
	}

	@Override
	public List<Video> showOne(Video video) {
		return videoMapper.selOne(video);
	}

}
