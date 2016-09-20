/**
 * @class_name Main.java
 * @author Charles
 * @version 1.0
 * @date Sep 20, 2016
 * @description 
 */
package unit2.exericse6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		Student[] students = new Student[5];
		for(int i = 0; i <  5; i++) {
			Student rawStudent = new Student();
			
			System.out.print("Enter the name of Student #" + (i + 1) + "?: ");
			rawStudent.setName(scanner.nextLine());
			
			for(int mark = 1; mark <= 4; mark++) {
				System.out.print("Enter their mark #" + mark + ": ");
				rawStudent.setMark(mark, Double.parseDouble(scanner.nextLine()));
			}
			
			System.out.println();
			students[i] = rawStudent;
		}
		
		for(Student student : students) {
			System.out.println("Student Name: " + student.getName());
			for(int i = 1; i <= 4; i++)
				System.out.println("Period " + i + " Mark: " + student.getMark(i));
			System.out.println("Student Average: " + student.getAverage());
			System.out.println();
		}
		
		scanner.close();
		
	}
}
