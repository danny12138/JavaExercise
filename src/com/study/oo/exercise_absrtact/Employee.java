package com.study.oo.exercise_absrtact;

public abstract class Employee {
    //父类
    private String name;
    private int id;
    private int salary;

    public Employee() {
        //System.out.println("抽象类的空参构造");
    }

    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public abstract void show();

    public static void print(Employee p){
        System.out.println("name: "+p.getName() + ",id: "+p.getId()+",salary: "+p.getSalary());;
    }
}
