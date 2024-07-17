package com.new_task_day9;
import java.util.Scanner;

public class SkewSymmetricMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the matrix :");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Check if the matrix is skew-symmetric
        if (isSkewSymmetric(matrix, n)) {
            System.out.println("The matrix is skew-symmetric.");
        } else {
            System.out.println("The matrix is not skew-symmetric.");
        }
    }

 
    public static boolean isSkewSymmetric(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != -matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
