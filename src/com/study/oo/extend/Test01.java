package com.study.oo.extend;

public class Test01 {
    public static void main(String[] args) {
        Personnel p1 = new Personnel();
        p1.setName("aaa");
        p1.setId(1);
        p1.setAge(29);
        p1.show();

        Programmer p2 = new Programmer("bbb",22,100,9000,"Java");
        p2.show();

        ProjectManger p3 = new ProjectManger(8000,"ProjectManger1");
        p3.setAge(25);
        p3.setName("abc");
        p3.setId(10);
        System.out.println(p3.job);
        System.out.println(p3.bonus);
        //p3.ShowParentJob();
        p3.show();

        //普通内部类的对象创造
        Personnel.Leader p5 = new Personnel().new Leader();
        System.out.println(p5.name);
        //静态内部类的对象创造
        Personnel.Underling p6 = new Personnel.Underling();
        System.out.println(p6.name);
    }
}
