package com.LogicBuilding;

/*
 * 179. Largest Number--Leetcode

Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
Since the result may be very large, so you need to return a string instead of an integer.

Example 1:
Input: nums = [10,2]
Output: "210"

Example 2:
Input: nums = [3,30,34,5,9]
Output: "9534330"
 * 
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class PossibleLargestNumber {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }

        // Convert int array to String array, so we can sort later on
        String[] strs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strs[i] = String.valueOf(nums[i]);
        }

        // Create a comparator to decide which string should come first in concatenation
        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                String order1 = str1 + str2;
                String order2 = str2 + str1;
                return order2.compareTo(order1);
            }
        };

        Arrays.sort(strs, customComparator);

        // An extreme edge case that you have only a bunch of 0 in your int array
        if (strs[0].charAt(0) == '0') {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s);
        }

        return sb.toString();
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

        PossibleLargestNumber l = new PossibleLargestNumber();
        String result = l.largestNumber(nums);
        System.out.println("The largest number formed is: " + result);
    }
}

