package com.strings;

public class StringDemo {

    public static void main(String[] args) {
        String str = "Hello";
        StringBuffer sb = new StringBuffer("Hello");

        System.out.println("String - immutable");
        System.out.println("Before concat hashcode=" + str.hashCode());
        str = str + "World";
        System.out.println("After concat hashcode=" + str.hashCode());
        str = str + "hai";
        System.out.println("After concat hashcode=" + str.hashCode());

        System.out.println("StringBuffer - mutable");
        System.out.println("Before concat hashcode=" + sb.hashCode());
        sb.append("world");
        System.out.println("After concat hashcode=" + sb.hashCode());
        sb.append("hai");
        System.out.println("After concat hashcode=" + sb.hashCode());
    }
}
