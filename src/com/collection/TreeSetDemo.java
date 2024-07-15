package com.collection;


import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        Set<Object> set3 = new TreeSet<>();

        set1.add(30);
        set1.add(10);
        set1.add(20);
        set1.add(10);
        set1.add(10);
        // set1.add(null); // NullPointerException
        // set1.add(null);
        set1.add(2);
        System.out.println("TreeSet = " + set1);

        set2.add("one");
        set2.add("hello");
        set2.add("two");
        System.out.println("TreeSet = " + set2);

        // set2.add(10); // ClassCastException
        // set2.add("hello"); // ClassCastException
    }
}
