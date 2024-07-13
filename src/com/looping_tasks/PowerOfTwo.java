package com.looping_tasks;

import java.util.Scanner;

public class PowerOfTwo {

     static boolean isPowerOfTwo(int n) {
        
        if (n == 0) {
            return false;
        }

        return (n & (n - 1)) == 0;

       
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter");
        int number=sc.nextInt();
        
        if (isPowerOfTwo(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

