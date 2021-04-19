package com.study.oo.leetcode;

public class Q7 {
    public static void main(String[] args) {
        int d = reverse2(153);
        System.out.println(d);
    }

    public static int reverse(int x) {
        //获取输入值的位数用变量digit记录
        int digit = 1;
        int help = x;
        while (true) {
            if (help >= 0) {//如果输入值为零或正数
                if (help < 10) {
                    break;
                } else {
                    help = help / 10;
                    digit += 1;
                }
            } else {//如果输入值为负数
                if (help > -10) {
                    break;
                } else {
                    help = help / 10;
                    digit += 1;
                }
            }
        }
        //创建空数组存储每个位的数
        int[] arr = new int[digit];
        //遍历数组存储每个位的数
        for (int i = 0; i < digit; i++) {
            arr[i] = (int) (x / Math.pow(10, i) % 10);
        }
        //遍历数组获取输出
        long ans = 0;
        for (int j = 0; j < digit; j++) {
            ans = (long) (ans + arr[j] * Math.pow(10, digit - j - 1));
        }
        //如果输出结果在整数范围
        if (ans > Math.pow(2, 31) - 1 || ans < -(Math.pow(2, 31))) {
            return 0;
        }
        else {
            return (int) ans;
        }
    }

    public static int reverse2(int x) {
        long n = 0;
        while(x != 0) {
            n = n*10 + x%10;
            x = x/10;
        }
        return (int)n==n? (int)n:0;
    }
}


