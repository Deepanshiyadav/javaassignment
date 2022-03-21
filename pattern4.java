package javaAssignmentAssignment6;

public class pattern4 {
	public static void main(String[] args) {
		int n = 5;
		for (int i = 0; i <n; i++) {
			for (int j = n - i; j > i; j--) {
				System.out.print("  ");
				for (j = 0; j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}
