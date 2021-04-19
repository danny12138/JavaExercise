package com.study.oo.exercise_api;

import java.util.Scanner;

public class hw4 {
    /*
    键盘录入一个字符串，统计该字符串中的大写字母、小写字母、数字字符和其他字符分别有多少个
    例如，键盘录入abcABCD12345!@#$%&，输出结果为：小写字母有3个，大写字母有4个，数字字符有5个，其他字符有6个。
     */
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        String ip = new Scanner(System.in).nextLine();
        int countLow = 0,countUp=0,countInt=0,countOther=0;
        for (int i=0;i<ip.length();i++){
            String str = ip.substring(i,i+1);
            if (str.matches("[A-Z]")){
                countUp++;
            }
            else if(str.matches("[a-z]")){
                countLow++;
            }
            else if(str.matches("[0-9]")){
                countInt++;
            }
            else {
                countOther++;
            }
        }
        System.out.printf("小写字母有%d个，大写字母有%d个，数字字符有%d个，其他字符有%d个",countLow,countUp,countInt,countOther);
    }
}
