package com.beitech.test.BeitechTest.Services;


import com.beitech.test.BeitechTest.entities.Order;
import com.beitech.test.BeitechTest.repository.OrderDetailRepository;
import com.beitech.test.BeitechTest.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepo;

    public List<Order> getAllOrders(){
        return orderDetailRepo.findAll();
    }


}
