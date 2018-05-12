package com.beitech.test.BeitechTest.Services;


import com.beitech.test.BeitechTest.entities.Order;
import com.beitech.test.BeitechTest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository order_repo;

    public List<Order> getOrderByCustomerId(int customer_id){
        List<Order> list_orders = new ArrayList<>();
        order_repo.findByCustomerId(customer_id).forEach(list_orders::add);
        return list_orders;
    }

}