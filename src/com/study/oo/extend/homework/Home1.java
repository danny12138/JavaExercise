package com.study.oo.extend.homework;

public class Home1 {
    public static void main(String[] args) {
        // 手机类
        Phone p = new Phone();
        p.setBrand("华为P40");
        p.setPrice(5000);
        p.call();
        p.sendMessage();
        p.playGame();

        // 狗类
        Dog d = new Dog();
        d.setName("阿黄");
        d.setAge(10);
        d.eat();
        d.lookHome();

        // 猫类
        Cat c = new Cat();
        c.setAge(2);
        c.setName("翠花");
        c.eat();
        c.catchMouse();

        // 学生
        Student s = new Student();
        s.setChinese(90);
        s.setMath(80);
        s.setEnglish(92);
        int sum = s.getSum();
        System.out.println("总成绩:" + sum);

        // 长方形类
        Rect r = new Rect();
        r.setLength(100);
        r.setWidth(40);
        int girth = r.getGirth();
        System.out.println(girth);
        int area = r.getArea();
        System.out.println(area);
    }
}
