package com.crossent.services.mybatisservice.controller;

import com.crossent.services.mybatisservice.ApiDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@RestController
public class ApiController {
	@Autowired
	private ApiDao apiDao;

	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		return String.format("%s %s", apiDao.selectName(), LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
	}
}