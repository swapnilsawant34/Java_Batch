package com.control_statements.tasks;
import java.util.*;
public class Program4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);;
		
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		System.out.println("Enter the no of rows");
		int m=sc.nextInt();
		
		int i;
		
		System.out.println("Multiplication table upto m rows:");
		for(i=1;i<=m;i++)
		{
		
				
				System.out.println(n*i);
			
		}
	

	}

}
