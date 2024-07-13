package com.strings;

public class StringDemo2 {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		System.out.println("String literals");
		System.out.println(str1 + "==" + str2 + (str1 == str2));
		System.out.println(str1 + " equals " + str2 + (str1.equals(str2)));

	//	String s2 = new String("World"); //allocates different memory locations result will be false for s1==s2
	//	String s1 = new String("World");
		
		String s1 = new String("World").intern();   //if you are using intern() method it will allocate a in single memory location s1 and s2 is pointed that location. 
		String s2 = new String("World").intern();
		System.out.println("String objects");
		System.out.println(s1 + "==" + s2 + (s1 == s2));
		System.out.println(s1 + " equals " + s2 + (str1.equals(str2)));
	}

}