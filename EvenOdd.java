package javaAssignmentAssignment6;

public class EvenOdd {
	public void logic(int a) {
		if (a % 2 == 0) {
			System.out.println("Even");
		} else
			System.out.println("Odd");

	}
	public static void main(String[] args) {
		EvenOdd obj = new EvenOdd();
		
		obj.logic(25);
	}
	

}
