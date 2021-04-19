package com.study.oo.exercise_api;

public class hw6 {
    public static void main(String[] args) {
        /*
        定义一个方法，功能如下：给定一个字符串，返回该字符串的反转形式
        例如：字符串为abcdef，返回结果为fedcba
         */
        System.out.println(reverseStr("abcdef"));

    }

    private static String reverseStr(String str){
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return String.valueOf(sb);
    }
}
