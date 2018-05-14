package com.beitech.test.BeitechTest.entities;


import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue
    private int customerId;
    private String nameCustomer;
    private String emailCustomer;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "customer_products",
            joinColumns = { @JoinColumn(name = "id_customer") },
            inverseJoinColumns = { @JoinColumn(name = "id_product") })
    private Set<Products> products = new HashSet<>();

    public Customer() {
    }

    public Customer(String nameCustomer, String emailCustomer, Set<Products> products) {
        this.nameCustomer = nameCustomer;
        this.emailCustomer = emailCustomer;
        this.products = products;
    }

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

    public Set<Products> getProducts() {
        return products;
    }

    public void setProducts(Set<Products> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", nameCustomer='" + nameCustomer + '\'' +
                ", emailCustomer='" + emailCustomer + '\'' +
                ", products=" + products +
                '}';
    }
}
