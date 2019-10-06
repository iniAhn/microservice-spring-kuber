package com.crossent.services.departmentservice.service;

import com.crossent.services.departmentservice.client.EmployeeClient;
import com.crossent.services.departmentservice.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

	private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentService.class);

	@Autowired
	DepartmentRepository repository;
	@Autowired
	EmployeeClient employeeClient;

	public void getTest(){

	}


}