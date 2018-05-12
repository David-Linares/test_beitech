package com.beitech.test.BeitechTest.entities;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Order {

    @Id
    @GeneratedValue
    private int order_id;
    @ManyToOne
    private Customer id_customer;
    private String delivery_address;

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + order_id +
                ", id_customer=" + id_customer +
                ", delivery_address='" + delivery_address + '\'' +
                '}';
    }
}
