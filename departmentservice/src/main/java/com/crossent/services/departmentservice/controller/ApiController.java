package com.crossent.services.departmentservice.controller;

import com.crossent.services.departmentservice.ApiDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ApiController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ApiController.class);

	@Autowired
	private ApiDao apiDao;

	@GetMapping("/")
	public String get() {
		LOGGER.info("mybatis find");
		return String.format("%s",  LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}

	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		LOGGER.info("helloWorld");
		return String.format("%s %s", apiDao.selectName(), LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}

	@GetMapping(path = "/{name}/{test}")
	public String testInsert(@PathVariable("name") String name,@PathVariable("test") String test) {
		LOGGER.info("test");
		Map<String, String> requstMap = new HashMap<String,String>();
		requstMap.put("name",name);
		requstMap.put("test",test);
		return String.format("%s %s", apiDao.insertName(requstMap), LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}

}