package com.arrays;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] a;
        int n, i, element, index = -1;
        boolean found = false;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number of values");
        n = sc.nextInt();
        a = new int[n];

        System.out.println("Enter " + n + " values");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched");
        element = sc.nextInt();

        for (i = 0; i < a.length; i++) {
            if (a[i] == element) {
                found = true;
                index = i;
                break;
            }
        }
        if (found) {
            System.out.println(element + " is found at index " + index);
        } else {
            System.out.println(element + " is not found");
        }
    }
}
