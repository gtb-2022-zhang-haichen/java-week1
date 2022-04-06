package com.demo.week1.OOP.nestedClasses.non_static_nested_class;



public class OuterClass {
    final String outerField = "Outer Field";
    static final String staticOuterField = "Static Outer field";
    public int x = -1;

    class InnerClass {
        // 关于内部类和外部类存在同名的字段时, java 编译器会隐藏外部类的字段名,在内部类中所有的字段都仅限于内部类中的字段值
        // 如果想要同时使用外部类的字段值,那么就得使用 OuterClass.this.fields 的方式来访问成员字段名.
        public int x = 1;
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
            System.out.println(OuterClass.this.x);
        }
    }

    // 一个静态的嵌套类其实和其他顶级类没有任何区别.
    // 静态的嵌套类无法直接访问外部类的成员属性.因为他是在类加载的时候创建的, 而成员属性只有在类对象被实例化之后才会创建
    // 因此无法直接访问成员变量. 因此在这个类的方法中如果想要访问它外部类的成员变量.需要通过它外部类的对象来访问.
    static class StaticNestedClass {
        void accessMembers(OuterClass outer) {
//            System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
        var outer = new OuterClass();

        // 在创建innerClass的对象时, 是通过 outerObject.new 的方式来创建的.
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();
        staticNestedObject.accessMembers(outer);

        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();
        topLevelObject.accessMembers(outer);
    }
}
