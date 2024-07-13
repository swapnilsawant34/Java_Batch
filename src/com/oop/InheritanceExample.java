package com.oop;


//Hierarchical inheritance  and inheritance constructor
class Employeee {
	int employeeId;
	String employeeName;
	String department;

	Employeee() {
		System.out.println("employee class def cons called");
		employeeId = 1001;
		employeeName = "Sai";
		department = "Admin";
	}

	public Employeee(int employeeId, String employeeName, String department) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
		System.out.println("emp - arg cons called");
	}

	void display() {
		System.out.println("Id :" + employeeId);
		System.out.println("Name :" + employeeName);
		System.out.println("Department :" + department);
	}

}

class PermanentEmployee extends Employeee {
	double salary;

	PermanentEmployee() {
// super();
		System.out.println("Permanent employee - def cons called");
		salary = 100000;
	}

	public PermanentEmployee(int employeeId, String employeeName, String department, double salary) {

		super();
//super(employeeId,employeeName,department);
		this.salary = salary;
		System.out.println("Perm emp - arg cons called");
	}

	void show() {
		display();// superclass method
		System.out.println("Salary :" + salary);
	}

}

class Trainee extends Employeee {

	double stipend;

	Trainee() {
// super();
		System.out.println("Trainee - def cons called");
		stipend = 10000;
	}

	public Trainee(int employeeId, String employeeName, String department, double stipend) {
		super(employeeId, employeeName, department);
		this.stipend = stipend;

	}

	void print() {
		display();
		System.out.println("Stipend =" + stipend);
	}
}

public class InheritanceExample {
	public static void main(String[] args) {
		PermanentEmployee emp1 = new PermanentEmployee();
		emp1.show();

		PermanentEmployee emp2 = new PermanentEmployee(1002, "Minu", "Admin", 50000);
		emp2.show();

		Trainee trainee1 = new Trainee();
		trainee1.print();

		Trainee trainee2 = new Trainee(1003, "abc", "training", 5000);
		trainee2.print();
	}
}
