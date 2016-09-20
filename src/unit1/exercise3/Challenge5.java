/**
 * @class_name Challenge5.java
 * @author Charles
 * @version 1.0
 * @date Sep 12, 2016
 * @description 
 */
package unit1.exercise3;

import java.util.Scanner;

public class Challenge5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter an integer: ");
		int i = scanner.nextInt();
		System.out.println(reverseInteger(i));

		scanner.close();

	}

	public static int reverseInteger(int i) {
		int reversal = 0;

		while (i > 0) {
			reversal += (i % 10) * Math.pow(10, countDigits(i) - 1);
			i -= i % 10;
			i /= 10;
		}

		return reversal;
	}

	public static int countDigits(int i) {
		int r = 0;
		while (i > 0) {
			i -= i % 10;
			i /= 10;
			r++;
		}
		return r;
	}
}
