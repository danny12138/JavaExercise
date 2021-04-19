package com.study.oo.extend;

public class ProjectManger extends Personnel {
    //子类继承父类
    int bonus;
    String job;

    {
        job = "ProjectManger";
    }

    public ProjectManger() {
    }

    public ProjectManger(int bonus, String job) {
        this.bonus = bonus;
        this.job = job;
    }

    public ProjectManger(String name, int age, int id, int pay, String job, int bonus, String job1) {
        super(name, age, id, pay, job);
        this.bonus = bonus;
        this.job = job1;
    }

    public ProjectManger(String name, int age, int id, int pay, String job) {
        super(name, age, id, pay, job);
    }

    public void ShowParentJob() {
        System.out.println("super结果：" + super.job);
        System.out.println("this结果：" + this.job);
    }

    /**
     * @ Override
     */
    public void show(){
        System.out.println("name: "+ getName() +",age: "+ getAge() +",id: "+ getId() +",pay: "+pay+",job:"+job+",bonus: "+bonus);
    }
}
