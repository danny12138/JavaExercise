package com.study.oo.leetcode;

import java.util.Arrays;

public class Q26 {
    public static void main(String[] args) {
        int ans = removeDuplicates(new int[]{1,1,2,3,3,5,6});
        System.out.println(ans);
    }

    public static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i=k;i<nums.length;i++){
            if (nums[i-1]!=nums[i]){
                k++;
                nums[k-1] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
