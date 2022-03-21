package com.ContolStatement;

public class bitwise {
    public static void main(String[] args){
        int a=3, b=5;
        System.out.println("And operator= " +(a&b));
        System.out.println("Or operator=" +(a|b));
        System.out.println("xor operator= " +(a^b));

        System.out.println(+(~a));
        int c=0b00000000_00000000_00000000_00000010;
        System.out.println("left shift= " +(c >> 1));
        System.out.println("right shift =" +(c << 1));

        int d=0b11111111_11111111_11111111_11111100;
        System.out.println(" unary operator=" +(d >>> 29));


    }
}
