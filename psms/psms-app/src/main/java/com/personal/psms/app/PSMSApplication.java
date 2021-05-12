package com.personal.psms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
@EnableAutoConfiguration
public class PSMSApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(PSMSApplication.class,args);

	}

}
