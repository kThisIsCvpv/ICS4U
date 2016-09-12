/**
 * @class_name Challenge4.java
 * @author Charles
 * @version 1.0
 * @date Sep 12, 2016
 * @description 
 */
package exercise3;

import java.util.Scanner;

public class Challenge4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the line: ");
		String input = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z]", "");
		if (isPalindrome(input))
			System.out.println("This is a palindrome.");
		else
			System.out.println("This is not a palindrome.");

		scanner.close();

	}

	public static boolean isPalindrome(String input) {
		char[] charArray = input.toCharArray();

		for (int i = 0; i < input.length(); i++) {
			if (charArray[i] != charArray[input.length() - 1 - i])
				return false;
		}

		return true;
	}
}
