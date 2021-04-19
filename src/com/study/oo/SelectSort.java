package com.study.oo;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] aa = {3,1,6,2,5};
        for (int i = 0; i < aa.length; i++){
            int min = aa[i];
            int minIndex = i;
            for (int j = i; j < aa.length; j++){
                if (min>aa[j]){
                    min = aa[j];
                    minIndex = j;
                }
            }
            int temp = aa[i];
            aa[i] = min;
            aa[minIndex] = temp;
        }

        System.out.println(Arrays.toString(aa));
    }
}
