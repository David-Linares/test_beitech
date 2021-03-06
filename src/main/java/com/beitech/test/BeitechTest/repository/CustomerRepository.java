package com.beitech.test.BeitechTest.repository;

import com.beitech.test.BeitechTest.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    public Customer findByCustomerId(int customerId);
}
