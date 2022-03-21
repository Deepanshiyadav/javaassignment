package javaAssignmentAssignment6;

public class Pimenumber {
	public void prime(int n) {
		int count = 0;
		for (int i = 2;i<n; i++) {
			if (n%i == 0) {
				count++;
				break;
				
			}
		}
		if (count > 0 ) {
			System.out.println("It is not a Prime Number");
		}
		else {
			System.out.println("It is a Prime Number");
		}
		
		
	}
	public static void main(String[] args) {
		Pimenumber obj = new Pimenumber();
		obj.prime(13);
		
	}
	

}
