package com.control_statements.tasks;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float avg;
		
		System.out.println("Enter all five marks");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		int s4=sc.nextInt();
		int s5=sc.nextInt();
		
		int total=s1+s2+s3+s4+s5;
		
		avg=total/5;
		
		System.out.println("Averege:"+avg);
		
		if(avg>80)
		{
			System.out.println("First Grade University");
		}else if(avg>60) {
			System.out.println("Second Grade University");
		}else {
			
			System.out.println("Third Grade University");
		}
		

	}

}
