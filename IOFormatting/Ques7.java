package IOFormatting;

import java.util.Scanner;

public class Ques7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of the Day you print: ");
        int day = s.nextInt();
        for (int i = 0 ;;i++){
            if (i==0)
                break;
        }

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
                default:
                    System.out.println("Sunday");
        }
    }
}
