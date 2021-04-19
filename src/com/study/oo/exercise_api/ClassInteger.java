package com.study.oo.exercise_api;

public class ClassInteger {
    public static void main(String[] args) {
        //test1();
        String test = "245227308@";
        String mail = "\\d{8,12}[@]";
        String testP = "111aA";
        System.out.println(test.matches(mail));
    }

    private static void test1() {
        int aa = 12345;
        String ss = "12345";
        Integer i1 = new Integer("12345");
        Integer i2 = new Integer(ss);
        int t1 = i1;
        int i3 = 12345;
        System.out.println(t1==i3);
        System.out.println(Integer.parseInt("123"));
        System.out.println(Integer.valueOf("1234"));
    }
}
