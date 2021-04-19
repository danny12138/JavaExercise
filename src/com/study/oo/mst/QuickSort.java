package com.study.oo.mst;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 7, 6, 9, 8, 4};
        quicksort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    public static int[] quicksort(int[] arr,int low,int high){
        int temp,i,j,t;
        if (low>high){
            return arr;
        }
        else{
        i = low;
        j = high;
        temp = arr[low];
        while (i<j){
            while (temp<=arr[j]&&i<j){
                j--;
            }
            while (temp>=arr[i]&&i<j){
                i++;
            }
            if (i<j){
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = temp;
        quicksort(arr,low,j-1);
        quicksort(arr,j+1,high);
        }
        return arr;
    }
}
