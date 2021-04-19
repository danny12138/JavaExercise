package com.study.oo.extend;

public class Programmer extends Personnel{
    //子类继承父类

    public Programmer() {
    }

    public Programmer(String name, int age, int id, int pay, String job) {
        super(name, age, id, pay, job);
    }


}
