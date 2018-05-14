package com.beitech.test.BeitechTest.services;

import com.beitech.test.BeitechTest.entities.Customer;
import com.beitech.test.BeitechTest.entities.CustomerProducts;
import com.beitech.test.BeitechTest.entities.Products;
import com.beitech.test.BeitechTest.repository.CustomerProductsRepository;
import com.beitech.test.BeitechTest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    private CustomerProductsRepository customerProductRepo;

    public Customer getCustomerInfo(int customerId){
        return customerRepository.findByCustomerId(customerId);
    }

}
