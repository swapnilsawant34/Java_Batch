package com.collection;


public class WrapperClass {

    public static void main(String[] args) {
        int a = 10;
        Integer obj1 = new Integer(30);
        Integer obj2 = new Integer(20);
        
        // Autoboxing and unboxing
        // Primitive to object
        Integer obj3 = a;
        // Integer obj3 = new Integer(a);
        System.out.println("int primitive converted to Integer object=" + obj3);
        
        // Object to primitive
        int c = obj1;
        // int c = obj1.intValue();
        System.out.println("Integer object converted to int primitive=" + c);
        
        // String to int
        String s = "125";
        int result = Integer.parseInt(s);
        System.out.println("string converted to int=" + result);
        
        Integer i = 10;
        // Integer to string
        String str = i.toString();
        System.out.println("integer converted to string=" + str);
        
        Integer obj4 = Integer.valueOf(15);
        System.out.println("int to integer=" + obj4);
        System.out.println("decimal to binary=" + Integer.toBinaryString(135));
        System.out.println("decimal to octal=" + Integer.toOctalString(135));
        System.out.println("decimal to hexadecimal=" + Integer.toHexString(135));
        System.out.println(obj1 + " equals " + obj2 + "=" + obj1.equals(obj2));
        System.out.println("size of int=" + Integer.SIZE);
        System.out.println("Min range=" + Integer.MIN_VALUE + " Max range=" + Integer.MAX_VALUE);
        System.out.println("Maximum of 23, 45=" + Integer.max(23, 45));
        
        int res = obj1.compareTo(obj2);
        if (res == 0)
            System.out.println(obj1 + " and " + obj2 + " are equal");
        else if (res > 0)
            System.out.println(obj1 + " is greater than " + obj2);
        else
            System.out.println(obj1 + " is smaller than " + obj2);
    }

}
