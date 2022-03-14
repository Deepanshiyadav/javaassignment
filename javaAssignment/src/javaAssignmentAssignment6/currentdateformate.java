package javaAssignmentAssignment6;

import java.util.Date;

public class currentdateformate {
	public static void main(String[] args) {

		Date date = new Date();

		System.out.printf("%tT%n", date);

		System.out.printf("hours: %tH; minutes: %tM; seconds: %tS%n", date, date, date);

		System.out.printf("%1$tH : %1$tM : %1$tS  %1$tp  %1$tL  %1$tN  %1$tZ  %1$tA  %1$tB  %1$tY %n" , date);
		
	}
}
