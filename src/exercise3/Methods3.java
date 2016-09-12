/**
 * @class_name Methods3.java
 * @author Charles
 * @version 1.0
 * @date Sep 12, 2016
 * @description 
 */
package exercise3;

import java.util.Scanner;

public class Methods3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Input the value of A: ");
		int a = Integer.parseInt(scanner.nextLine());

		System.out.print("Input the value of B: ");
		int b = Integer.parseInt(scanner.nextLine());

		System.out.print("Input the value of C: ");
		int c = Integer.parseInt(scanner.nextLine());

		System.out.print("This quadratic equation has " + countRoots(a, b, c) + " different roots.");

		scanner.close();

	}

	public static int countRoots(int a, int b, int c) {
		int discriminant = getDiscriminant(a, b, c);
		if (discriminant < 0)
			return 0;
		else if (discriminant == 0)
			return 1;
		else
			return 2;
	}

	public static int getDiscriminant(int a, int b, int c) {
		return (int) (Math.pow(b, 2) - (4 * a * c));
	}
}
