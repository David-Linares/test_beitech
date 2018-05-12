package com.beitech.test.BeitechTest.repository;


import com.beitech.test.BeitechTest.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
