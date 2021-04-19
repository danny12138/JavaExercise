package com.study.oo.exercise_absrtact;

public class TestingEngineer extends Employee {

    public TestingEngineer() {
    }

    public TestingEngineer(String name, int id, int salary) {
        super(name, id, salary);
    }

    @Override
    public void show() {
        System.out.println("工作：软件测试");
    }
}
