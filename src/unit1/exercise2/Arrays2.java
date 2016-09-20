package unit1.exercise2;

import java.util.Random;
import java.util.Scanner;

public class Arrays2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int length = 10;
		String[] names = new String[length];

		for (int i = 1; i <= length; i++) {
			System.out.print("Please enter the name of Student " + i + ": ");
			names[i - 1] = scanner.nextLine();
		}

		String winner = names[new Random().nextInt(length)];
		System.out.println("The winner of the lottery is " + winner + ".");

		scanner.close();

	}
}
