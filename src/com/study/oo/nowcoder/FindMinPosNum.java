package com.study.oo.nowcoder;
//给定一个无序数组arr，找到数组中未出现的最小正整数
//例如arr = [-1, 2, 3, 4]。返回1
//arr = [1, 2, 3, 4]。返回5
//[要求]
//时间复杂度为O(n)O(n)，空间复杂度为O(1)O(1)
public class FindMinPosNum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(minNumberdisappered(arr));
    }

    public static int minNumberdisappered (int[] arr) {
        int i = 1;
        while (true){
            int countNE = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[j] > 0 && i == arr[j]) {
                    countNE++;
                }
            }
            if (countNE == 0){
                return i;
            }
            i++;
        }
    }
}
