package com.spring.service.impl;

import java.util.List;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import com.spring.repository.JPACustomerRepositoryImpl;
import com.spring.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository = new JPACustomerRepositoryImpl();
	
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
