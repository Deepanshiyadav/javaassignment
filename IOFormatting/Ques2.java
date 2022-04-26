package IOFormatting;

import java.util.Scanner;
import java.util.Locale;

public class Ques2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your Amount: ");
        double amt = s.nextDouble();
        System.out.println("Enter time: ");
        int time = s.nextInt();
        System.out.println("Enter your intrest: ");
        double intrest = s.nextDouble();

        double si = (amt*time*intrest)/100;
        System.out.println("Here is your Intrest Amount:  "+si+Locale.US);
    }


}
