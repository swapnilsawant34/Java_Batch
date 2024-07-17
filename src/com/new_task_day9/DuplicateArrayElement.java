package com.new_task_day9;

import java.util.Scanner;

public class DuplicateArrayElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] myArray = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }

        // Call the function to find and print duplicate elements
        findDuplicates(myArray);
    }

    // Function to find and print duplicate elements in an array
    public static void findDuplicates(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    System.out.println("Duplicate Element : " + array[j]);
                }
            }
        }
    }
}
