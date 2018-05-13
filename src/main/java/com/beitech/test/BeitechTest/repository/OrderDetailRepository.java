package com.beitech.test.BeitechTest.repository;


import com.beitech.test.BeitechTest.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {

    public List<OrderDetail> findByOrderCustomerCustomerId(int orderId);

}
