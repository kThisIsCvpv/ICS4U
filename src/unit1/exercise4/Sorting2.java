/**
 * @class_name Sorting2.java
 * @author Charles
 * @version 1.0
 * @date Sep 13, 2016
 * @description 
 */
package unit1.exercise4;

import java.util.Scanner;

public class Sorting2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter 10 words: ");
		String input = scanner.nextLine();
		String[] words = input.split(" ");

		sort(words);
		System.out.print("The sorted word list is: ");
		for (String word : words)
			System.out.print(word + " ");

		scanner.close();

	}

	public static void sort(String[] array) {
		for (int index = 0; index < array.length; index++) {
			int smallest = index;
			for (int i = (index + 1); i < array.length; i++) {
				if (array[smallest].compareTo(array[i]) > 0)
					smallest = i;
			}

			String oldVar = array[index];
			array[index] = array[smallest];
			array[smallest] = oldVar;
		}
	}
}
