package com.study.oo.nowcoder;

import java.util.Arrays;
import java.util.HashMap;

public class MaxLength {
    public static void main(String[] args) {
        int [] arr = {2,3,4,3,2,1,3,4,5,7,9};
        System.out.println(maxSize(arr));
    }

    public static int maxSize(int[] arr) {
              int[] last = new int[100000];
              int start = 0;
              int ans = 0;
              for(int i = 0; i < arr.length; i++){
                  int index = arr[i];
                  start = Math.max(start, last[index]);
                  ans = Math.max(ans, i - start + 1);
                  last[index] = i + 1;
                  System.out.println(start);
                  System.out.println(last[index]);
              }
              return ans;
          }
}
