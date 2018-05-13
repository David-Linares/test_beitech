package com.beitech.test.BeitechTest.services;

import com.beitech.test.BeitechTest.entities.Customer;
import com.beitech.test.BeitechTest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerInfo(int customerId){
        return customerRepository.findByCustomerId(customerId);
    }
}
