/**
 * @class_name Arrays3.java
 * @author Charles
 * @version 1.0
 * @date Sep 14, 2016
 * @description 
 */
package exercise5;

import java.util.Scanner;

public class Arrays3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int amountOfPeople = 5;
		String[][] peopleNames = new String[amountOfPeople][2];

		for (int x = 0; x < amountOfPeople; x++) {
			System.out.print("Enter the full name of Person #" + (x + 1) + ": ");
			String name = scanner.nextLine();
			
			String[] splitNames = name.split(" ");
			peopleNames[x][0] = splitNames[0]; // First Name -> 0
			peopleNames[x][1] = splitNames[1]; // Last Name -> 1
		}
		
		for(int x = 0; x < peopleNames.length; x++) {
			for(int y = 0; y < peopleNames[x].length; y++)
				System.out.print(peopleNames[x][y] + " ");
			System.out.println();
		}

		scanner.close();

	}
}
