package com.control_statements.tasks;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Salary");
		double sal=sc.nextDouble();
		
		System.out.println("Enter no of shifts");
		int shift=sc.nextInt();
		
		double bonus, foodexpense ,travelexpense,shiftearning,totalsaving;
		
		
		foodexpense=0.20*sal;
		travelexpense=0.30*sal;
		shiftearning=0.02*sal;
		
		totalsaving=sal-(foodexpense+travelexpense)	+shiftearning;
		
		if(sal>20000)
		{
			bonus=0.17*sal+1500;
			System.out.printf("Bonus: %.2f%n", bonus);
		}else if(sal>15000)
		{
			bonus=0.15*sal+1200;
			System.out.printf("Bonus: %.2f%n", bonus);
			
		}else if(sal>10000)
		{
			bonus=0.12*sal+1000;
			System.out.printf("Bonus: %.2f%n", bonus);
		}
		else {
			bonus=0.08*sal+500;
			System.out.printf("Bonus: %.2f%n", bonus);
		}
		
		 System.out.printf("Total Savings: %.2f%n", totalsaving);
	        System.out.printf("Bonus: %.2f%n", bonus);

	}

}
