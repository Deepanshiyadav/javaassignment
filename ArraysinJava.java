package com.divergent.corejava.io;

public class ArraysinJava {
	public  static void main(String[] args) {
		int arr[] = new int[5];
		int temp = 2;
		for (int i =0; i<arr.length;i++) {
			arr[i] = temp;
			temp = temp +2;
			
		}
		for (int j=0; j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
