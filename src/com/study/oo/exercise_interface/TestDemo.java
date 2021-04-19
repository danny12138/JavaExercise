package com.study.oo.exercise_interface;

public class TestDemo {
    public static void main(String[] args) {
        ClassDemo cd = new ClassDemo();
        cd.showA(); //抽象方法在重写后访问
        cd.showB(); //默认方法访问
        //cd.showC(); 接口的静态方法只能被接口调用
        InterfaceDemo.showC();
        System.out.println(cd.id); //直接访问接口中的属性
        System.out.println(ClassDemo.ss);//静态变量可以直接通过类访问
        System.out.println(cd.ss);//静态变量也通过构建对象来访问

        ClassDemo2 cd2 = new ClassDemo2();
        System.out.println(ClassDemo2.ss);//静态变量继承后也可以直接通过类访问
        System.out.println(cd2.ss);//静态变量也可以通过继承后构建对象来实现
        System.out.println(cd2.id);//子类可以继承父类实现的接口，即调用父类接口的默认方法
        cd2.showB();               //和属性
    }
}
