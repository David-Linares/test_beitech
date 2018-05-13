package com.beitech.test.BeitechTest.entities;


import javax.persistence.*;

@Entity
@Table (name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private int orderId;
    @ManyToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;
    private String deliveryAddress;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public String toString() {
        return "Order{" +
                "order_id=" + orderId +
                ", idCustomer=" + customer +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                '}';
    }
}
