package com.demo.week1.OOP.initializer;

public class Demo {
    private int id;

    public Demo() {
        this(-1);
    }

    // 定义一个类变量的初始化代码块
    {
        System.out.println("This is a constructor");
        System.out.println(this.getId());
    }

    public Demo(int id) {
        this.id = id;
        System.out.println("This is my ID " + id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
