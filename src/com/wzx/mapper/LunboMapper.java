package com.wzx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wzx.pojo.Lunbo;

public interface LunboMapper {
	
	@Select("select * from lunbo_img")
	List<Lunbo> selByLunbo();
}
