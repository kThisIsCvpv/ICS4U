package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Review2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter a sentence: ");
		String sentence = scanner.nextLine();

		String[] words = sentence.split(" ");
		List<String> wordsList = new ArrayList<String>(Arrays.asList(words));

		Collections.sort(wordsList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.toLowerCase().compareTo(o2.toLowerCase());
			}
		});

		for (String word : wordsList)
			System.out.println(word);

		scanner.close();
	}
}
