package unit1.exercise2;

import java.util.Scanner;

public class Arrays1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int length = 10;
		double[] array = new double[length];

		for (int i = 1; i <= length; i++) {
			System.out.print("Please enter the value of #" + i + ": ");
			array[i - 1] = Double.parseDouble(scanner.nextLine());
		}

		double highestNumber = Double.MIN_VALUE;
		double totalNumber = 0d;

		for (double value : array) {
			if (highestNumber < value) {
				highestNumber = value;
			}

			totalNumber += value;
		}

		double average = totalNumber / length;

		System.out.println("The highest number is " + highestNumber + ".");
		System.out.println("The average of the numbers is " + average + ".");

		scanner.close();

	}
}
