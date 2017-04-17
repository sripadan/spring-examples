package com.spring.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring.model.Customer;

public class JPACustomerRepositoryImpl implements  CustomerRepository {

	public  List<Customer> findAll(){
		List<Customer> list = new ArrayList<>();
		Customer c1 = new Customer();
		c1.setName("Naren");
		c1.setId("001");
		c1.setAddress("New Jersey, USA");
		list.add(c1);
		return list;
	}
}
