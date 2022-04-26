package ExceptionHandling;

public class Ques10_Test2 {
    public static void main(String[] args) {
        int a =20;
        int b=30;
        int c= 10;
        int x = (a * b)/(a - b + c); // it shows an arithmetic Exception , because values is not divided by 0 (20-30+10)= (-10+10) = 0
        System.out.println("Result: " +x);
    }
}
