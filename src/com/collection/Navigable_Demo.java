package com.collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Navigable_Demo {

    public static void main(String[] args) {
        NavigableSet<Integer> set1 = new TreeSet<Integer>().descendingSet();
        Set<String> set2 = new TreeSet<>();
        Set set3 = new TreeSet<>();
        set1.add(1);
        set1.add(30);
        set1.add(10);
        set1.add(20);
        set1.add(10);
        set1.add(10);
        // set1.add(null); // NullPointerException
        // set1.add(null);
        set1.add(2);
        System.out.println("TreeSet = " + set1);
    }
}
