package com.study.oo.nowcoder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

class Transform {
    public static void main(String[] args) {
        String str = "This word is Hello World";
        System.out.println(trans(str,str.length()));
    }
    public static String trans(String s, int n) {
        String ans = "";
        String words = "";
        for (int i = 0; i < n; i++){
            char cc = s.charAt(i);
            if (cc >= 'a' && cc <= 'z'){
                words += Character.toUpperCase(cc);
            }else if (cc >= 'A' && cc <= 'Z'){
                words += Character.toLowerCase(cc);
            }
            else {
                ans = cc + words + ans;
                words = "";
            }
        }
        ans = words + ans;
        return ans;
    }
}