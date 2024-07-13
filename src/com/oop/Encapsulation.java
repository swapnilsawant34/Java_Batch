package com.oop;

import java.util.Scanner;

class Customer {
	private long accountNo;
	private String customerName;
	private double balance;

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Insufficient balance");
		} else {
			balance -= amount;
		}
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Customer customer = new Customer();
		customer.setAccountNo(10001);
		customer.setCustomerName("sai");
		customer.setBalance(5000);
		System.out.println("customer details");
		System.out.println("Account no :" + customer.getAccountNo());
		System.out.println("Name :" + customer.getCustomerName());
		System.out.println("Balance:" + customer.getBalance());
		double amount;
		System.out.println("Enter amount to deposit ");
		amount = scanner.nextDouble();
		customer.deposit(amount);
		System.out.println("After deposit =" + customer.getBalance());

	}

}