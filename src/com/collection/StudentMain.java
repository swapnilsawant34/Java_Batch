package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StudentMain {

    static Map<String, String> calculateGrade(Map<String, Float> map) {
        Map<String, String> resultMap = new HashMap<>();
        String grade = "";
        String name = "";
        for (Entry<String, Float> entry : map.entrySet()) {
            name = entry.getKey();
            if (entry.getValue() >= 60) {
                grade = "PASS";
            } else {
                grade = "FAIL";
            }
            resultMap.put(name, grade);
        }
        return resultMap;
    }

    public static void main(String[] args) {
        Map<String, Float> inputMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int n;
        String name;
        float mark;
        System.out.println("Enter the number of students");
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter name, mark");
            scanner.nextLine(); // consume the newline
            name = scanner.nextLine();
            mark = scanner.nextFloat();
            inputMap.put(name, mark);
        }
        System.out.println("Input Map =" + inputMap);
        System.out.println("Resultant Map=" + StudentMain.calculateGrade(inputMap));
    }
}
