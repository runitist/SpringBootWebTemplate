package com.springboot.template.sample.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.template.sample.dao.SampleDataSourceDAOTest;
import com.springboot.template.sample.service.DemoService;

@RestController
@RequestMapping("/test")
public class SampleController {
	@Autowired
	private SampleDataSourceDAOTest smd;
	@Autowired
	private DemoService service;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@RequestMapping("/datasourcetest")
	public List<Map<String, ?>> getMessages() {
		//Plain Datasource Test
		logger.info("datasourcetest 시작");
		return smd.selectAll();
	}
	
	@RequestMapping("/mybatistest")
	public String mybatisTest() throws Exception {
		//MybatisTest
		logger.info("mybatisTest 시작");
		return service.getDual();
	}
	
}
