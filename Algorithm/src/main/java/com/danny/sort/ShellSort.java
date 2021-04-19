package com.danny.sort;

public class ShellSort {
    public static void sort(int[] arr){
        for (int i = arr.length/2; i > 0; i/=2){
            for (int j = i; j < arr.length; j++){
                for (int k = j; k > i-1; k-=i){
                    if (arr[k] < arr[k-i]) {
                        int temp = arr[k];
                        arr[k] = arr[k-i];
                        arr[k-i] = temp;
                    }
                }
            }
        }
    }
}
