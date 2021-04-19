package com.study.oo.exercise_absrtact;

public class Programmer extends Employee {
    private int bonus;

    public Programmer() {
    }

    public Programmer(String name, int id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public Programmer(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void show(){
        System.out.println("工作：软件开发");
    }
}
