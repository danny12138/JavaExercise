package com.study.oo.exercise.java8.exercise_java8;

//练习五：取用前几个：limit、跳过前几个：skip
//        问题：
//        已知ArrayList集合中有如下元素{陈玄风、梅超风、陆乘风、曲灵风、武眠风、冯默风、罗玉风}，使用Stream
//        1、取出前2个元素并在控制台打印输出。
//        2、取出后2个元素并在控制台打印输出。
import java.util.ArrayList;
import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> list2 = new ArrayList<String>(Arrays.asList("陈玄风","梅超风","陆乘风","曲灵风","武眠风","冯默风","罗玉风"));
        System.out.println("集合内容如下:");
        System.out.println(list2);
        System.out.println("取出前2个元素并在控制台打印输出。");
        list2.stream().limit(2).forEach(System.out::println);
        System.out.println("取出后2个元素并在控制台打印输出。");
        list2.stream().skip(list2.size()-2).forEach(System.out::println);
    }
}
