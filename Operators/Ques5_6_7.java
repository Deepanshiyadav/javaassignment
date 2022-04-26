package Operators;

public class Ques5_6_7 {
    public static void main(String[] args) {
        //question5
        float a= 1.2f;
        float b= -1.3f;
        System.out.println("Positive Infinite: " +a/0 );
        System.out.println("Negative Infinite: " +b/0);
        System.out.println("--------------------------------------------");
        //question6
        float f = 0.0f;
        System.out.println("NAN : " +f/0);
        System.out.println("--------------------------------------------");

        //question7
        System.out.println(" Arithmetic Exception:" +0/0);
        System.out.println("--------------------------------------------");

    }

}
