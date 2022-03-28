package staticinJava;

public class MathClassInJava {

	public void math() {
		double PI = Math.PI;
		double d = Math.E;
		System.out.println("PI: " + PI);
		System.out.println("E: " + d);
	}

	public static void main(String[] args) {
		MathClassInJava obj = new MathClassInJava();
		obj.math();
	}
}
