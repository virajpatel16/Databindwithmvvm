package com.example.databindingmvvm;

public class Product {
    public String getProduct() {
        return pname;
    }

    public void setProduct(String product) {
        this.pname = product;
    }

    public Product(String product) {
        this.pname = product;
    }

    String pname;
}
