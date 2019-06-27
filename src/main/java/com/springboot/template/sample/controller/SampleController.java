package com.springboot.template.sample.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.template.sample.dao.SampleDataSourceDAOTest;

@RestController
@RequestMapping("/test")
public class SampleController {
	@Autowired
	SampleDataSourceDAOTest smd;

	@RequestMapping("/datasourcetest")
	public List<Map<String, ?>> getMessages() {
		return smd.selectAll();
	}
}
