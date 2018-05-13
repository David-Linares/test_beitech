package com.beitech.test.BeitechTest.repository;


import com.beitech.test.BeitechTest.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    public List<Order> findByDateOrderGreaterThanEqualAndDateOrderLessThanEqualAndCustomerCustomerId(Date initial_date, Date finish_date, int customerId);

}
