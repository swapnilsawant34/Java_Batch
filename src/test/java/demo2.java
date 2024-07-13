package test.java;


public class demo2 {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 6, 7, 8};
        int sum = findCommonElementsSum(arr1, arr2);

        if (sum == 0) {
            System.out.println("No common elements");
        } else {
            System.out.println("Sum of common elements: " + sum);
        }
    }

    public static int findCommonElementsSum(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    sum += arr1[i];         //sum = sum+ arr1[i];
                    // Avoid duplicates if elements appear multiple times in arr1
                    //arr1[i] = Integer.MAX_VALUE; // Mark element as "processed"
                    break; // Move to next element in arr1 after finding a common element
                }
            }
        }
        return sum;
    }
}
