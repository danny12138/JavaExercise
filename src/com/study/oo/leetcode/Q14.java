package com.study.oo.leetcode;

public class Q14 {
    public static void main(String[] args) {
        String[] aa = {"flower","","flight"};
        System.out.println(longestCommonPrefix(aa));

        /**
         * 编写一个函数来查找字符串数组中的最长公共前缀。
         *         如果不存在公共前缀，返回空字符串 ""。
         */
    }

    public static String longestCommonPrefix(String[] strs) {
        //找到长度最小的字符串
        if (strs.length > 0) {
            int minStr = strs[0].length();
            for (int i = 0; i < strs.length; i++) {
                int currentStr = strs[i].length();
                if (currentStr < minStr) {
                    minStr = currentStr;
                }
            }
            if (minStr == 0){
                return "";
            }
            String ans = "";
            for (int j = 0; j < minStr; j++) {
                char checkChar = strs[0].charAt(j);
                int check = 0;
                for (int k = 1; k < strs.length; k++) {
                    if (checkChar == strs[k].charAt(j)) {
                        check += 1;
                    }
                }
                if (check == strs.length - 1) {
                    ans += checkChar;
                } else {
                    return ans;
                }

            }
            return ans;
        }
        else {
            return "";
        }
    }
}
