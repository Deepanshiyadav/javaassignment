package com.ContolStatement;

public class multidaray {
	public static void main(String[] args) {

		int[][] array2D = { { 5, 4, 3, 2, 1 }, { 2, 3, 4, 4,9,5, 6 } };
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < array2D[i].length; j++) {

				System.out.print(array2D[i][j] + " ");

			}
			System.out.println();
		}
	}

}
