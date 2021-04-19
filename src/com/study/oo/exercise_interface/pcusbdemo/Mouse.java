package com.study.oo.exercise_interface.pcusbdemo;

public interface Mouse {
    public abstract void showM();

    public default void connectM() {
        System.out.println("鼠标连接了");
    }
}
