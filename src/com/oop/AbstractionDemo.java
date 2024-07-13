package com.oop;


abstract class Vehicle1 {
	  abstract void start();
	 
	  // {
	  //   System.out.println("start a vehicle");
	  // }
	  abstract void stop();
	 
	  // {
	  //   System.out.println("stop a vehicle");
	  // }
	  //concrete method
	  void buy() {
	    System.out.println("buying a vehicle");
	  }
	}

	class Bike1 extends Vehicle1 {
	  public void start() {
	    System.out.println("start a bike");
	  }

	  void stop() {
	    System.out.println("stop a bike");
	  }

	  void ride() {
	    System.out.println("riding a bike");
	  }
	}

	class Car1 extends Vehicle1 {
	  void start() {
	    System.out.println("start a car");
	  }

	  void stop() {
	    System.out.println("stop a car");
	  }
	}

	public class AbstractionDemo {
	  public static void main(String[] args) {
	    // Vehicle v=new Vehicle(); // This line cannot be executed
	    Vehicle1 v = new Car1();
	    v.start();
	    v.stop();
	    v.buy();
	    v = new Bike1();
	    v.start();
	    v.stop();
	    v.buy();
	    Bike1 b = new Bike1();
	    b.ride();
	  }
	}
