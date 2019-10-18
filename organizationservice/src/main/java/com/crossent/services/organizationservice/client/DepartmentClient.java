package com.crossent.services.organizationservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.crossent.services.organizationservice.model.Department;

import java.util.List;

@FeignClient(name = "department")
public interface DepartmentClient {

	@GetMapping("/helloWorld")
	public String helloWorld();

	@GetMapping(path = "/{name}/{test}")
	public String testInsert(@PathVariable("name") String name,@PathVariable("test") String test);
	
}
