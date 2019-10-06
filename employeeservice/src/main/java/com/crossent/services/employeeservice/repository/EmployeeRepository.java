package com.crossent.services.employeeservice.repository;

import org.springframework.data.repository.CrudRepository;
import com.crossent.services.employeeservice.model.Employee;

import java.util.List;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	List<Employee> findByDepartmentId(Long departmentId);
	List<Employee> findByOrganizationId(Long organizationId);
	
}
