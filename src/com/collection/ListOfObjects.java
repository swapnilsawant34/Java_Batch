package com.collection;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    private String code;
    private String name;
    private double price;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product [code=%s, name=%s, price=%s]", code, name, price);
    }
}

public class ListOfObjects {

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        int n;
        String code, name;
        double price;
        Product p = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of products");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter product code, name & price");
            code = sc.next();
            name = sc.next();
            price = sc.nextDouble();
            p = new Product();
            p.setCode(code);
            p.setName(name);
            p.setPrice(price);
            productList.add(p);
        }

        System.out.println("Product list");
        for (Product obj : productList) {
            System.out.println(obj);
        }
    }
}
