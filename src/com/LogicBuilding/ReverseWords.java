package com.LogicBuilding;
import java.util.Scanner;
/*
 *  Reverse Words in a String--Leetcode

Given an input string s, reverse the order of the words.

A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

Return a string of the words in reverse order concatenated by a single space.

Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

 

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string
 * 
 */
public class  ReverseWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string to reverse the words:");
        String input = sc.nextLine();

        String reversed = reverseWords(input);
        System.out.println("Reversed words: " + reversed);
    }

    public static String reverseWords(String s) {
        // Trim leading and trailing spaces, split by one or more spaces
        String[] words = s.trim().split("\\s+");
        
        StringBuilder result = new StringBuilder();
        
        // Append words from the end to the beginning with a single space
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);
            if (i > 0) {
                result.append(" ");
            }
        }
        
        return result.toString();
    }
}
