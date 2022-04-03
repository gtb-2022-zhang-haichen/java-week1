package com.demo.week1.numeric_computation;

import com.demo.week1.Main;

public class NumericComputionDemo {
    public static void main(String[] args) {
        double x = 4;
        double y = Math.sqrt(x);
        System.out.println(y);

        convertType();
        isInfinite();
    }

    public static void convertType(){
        final int integer = 0x0123_4567;
        final short smallerInteger = (short)integer;
        System.out.printf("%x\n", smallerInteger);
    }

    public static void isInfinite(){
        var x = 1d/0d;
        System.out.println(Double.isInfinite(x));
    }

}
