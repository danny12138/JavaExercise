package com.study.oo.exercise_api;

import java.util.Scanner;

public class TutorialEx {
    public static void main(String[] args) {
        UserLogin();
        //UpFLowO();

    }
    //toUpperCase First element toLowerCase other elements
    private static void UpFLowO() {
        Scanner s1 = new Scanner(System.in);
        String str = s1.nextLine();
        String str1 = str.substring(0,1).toUpperCase();
        String str2 = str.substring(1).toLowerCase();
        System.out.println(str1+str2);
        s1.close();
    }

    private static void UserLogin() {
        String user = "admin";
        String passwords = "123";
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while (true){
            System.out.print("请输入用户名: ");
            String n = sc.next();
            System.out.print("请输入密码: ");
            String p = sc.next();
            count++;
            if (n.equals(user)&& p.equals(passwords)){
                System.out.println("登陆成功!");
                break;
            }
            else {
                if (count < 3){
                    System.out.println("密码错误,请重新输入,您还有"+(3-count)+"次机会尝试.");
                }
                else {
                    System.out.println("今日3次机会用完,请明天再尝试");
                    sc.close();
                    break;
                }
            }
        }
    }
}
