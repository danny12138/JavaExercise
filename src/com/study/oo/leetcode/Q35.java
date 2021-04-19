package com.study.oo.leetcode;

public class Q35 {
    public static void main(String[] args) {
        System.out.println(searchInsert(new int[] {1,3,4,5,6},-2));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums[nums.length/2]>target) {
            for (int i = 0; i < nums.length / 2; i++) {
                if (nums[i] >= target) {
                    return i;
                }
            }
        }
        else if (nums[nums.length/2]<=target){
            for (int i = nums.length/2; i < nums.length; i++) {
                if (nums[i] >= target) {
                    return i;
                }
            }
        }
        return nums.length;
    }
}
