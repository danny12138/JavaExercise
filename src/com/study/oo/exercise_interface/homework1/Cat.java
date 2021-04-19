package com.study.oo.exercise_interface.homework1;

public class Cat extends Animal implements Work{
    public void work(){
        System.out.println("捉老鼠");
    }
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("会跳高的猫");
    }
}
