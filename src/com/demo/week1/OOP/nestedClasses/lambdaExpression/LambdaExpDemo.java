package com.demo.week1.OOP.nestedClasses.lambdaExpression;


public class LambdaExpDemo {
    public static void main(String[] args) {
        var plane = new Plane();
        plane.takeOff("Flying to Beijing", (m) -> {
            System.out.println("Plane is already to take off.");
            System.out.println(m + "!");
        });
        plane.land("Landed successfully", (m) -> {
            System.out.println(m + "!");
            System.out.println("Welcome to Beijing...");
        });

        var car = new Car();
        car.start("Staring...", (dashboardMsg) -> {
            System.out.println("service of airport pickup is ready for you...");
            System.out.println(dashboardMsg + "!");
        });
        car.stop("arriving at destination...", (dashboardMsg) -> {
            System.out.println(dashboardMsg + "!");
            System.out.println("Welcome home honey!");
        });
    }
}


class Plane {
    public void takeOff(String message, StartUp s) {
        s.start(message);
    }

    public void land(String message, Brake b) {
        b.brake(message);
    }
}


class Car {
    public void start(String message, StartUp s) {
        s.start(message);
    }

    public void stop(String message, Brake b) {
        b.brake(message);
    }
}
