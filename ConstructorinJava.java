package javaAssignmentAssignment6;

public class ConstructorinJava {
	int i;

	public ConstructorinJava() {
		i = 100;
		System.out.println("in constuctor");
	}

	public ConstructorinJava(int p) {
		i = p;
		System.out.println("in parameterised constructor");

	}

	public void init() {
		i = 10;
	}

	public void display() {
		System.out.println(i);
	}

	public static void main(String[] args) {
		ConstructorinJava obj = new ConstructorinJava();
		//obj.init();
		obj.display();
	}

}
