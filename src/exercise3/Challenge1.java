/**
 * @class_name Challenge1.java
 * @author Charles
 * @version 1.0
 * @date Sep 12, 2016
 * @description 
 */
package exercise3;

import java.util.Scanner;

public class Challenge1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] frequencyArray = new int[100];

		while (true) {
			System.out.print("Please enter a number: ");
			int number = Integer.parseInt(scanner.nextLine());
			if (number == 0)
				break;
			frequencyArray[number - 1]++;
		}

		for (int i = 0; i < frequencyArray.length; i++) {
			int frequency = frequencyArray[i];
			if (frequency != 0)
				System.out.println("The number " + (i + 1) + " was entered " + frequency + " time" + (frequency != 1 ? "s." : "."));
		}

		scanner.close();

	}

}
