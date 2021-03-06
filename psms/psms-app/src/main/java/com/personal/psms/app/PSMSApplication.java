package com.personal.psms.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableAutoConfiguration
@EnableReactiveMongoRepositories(basePackages = {"com.personal.psms.dao.repositories"})
@PropertySource("classpath:application.properties")
@SpringBootApplication(scanBasePackages = {"com.personal.psms.api.*",
		"com.personal.psms.dao.*",
		"com.personal.psms.service.*"})
public class PSMSApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PSMSApplication.class,args);
		
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PSMSApplication.class);
	}


}
