package com.study.oo.extend.homework;

public class Home2 {
    public static void main(String[] args) {
        // 员工类
        Employee e  = new Employee("王小二", 18, 1000);
        e.show();

        // 动物类
        Animal a = new Animal("二哈", 1);
        a.eat();
        a.sleep();

        // 人类
        Person p = new Person("芙蓉姐", 32, "女");
        p.study();
        p.sleep();
    }
}
