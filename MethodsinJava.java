package com.divergent.corejava.io;

public class MethodsinJava {

	public int add(int i, int j) {
		int k = i + j;
		return k;
	}

	public int sub(int a, int b) {
		int c = a - b;
		return c;
	}

	public int multiply(int p, int q) {
		int r = p * q;
		return r;
	}

	public int divide(int s, int t) {
		int u = s / t;
		return u;
	}

	public void even(int a) {
		if (a % 2 == 0) {
			System.out.println("even");
		} else
			System.out.println("odd");

	}

	public static void main(String[] args) {
		MethodsinJava obj = new MethodsinJava();

		int w = obj.add(20, 15);
		System.out.println(w);

		int d = obj.sub(30, 29);
		System.out.println(d);

		int y = obj.multiply(23, 2);
		System.out.println(y);

		int g = obj.divide(8, 4);
		System.out.println(g);

		obj.even(20);

	}
}
