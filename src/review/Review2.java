package review;

import java.util.Arrays;
import java.util.Scanner;

public class Review2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a sentence: ");
		String sentence = scanner.nextLine();

		String[] words = sentence.split(" ");

		for (int i = 0; i < words.length; i++)
			words[i] = words[i].toLowerCase();

		Arrays.sort(words);

		for (int i = 0; i < words.length; i++)
			System.out.println(words[i]);

		scanner.close();
	}
}
