package string.tasks;

import java.util.Scanner;

public class CheckVowels {
	public static boolean findVowels(String str) {
		if (str.length() == 0) {
			return false;
		}
		String str1 = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str1.charAt(i) == 'a' || str1.charAt(i) == 'e' || str1.charAt(i) == 'i' || str1.charAt(i) == 'o'
					|| str1.charAt(i) == 'u') {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.next();
		if (findVowels(str)) {
			System.out.print("yes");
		} else {
			System.out.print("no");
		}
	}
}