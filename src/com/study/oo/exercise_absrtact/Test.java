package com.study.oo.exercise_absrtact;

public class Test {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("张三",123,12000,9000);
        Employee.print(p1);
        System.out.println("bonus: "+p1.getBonus());
        p1.show();

        TestingEngineer p2 = new TestingEngineer("李四",234,10000);
        Employee.print(p2);
        p2.show();

        ProjectManger p3 = new ProjectManger("王五",456,11000,7000);
        Employee.print(p3);
        System.out.println("bonus: "+p3.getBonus());
        p3.show();
    }
}
