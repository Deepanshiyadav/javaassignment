package Operators;

public class Ques17 {
    public static void main(String[] args) {
        int x = 1000000000;
        System.out.println(x*4);
        System.out.println(Math.multiplyExact(x,4));//IntegerOverFlow
    }
}
