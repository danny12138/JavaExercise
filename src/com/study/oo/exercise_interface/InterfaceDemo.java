package com.study.oo.exercise_interface;

public interface InterfaceDemo {
    final int id = 1;

    public abstract void showA();

    public default void showB() {
        System.out.println("默认方法被执行");
    }

    public static void showC() {
        System.out.println("静态方法被执行");
    }

}
