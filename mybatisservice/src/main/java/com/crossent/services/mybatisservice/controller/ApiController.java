package com.crossent.services.mybatisservice.controller;

import com.crossent.services.mybatisservice.ApiDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

	@GetMapping(path = "/{id}")
	public String test(@PathVariable("id") String id) {
		LOGGER.info("test");
		return String.format("%s %s", id, LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}

}