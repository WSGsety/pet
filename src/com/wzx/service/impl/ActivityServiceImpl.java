package com.wzx.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wzx.mapper.ActivityMapper;
import com.wzx.pojo.Activity;
import com.wzx.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService{
	
	@Resource
	private ActivityMapper activityMapper;

	@Override
	public List<Activity> showAll() {
		return activityMapper.selAll();
	}

	@Override
	public List<Activity> showOne(Activity activity) {
		return activityMapper.selById(activity);
	}
	
	


}
