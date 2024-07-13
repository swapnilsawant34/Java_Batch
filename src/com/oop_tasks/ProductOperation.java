package com.oop_tasks;


import java.util.Scanner;

public class ProductOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of products:");
        int n=sc.nextInt();
        Product[] p = new Product[n];  // Array to store products
        int productCount = 0;

        while (true) {
            
            System.out.println("1. Add New Product");
            System.out.println("2. Search Product");
            System.out.println("3. Display All Products");
            System.out.println("4. Exit");
            System.out.print("Select Choice:");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                  
                    System.out.print("Enter Product Code: ");
                    int productCode = sc.nextInt();
                      sc.nextLine();  
                    System.out.print("Enter Product Name: ");
                    String productName = sc.nextLine();
                    System.out.print("Enter Product Price: ");
                    double price = sc.nextDouble();
                    p[productCount++] = new Product(productCode, productName, price);
                    System.out.println("Product added successfully.");
                    break;

                case 2:
                    // Search Product logic
                    System.out.print("Enter Product Code to search: ");
                    int searchCode = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < productCount; i++) {
                        if (p[i].getProductCode() == searchCode) {
                            System.out.println("Product Found: " + p[i]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Product not found.");
                    }
                    break;

                case 3:
                   
                    System.out.println("All Products are:");
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(p[i]);
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting the application.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
