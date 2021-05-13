package com.personal.psms.dao.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.personal.psms.dao.entities.Employee;


@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee,String>{

	
}
