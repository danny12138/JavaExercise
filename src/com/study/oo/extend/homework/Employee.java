package com.study.oo.extend.homework;

public class Employee {
    private String name;
    private int id;
    private int salary;

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

    public Employee() {

    }

    public Employee(String name, int id, int salary) {
        super();
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void show() {
        System.out.println("姓名：" + name + ",工号：" + id + ",工资：" + salary);
    }
}
