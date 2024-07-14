package com.arrays;

import java.util.Scanner;

public class ArrayDemo1 {
	// arr=c
	static void modify(int arr[]) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * 2;
		}
		System.out.println("Array values in the method");
		for (int var : arr) {
			System.out.println(var);
		}

	}

	public static void main(String[] args) {

		int c[], n, i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values");
		n = sc.nextInt();
		c = new int[n];
		System.out.println("Enter " + n + " values");
		for (i = 0; i < n; i++) {
			c[i] = sc.nextInt();
		}
		System.out.println("Before calling method array values");
		for (int var : c) {
			System.out.println(var);
		}
		modify(c);
		System.out.println("After calling method array values");
		for (int var : c) {
			System.out.println(var);
		}
	}

}
