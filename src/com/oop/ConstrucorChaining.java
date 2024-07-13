package com.oop;

class Car {
	int modelId;
	String modelName;
	String color;

	Car() {
		this(2023, "Maruti");
		System.out.println("def cons called");
	}

	Car(int id, String name) {
		this(id, name, "Blue");

		System.out.println("2 arg cons called");
	}

	Car(int modelId, String modelName, String color) {
		System.out.println("3 arg cons called");
		this.modelId = modelId;
		this.modelName = modelName;
		this.color = color;
	}

	void display() {
		System.out.println("Model :" + modelId);
		System.out.println("Name :" + modelName);
		System.out.println("Colour :" + color);
	}
}

public class ConstrucorChaining {

	public static void main(String[] args) {
		Car c = new Car();
		c.display();

	}
}
