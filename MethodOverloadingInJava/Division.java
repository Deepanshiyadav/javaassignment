package MethodOverloadingInJava;

public class Division {

	public void divide(int i, int j) {
		System.out.println(i / j);
	}

	public void divide(float i, float j) {
		System.out.println(i / j);
	}

	public void divide(double i, double j) {
		System.out.println(i / j);
	}

	public static void main(String[] args) {
		Division d = new Division();
		d.divide(9, 3);
		d.divide(20f, 2.3f);
		d.divide(19d, 12d);
	}

}
