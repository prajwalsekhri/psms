package com.personal.psms.dao.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {
	
	@Id
	private Long userId;
	private String userName;
	
	
	public Employee() {
		
	}
	
	
	public Employee(Long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}



	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
//		System.out.println("fdsf");
	}
}
