package com.beitech.test.BeitechTest.controller;


import com.beitech.test.BeitechTest.Services.OrderDetailService;
import com.beitech.test.BeitechTest.Services.OrderService;
import com.beitech.test.BeitechTest.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/order/detail")
public class OrderDetailController {

    private OrderDetailService orderDetailService;

    @Autowired
    public OrderDetailController(OrderDetailService orderService) {
        this.orderDetailService = orderService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Order> findAllOrders(){
        return orderDetailService.getAllOrders();
    }


}
