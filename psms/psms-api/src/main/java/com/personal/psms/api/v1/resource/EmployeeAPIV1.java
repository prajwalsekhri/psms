package com.personal.psms.api.v1.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personal.psms.dao.entities.Employee;
import com.personal.psms.service.employee.EmployeeService;

import reactor.core.publisher.Flux;



@RestController
@RequestMapping("rest/test")
public class EmployeeAPIV1{
	
	@Autowired
	private EmployeeService emp;
	
	@GetMapping("all1")
	public Flux<Employee> getEmployee() {
		return emp.getAll();
	}
}
