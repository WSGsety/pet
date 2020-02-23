package com.wzx.service;

import java.util.List;

import com.wzx.pojo.Video;

public interface VideoService {

	List<Video> showAll();
	
	List<Video> showOne(Video video);
}
