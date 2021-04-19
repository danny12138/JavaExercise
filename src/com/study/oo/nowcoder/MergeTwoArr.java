package com.study.oo.nowcoder;

import java.util.Arrays;

public class MergeTwoArr {
    public static void main(String[] args) {
        int[] arr1 = {0,0,0,0,1,2,3,4,5};
        int[] arr2 = {3,6,9,10};
        merge(arr1,5,arr2,4);
        System.out.println(Arrays.toString(arr1));
    }
    public static void merge(int A[], int m, int B[], int n) {
        int j = n -1;
        //index是数组A和B长度之和，因为题目规定A的长度一定能容纳B，所以直接相加作为合并后的坐标。
        int index = m + n - 1;
        int i = m -1;
        while(i >=0 && j >=0){
            A[index--] = A[i] > B[j] ? A[i--] : B[j--];
        }
        //如果A的数字比B多，则不会进入后续处理；如果B的数字比A多，则进入后续处理，将B剩余数字添加到数组A中。
        while(j >=0){
            A[index--] = B[j--];
        }
        /*int indexA = m - 1;
        int indexB = n - 1;
        for (int i = 0; i < A.length; i++){
            int j = A.length - i -1;
            int k = B.length - i -1;
            if (k > 0){
                if (m>B[k]){
                    A[k] = B[k];
                }
                else if (n>A[k]){
                    A[j] =
                }
            }
        }*/
    }
}
