package com.exception;
public class ExceptionDemo {

    public static void main(String[] args) {
        int a, b, c;
        try {
            a = Integer.parseInt(args[0]); // AIOBException, NFE exception
            b = Integer.parseInt(args[1]); // AIOBException, NFE exception
            c = a / b; // ArithmeticException
            System.out.println("Result =" + c);
        } catch (ArithmeticException e) {
            //System.out.println(e.getMessage());
            System.out.println("cannot divide by 0");
        } catch (NumberFormatException e) {
            System.out.println("check your input values");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Provide 2 numbers");
        } catch (Exception e) {
            //System.out.println(e.getMessage());
            System.out.println("Invalid input");
        } finally {
            System.out.println("Executed always"); // close the opened resources
        }
    }
}

