package com.oop;

import java.util.Scanner;

public class ArrayOfObject {

	public static void main(String[] args) {
		Employee emp[];
//int arr[]=new int[10];
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of employees");
		n = sc.nextInt();
		emp = new Employee[n];// allocating memory for array
		long eid;
		String name, dept;
		double sal;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter id,name,salary & dept");
			eid = sc.nextLong();
			sc.nextLine();
			name = sc.nextLine();
			sal = sc.nextDouble();
			sc.nextLine();
			dept = sc.nextLine();
			emp[i] = new Employee();// allocating memory for individual objects
			emp[i].setData(eid, name, sal, dept);
		}
		System.out.println("Employee details");
		for (Employee e : emp) {
			e.putData();
		}
	}

}


 