/**
 * @class_name Sorting3.java
 * @author Charles
 * @version 1.0
 * @date Sep 13, 2016
 * @description 
 */
package exercise4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sorting3 {

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

		Map<Character, Integer> count = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < appearance.length; i++) {
			char reference = (char) (i + 65);
			count.put(reference, appearance[i]);
		}

		List<Entry<Character, Integer>> entries = new LinkedList<Entry<Character, Integer>>();
		entries.addAll(count.entrySet());

		Collections.sort(entries, new Comparator<Entry<Character, Integer>>() {
			public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue()) * -1;
			}
		});

		for (Entry<Character, Integer> entry : entries) {
			double prob = ((double) entry.getValue()) / totalCharacters * 1000d;
			prob = Math.round(prob) / 10d;
			System.out.println(entry.getKey() + " appears " + entry.getValue() + " different times (" + prob + "%).");
		}

		br.close();

	}

}
