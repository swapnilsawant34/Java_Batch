package com.LogicBuilding;

/*
 * Word Break
Medium

Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated sequence of one or more dictionary words.
Note that the same word in the dictionary may be reused multiple times in the segmentation.
Example 1:

Input: s = "leetcode", wordDict = ["leet","code"]
Output: true
Explanation: Return true because "leetcode" can be segmented as "leet code".
Example 2:

Input: s = "applepenapple", wordDict = ["apple","pen"]
Output: true
Explanation: Return true because "applepenapple" can be segmented as "apple pen apple".
Note that you are allowed to reuse a dictionary word.
Example 3:

Input: s = "catsandog", wordDict = ["cats","dog","sand","and","cat"]
Output: false
 * 
 */

import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // Base case: empty string can always be segmented

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the string:");
        String s = scanner.nextLine();
        
        System.out.println("Enter the number of words in the dictionary:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        List<String> wordDict = new ArrayList<>();
        System.out.println("Enter the dictionary words:");
        for (int i = 0; i < n; i++) {
            wordDict.add(scanner.nextLine());
        }
        
        WordBreak wb = new WordBreak();
        boolean result = wb.wordBreak(s, wordDict);
        
        System.out.println("Can the string be segmented? " + result);
        
        scanner.close();
    }
}


