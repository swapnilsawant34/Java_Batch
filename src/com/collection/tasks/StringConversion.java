package com.collection.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StringConversion {

	static String[] convertToStringArray(List<String> list)
	{
		
		 Collections.sort(list);
	        
	        
	        String[] str = new String[list.size()];
	        str = list.toArray(str);

	        return str;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of strings:");
		int n=sc.nextInt();
		
		//String[] str= new String[n];
		
		List<String> list=new ArrayList<>();
		System.out.println("Enter the String values");
		for(int i=0;i<=n;i++)
		{
			String str=sc.nextLine();
			list.add(str);
		}
		
		
		String[]finalArray= convertToStringArray(list);
		
		System.out.println("Sorted Strings is:");
		for(String s:list)
		{
			System.out.println(s);
		}
		
		

	}

}
