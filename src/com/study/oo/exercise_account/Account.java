package com.study.oo.exercise_account;

public class Account {
    private String id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(String id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double money){
        if (balance < money){
            System.out.println("余额不足，取钱失败");
        }
        else {
            balance -= money;
            System.out.println("成功取出："+money);
            System.out.println("余额："+balance);
        }
    }

    public void deposit(double money){
        balance += money;
        System.out.println("成功存入："+money);
        System.out.println("余额："+balance);
    }
}
