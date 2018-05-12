package com.beitech.test.BeitechTest.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int customer_id;
    private String name_customer;
    private String email_customer;

    public int getCustomer_id() {
        return customer_id;
    }

    public String getName_customer() {
        return name_customer;
    }

    public void setName_customer(String name_customer) {
        this.name_customer = name_customer;
    }

    public String getEmail_customer() {
        return email_customer;
    }

    public void setEmail_customer(String email_customer) {
        this.email_customer = email_customer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", name_customer='" + name_customer + '\'' +
                ", email_customer='" + email_customer + '\'' +
                '}';
    }
}
