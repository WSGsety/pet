package com.wzx.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wzx.mapper.LunboMapper;
import com.wzx.pojo.Lunbo;
import com.wzx.service.LunboService;

@Service
public class LunboServiceImpl implements LunboService{

	@Resource
	private LunboMapper lunboMapper;

	@Override
	public List<Lunbo> show() {
		return lunboMapper.selByLunbo();
	}
	
	

}
