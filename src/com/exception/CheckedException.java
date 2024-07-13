package com.exception;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

    public static void main(String[] args) throws IOException {
        int a, b, c;
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader breader = new BufferedReader(ir);
        // BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter 2 numbers");
        a = Integer.parseInt(breader.readLine());
        b = Integer.parseInt(breader.readLine());
        c = a + b;
        System.out.println(c);
    }
}
