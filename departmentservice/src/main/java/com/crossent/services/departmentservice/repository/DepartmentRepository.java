package com.crossent.services.departmentservice.repository;

import org.springframework.data.repository.CrudRepository;
import com.crossent.services.departmentservice.model.Department;

import java.util.List;

public interface DepartmentRepository extends CrudRepository<Department, String> {

	List<Department> findByOrganizationId(Long organizationId);
	
}
