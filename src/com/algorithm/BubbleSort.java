package com.algorithm;

public class BubbleSort {
    public static void main(String[] args) {
        int[] x = {5, 3, 8, 4, 2};

        // Bubble Sort Algorithm
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - 1 - i; j++) {
                if (x[j] > x[j + 1]) {
                    // Swap elements
                    int temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted array is:");
        for (int i = 0; i < x.length; i++) {
            System.out.println("\t" + x[i]);
        }
    }
}

