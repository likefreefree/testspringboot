package com.mysite.springboottest.service;

import java.util.List;

import com.mysite.springboottest.model.Customer;

public interface CustomerService {
    List<Customer> findAll();
    Customer create(Customer customer);
	Customer update(Customer customer);
	void delete(Long id);
	Customer get(Long id);
}
