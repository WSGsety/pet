package com.wzx.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wzx.pojo.Activity;
import com.wzx.service.ActivityService;

@Controller
@RequestMapping("activity")
public class ActivityController {

	@Resource
	private ActivityService activityServiceImpl;
	
	@RequestMapping("showall")
	@ResponseBody
	public MappingJacksonValue show(String callback){
		List<Activity> list = activityServiceImpl.showAll();
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}
	
	@RequestMapping("showone")
	@ResponseBody
	public MappingJacksonValue show2(Activity activity,String callback){
		List<Activity> list = activityServiceImpl.showOne(activity);
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}
}
