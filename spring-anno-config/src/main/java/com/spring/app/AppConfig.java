package com.spring.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.repository.CustomerRepository;
import com.spring.repository.JPACustomerRepositoryImpl;
import com.spring.service.CustomerService;
import com.spring.service.impl.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.spring"})
@PropertySource("app.properties")
public class AppConfig {

	
	// you can comment below beans if you want to use autowrired annotations.
	// use componentScan to identify the beans.
	
	/*@Bean(name="customerService")
	public CustomerService getCustomerService(){
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		//customerService.setCustomerRepository(getCustomerRepository());
		return customerService;
	}*/
	
	/*
	@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new JPACustomerRepositoryImpl();
				
	}*/
}
