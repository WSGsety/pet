package com.wzx.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wzx.pojo.Lunbo;
import com.wzx.service.LunboService;

@Controller
@RequestMapping("lunbo")
public class LunboController {
	
	@Resource
	private LunboService lunboServiceImpl;
	
	@RequestMapping("show")
	@ResponseBody
	public MappingJacksonValue show(String callback){
		List<Lunbo> list = lunboServiceImpl.show();
		MappingJacksonValue mjv = new MappingJacksonValue(list);
		mjv.setJsonpFunction(callback);
		return mjv;
	}
}
