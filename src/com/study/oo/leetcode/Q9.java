package com.study.oo.leetcode;

public class Q9 {
    //    判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
    public static void main(String[] args) {
        int test1 = 1001;
        int test2 = -1234321;
        boolean aa =isPalindrome(test1);
        System.out.println(aa);
    }

    public static boolean isP2(int x){
        if(x<0)
            return false;
        int top=0,bottom=0;
        int quo=x;
        while(quo!=0){
            top=quo%10;
            bottom=bottom*10+top;
            quo=quo/10;
        }
        return bottom==x;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        else {
            int digit = 1;
            int help = x;
            while (true) {
                if (help < 10) {
                    break;
                } else {
                    help = help / 10;
                    digit += 1;
                }
            }
            int help2 = x;
            int newDigit = digit;
            for (int i = 0; i <= digit/2;i++){

                int top = (int) Math.pow(10,newDigit-1);
                int bottom = help2%10;
                if (top!=0 && bottom != help2/top){
                    return false;
                }
                else {
                    help2 = (help2-bottom-bottom*top)/10;
                    newDigit -= 2;

                }
            }
        }
        return true;
    }
}
