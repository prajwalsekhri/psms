package com.personal.psms.dao.entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "employee")
public class Employee {
	
	@Id
	private String userId;
	private String userName;
	
	
	public Employee() {
		
	}


	public Employee(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
	}



	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
