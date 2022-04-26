package Operators;

public class Ques13 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;
        System.out.println("The value of a&b is:" + (a & b));
        System.out.println("The value of a|b is:" + (a | b));
        System.out.println("The value of a^b is:" + (a ^ b));
        System.out.println("The value of ~b is: " + (~b));

        int c = 0B00000000_00000000_00000000_00000100;
        System.out.println(c >> 1);
        System.out.println(c << 1);

        int d = 0B11111111_11111111_11111111_11111100;
        System.out.println(d >>> 29);

    }


}
