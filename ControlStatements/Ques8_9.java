package ControlStatements;

public class Ques8_9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        //question 8
        for (int i = 0; i == arr.length; i++) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------------------");
        //question 9
        for (int j : arr) {
            System.out.println(j);

            if (j >= 10) {
                System.out.println("Sorry!!! the value is greater than range");
                break;
            }
        }
    }
}
