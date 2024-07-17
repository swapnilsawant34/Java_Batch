package com.new_task_day9;


import java.util.Scanner;

public class MoveZerosToEnd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        moveZeroes(array);

        // Print the result
        System.out.println("Array after moving zeroes to the end:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    // Function to move all zeroes to the end of the array
    public static void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
