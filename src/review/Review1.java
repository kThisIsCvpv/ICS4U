package review;

import java.util.Scanner;

public class Review1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a Postal Code: ");
		String postalCode = scanner.nextLine();

		char[] postalArray = postalCode.toCharArray();
		int sum = 0;

		for (int i = 0; i < postalArray.length; i++)
			if (Character.isDigit(postalArray[i]))
				sum += Integer.parseInt(Character.toString(postalArray[i]));

		System.out.println("The sum of all the digits in the Postal Code is " + sum + ".");

		scanner.close();
	}
}
