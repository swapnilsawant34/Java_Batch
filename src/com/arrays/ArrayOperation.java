package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {

	public static void main(String[] args) {

		int a[], b[], n, i, j, index, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of values");
		n = sc.nextInt();
		a = new int[n];
		b = new int[n];
		System.out.println("Enter " + n + " values");
		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the index of the element to modify");
		index = sc.nextInt();
		System.out.println("enter the number ");
		num = sc.nextInt();
		System.out.println("Before update array values=" + Arrays.toString(a));
		for (i = 0; i < a.length; i++) {
			if (i == index) {
				a[i] = num;
			}
		}
		System.out.println("After update array values=" + Arrays.toString(a));
		for (i = a.length - 1, j = 0; i >= 0; i--, j++) {
			b[j] = a[i];

		}
		System.out.println("Reversed array values=" + Arrays.toString(b));
		int slice[] = Arrays.copyOfRange(a, 2, 4);
		System.out.println("Array slice=" + Arrays.toString(slice));
		Arrays.sort(a);
		System.out.println("Sorted Array =" + Arrays.toString(a));
	}

}