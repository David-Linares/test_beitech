package com.beitech.test.BeitechTest.controller;


import com.beitech.test.BeitechTest.entities.OrderDetail;
import com.beitech.test.BeitechTest.services.OrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/order/detail")
public class OrderDetailController {

    private OrderDetailService orderDetailService;

    @Autowired
    public OrderDetailController(OrderDetailService orderService) {
        this.orderDetailService = orderService;
    }

    @RequestMapping("/{orderId}")
    public List<OrderDetail> findDetailByOrder(@PathVariable int orderId){
        return orderDetailService.getListByOrderId(orderId);
    }


}
