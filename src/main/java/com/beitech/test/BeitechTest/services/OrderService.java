package com.beitech.test.BeitechTest.services;


import com.beitech.test.BeitechTest.entities.Order;
import com.beitech.test.BeitechTest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepo;

    public List<Order> getAllOrders(){
        return orderRepo.findAll();
    }

    public List<Order> getOrdersByCustomerId(Date initialDate, Date finishDate, int customerId){
        return orderRepo.findByDateOrderGreaterThanEqualAndDateOrderLessThanEqualAndCustomerCustomerId(initialDate, finishDate, customerId);
    }

    public Order createNewOrder(Order newOrder){
        return orderRepo.save(newOrder);
    }

}
