package com.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.spring.model.Customer;

@Repository("customerRepository")
public class JPACustomerRepositoryImpl implements  CustomerRepository {
	
	@Value("${dbUserName}")
	private String dbUserName;

	public  List<Customer> findAll(){
		
		System.out.println("dbUserName -- >" + dbUserName);
		
		List<Customer> list = new ArrayList<>();
		Customer c1 = new Customer();
		c1.setName("Naren");
		c1.setId("001");
		c1.setAddress("New Jersey, USA");
		list.add(c1);
		return list;
	}
}
