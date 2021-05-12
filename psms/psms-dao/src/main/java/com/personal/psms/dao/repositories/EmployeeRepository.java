package com.personal.psms.dao.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.personal.psms.dao.entities.Employee;

//@Repository
public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Long>{

}
