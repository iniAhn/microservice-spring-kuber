package com.crossent.services.organizationservice.controller;

import com.crossent.services.organizationservice.client.DepartmentClient;
import com.crossent.services.organizationservice.client.EmployeeClient;
import com.crossent.services.organizationservice.model.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrganizationController {

	private static final Logger LOGGER = LoggerFactory.getLogger(OrganizationController.class);

	@Autowired
	DepartmentClient departmentClient;
	@Autowired
	EmployeeClient employeeClient;
	

	@GetMapping("/{id}/department")
	public String findByIdWithDepartments(@PathVariable("id") String id) {
		LOGGER.info("Organization find: id={}", id);
		return departmentClient.helloWorld();
	}
	

	@GetMapping("/{id}/with-employees")
	public List<Employee> findByIdWithEmployees(@PathVariable("id") String id) {
		LOGGER.info("Organization find: id={}", id);
		return employeeClient.findByOrganization(id);
	}
	
}
