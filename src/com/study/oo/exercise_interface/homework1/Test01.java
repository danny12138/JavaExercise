package com.study.oo.exercise_interface.homework1;

public class Test01 {
    public static void main(String[] args) {
        Cat cat = new Cat("kitty", 2);
        System.out.println(cat.getName());
        System.out.println(cat.getAge());
        cat.work();
        cat.jump();
        Dog dog = new Dog("bigyellow", 4);
        System.out.println(dog.getName());
        System.out.println(dog.getAge());
        dog.work();
    }
}
