/**
 * @class_name Challenge3.java
 * @author Charles
 * @version 1.0
 * @date Sep 12, 2016
 * @description 
 */
package exercise3;

import java.util.Scanner;

public class Challenge3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[][] magicSquare = new int[5][5];

		for (int row = 0; row < magicSquare.length; row++) {
			System.out.print("Please enter the numbers for Row #" + (row + 1) + ": ");
			String rawNumbers = scanner.nextLine();
			String[] rawNumbersArray = rawNumbers.split(" ");
			for (int col = 0; col < rawNumbersArray.length; col++)
				magicSquare[row][col] = Integer.parseInt(rawNumbersArray[col]);
		}

		if (isMagicSquare(magicSquare))
			System.out.println("This is a magic square!");
		else
			System.out.println("This is not a magic square!");

		scanner.close();

	}

	public static boolean isMagicSquare(int[][] magicSquare) {
		int sumFirst = 0;
		int columns = 0;

		for (int row = 0; row < magicSquare.length;) { // Finds the first row to act as the comparator
			columns = magicSquare[row].length;
			for (int col = 0; col < columns; col++)
				sumFirst += magicSquare[row][col];
			break;
		}

		for (int row = 0; row < magicSquare.length; row++) { // Tests Left to Right
			int rowValue = 0;
			for (int col : magicSquare[row])
				rowValue += col;

			if (rowValue != sumFirst)
				return false;
		}

		for (int col = 0; col < columns; col++) {
			int colValue = 0;
			for (int row = 0; row < magicSquare.length; row++) // Tests Up to Down
				colValue += magicSquare[row][col];

			if (colValue != sumFirst)
				return false;
		}

		int minLength = Math.min(columns, magicSquare.length);

		int diagValueLeft = 0;
		int diagValueRight = 0;
		for (int i = 0; i < minLength; i++) {
			diagValueLeft += magicSquare[i][i];
			diagValueRight += magicSquare[i][columns - 1 - i];
		}

		return diagValueLeft == sumFirst && diagValueRight == sumFirst;
	}
}
