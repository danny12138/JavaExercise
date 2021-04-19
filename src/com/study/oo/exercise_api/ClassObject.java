package com.study.oo.exercise_api;

import java.util.Objects;

public class ClassObject {
    public static void main(String[] args) {
        ObjectA a1 = new ObjectA("AA",11);
        ObjectA a2 = new ObjectA("AA",12);
        ObjectA b1 = new ObjectB("AA",11);
        ObjectC c1 = new ObjectC();
        ObjectA aa = a1;
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(b1.hashCode());
        System.out.println(c1.hashCode());
        System.out.println(a1 == b1);
        System.out.println(a1.equals(a2));
        System.out.println(a1.getClass());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(aa.toString());

    }
}

class ObjectA{
    private String name;
    private int age;

    @Override
    public String toString() {
        return super.toString();
    }

    public ObjectA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ObjectA() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ObjectA)) return false;
        ObjectA objectA = (ObjectA) o;
        return getAge() == objectA.getAge() &&
                getName().equals(objectA.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}

class ObjectB extends ObjectA{
    public ObjectB(String name, int age) {
        super(name, age);
    }

    public ObjectB() {
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class ObjectC extends ObjectA{
    public ObjectC(String name, int age) {
        super(name, age);
    }

    public ObjectC() {
    }
}
