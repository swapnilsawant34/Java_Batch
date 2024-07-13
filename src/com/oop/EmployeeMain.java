package com.oop;

class Employee {
//instance variables
	long employeeId;
	String employeeName;
	double salary;
	String department;

//instance methods
//initializing the instance variables
	void setData(long empid, String name, double sal, String dept) {
		employeeId = empid;
		employeeName = name;
		salary = sal;
		department = dept;
	}

//to display instance variables value
	void putData() {
		System.out.println("Id :" + employeeId);
		System.out.println("Name :" + employeeName);
		System.out.println("Salary :" + salary);
		System.out.println("Department :" + department);
	}

}

public class EmployeeMain {
	public static void main(String[] args) {

		Employee emp1 = null;
		emp1 = new Employee(); // object instantiation
		Employee emp2 = new Employee();
		emp2.setData(1001, "Sai", 45000, "HR");
		System.out.println("Employee 1 details");
		emp1.putData();
		System.out.println("Employee 2 details");
		emp2.putData();
		System.out.println("Employee 3 details");
		Employee emp3 = emp2;
		emp3.putData();
	}
}