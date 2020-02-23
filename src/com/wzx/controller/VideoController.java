package com.wzx.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wzx.pojo.Video;
import com.wzx.service.VideoService;

@Controller
@RequestMapping("video")
public class VideoController {

	@Resource
	private VideoService videoServiceImpl;
	
	@RequestMapping("showall")
	@ResponseBody
	public MappingJacksonValue show(String callback){
		List<Video> list = videoServiceImpl.showAll();
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}
	
	@RequestMapping("showone")
	@ResponseBody
	public MappingJacksonValue show1(Video video,String callback){
		List<Video> list = videoServiceImpl.showOne(video);
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}
}
