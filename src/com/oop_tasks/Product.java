package com.oop_tasks;
public class Product {
    private int productCode;
    private String productName;
    private double price;

    public Product(int productCode, String productName, double price) {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product Code: " + productCode + ", Product Name: " + productName + ", Price: " + price;
    }
}
