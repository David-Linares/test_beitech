package com.beitech.test.BeitechTest.controller;


import com.beitech.test.BeitechTest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    private OrderRepository order_repo;

    @Autowired
    public OrderController(OrderRepository order_repo) {
        this.order_repo = order_repo;
    }
}
