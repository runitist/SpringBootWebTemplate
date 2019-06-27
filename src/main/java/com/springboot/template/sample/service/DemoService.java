package com.springboot.template.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.template.sample.dao.DemoDao;

@Service
public class DemoService {
	
	@Autowired
	private DemoDao dao;
	
	public String getDual() throws Exception {
		return dao.getDual();
	}

}
