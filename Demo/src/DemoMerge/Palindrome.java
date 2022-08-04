package DemoMerge;

import java.util.Scanner;

public class Palindrome {

	public void checkPalindrome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String text = scanner.next();
		String reverseText = "";
		for (int value = string.length() - 1; value >= 0; value--) {

			reverse = reverse + string.charAt(value);
		}
		if (string.equals(reverse)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("The given string not a palindrome");
		}
	}

}
