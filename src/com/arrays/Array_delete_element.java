package com.arrays;

import java.util.Scanner;

public class Array_delete_element {

	public static void main(String[] args) {
		
		
        Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter the Arry size");
        int n=sc.nextInt();
        
		int x[]=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<x.length;i++)
		{
			x[i]=sc.nextInt();   // 1 2 3 4 5
		}
		
		System.out.println("Enter the index"); 
		int index=sc.nextInt();      // 2
		
		for(int i=index;i<x.length-1;i++)     //i=2
		{
			x[i]=x[i+1];         //
					
		}
		System.out.println("Arry delete:");
		for(int i=0;i<x.length-1;i++)
		{
			//System.out.printf("a[%d]--->%d\n",i,x[i]);
			System.out.println(x[i]);
		}

	}

}
