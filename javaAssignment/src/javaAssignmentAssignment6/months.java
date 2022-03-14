package javaAssignmentAssignment6;

import java.util.Scanner;

public class months {
	public static void main(String[] args) {
		System.out.println("Enter a value: ");

		while (true) {
			Scanner in = new Scanner(System.in);
			int Month = in.nextInt();

			switch (Month) {
			case 1:
				System.out.println("January");

			case 2:
				System.out.println("February");

			case 3:
				System.out.println("March");

			case 4:
				System.out.println("April");

			case 5:
				System.out.println("May");

			case 6:
				System.out.println("June");

			case 7:
				System.out.println("July");
			case 8:
				System.out.println("August");

			case 9:
				System.out.println("September");

			case 10:
				break;

			}
		}
	}

}
