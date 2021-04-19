package com.study.oo.exercise_interface.homework1;

public class Dog extends Animal{
    public void work(){
        System.out.println("看家");
    }
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
