package DemoMerge;

import java.util.Scanner;

public class Palindrome {

	public void checkPalindrome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");

		String stringOne = scanner.next();
		String reverseOne = "";
		scanner.close();
		for (int value = stringOne.length() - 1; value >= 0; value--) {

			reverseOne = reverseOne + stringOne.charAt(value);
		}
		if (stringOne.equals(reverseOne)) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("The given string not a palindrome");
		}
	}

}
