package com.wzx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wzx.pojo.Video;

public interface VideoMapper {
	
	@Select("select id,videotitle,videoimg,videotime from video")
	List<Video> selAll();
	
	@Select("select * from video where id=#{id}")
	List<Video> selOne(Video video);
}
