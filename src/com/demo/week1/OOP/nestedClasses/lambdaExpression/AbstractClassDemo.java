package com.demo.week1.OOP.nestedClasses.lambdaExpression;

/*
* 抽象方法: 被 abstract 修饰分方法叫做 抽象方法, 抽象方法不包含函数实现. 仅仅包含函数签名. 一般存在于接口和抽象类中.
* 抽象类: 使用 abstract 修饰的类.
*
* 抽象类的特点: 类中的字段可以只定义而不初始化. 访问控制符没有限制. 类中的方法如果没有 abstract 修饰, 就必须提供函数实现, 如果使用 abstract 修饰, 那么就仅包含函数签名.
* 同时, 抽象类不能被实例化, 如果有个子类继承了抽象类, 那么子类必须实现抽象类中的抽象方法, 如果没有实现,那么子类也属于抽象类, 不能被实例化.
*
* 接口: 接口是对抽象类更高级的抽象, 接口中所有的字段都是 public static final的, 所以字段被定义后, 必须初始化,因为接口定义被加载时, 需要确定字段的值用来分配内存.
* 接口中所有的方法, 默认都是 public abstract 的, 所以方法不必也不能提供具体实现,所有的实现都必须通过接口类型的实现类去具体实现.
*
* 函数式接口: 如果一个接口中只有一个方法签名, 那么这个接口就是函数式接口.就是在一个方法中如果参数类型是函数式接口, 那么可以通过 Lambda Expression 的方式传递实现而不用编写匿名内部类.
* */


// functional interface
interface StartUp {
    void start(String message);
}

interface Brake {
    void brake(String message);
}
