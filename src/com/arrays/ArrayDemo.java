package com.arrays;

import java.util.Scanner;

public class ArrayDemo {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];
        int[] c;
        int n, i;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values");
        n = sc.nextInt();
        c = new int[n];

        for (i = 0; i < a.length; i++) {
            b[i] = a[i] * a[i];
        }

        System.out.println("Enter " + n + " values");
        for (i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        System.out.println("Initialized array");
        for (i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        System.out.println("Square of first array elements");
        for (i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

        // for each - enhanced for loop
        System.out.println("Input array");
        for (int var : c) {
            System.out.println(var);
        }
    }
}
