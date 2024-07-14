package test.java;

import java.util.Scanner;

public class demo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with multiple words:");
        String input = scanner.nextLine();
        scanner.close();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Get the first and last words
        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        // Check if they are the same and calculate the result
        int result;
        if (firstWord.equals(lastWord)) {
            result = firstWord.length();
        } else {
            result = firstWord.length() + lastWord.length();
        }

        // Output the result
        System.out.println("Result: " + result);
    }
}
