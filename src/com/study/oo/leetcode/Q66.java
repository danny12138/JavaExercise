package com.study.oo.leetcode;

import java.util.Arrays;

public class Q66 {
    public static void main(String[] args) {
        //给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
        //最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
        //你可以假设除了整数 0 之外，这个整数不会以零开头。
        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));

    }
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1] += 1;
        for (int i = digits.length-1; i > 0; i--){
            if (digits[i] == 10){
                digits[i] = 0;
                digits[i-1] += 1;
            }
        }
        if (digits[0]==10){
            int[] newL = new int[digits.length+1];
            newL[0] = 1;
            newL[1] = 0;
            for (int i = 2; i < newL.length; i++){
                newL[i] = digits[i-1];
            }
            return newL;
        }
        return digits;
    }
}
