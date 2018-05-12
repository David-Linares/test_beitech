package com.beitech.test.BeitechTest.controller;


import com.beitech.test.BeitechTest.Services.OrderService;
import com.beitech.test.BeitechTest.entities.Order;
import com.beitech.test.BeitechTest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    private OrderService order_service;

    @Autowired
    public OrderController(OrderService order_repo) {
        this.order_service = order_repo;
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public List<Order> findAllOrders(){
//        return order_service.findAll();
//    }


    @RequestMapping("/orders/customer/{customer_id}")
    public List<Order> findOrdersByCustomer(@PathVariable int customer_id){
        return order_service.getOrderByCustomerId(customer_id);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public List<Order> createOrder(){
//        return order_service.findAll();
//    }

}
