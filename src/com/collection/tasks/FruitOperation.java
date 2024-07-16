package com.collection.tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.println("Enter the no. of fruits in the first list:");
        int m = sc.nextInt();
        sc.nextLine(); 
        ArrayList<String> list1 = new ArrayList<>();
        System.out.println("Enter the fruit names for the first list:");
        for (int i = 0; i < m; i++) {
            list1.add(sc.nextLine());
        }
        
        
        System.out.println("Enter the no. of fruits in the second list:");
        int n = sc.nextInt();
        sc.nextLine(); 
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println("Enter the fruit names for the second list:");
        for (int i = 0; i < n; i++) {
            list2.add(sc.nextLine());
        }

        
        String[] result = FruitOperation.fruitSelector(list1, list2);
        
        // Print the result
        if (result.length == 0) {
            System.out.println("No fruit found");
        } 
        else {
            System.out.println("Selected fruits:");
            for (String fruit : result) {
                System.out.println(fruit);
            }
        }
        
        
    }

    public static String[] fruitSelector(ArrayList<String> list1, ArrayList<String> list2) {
      
        for (int i = 0; i < list1.size(); i++) {
            String fruit = list1.get(i);
            if (fruit.endsWith("a") || fruit.endsWith("e")) {
                list1.remove(i);
                i--; 
            }
        }
        
      
        for (int i = 0; i < list2.size(); i++) {
            String fruit = list2.get(i);
            if (fruit.startsWith("m") || fruit.startsWith("a")) {
                list2.remove(i);
                i--; 
            }
        }
        
        // Combine the two lists
        list1.addAll(list2);
        
        
        String[] resultArray = new String[list1.size()];     // Convert the combined list to a String array
        resultArray = list1.toArray(resultArray);
        
        return resultArray;
    }
}
