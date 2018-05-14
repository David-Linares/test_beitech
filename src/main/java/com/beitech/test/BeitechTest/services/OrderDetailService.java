package com.beitech.test.BeitechTest.services;


import com.beitech.test.BeitechTest.entities.OrderDetail;
import com.beitech.test.BeitechTest.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepo;

    public OrderDetail createNewOrderDetail(OrderDetail newOrderDetail){
        return orderDetailRepo.save(newOrderDetail);
    }

    public List<OrderDetail> getListByOrderId(int orderId){
        return orderDetailRepo.findByOrderOrderId(orderId);
    }


}
