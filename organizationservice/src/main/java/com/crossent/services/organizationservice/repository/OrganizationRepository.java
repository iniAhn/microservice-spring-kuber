package com.crossent.services.organizationservice.repository;

import org.springframework.data.repository.CrudRepository;
import com.crossent.services.organizationservice.model.Organization;

public interface OrganizationRepository extends CrudRepository<Organization, String> {
	
}
