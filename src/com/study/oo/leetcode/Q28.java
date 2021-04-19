package com.study.oo.leetcode;

import java.util.Objects;

public class Q28 {
    public static void main(String[] args) {
        String haystack = "lll"; String needle = "lll";
        System.out.println(strStr1(haystack,needle));
    }
    public static int strStr1(String haystack, String needle) {
        if (Objects.equals(needle, "")){
            return 0;
        }
        int ans = -1;
        for (int i = 0; i <= haystack.length()-needle.length(); i++){
            if (needle.equals(haystack.substring(i,i+needle.length()))){
                ans = i;
                break;
            }
        }
        return ans;
    }

    public static int strStr(String haystack, String needle) {
        if (Objects.equals(needle, "")){
            return 0;
        }
        int ans = haystack.indexOf(needle);
        return ans;
    }
}
