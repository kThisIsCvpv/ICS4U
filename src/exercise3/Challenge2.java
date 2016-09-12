/**
 * @class_name Challenge2.java
 * @author Charles
 * @version 1.0
 * @date Sep 12, 2016
 * @description 
 */
package exercise3;

import java.util.Scanner;

public class Challenge2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the numerator: ");
		int numerator = Integer.parseInt(scanner.nextLine());

		System.out.print("Please enter the denominator: ");
		int denominator = Integer.parseInt(scanner.nextLine());

		int highestCommon = getHighestCommonMultiple(numerator, denominator);
		numerator /= highestCommon;
		denominator /= highestCommon;

		System.out.println("The reduced fraction is " + numerator + (denominator != 1 ? "/" + denominator : "") + ".");

		scanner.close();

	}

	public static int getHighestCommonMultiple(int a, int b) {
		int start = Math.min(a, b);
		int commonMultiple = 1;

		for (int i = start; i > 1; i--) {
			if (a % i == 0 && b % i == 0) {
				commonMultiple = i;
				break;
			}
		}

		return commonMultiple;
	}
}
