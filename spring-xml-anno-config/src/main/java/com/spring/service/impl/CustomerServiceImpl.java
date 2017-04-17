package com.spring.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Customer;
import com.spring.repository.CustomerRepository;
import com.spring.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// (autowire member injection)
	@Autowired
	private CustomerRepository customerRepository;
	
	/*public CustomerServiceImpl() {
	
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}*/
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("Constructor injection");
		this.customerRepository = customerRepository;
	}
	
	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("Setter injection");
		this.customerRepository = customerRepository;
	}

	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
