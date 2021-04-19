package com.study.oo.nowcoder;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(solve("abcdef"));
    }
    public static String solve (String str) {
        char[] cc = str.toCharArray();
        int j;
        for (int i = 0; i < cc.length/2; i++){
            j = cc.length - i - 1;
            char temp = cc[i];
            cc[i] = cc[j];
            cc[j] = temp;
        }
        return new String(cc);
    }
}
