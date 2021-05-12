package com.personal.psms.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.psms.dao.entities.Employee;
import com.personal.psms.dao.repositories.EmployeeRepository;

import reactor.core.publisher.Flux;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository emp;
	
	@Override
	public Flux<Employee> getAll() {
		return emp.findAll();
	}

}
