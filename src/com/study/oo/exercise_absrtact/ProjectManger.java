package com.study.oo.exercise_absrtact;

public class ProjectManger extends Employee {
    private int bonus;

    public ProjectManger() {
    }

    public ProjectManger(String name, int id, int salary, int bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    public ProjectManger(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void show() {
        System.out.println("工作：控制进度");
    }
}
