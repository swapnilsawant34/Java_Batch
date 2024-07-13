package com.algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort2 {

    static void sort(int arr[]) {
        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int n, c[], i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of values");
        n = sc.nextInt();
        c = new int[n];
        System.out.println("Enter " + n + " values");
        for (i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        System.out.println("Before sorting " + Arrays.toString(c));
        sort(c);
        System.out.println("After sorting " + Arrays.toString(c));
    }
}
