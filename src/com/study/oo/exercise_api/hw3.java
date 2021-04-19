package com.study.oo.exercise_api;

import java.util.Scanner;

public class hw3 {
    /* 第三题
    分析以下需求，并用代码实现：
	(1)从键盘循环录入录入一个字符串,输入"end"表示结束
	(2)将字符串中大写字母变成小写字母，小写字母变成大写字母，其它字符用"*"代替,并统计字母的个数
		举例:
			键盘录入：Hello12345World
			输出结果：hELLO*****wORLD
					  总共10个字母 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("请连续输入字符串: ");
        while (true){
            String input = sc.next();
            if (input.equals("end")){
                break;
            }
            else {
                sb.append(input);
            }
        }
        for (int i = 0; i < sb.length(); i++){
            String check = String.valueOf(sb.charAt(i));
            if (check.matches("[A-Z]")){
                sb.replace(i,i+1,check.toLowerCase());
            }
            else if (check.matches("[a-z]")){
                sb.replace(i,i+1,check.toUpperCase());
            }
            else {
                sb.replace(i,i+1,"*");
            }
        }
        System.out.println(sb);
    }
}
