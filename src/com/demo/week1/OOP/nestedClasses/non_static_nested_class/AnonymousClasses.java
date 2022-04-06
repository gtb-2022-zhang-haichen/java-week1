package com.demo.week1.OOP.nestedClasses.non_static_nested_class;


import org.w3c.dom.ls.LSOutput;

import java.awt.*;

public class AnonymousClasses {
    interface HelloWorld {
        void greet();
        void greetSomeone(String someone);
    }

    // 外部属性
    int a = 1;

    // 在方法中声明一个匿名内部类
    public void sayHello(){
        // 定义一个 局部变量.
        var local = "local";


        class EnglishGreeting implements HelloWorld {
            String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                this.name = someone;
                System.out.println("Hello, " + this.name);
            }

        }


        EnglishGreeting englishGreeting = new EnglishGreeting();

        // 通过接口变量的方式创建匿名内部类.
        HelloWorld frenchGreeting = new HelloWorld() {
            String name = "tout le monde";

            @Override
            public void greet() {
                greetSomeone("tout le monde");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }

        };

        HelloWorld spanishGreeting = new HelloWorld() {
            String name = "mundo";

            @Override
            public void greet() {
                greetSomeone("mundo");
            }

            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greet();
        spanishGreeting.greet();

    }

    public static void main(String[] args) {
        AnonymousClasses anonymousClasses = new AnonymousClasses();
        anonymousClasses.sayHello();
        Button btn = new Button();
    }


}
