package com.beitech.test.BeitechTest.entities;


import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table (name = "orders")
public class Order {

    @Id
    @GeneratedValue
    private int orderId;
    @ManyToOne(optional = false)
    @JoinColumn(name = "id_customer")
    private Customer customer;
    private String deliveryAddress;
    @Column(name = "date_order", columnDefinition="TIMESTAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOrder;
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "order")
    private Set<OrderDetail> detail = new HashSet<>();


    public Order() {
    }

    public Order(Customer customer, String deliveryAddress) {
        this.customer = customer;
        this.deliveryAddress = deliveryAddress;
    }

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

    public Date getDateOrder() {
        return dateOrder;
    }

    public void setDateOrder(Date dateOrder) {
        this.dateOrder = dateOrder;
    }

    public Set<OrderDetail> getDetail() {
        return detail;
    }

    public void setDetail(Set<OrderDetail> detail) {
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", dateOrder=" + dateOrder +
                '}';
    }
}
