package com.study.oo.exercise_interface;

public class ClassDemo implements InterfaceDemo{
    static int ss = 88;

    public ClassDemo() {
    }

    @Override
    public void showA() {
        System.out.println("重写接口静态方法（行为）");
    }

    /*@Override
    public void showB() {
        System.out.println("重写接口默认方法");
    }*/
}
