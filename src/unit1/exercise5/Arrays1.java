/**
 * @class_name Arrays1.java
 * @author Charles
 * @version 1.0
 * @date Sep 14, 2016
 * @description 
 */
package unit1.exercise5;

public class Arrays1 {

	public static void main(String[] args) {

		int[][] numbers = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int x = numbers.length - 1; x >= 0; x--) {
			int[] innerArray = numbers[x];

			for (int y = innerArray.length - 1; y >= 0; y--)
				System.out.print(numbers[x][y]);
			System.out.print(" ");
		}

		System.out.println();
	}

}
