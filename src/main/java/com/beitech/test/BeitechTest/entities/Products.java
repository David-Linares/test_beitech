package com.beitech.test.BeitechTest.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Products {

    @Id
    @GeneratedValue
    private int productId;
    private String nameProduct;
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            },
            mappedBy = "products")
    private Set<Customer> customer = new HashSet<>();

    public Products() {
    }

    public Products(String nameProduct, Set<Customer> customer) {
        this.nameProduct = nameProduct;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productId=" + productId +
                ", nameProduct='" + nameProduct + '\'' +
                '}';
    }
}
