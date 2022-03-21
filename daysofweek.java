package javaAssignmentAssignment6;
import java.util.Scanner;

public class daysofweek {
	public static void main(String[] args) {
		
		System.out.println("Enter a value: ");
		
		Scanner in =  new Scanner(System.in);
		int days = in.nextInt();
		
		
		switch(days) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
			default:
				System.out.println("Not a Valid Number!");
		}
		
		
	}

}
