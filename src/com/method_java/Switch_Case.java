package com.method_java;

import java.util.Scanner;

public class Switch_Case {
	
	static boolean checkPrime(int num) {
		boolean result = false;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			result = true;
		}
		return result;

	}

	static boolean checkArmstrong(int num) {
		boolean flag = false;
		int num1 = num, num2 = num, ndigits = 0, sum = 0, digit;

		// find the number of digits
		while (num1 > 0) {
			num1 = num1 / 10;
			ndigits++;
		}
		while (num2 > 0) {
			digit = num2 % 10;
			sum = sum + (int) Math.pow(digit, ndigits);
			num2 = num2 / 10;
		}
		if (sum == num)
			flag = true;
		return flag;
	}

	static void fibboSeries(int num)
	{
		int n1=0,n2=1,n3;
	      System.out.println(n1+"\n"+n2);
	      
	      for(int i=2;i<num;i++)
	      {
	    	  n3=n1+n2;
	    	  System.out.println(""+n3);
	    	  n1=n2;
	    	  n2=n3;
	      }  
	}
	public static void main(String[] args) {
		int choice, num;
		String ch = "yes";
		boolean flag = false;
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Prime number");
				System.out.println("Enter a number");

				num = sc.nextInt();
				flag = Switch_Case.checkPrime(num);
				if (flag) {
					System.out.println(num + " is prime");
				} else {
					System.out.println(num + " is not prime");
				}
				break;
			case 2:
				System.out.println("Armstrong number");
				System.out.println("Enter a number");
				num = sc.nextInt();
				flag = Switch_Case.checkArmstrong(num);
				if (flag) {
					System.out.println(num + " is an armstrong number");
				} else {
					System.out.println(num + " is not an armstrong number");
				}
				break;
			case 3:
				System.out.println("Fibanocci series");
				System.out.println("Enter a number");
				num = sc.nextInt();
				Switch_Case.fibboSeries(num);
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("do you want to contuinue yes/no");
			ch = sc.next();
		} while (ch.equals("yes"));
	}

}