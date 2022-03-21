package javaAssignmentAssignment6;

import java.util.Scanner;

public class intro {
	public static void main(String[] args) {
		Scanner in = new  Scanner(System.in);
		
		System.out.printf("Enter your First Name:  ");
		String first_name = in.next();
		
		System.out.printf("Enter your Last Name:  ");
		String last_name = in.next();
		
		System.out.printf("what is your age?  ");
		int age = in.nextInt();
		
		System.out.printf("whats is your address?  ");
		String address = in.next();
		
		System.out.printf(" %n Your Name is :  " + first_name   + last_name );
		System.out.printf(" %n Your Age is:   " + age);
		System.out.printf(" %n Your Address is: " + address);
	}

}
