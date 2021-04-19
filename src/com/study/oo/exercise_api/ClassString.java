package com.study.oo.exercise_api;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class ClassString {
    public static void main(String[] args) {
        long ms1 = System.currentTimeMillis();
        //test2();
        //test1();
        //UserLogin();
        exercise1();
        long ms2 = System.currentTimeMillis();
        long runTime = ms2 - ms1;
        System.out.println("运行时间"+runTime+"ms");

        //ScannerTest();
        //String a = "AAA";
        //System.out.println(a.hashCode());
        //System.out.println((a+"").hashCode());
        //System.out.println((a+" ").hashCode());

    }

    private static void ScannerTest() {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s = sc.nextLine();
        String[] sA = s.split(" ");
        System.out.println(Arrays.toString(sA));
        System.out.println(s);
    }

    private static void exercise2() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String top = str.substring(0,1);
        String end = str.substring(1);
        String newStr = (top.toUpperCase()).concat(end.toLowerCase());
        System.out.println(newStr);
    }

    private static void test2() {
        String abc = "abcabc a";
        byte[] bt = abc.getBytes();
        char[] ca = abc.toCharArray();
        System.out.println(Arrays.toString(bt));
        System.out.println(Arrays.toString(ca));
        System.out.println(abc.toUpperCase());
        System.out.println(abc);
        String aab = String.valueOf(123);
        System.out.println(aab);
    }

    private static void exercise1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个长字符串:");
        String str = sc.next();
        System.out.println("请输入一个短字符串:");
        String subStr = sc.next();
        int count = 0;
        int index = str.indexOf(subStr);

        while (true){
            if (index != -1){
                count++;
                System.out.println("第"+count+"次的索引: "+index);
                index = str.indexOf(subStr, index+1);
            }
            else {
                System.out.println("短字符串一共出现了"+count+"次");
                break;
            }
        }
    }

    private static void UserLogin() {
        String user = "admin";
        String passwords = "123";
        Scanner sc = new Scanner(System.in);
        String strA = user+passwords;
        int count = 0;
        while (true){
            System.out.print("请输入用户名: ");
            String n = sc.next();
            System.out.print("请输入密码: ");
            String p = sc.next();
            String strB = n+p;
            count++;
            if (Objects.equals(strA, strB)){
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

    private static void test1() {
        String a1 = new String();
        String a2 = new String("ABC");
        String a3 = new String(new byte[]{'a','b','c','d','e'});
        String a4 = new String(new byte[]{'a','b','c','d','e'},0,3);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        System.out.println(a1.isEmpty());
        System.out.println(a3.startsWith("ab"));
    }
}
