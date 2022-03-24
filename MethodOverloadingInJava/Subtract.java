package MethodOverloadingInJava;

public class Subtract {
	public void sub(int i, int j) {
		System.out.println(i-j);
	}
	public void sub(int i,int j, int z) {
		System.out.println(i-j-z);
	}
	public void sub(int i,float f,float e) {
		System.out.println(i-f-e);
	}
	public void sub(float f, float e, float d) {
		System.out.println(f-e-d);
	}
	
	public static void main(String[] args) {
		Subtract s = new Subtract();
		s.sub(20,3);
		s.sub(10,20,3);
		s.sub(19,12.90f, 4.56f);
		s.sub(20.9f,10.98f,2.4f);
	}

}
