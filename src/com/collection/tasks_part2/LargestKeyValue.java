package com.collection.tasks_part2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LargestKeyValue {

    public static String getMaxKeyValue(HashMap<String, String> map) {
        if (map.isEmpty()) {
            return null; 
        }

        String largestKey = null;
        String largestValue = null;

        // Iterate through entries and find the largest key (lexicographically)
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String currentKey = entry.getKey();
            if (largestKey == null || currentKey.compareTo(largestKey) > 0) {
                largestKey = currentKey;
                largestValue = entry.getValue();
            }
        }

        return largestValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the size of the HashMap
        System.out.println("Enter the number of key-value pairs: ");
        int size = sc.nextInt();

        // Create a HashMap with String keys and String values
        HashMap<String, String> map = new HashMap<>();

        // Read key-value pairs (assuming String keys for clarity)
        for (int i = 0; i < size; i++) {
            System.out.println("Enter key and value (separated by space): ");
            String key = sc.next();
            String value = sc.next();
            map.put(key, value);
        }

        
        String largestValue = getMaxKeyValue(map);
        
            System.out.println("Value corresponding to the largest key: " + largestValue);
        
            
        

    }
}
