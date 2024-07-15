package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        ArrayList<Object> list1 = new ArrayList<>();
        
        list.add(12);
        list.add(45.6);
        list.add("hello");
        list.add(10);
        list.add(new Integer(10));
        list.add(10);
        list.add(15);
        list.add(null);
        
        System.out.println("ArrayList " + list);
        
        list.add(2, 100);
        System.out.println("List size = " + list.size());
        System.out.println("After inserting 100 in 2nd index " + list);
        System.out.println("Index of first occurrence of 10 = " + list.indexOf(10));
        System.out.println("Index of last occurrence of 10 = " + list.lastIndexOf(10));
        System.out.println("ArrayList contains 10 = " + list.contains(10));
        System.out.println("ArrayList contains 20 = " + list.contains(20));
        
        list1.add("new list");
        System.out.println("New list = " + list1);
        list1.addAll(list);
        System.out.println("After appending list with list1 = " + list1);
        list1.clear();
        System.out.println("After clearing elements of list1 = " + list1);
        
        System.out.println("4th element in the list = " + list.get(3));
        System.out.println(list + " is empty " + list.isEmpty());
        System.out.println(list1 + " is empty " + list1.isEmpty());
        System.out.println("Sublist from 2nd index to 4th index = " + list.subList(2, 5));
        
        list.remove(2);
        System.out.println("After deleting element in 2nd index = " + list);
        
        System.out.println("Traversing ArrayList using index-for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        System.out.println("Traversing ArrayList with for-each loop");
        for (Object var : list) {
            System.out.print(var + " ");
        }
        System.out.println();
        
        System.out.println("Traversing ArrayList with iterator");
        Iterator<Object> itr = list.iterator();
        while (itr.hasNext()) {
            Object obj = itr.next();
            System.out.print(obj + " ");
        }
        System.out.println();
        
        ListIterator<Object> listItr = list.listIterator();
        System.out.println("Traversing in the forward direction");
        while (listItr.hasNext()) {
            System.out.print(listItr.next() + " ");
        }
        System.out.println();
        
        System.out.println("Traversing in the backward direction");
        while (listItr.hasPrevious()) {
            System.out.print(listItr.previous() + " ");
        }
        System.out.println();
    }
}
