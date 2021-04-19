package com.study.oo.extend;

public class Personnel {
    //父类
    private String name;
    private int age;
    private int id;
    int pay = 7000;
    String job = "GeneralStaff";

    public Personnel() {
    }

    public Personnel(String name, int age, int id, int pay, String job) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.pay = pay;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    class Leader{
        String name = "leader";
    }

    static class Underling{
        String name = "underling";
    }

    public void show(){
        System.out.println("name: "+name+",age: "+age+",id: "+id+",pay: "+pay+",job:"+job);
    }

}
