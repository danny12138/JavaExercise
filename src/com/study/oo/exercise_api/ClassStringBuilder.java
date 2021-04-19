package com.study.oo.exercise_api;

import java.util.Arrays;
import java.util.Scanner;

public class ClassStringBuilder {
    public static void main(String[] args) {
        //test1();
        //exercise1();
       //exercise2();
    }

    private static void exercise2() {
        int[] arr = {1,2,2,2,3,3,};
        StringBuilder sb2 = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++){
            if (i==arr.length-1){
                sb2.append(arr[i]+"]");
            }
            else {
                sb2.append(arr[i]+",");

            }
        }
        System.out.println(sb2);
    }

    private static void exercise1() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println(sb);
    }

    private static void test1() {
        String a = "you";
        StringBuilder aa = new StringBuilder();
        System.out.println(aa.capacity());
        aa.append(a);
        aa.append(" hate me.");
        System.out.println(aa);
        aa.delete(4,8);
        System.out.println(aa);
        aa.insert(4,"love");
        aa.deleteCharAt(aa.length()-1);
        aa.append("!");
        System.out.println(aa);
        aa.replace(0,3,"I");
        aa.replace(aa.length()-3,aa.length()-1,"you");
        System.out.println(aa);
        System.out.println(aa.length());
        System.out.println(aa.capacity());
    }
}
