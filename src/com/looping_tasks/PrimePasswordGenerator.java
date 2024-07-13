package com.looping_tasks;


public class PrimePasswordGenerator {

    public static void main(String[] args) {
        int numberOfPrimes = 100; // Specify the number of prime numbers to sum
        int password = generatePrimeSumPassword(numberOfPrimes);
        System.out.println("The password is: " + password);
    }

    // Method to generate the password
    public static int generatePrimeSumPassword(int n) {
        int sum = 0;
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                sum += num;
                count++;
            }
            num++;
        }

        return sum;
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
