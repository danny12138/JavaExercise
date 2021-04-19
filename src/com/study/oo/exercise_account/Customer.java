package com.study.oo.exercise_account;

public class Customer {
    private String name;
    private Account act;

    public Customer() {
    }

    public Customer(String name, Account act) {
        this.name = name;
        this.act = act;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAct() {
        return act;
    }

    public void setAct(Account act) {
        this.act = act;
    }

    public void show(){
        System.out.println("尊敬的"+this.name+"先生/女士，");
        System.out.println("您的账号为："+act.getId()+"；余额为："+act.getBalance()+"；年利率为："+act.getAnnualInterestRate()+"%");

    }
}
