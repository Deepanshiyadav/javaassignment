package IOFormatting;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your  First Name: ");
        String fn = s.next();
        System.out.println("Enter your  last Name: ");
        String ln = s.next();
        System.out.println("Enter your Age: ");
        int age = s.nextInt();
        System.out.println("Enter your Address: ");
        String add = s.next();

        System.out.println("---------------------------------------");

        System.out.println("Your First Name is:  " +fn );
        System.out.println("Your Last Name is:  " +ln);
        System.out.println("Your age is : " + age);
        System.out.println("Your Address is : " +add);

    }
}
