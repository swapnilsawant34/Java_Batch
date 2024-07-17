package com.LogicBuilding;
/*
 * Hard: Search in Rotated Sorted Array
Write a Java function to search for a target value in a rotated sorted array. 
For example, given [4, 5, 6, 7, 0, 1, 2] and target = 0, return 4 (the index of 0 in the array).
 * 
 * 
 */
import java.util.Scanner;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Determine which side is sorted
            if (nums[left] <= nums[mid]) {
                // Left side is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // Right side is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the target value:");
        int target = scanner.nextInt();

        SearchInRotatedSortedArray search = new SearchInRotatedSortedArray();
        int result = search.search(nums, target);

        System.out.println("The index of the target value is: " + result);

        scanner.close();
    }
}
