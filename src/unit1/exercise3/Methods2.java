/**
 * @class_name Methods2.java
 * @author Charles
 * @version 1.0
 * @date Sep 12, 2016
 * @description 
 */
package unit1.exercise3;

import java.util.Scanner;

public class Methods2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input the sentence: ");
		String line = scanner.nextLine().toLowerCase();

		System.out.print("Input the number: ");
		int index = Integer.parseInt(scanner.nextLine());

		printNth(line, index);

		scanner.close();

	}

	public static void printNth(String line, int index) {
		char[] charIndex = line.toCharArray();
		for (int i = 1; i <= charIndex.length; i++) {
			if (i % index == 0)
				System.out.print(Character.toUpperCase(charIndex[i - 1]));
			else
				System.out.print(charIndex[i - 1]);
		}
	}
}
