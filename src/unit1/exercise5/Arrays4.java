/**
 * @class_name Arrays3.java
 * @author Charles
 * @version 1.0
 * @date Sep 14, 2016
 * @description 
 */
package unit1.exercise5;

import java.util.Scanner;

public class Arrays4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int amountOfPeople = 5;
		int[][] students = new int[amountOfPeople][4];

		for (int x = 0; x < amountOfPeople; x++) {
			System.out.print("Enter the marks of Student #" + (x + 1) + ": ");
			String rawMarks = scanner.nextLine();
			String[] splitRaw = rawMarks.split(" ");
			for (int i = 0; i < splitRaw.length; i++)
				students[x][i] = Integer.parseInt(splitRaw[i]);
		}

		for (int x = 0; x < students.length; x++) {
			int totalMarks = 0;
			for (int y = 0; y < students[x].length; y++)
				totalMarks += students[x][y];
			int averageMark = totalMarks / students[x].length;
			System.out.println("The test average for Student #" + (x + 1) + " is " + averageMark + ".");
		}

		scanner.close();

	}
}
