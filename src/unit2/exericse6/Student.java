/**
 * @class_name Student.java
 * @author Charles
 * @version 1.0
 * @date Sep 20, 2016
 * @description 
 */
package unit2.exericse6;

public class Student {

	private static String SCHOOL_NAME = "Richmond HIll High School";

	private String name;

	private double period1Mark;
	private double period2Mark;
	private double period3Mark;
	private double period4Mark;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return SCHOOL_NAME;
	}

	public double getMark(int period) {
		switch (period) {
			case 1:
				return this.period1Mark;
			case 2:
				return this.period2Mark;
			case 3: 
				return this.period3Mark;
			default: 
				return this.period4Mark;
		}
	}

	public void setMark(int period, double mark) {
		switch (period) {
			case 1:
				this.period1Mark = mark;
				break;
			case 2:
				this.period2Mark = mark;
				break;
			case 3: 
				this.period3Mark = mark;
				break;
			default: 
				this.period4Mark = mark;
				break;
		}
	}

	public double getAverage() {
		double d = 0;
		for (int i = 1; i <= 4; i++)
			d += getMark(i);
		return d / 4;
	}
}
