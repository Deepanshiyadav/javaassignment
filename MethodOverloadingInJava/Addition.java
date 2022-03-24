package MethodOverloadingInJava;

public class Addition {
	
	public void sum(int i, int j) {
		System.out.println(i+j);
	}
	public void sum(int i, int j, int z) {
		System.out.println(i+j+z);
	}
	public void sum(int i, float f) {
		System.out.println(i+f);
	}
	public void sum(float f, float e, float d) {
		System.out.println(f+e+d);
	}

	public static void main(String[] args) {
		Addition add = new Addition();
		add.sum(120,12);
		add.sum(20,10,60);
		add.sum(29, 29.45f);
		add.sum(28.9f,12.4f,29);
	}
}
