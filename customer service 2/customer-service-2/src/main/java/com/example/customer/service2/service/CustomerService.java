package com.example.customer.service2.service;

import com.example.customer.service2.entity.Customer;
import com.example.customer.service2.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    public Customer saveCustomer(Customer cst) {
        return customerRepository.save(cst);}

    public Optional<Customer> findByCstId(Long customer_id) {
        return customerRepository.findById(customer_id);
    }
}

