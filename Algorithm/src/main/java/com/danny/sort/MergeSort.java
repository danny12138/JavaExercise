package com.danny.sort;

import org.junit.Test;

import java.util.Arrays;

public class MergeSort {

    public static void sort(int[] arr){
        merge(arr,0,arr.length-1);
    }
    /**
     * 两个有序列表归并
     * @param arr         需要排序的数组
     * @param start       数组开始索引
     * @param end         数组结束索引
     */
    public static void merge(int[] arr, int start, int end){
        if (start >= end){
            return;
        }
        int mid = (start+end) / 2;
        int startL = start, endL = mid;
        int startR = mid+1, endR = end;
        merge(arr,startL,endL);
        merge(arr,startR,endR);

        int[] arr2 = new int[arr.length];
        int k = 0;
        while (startL <= endL && startR <= end) arr2[k++] = arr[startL] <= arr[startR] ? arr[startL++] : arr[startR++];

        while (startL <= endL) arr2[k++] = arr[startL++];

        while (startR<=end) arr2[k++] = arr[startR++];

        //将保存的有序数组替换到原先数组
        int ii = start;
        int kk = 0;
        while (kk <= end-start) arr[ii++] = arr2[kk++];
    }
}
