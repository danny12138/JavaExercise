package com.study.oo.nowcoder;

public class BinaryNumOf1 {
    public static void main(String[] args) {
        System.out.println(NumberOf1(0));
    }
    public static int NumberOf1(int n) {
        int num = 0;
        while (n != 0){
            num++;
            n = (n-1) & n;
        }
        return num;
    }
}
