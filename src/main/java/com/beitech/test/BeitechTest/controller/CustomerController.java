package com.beitech.test.BeitechTest.controller;


import com.beitech.test.BeitechTest.entities.Customer;
import com.beitech.test.BeitechTest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private CustomerRepository customer_repo;

    @Autowired
    public CustomerController(CustomerRepository customer_repo) {
        this.customer_repo = customer_repo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> findAllOrders(){
        return customer_repo.findAll();
    }

}
