/**
 * @class_name Sorting3.java
 * @author Charles
 * @version 1.0
 * @date Sep 13, 2016
 * @description 
 */
package unit1.exercise4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorting3 {

	public static class Entry {

		public char character;
		public int count;

		public Entry(char character, int count) {
			this.character = character;
			this.count = count;
		}
	}

	public static void main(String[] args) throws Exception {

		File file = new File("dictionary.txt");
		if (!file.exists())
			file.createNewFile();

		BufferedReader br = new BufferedReader(new FileReader(file));

		int[] appearance = new int[26];
		int totalCharacters = 0;

		String line;
		while ((line = br.readLine()) != null) {
			char[] chars = line.toUpperCase().replaceAll("[^A-Z]", "").toCharArray();
			totalCharacters += chars.length;
			for (char character : chars) {
				int indexValue = ((int) character) - 65;
				appearance[indexValue]++;
			}
		}

		br.close();

		List<Entry> count = new ArrayList<Entry>();
		for (int i = 0; i < appearance.length; i++) {
			char reference = (char) (i + 65);
			count.add(new Entry(reference, appearance[i]));
		}

		Comparator<Entry> compare = new Comparator<Entry>() {
			public int compare(Entry o1, Entry o2) {
				return Integer.compare(o1.count, o2.count) * -1;
			}
		};

//		count.stream().sorted(compare).forEach(entry -> System.out.println(entry.character + " appears " + entry.count + " different times."));

		Collections.sort(count, compare);

		for (Entry entry : count) {
			double prob = ((double) entry.count) / totalCharacters * 1000d;
			prob = Math.round(prob) / 10d;
			System.out.println(entry.character + " appears " + entry.count + " different times (" + prob + "%).");
		}

	}

}
