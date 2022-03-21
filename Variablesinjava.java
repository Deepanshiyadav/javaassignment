package javaAssignmentAssignment6;

public class Variablesinjava {
	int i = 10; // instance variable

	public void show() {
		System.out.println(i + " instance");
		i = 90;
		System.out.println(i + " instance ");
		int i = 29; // local variable
		System.out.println(i + " local");

	}

	public void display() {
		System.out.println(i + " display");
	}

	public static void main(String[] args) {
		Variablesinjava obj = new Variablesinjava();

		obj.show();
		obj.display();
	}

}
