/**
 * @class_name Methods1.java
 * @author Charles
 * @version 1.0
 * @date Sep 12, 2016
 * @description 
 */
package unit1.exercise3;

import java.util.Scanner;

public class Methods1 {

	public static enum Operation {
		ADD, SUBSTRACT, DIVIDE, MULTIPLY;
	}

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the numbers: ");
		String rawNumbers = scanner.nextLine();

		String[] rawNumbersArray = rawNumbers.split(" ");
		int[] numbersArray = new int[rawNumbersArray.length];
		for (int i = 0; i < rawNumbersArray.length; i++)
			numbersArray[i] = Integer.parseInt(rawNumbersArray[i]);

		System.out.print("Enter the operation: ");
		Operation operation = Operation.valueOf(scanner.nextLine().toUpperCase());

		System.out.println(calculate(numbersArray, operation));

		scanner.close();

	}

	public static int calculate(int[] numbersArray, Operation operation) {
		int returnValue = 0;

		switch (operation) {
			case ADD:
				for (int i : numbersArray)
					returnValue += i;
				break;
			case SUBSTRACT:
				for (int i : numbersArray)
					returnValue -= i;
				break;
			case MULTIPLY:
				returnValue = numbersArray.length > 0 ? numbersArray[0] : 0;
				for (int i = 1; i < numbersArray.length; i++)
					returnValue *= numbersArray[i];
				break;
			case DIVIDE:
				returnValue = numbersArray.length > 0 ? numbersArray[0] : 0;
				for (int i = 1; i < numbersArray.length; i++)
					returnValue /= numbersArray[i];
				break;
		}

		return returnValue;
	}
}
