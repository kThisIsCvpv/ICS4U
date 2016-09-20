/**
 * @class_name Arrays3.java
 * @author Charles
 * @version 1.0
 * @date Sep 14, 2016
 * @description 
 */
package unit1.exercise5;

import java.util.Scanner;

public class Arrays5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int gridAmount = 5;
		int[][] grid = new int[gridAmount][gridAmount];

		while (!isComplete(grid)) {
			printGrid(grid);

			System.out.println("\n");
			System.out.print("Please enter a set of coordinates: ");

			String input = scanner.nextLine();
			String[] inputSplit = input.replaceAll("[^1-9 ]", "").split(" ");
			grid[Integer.parseInt(inputSplit[0]) - 1][Integer.parseInt(inputSplit[1]) - 1] = 1;
		}

		System.out.println("\nDone!");
		scanner.close();

	}

	public static boolean isComplete(int[][] grid) {
		for (int x = 0; x < grid.length; x++)
			for (int y = 0; y < grid[x].length; y++)
				if (grid[x][y] == 0)
					return false;
		return true;
	}

	public static void printGrid(int[][] grid) {
		for (int x = 0; x < grid.length; x++) {
			for (int y = 0; y < grid[x].length; y++)
				if (grid[x][y] == 0)
					System.out.print("* ");
				else
					System.out.print("x ");
			System.out.println();
		}
	}
}
