package com.LogicBuilding;

/*
 * 
 * 204. Count Primes---Leetcode
 * Given an integer n, return the number of prime numbers that are strictly less than n.
Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
 * 
 */

import java.util.Arrays;
import java.util.Scanner;

class CountPrimeNum {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0;
        }

        // Initialize a boolean array with all elements set to true
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true); // Assume all numbers are prime initially
        isPrime[0] = isPrime[1] = false; // 0 and 1 are not prime numbers

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark all multiples of i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (boolean prime : isPrime) {
            if (prime) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer n:");
        int n = scanner.nextInt();

        CountPrimeNum countPrimeNum = new CountPrimeNum();
        int result = countPrimeNum.countPrimes(n);
        System.out.println("The number of prime numbers less than " + n + " is: " + result);
    }
}

