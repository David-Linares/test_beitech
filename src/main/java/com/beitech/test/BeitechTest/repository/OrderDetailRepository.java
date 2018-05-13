package com.beitech.test.BeitechTest.repository;


import com.beitech.test.BeitechTest.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<Order, Integer> {
}
