package com.study.oo;

public class test {
    int rec(int n){
        if (n == 1){
            return n;
        }
        return n*rec(n-1);
    }
    public static void main(String[] args){
        test t = new test();
        System.out.println(t.rec(5));
    }
}
