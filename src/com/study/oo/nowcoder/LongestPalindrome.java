package com.study.oo.nowcoder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class LongestPalindrome {
    public static void main(String[] args) {
        int ans = getLongestPalindrome("abc1234321ab",12);
        System.out.println(ans);
    }
    public static int getLongestPalindrome(String A, int n) {
        // write code here
        if (n <= 1){
            return n;
        }
        int ans = 1;
        for (int i = 0; i < A.length(); i++){
            for (int j = 2; j <= A.length()-i; j++){
                String sb = A.substring(i,i+j);
                String rsb = (new StringBuilder(sb).reverse().toString());
                if (sb.equals(rsb)){
                    ans = Math.max(ans,j);
                }
            }
        }
        return ans;
    }
}
