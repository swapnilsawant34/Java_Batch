package test.java;


import java.util.Arrays;
import java.util.Scanner;

public class demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        
        int array[] = new int[n];

       
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Original array: " + Arrays.toString(array));
       
        int reversedArray[] = reverseArray(array);

        
        

        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
    }

     static int[] reverseArray (int array[]) { 
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = temp;
        }
        return array;
    }
}
