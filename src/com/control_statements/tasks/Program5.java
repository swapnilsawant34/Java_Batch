package com.control_statements.tasks;

import java.util.*;
public class Program5 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int no=sc.nextInt();
		
		if(no>0)
		{
			System.out.println(no+ " is +ve number ");
		}else if(no<0) {
			System.out.println(no+ "  is -ve  number");
			
		}else {
			System.out.println(no+ " number is zero");
		}

	}

}
