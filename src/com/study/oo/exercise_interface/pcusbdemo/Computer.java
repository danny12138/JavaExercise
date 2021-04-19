package com.study.oo.exercise_interface.pcusbdemo;

public class Computer implements Keyboard,Mouse {

    public void powerOn(){
        System.out.println("开机");
    }

    public void powerDown(){
        System.out.println("关机");
    }

    @Override
    public void showK() {

    }

    @Override
    public void showM() {

    }
}
