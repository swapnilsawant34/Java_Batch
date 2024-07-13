package com.oop;

public class OverLoadDemo {

	  void add(int a, int b) {
	    int sum = a + b;
	    System.out.println("Sum of 2 integers=" + sum);
	  }

	 
	  // int add(int a, int b) {
	  //   int sum = a + b;
	  //   System.out.println("Sum of 2 integers=" + sum);
	  //   return sum;
	  // }

	  String add(String s1, String s2) {
	    return s1 + s2;
	  }

	  int add(int a, int b, int c) {
	    return a + b + c;
	  }

	  void add(double a, double b) {
	    double res = a + b;
	    System.out.println("Sum of 2 double values=" + res);
	  }

	  public static void main(String[] args) {
	    OverLoadDemo obj = new OverLoadDemo();
	    obj.add(45.6, 67.8);
	    obj.add(3, 4);
	    System.out.println(obj.add("Hello", "World"));
	    System.out.println(obj.add(3, 4, 5));
	  }
	}
