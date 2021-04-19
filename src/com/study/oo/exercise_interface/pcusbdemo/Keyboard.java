package com.study.oo.exercise_interface.pcusbdemo;

public interface Keyboard {
    public abstract void showK();

    public default void connectK() {
        System.out.println("键盘连接了");
    }
}
