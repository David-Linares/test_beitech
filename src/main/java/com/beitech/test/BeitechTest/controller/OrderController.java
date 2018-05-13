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

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Order> findAllOrders(){
        return orderService.getAllOrders();
    }

    @RequestMapping("/customer/{customerId}")
    public List<Order> findOrdersByCustomer(@PathVariable int customerId){
        return orderService.getOrdersByCustomerId(customerId);
    }

    @RequestMapping("/customer/{customerId}")
    public List<Order> findOrdersDetail(@PathVariable int customerId){
        return orderService.getOrdersByCustomerId(customerId);
    }

//    @RequestMapping(method = RequestMethod.POST)
//    public List<Order> createOrder(){
//        return order_service.findAll();
//    }

}
