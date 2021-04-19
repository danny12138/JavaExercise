package com.study.oo.nowcoder;

import java.util.Arrays;

public class compareVersion {
    public static void main(String[] args) {
        String a = "1.2";
        String b = "1.3";
        System.out.println(a.compareTo(b));
        System.out.println(compare(a,b));
    }
    public static int compare (String version1, String version2) {
        // write code here
        if (version1.equals(version2)){
            return 0;
        }
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int n1 = s1.length;
        int n2 = s2.length;
        for (int i = 0, j = 0; i < n1 && j < n2;){
            int i1 = Integer.parseInt(s1[i]);
            int i2 = Integer.parseInt(s2[i]);
            if (i1 > i2){
                return 1;
            }
            else if (i2 > i1){
                return -1;
            }else {
                i++;
                j++;
            }
        }
        if (n1>n2){
            return 1;
        }else if (n2>n1){
            return -1;
        }else return 0;
    }
}
