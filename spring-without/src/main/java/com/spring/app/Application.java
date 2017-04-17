package com.spring.app;

import com.spring.service.CustomerService;
import com.spring.service.impl.CustomerServiceImpl;

public class Application {

	public static void main(String[]  args) {
		
		CustomerService customerService = new CustomerServiceImpl();
		
		System.out.println(customerService.findAll().get(0).getName());
		
	}
}
