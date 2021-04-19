package com.study.oo.nowcoder;

public class MaxSumSubIntArray {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,10,-4,7,2,-5};
        System.out.println(FindGreatestSumOfSubArray(arr));
    }
    public static int FindGreatestSumOfSubArray(int[] array) {
        int ans = array[0];
        int start = array[0];
        for (int i = 1; i < array.length; i++){
            start = Math.max(start+array[i],array[i]);
            ans = Math.max(start, ans);
        }
        return ans;
    }
}
