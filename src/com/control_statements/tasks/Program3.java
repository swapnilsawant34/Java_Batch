package com.control_statements.tasks;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Fees");
		int fees=sc.nextInt();
		
		System.out.println("Enter the percentage marks:");
		int marks=sc.nextInt();
		
		double discountPer=0.0;   //discount percentage
		
	        if (marks > 90) {
	        	discountPer = 50.0;
	        } else if (marks >= 81 && marks <= 90) {
	        	discountPer = 25.0;
	        } else if (marks >= 70 && marks <= 80) {
	        	discountPer = 10.0;
	        } else {
	        	discountPer = 0.0;
	        }
		
	        double discountFees = fees - (fees * (discountPer/100));
	        
	        System.out.println("Fees after dicount:"+discountFees);
	
		

	}

}
