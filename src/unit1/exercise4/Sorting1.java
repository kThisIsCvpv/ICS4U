/**
 * @class_name Sorting1.java
 * @author Charles
 * @version 1.0
 * @date Sep 13, 2016
 * @description 
 */
package unit1.exercise4;

import java.util.Scanner;

public class Sorting1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter 10 numbers: ");
		String input = scanner.nextLine();
		String[] rawInput = input.split(" ");
		int[] numbers = new int[rawInput.length];

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = Integer.parseInt(rawInput[i]);

		sort(numbers);

		System.out.print("The sorted numbers list is: ");
		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

		scanner.close();

	}

	public static void sort(int[] array) {
		mainLoop: while (true) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int var = array[i + 1];
					array[i + 1] = array[i];
					array[i] = var;

					continue mainLoop;
				}
			}

			break;
		}
	}
}
