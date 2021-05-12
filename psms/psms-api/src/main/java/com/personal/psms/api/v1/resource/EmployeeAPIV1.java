package com.personal.psms.api.v1.resource;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.psms.dao.entities.Employee;
import com.personal.psms.dao.repositories.EmployeeRepository;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("rest/test")
public class EmployeeAPIV1{
	
	
	private final EmployeeRepository emp;
	
	@Inject
	public EmployeeAPIV1(EmployeeRepository emp) {
		this.emp=emp;
	}
	
	@GetMapping("all")
	public Flux<Employee> getEmployee() {
		return emp.findAll();
	}
}
