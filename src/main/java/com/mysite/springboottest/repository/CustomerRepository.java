package com.mysite.springboottest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mysite.springboottest.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
