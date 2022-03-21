package com.ContolStatement;

public class infinity {
    public static void main (String [] args){
        double d= Double.NaN;
        if (Double.isNaN(d)){
            System.out.println("it is not a number");
        }
        System.out.println("positive infinity:"+ (2.5/0));
        System.out.println("negative infinity:"+(-6.9/0));
        float f = ((float)(0.0/0));
        System.out.println("Negative NaN:"+ f);



    }
}
