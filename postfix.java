package com.ContolStatement;

public class postfix {
    public static void main(String [] args){
        int a= 25;
        int b=30;
        System.out.println( "postfix =" +(++a)  ) ;
        System.out.println("prefix = " +(b++));
        int p = 18;
        int q = 2;
        System.out.println("increment="+(2*++p));
        System.out.println("decrement="+(2*--q));
    }
}
