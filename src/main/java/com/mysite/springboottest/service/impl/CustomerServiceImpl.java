package com.mysite.springboottest.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mysite.springboottest.model.Address;
import com.mysite.springboottest.model.Customer;
import com.mysite.springboottest.repository.CustomerRepository;
import com.mysite.springboottest.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	public Customer create(Customer customer){
		List<Address> addresses=customer.getAddresses();
		addresses.forEach(address->{
			address.setCustomer(customer);
		});
		customerRepository.save(customer);
		return customer;
	}
	@Override
	public Customer update(Customer customer) {
		List<Address> addresses=customer.getAddresses();
		addresses.forEach(address->{
			address.setCustomer(customer);
		});		
		customerRepository.save(customer);
		return customer;
	}
	@Override
	public void delete(Long id) {
		customerRepository.deleteById(id);
		
	}
	@Override
	public Customer get(Long id) {
		Optional<Customer> customer=customerRepository.findById(id);
		return customer.isPresent()?customer.get():null;
	}

}
