package com.demo.week1.OOP.nestedClasses.non_static_nested_class;

interface Greeting {
    public void hello();
    public void ask();
}

interface SayBye {
    public void bye();
}

class Student {
    public void sayHello(Greeting greet) {
        greet.hello();
        greet.ask();
    }

    public void sayByeBye(SayBye bye){
        bye.bye();
    }
}


public class AnonymousDemo {
    public static void main(String[] args) {
        var chineseStu = new Student();
        chineseStu.sayHello(new Greeting() {
            @Override
            public void hello() {
                System.out.print("你好! ");
            }

            @Override
            public void ask() {
                System.out.println("您吃了吗");
            }
        });
        chineseStu.sayByeBye(new SayBye() {
            @Override
            public void bye() {
                System.out.println("再见了您.");
            }
        });

        var europeStu = new Student();
        europeStu.sayHello(new Greeting() {
            @Override
            public void hello() {
                System.out.print("Hi, bro! ");
            }

            @Override
            public void ask() {
                System.out.println("What's Up!");
            }
        });
        europeStu.sayByeBye(new SayBye() {
            @Override
            public void bye() {
                System.out.println("See you...");
            }
        });
    }
}


