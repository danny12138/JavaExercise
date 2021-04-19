package com.study.oo.leetcode;

import java.util.Arrays;

public class Q27 {
    public static void main(String[] args) {
        int[] nu = {1,2,5,3,3,3,3,6,7};
        int val = 3;
        System.out.println(removeElement(nu, val));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int ans = 0;
        for (int i = ans; i < nums.length; i++) {
            if (nums[i] != val) {
                //int temp = nums[ans];
                nums[ans] = nums[i];
                //nums[i] = temp;
                ans++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return ans;
    }
}
