package com.divergent.corejava.io;

import java.util.Scanner;

public class TakeUserInput {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = in.next();
		 
		 System.out.println("enter your age? ");
		 int age = in.nextInt();
		 System.out.println("your age is : " + age);
		 
	}

	
}
