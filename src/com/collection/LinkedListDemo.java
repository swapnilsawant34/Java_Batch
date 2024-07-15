package com.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();

        list.add(4);
        list.add(20);
        list.add(10);
        
        System.out.println("Linked list = " + list);
        
        list.add(2, 100);
        
        System.out.println("List size = " + list.size());
        System.out.println("After inserting 100 in 2nd index " + list);
        System.out.println("Index of first occurrence of 10 = " + list.indexOf(10));
        System.out.println("Index of last occurrence of 10 = " + list.lastIndexOf(10));
        System.out.println("LinkedList contains 10 = " + list.contains(10));
        System.out.println("LinkedList contains 20 = " + list.contains(20));
    }
}
