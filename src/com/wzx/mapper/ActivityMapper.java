package com.wzx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wzx.pojo.Activity;

public interface ActivityMapper {
	
	@Select("select id,activitytitle,activitylocal,activitytime,activitystate from activity")
	List<Activity> selAll();
	
	@Select("select * from activity where id=#{id}")
	List<Activity> selById(Activity activity);
}
