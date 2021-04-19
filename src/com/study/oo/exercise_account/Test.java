package com.study.oo.exercise_account;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Account n1 = new Account("1000",2000,1.23);
        Customer c1 = new Customer("Smith Jane", n1);
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用个人银行账户管理系统");
        while (true){
            System.out.println("请选择您要办理的业务，存款输入1，取款输入2，查看余额请输入3，退出输入其他数字。");
            int x = sc.nextInt();
            if (x == 1){
                System.out.println("请输入您要存款的金额：");
                double m1 = sc.nextDouble();
                n1.deposit(m1);
            }
            else if (x==2){
                System.out.println("请输入您要取款的金额：");
                double m2 = sc.nextDouble();
                n1.withdraw(m2);
            }
            else if (x==3){
                c1.show();
            }
            else {
                System.out.println("感谢您的使用，再见！");
                break;
            }
        }
    }
}
