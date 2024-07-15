package com.collection.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MeargeArrayList {

	static List<Integer> mearge(List<Integer> list1,List<Integer> list2)
	{
		ArrayList<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        
        Collections.sort(mergedList);
        System.out.println("Mearged arraylist"+mergedList);
        
        ArrayList<Integer> resultList = new ArrayList<>();
        resultList.add(mergedList.get(2));
        resultList.add(mergedList.get(6));
        resultList.add(mergedList.get(8));
        
		
		return resultList;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		List<Integer> list1=new ArrayList<>();
		System.out.println("Enter the elements in ArrayList1");
		//int n1=sc.nextInt();
		
		
		for(int i=0;i<5;i++)
		{
			list1.add(sc.nextInt());
		}
		
		List<Integer> list2=new ArrayList<>();
		System.out.println("Enter the elements in ArrayList2");
		//int n2=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			list2.add(sc.nextInt());
		}
		
		
		List<Integer> list=mearge(list1, list2);
		
		System.out.println("Final arralist is:"+list);

	}

}
