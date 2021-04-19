package com.study.oo;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Math方法随机小数[0，1) -> (*100) [0,100) -> (*100+1) -> [1,101) -> [1,100]
        int key = (int)(Math.random()*100+1);
        System.out.print("请输入一个1到100的整数：");
        int ans = sc.nextInt();
        while (ans != key){
            if (ans > key){
                System.out.println("大了");
            }
            else {
                System.out.println("小了");
            }
            System.out.print("请继续输入整数：");
            ans = sc.nextInt();
        }
        if (ans == key){
            System.out.println("恭喜你，猜对了！");
        }
    }
}
