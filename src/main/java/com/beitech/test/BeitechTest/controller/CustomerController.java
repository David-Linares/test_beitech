package com.beitech.test.BeitechTest.controller;


import com.beitech.test.BeitechTest.entities.Customer;
import com.beitech.test.BeitechTest.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerRepository customerRepo;    

    @Autowired
    public CustomerController(CustomerRepository customerRepo) {
        this.customerRepo = customerRepo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Customer> findAllOrders(){
        return customerRepo.findAll();
    }

}
