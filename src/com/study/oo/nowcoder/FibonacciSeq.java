package com.study.oo.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class FibonacciSeq {
    public static void main(String[] args) {
        System.out.println(Fibonacci(4));
    }
    public static int Fibonacci(int n) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(0,1,1,2));
        while (arr.size()-1 < n){
            arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
        }
        System.out.println(arr);
        return arr.get(n);
    }
}
