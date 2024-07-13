package com.oop;

class Vehicle {
	void start() {
		System.out.println("Start a vehicle");
	}

	void stop() {
		System.out.println("Stop a vehicle");
	}
}

class Bike extends Vehicle {
	public void start() {
		System.out.println("Start a bike");
	}

	void stop() {
		System.out.println("Stop a bike");
	}
}

class Carr extends Vehicle {
	void start() {
		System.out.println("Start a car");
	}

	void stop() {
		System.out.println("Stop a car");
	}
}

public class DynamicMethodDispatch {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.start();
		v.stop();

		v = new Carr();
		v.start();
		v.stop();

		v = new Bike();
		v.start();
		v.stop();
	}
}
