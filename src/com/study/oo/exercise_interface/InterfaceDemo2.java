package com.study.oo.exercise_interface;

public interface InterfaceDemo2 {
    final int id = 2;

    public abstract void showA();

    public default void showB() {
        System.out.println("默认方法被执行2");
    }

    public static void showC() {
        System.out.println("静态方法被执行2");
    }
}
