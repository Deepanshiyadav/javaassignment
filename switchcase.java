package com.ContolStatement;

enum weekdays {
	monday, tuesday
}

public class switchcase {

	public static void main(String[] args) {
		int day = 2;

		switch (day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;

		default:
			System.out.println("not a valid value");

		}
	}
}
