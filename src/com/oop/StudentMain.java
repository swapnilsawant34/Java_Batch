package com.oop;
//constructor,type

import java.util.Scanner;

class Student {
	long regno;
	String studentName;
	String department;

//constructor overloading
//default constructor
	Student() {
		System.out.println("default cons called");
		regno = 1001;
		studentName = "sri";
		department = "CSC";
	}// constructor with 3 args

	Student(long rno, String name, String dept) {
		System.out.println("3 args cons called");
		regno = rno;
		studentName = name;
		department = dept;
	}

//cons with 2 arguments
	Student(long rno, String name) {
		System.out.println("2 arg parameterized cons called");
		regno = rno;
		studentName = name;
	}

	void display() {
		System.out.println("Register no: " + regno);
		System.out.println("Name :" + studentName);
		System.out.println("Department :" + department);
	}
}

public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		long rno;
		String name, dept;
		System.out.println("Enter register number,name & dept");
		rno = sc.nextLong();
		sc.nextLine();
		name = sc.nextLine();
		dept = sc.nextLine();
		Student s2 = new Student(rno, name, dept);
		Student s3 = new Student(1003, "Abc");
		System.out.println("Student 1");
		s1.display();
		System.out.println("Student 2");
		s2.display();
		System.out.println("Student 3");
		s3.display();
	}
}