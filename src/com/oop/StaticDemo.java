package com.oop;


public class StaticDemo {

	  int a;
	  static int b;

	  static {
	    System.out.println("In static block b=" + b);
	    b++;
	  }

	  static void display() {
	    System.out.println("In static method ");
	    StaticDemo s = new StaticDemo();
	    System.out.println("a=" + s.a);
	    System.out.println("b=" + b);
	    b += 5;
	  }

	  void show() {
	    int c = 0;
	    System.out.println("local var c=" + c);
	    System.out.println("In non-static method ");
	    System.out.println("a=" + a);
	    System.out.println("b=" + b);
	  }

	  public static void main(String[] args) {
	    System.out.println("Main method called");
	    System.out.println("static var b=" + StaticDemo.b);
	    StaticDemo.display();

	    // System.out.println("instance var a="+a); // This would cause an error

	    StaticDemo obj = new StaticDemo();
	    System.out.println("instance var a=" + obj.a);
	    obj.show();

	    obj = null;
	    System.out.println("after object is set to null");
	    System.out.println("static var b=" + StaticDemo.b);

	    // System.out.println("instance var a="+obj.a); // This would cause an error since obj is null
	  }
	}
