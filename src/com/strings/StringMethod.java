package com.strings;

public class StringMethod {

    public static void main(String[] args) {
        String str = "Hello";
        String str1 = "world";

        System.out.println("Length of " + str + " = " + str.length());
        int len = str1.length();
        System.out.println("Length of " + str1 + " = " + len);

        System.out.println("2nd character in " + str + " = " + str.charAt(1));

        str = str.concat(str1);
        System.out.println("After concat str = " + str);

        System.out.println("Index of first occurrence of 'l' in " + str + " = " + str.indexOf('l'));
        System.out.println("Index of last occurrence of 'l' in " + str + " = " + str.lastIndexOf('l'));

        String str3 = "WORLD";
        System.out.println(str1 + " equals " + str3 + " = " + str1.equals(str3));
        System.out.println(str1 + " equals " + str + " + " + str1.equals(str));

        System.out.println(str1 + " equals ignoring case " + str3 + " = " + str1.equalsIgnoreCase(str3));

        System.out.println();
        System.out.println("Before replace str = " + str);
        str = str.replace('o', 'a');
        System.out.println("After replace str = " + str);

        System.out.println("str1 = " + str1);

        String str4 = "hello";
        System.out.println("str4 = " + str4);

        int result = str1.compareTo(str4);
        if (result == 0) {
            System.out.println("strings are equal");
        } else if (result > 0) {
            System.out.println(str1 + " is greater");
        } else {
            System.out.println(str4 + " is greater");
        }

        System.out.println("Reversing a string");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        StringBuffer sb = new StringBuffer(str);
        String reversed = sb.reverse().toString();
        System.out.println("\nReversed string = " + reversed);

        String sentence = "This sentence will be splitted into tokens";
        String words[] = sentence.split(" ");
        System.out.println("Tokens ");
        for (String s : words) {
            System.out.println(s);
        }

        System.out.println(str.toLowerCase() + " " + str.toUpperCase());

        System.out.println("String to character array");
        char ch[] = str.toCharArray();
        for (char c : ch) {
            System.out.print(c);
        }
        System.out.println();

        System.out.println("char array to string");
        char charr[] = { 'a', 'b', 'c', 'd', 'e' };
        String s = new String(charr);
        System.out.println(s);
    }
}
