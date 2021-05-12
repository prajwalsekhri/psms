package com.personal.psms.service.employee;

import com.personal.psms.dao.entities.Employee;

import reactor.core.publisher.Flux;

public interface EmployeeService {

		
	public Flux<Employee> getAll();
}
