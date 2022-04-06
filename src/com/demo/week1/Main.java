package com.demo.week1;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
//	 write your code here
//        var a = 3.15;
//        System.out.println(Double.valueOf(a).getClass());
//        var str1 = "Hello, World";
//        System.out.println(str1.lastIndexOf("World"));
//        var b = -100;
//        System.out.println(b>1?"大于 1":b+": 小于等于 1");
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE-1);
//        final double result1 = 2 / 3 * 5;
//        final double result2 = 2 * 5 / 3;
//        System.out.println(result1);

        String s1 = "Hi";
        int a = 1;
        System.out.println("s1 memory address: " + System.identityHashCode(s1));
        f(s1);
        System.out.println("s1 memory address after being passed into the function: " + System.identityHashCode(s1));
    }

    public static void f(String str){
        System.out.println("address of inner parameter: " + System.identityHashCode(str));
        str = "hello";
        System.out.println("address of inner parameter after referring to a new obj: " + System.identityHashCode(str));
    }
}
