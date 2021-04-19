package com.study.oo.exercise_interface;

//先继承方法后实现接口
public class ClassDemo2 extends ClassDemo implements InterfaceDemo2 {
    int id = 1;

    public ClassDemo2() {
    }

    @Override
    public void showA() {
        System.out.println();
    }

    @Override
    public void showB() {
        System.out.println("子类实现父类与自己实现的接口默认方法如果重名也要重写方法，属性重名也要重写");
    }


}
