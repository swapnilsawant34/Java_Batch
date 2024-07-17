package com.new_task_day9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FindLeadersInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

       
        List<Integer> leaders = findLeaders(array);

        // Print the result
        System.out.println("Leaders in the array:");
        for (int leader : leaders) {
            System.out.print(leader + " ");
        }
    }

    public static List<Integer> findLeaders(int[] array) {
        List<Integer> leaders = new ArrayList<>();
        int maxFromRight = Integer.MIN_VALUE;

    
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > maxFromRight) {
                maxFromRight = array[i];
                leaders.add(array[i]);
            }
        }

       
        Collections.reverse(leaders);
        return leaders;
    }
}
