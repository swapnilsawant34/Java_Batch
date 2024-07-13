package com.exception;

public class Nested_Try {

    public static void main(String[] args) {
        int a, b, c;

        try {
            a = Integer.parseInt(args[0]);  // May throw NumberFormatException or ArrayIndexOutOfBoundsException
            b = Integer.parseInt(args[1]);  // May throw NumberFormatException or ArrayIndexOutOfBoundsException
            
            try {
                c = a / b;  // May throw ArithmeticException
                System.out.println("Result = " + c);
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException handled by inner catch block: " + e.getMessage());
            }
            
            System.out.println("Outer try block is continued");

        } catch (NumberFormatException e) {
            System.out.println("Check your input values");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Provide 2 numbers");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException handled by outer catch block: " + e.getMessage());
        }
    }
}
