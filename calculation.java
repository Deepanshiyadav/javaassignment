package javaAssignmentAssignment6;

import java.util.Scanner;

public class calculation {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

        int i;
        for (i=0; i<2; i++) {
        	
		System.out.printf("%n%nEnter Amount:");
		double amt = in.nextDouble();
		
		System.out.println("Enter Time: ");
		int t = in.nextInt();
		
		System.out.println("Enter Rate: ");
		int rate = in.nextInt();
		
		double SI = (amt * t * rate) / 100;
		System.out.printf(" Your Intrest is:  " + SI);
		

        }
	}

}
