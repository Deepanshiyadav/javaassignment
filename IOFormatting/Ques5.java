package IOFormatting;

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int row = s.nextInt();
        for(int i =0;  i<row; i++){
            for (int j =0; j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
