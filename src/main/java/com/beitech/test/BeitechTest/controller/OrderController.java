package com.beitech.test.BeitechTest.controller;


import com.beitech.test.BeitechTest.entities.Order;
import com.beitech.test.BeitechTest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private OrderRepository order_repo;

    @Autowired
    public OrderController(OrderRepository order_repo) {
        this.order_repo = order_repo;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Order> findAllOrders(){
        return order_repo.findAll();
    }


    @RequestMapping(method = RequestMethod.POST)
    public List<Order> createOrder(){
        return order_repo.findAll();
    }


    @RequestMapping(method = RequestMethod.GET)
    public List<Order> findOrdersByDate(){
        return order_repo.findAll();
    }


}
