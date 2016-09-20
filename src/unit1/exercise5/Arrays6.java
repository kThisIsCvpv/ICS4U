/**
 * @class_name Arrays3.java
 * @author Charles
 * @version 1.0
 * @date Sep 14, 2016
 * @description 
 */
package unit1.exercise5;

import java.util.Scanner;

public class Arrays6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int amountOfPeople = 5;
		String[][] peopleData = new String[amountOfPeople][3];

		for (int x = 0; x < amountOfPeople; x++) {
			System.out.print("Enter the name of Person #" + (x + 1) + ": ");
			peopleData[x][0] = scanner.nextLine();

			System.out.print("Enter the phone number of Person #" + (x + 1) + ": ");
			peopleData[x][1] = scanner.nextLine();

			System.out.print("Enter the email address of Person #" + (x + 1) + ": ");
			peopleData[x][2] = scanner.nextLine();

			System.out.println();
		}

		sort(peopleData);

		printDashes(65);
		System.out.printf("| %-20s | %-15s | %-20s |\n", "Name", "Phone Number", "Email Address");
		printDashes(65);

		for (int x = 0; x < peopleData.length; x++) {
			String name = peopleData[x][0];
			String phoneNumber = peopleData[x][1];
			String emailAddress = peopleData[x][2];

			System.out.printf("| %-20s | %-15s | %-20s |\n", name, phoneNumber, emailAddress);
			printDashes(65);
		}

		scanner.close();

	}

	public static void printDashes(int amount) {
		for (int i = 0; i < amount; i++)
			System.out.print("-");
		System.out.println();
	}

	public static void sort(String[][] array) {
		for (int index = 0; index < array.length; index++) {
			int smallest = index;
			for (int i = (index + 1); i < array.length; i++) {
				if (array[smallest][0].compareTo(array[i][0]) > 0)
					smallest = i;
			}

			String[] oldVar = array[index];
			array[index] = array[smallest];
			array[smallest] = oldVar;
		}
	}
}
