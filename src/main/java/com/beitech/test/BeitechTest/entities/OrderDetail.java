package com.beitech.test.BeitechTest.entities;


import javax.persistence.*;

@Entity
@Table (name = "orders_detail")
public class OrderDetail {

    @Id
    @GeneratedValue
    private int orderDetailId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_order", nullable = true)
    private Order order;
    private String productDescription;
    private double price;

    public OrderDetail() {
    }

    public OrderDetail(Order order, String productDescription, double price) {
        this.order = order;
        this.productDescription = productDescription;
        this.price = price;
    }

    public int getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(int orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderDetailId=" + orderDetailId +
//                ", order=" + order +
                ", productDescription='" + productDescription + '\'' +
                ", price=" + price +
                '}';
    }
}
