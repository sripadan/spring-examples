package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.service.CustomerService;

public class Application {

	public static void main(String[]  args) {
		
		// JSR-330 annotations
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		CustomerService customerService = appContext.getBean("customerService", CustomerService.class);
		CustomerService customerService2 = appContext.getBean("customerService", CustomerService.class);
		
		System.out.println(customerService);
		System.out.println(customerService2);
		
		System.out.println(customerService.findAll().get(0).getName());
		
	}
}
