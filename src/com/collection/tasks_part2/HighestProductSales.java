package com.collection.tasks_part2;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestProductSales {

    public static HashMap<String, String> getHighestSoldProducts(HashMap<String, String> productCategoryMap, HashMap<String, Integer> productUnitsSold) {
        HashMap<String, String> highestSoldProducts = new HashMap<>();

        // Iterate over product names in units sold map
        for (Map.Entry<String, Integer> entry : productUnitsSold.entrySet()) {
            String productName = entry.getKey();
            int unitsSold = entry.getValue();

            String category = productCategoryMap.get(productName);

            // Check if category exists in highestSoldProducts
            if (category != null && !highestSoldProducts.containsKey(category)) {
                highestSoldProducts.put(category, productName);
            } else if (category != null && productUnitsSold.get(highestSoldProducts.get(category)) < unitsSold) {
                // Update highestSoldProducts with product having highest units sold in this category
                highestSoldProducts.put(category, productName);
            }
        }

        return highestSoldProducts;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of productCategoryMap
        System.out.println("Enter the number of product-category pairs: ");
        int numProductsCategory = scanner.nextInt();

        // Create productCategoryMap
        HashMap<String, String> productCategoryMap = new HashMap<>();
        for (int i = 0; i < numProductsCategory; i++) {
            System.out.println("Enter product name and category (separated by space): ");
            String productName = scanner.next();
            String category = scanner.next();
            productCategoryMap.put(productName, category);
        }

        // Get the size of productUnitsSold
        System.out.println("Enter the number of product-units sold pairs: ");
        int numProductsUnits = scanner.nextInt();

        // Create productUnitsSold
        HashMap<String, Integer> productUnitsSold = new HashMap<>();
        for (int i = 0; i < numProductsUnits; i++) {
            System.out.println("Enter product name and units sold (separated by space): ");
            String productName = scanner.next();
            int unitsSold = scanner.nextInt();
            productUnitsSold.put(productName, unitsSold);
        }

        HashMap<String, String> highestSoldProducts = getHighestSoldProducts(productCategoryMap, productUnitsSold);

        System.out.println("Products with highest units sold in each category: " + highestSoldProducts);

       
        
        /*
         * Input1 :{“lux”:”soap”,”colgate”:”paste”, ”pears”:”soap”,”sony”:”electronics”,”samsung”:”electronics”}

          Input 2:{“lux”:1000,”colgate”:500,”pears”:2000,”sony”:100,” samsung”,600} 

             Output: {“pears”,”colgate”,”samsung”}
         * 
         */
        
    }
}
