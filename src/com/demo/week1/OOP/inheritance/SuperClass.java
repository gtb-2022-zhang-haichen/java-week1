package com.demo.week1.OOP.inheritance;

public class SuperClass {
    public SuperClass() {
        System.out.println("Default Super constructor");
    }

    // 父类只定义一个带参的和一个不带参数的来控制行为
    public SuperClass(String arg) {
        System.out.println("Constructor Super with String args:"+ arg);
    }

    @Override
    public String toString() {
        return "SuperClass String";
    }
}
