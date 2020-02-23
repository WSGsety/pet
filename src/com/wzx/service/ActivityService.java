package com.wzx.service;

import java.util.List;


import com.wzx.pojo.Activity;

public interface ActivityService {
	
	List<Activity> showAll();
	
	List<Activity> showOne(Activity activity);
	
}
