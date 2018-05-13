package com.beitech.test.BeitechTest.entities;


import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    //@Column(name = "customer_id")
    private int customerId;
    private String nameCustomer;
    private String emailCustomer;
    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", emailCustomer='" + emailCustomer + '\'' +
                '}';
    }
}
