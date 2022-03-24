package MethodOverloadingInJava;

public class Multiplication {
	public void multiply(int i , int j, int z) {
		System.out.println(i*j*z);
	}
	public void multiply(int i , int j, float z) {
		System.out.println(i*j*z);
	}
	public void multiply(double i , float j,float  z) {
		System.out.println(i*j*z);
	}
	public void multiply(double i , double j, double z) {
		System.out.println(i*j*z);
	}
	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		m.multiply(2, 7, 10);
		m.multiply(20, 15,67.9f );
		m.multiply(45d, 87.8f, 67f);
		m.multiply(6d, 908d, 12d);
	}

}
