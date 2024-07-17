package com.collection.tasks_part2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentFeedback {

    public static Map<String, Integer> consolidateFeedback(HashMap<String, Integer> mathsFeedback, HashMap<String, Integer> englishFeedback) {
        HashMap<String, Integer> consolidatedMap = new HashMap<>();

        // Iterate over teachers in maths feedback
        for (Map.Entry<String, Integer> entry : mathsFeedback.entrySet()) {
            String teacherName = entry.getKey();
            int mathsScore = entry.getValue();

            // Check if teacher exists in english feedback
            if (englishFeedback.containsKey(teacherName)) {
                int englishScore = englishFeedback.get(teacherName);
                consolidatedMap.put(teacherName, Math.max(mathsScore, englishScore)); // Take the highest score
            } else {
                consolidatedMap.put(teacherName, mathsScore); // Add only maths score if not present in english feedback
            }
        }

        // Add teachers only present in english feedback
        for (Map.Entry<String, Integer> entry : englishFeedback.entrySet()) {
            String teacherName = entry.getKey();
            int feedback=entry.getValue();
            if (!consolidatedMap.containsKey(teacherName)) {
                consolidatedMap.put(teacherName, feedback);
            }
        }

        return consolidatedMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get Maths feedback
        HashMap<String, Integer> mathsFeedback = new HashMap<>();
        System.out.println("Enter the number of teachers providing maths feedback: ");
        int numMathsTeachers = sc.nextInt();
        for (int i = 0; i < numMathsTeachers; i++) {
            System.out.println("Enter teacher name and their maths feedback (separated by space): ");
            String teacherName = sc.next();
            int feedback = sc.nextInt();
            mathsFeedback.put(teacherName, feedback);
        }

        // Get English feedback
        HashMap<String, Integer> englishFeedback = new HashMap<>();
        System.out.println("Enter the number of teachers providing english feedback: ");
        int numEnglishTeachers = sc.nextInt();
        for (int i = 0; i < numEnglishTeachers; i++) {
            System.out.println("Enter teacher name and their english feedback (separated by space): ");
            String teacherName = sc.next();
            int feedback = sc.nextInt();
            englishFeedback.put(teacherName, feedback);
        }

        // Consolidate feedback
        Map<String, Integer> consolidatedFeedback = consolidateFeedback(mathsFeedback, englishFeedback);

        // Print consolidated feedback
        System.out.println("Consolidated Feedback:");
        for (Map.Entry<String, Integer> entry : consolidatedFeedback.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        
    }
}

