package exercise2;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int length = 10;
		int[] array = new int[length];

		for (int i = 1; i <= length; i++) {
			System.out.print("Please enter the value of number #" + i + ": ");
			array[i - 1] = Integer.parseInt(scanner.nextLine());
		}

		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] % 2 == 0 ? 0 : array[i];
		}

		System.out.print("The new array is: ");

		for (int i = 0; i < array.length; i++) {
			if (i != 0) {
				System.out.print(", ");
			}

			System.out.print(array[i]);
		}

		scanner.close();

	}
}
