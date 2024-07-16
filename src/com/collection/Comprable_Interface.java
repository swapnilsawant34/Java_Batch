package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Product1 implements Comparable<Product1> {
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

    @Override
    public int compareTo(Product1 o) {
        int result = 0;
       /*
        * if (this.price == o.price)
            result = 0;
        else if (this.price > o.price)
            result = 1;
        else
            result = -1;
        * 
        * 
        */
       
         result=this.name.compareTo(o.name);
        return result;
    }
}

public class Comprable_Interface {
    public static void main(String[] args) {
        List<Product1> productList = new ArrayList<>();
        int n;
        String code, name;
        double price;
        Product1 p = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter product code, name & price");
            code = sc.next();
            name = sc.next();
            price = sc.nextDouble();
            p = new Product1();
            p.setCode(code);
            p.setName(name);
            p.setPrice(price);
            productList.add(p);
        }
        System.out.println("Product list");
        for (Product1 obj : productList) {
            System.out.println(obj);
        }
        Collections.sort(productList);
        
        /*System.out.println("Sorting based on product price - ascending order");
        for (Product1 obj : productList) {
            System.out.println(obj);
        }*/
        /* System.out.println("Sorting based on product price - descending order");
        for (Product1 obj : productList) {
            System.out.println(obj);
        } */
         System.out.println("Sorting based on product name");
        for (Product1 obj : productList) {
            System.out.println(obj);
        } 
    }
}

