package com.method_java;

public class MethodDemo {

	// method without return value and no arguments
	
static void display() {
	System.out.println("display method called");
	}

	// method with return value and with arguments
	static int sum(int a, int b) {
	return a + b;
	}

	// method with return value and no arguments
	static String show() {
	return "Hello World";
	}

	// method with no return value and with arguments
	static void max(int a, int b) {
	if (a > b) {
	System.out.println("Maximum is=" + a);
	} else {
	System.out.println("Maximum is =" + b);
	}
	}

	public static void main(String[] args) {
	MethodDemo.display();// call static method
	int result = MethodDemo.sum(4, 5);
	System.out.println("Sum =" + result);
	// calling method in sop
	System.out.println("Sum =" + MethodDemo.sum(6, 7));
	System.out.println(MethodDemo.show());
	MethodDemo.max(5, 6);



	}

}