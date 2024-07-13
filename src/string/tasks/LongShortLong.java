package string.tasks;

import java.util.Scanner;

public class LongShortLong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the 1st string:");
        String S1 = scanner.nextLine();

        System.out.print("Enter the 2nd string: ");
        String S2 = scanner.nextLine();

        
        String longer, shorter;
        if (S1.length() >= S2.length()) {
            longer = S1;
            shorter = S2;
        } else {
            longer = S2;
            shorter = S1;
        }

        
        String r = longer + shorter + longer;

        // Output the result
        System.out.println("Resulting string: " + r);
    }
}
