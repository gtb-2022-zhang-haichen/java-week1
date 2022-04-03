package com.demo.week1.OOP.inheritance;

public class DerivedClass extends SuperClass{
    public DerivedClass() {
        System.out.println("Default Derived constructors");
    }

    public DerivedClass(int args) {
        this();
        System.out.println("Constructors with int args" + args);
    }

    public DerivedClass(String args) {
        super(args);
        System.out.println("Constructors with String args " + args);
    }

    @Override
    public String toString() {
        return "Derived Class String";
    }
}
