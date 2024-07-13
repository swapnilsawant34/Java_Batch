package com.strings;

public class String_Buffer {

    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer(); // capacity-16
        StringBuffer sb2 = new StringBuffer("Helloworld"); // 16+10=26
        StringBuffer sb3 = new StringBuffer(50); // capacity-50
        
        System.out.println("Length ");
        System.out.println(sb1.length() + " " + sb2.length() + " " + sb3.length());
        System.out.println("Capacity ");
        System.out.println(sb1.capacity() + " " + sb2.capacity() + " " + sb3.capacity());
        
        sb3.append("world");
        sb3.append(true).append(10).append('c').append("newstring");
        System.out.println("New string=" + sb3);
        
        System.out.println("3rd character in " + sb3 + "=" + sb3.charAt(2));
        System.out.println("Index of first occurrence of 'l' in " + sb3 + "=" + sb3.indexOf("l"));
        System.out.println("Index of last occurrence of 'l' in " + sb3 + "=" + sb3.lastIndexOf("l"));
        
        System.out.println("Before insert=" + sb2);
        sb2.insert(2, 'a');
        System.out.println("After insert=" + sb2);
        
        sb2.deleteCharAt(0);
        System.out.println("After delete=" + sb2);
        
        System.out.println(sb2 + "=" + sb2.substring(3));
        System.out.println(sb2 + "=" + sb2.substring(3, 6));
        
        System.out.println(sb3 + " capacity=" + sb3.capacity());
        sb3.trimToSize();
        System.out.println("After trimToSize=" + sb3 + " capacity=" + sb3.capacity());

        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = new StringBuffer("Hello");
        System.out.println(s1 + " equals " + s2 + "=" + (s1.equals(s2)));

        String str1 = s1.toString();
        String str2 = s2.toString();
        System.out.println(str1.equals(str2));
    }
}
