package com.study.oo.nowcoder;

import java.util.ArrayList;

//以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
//        （字符串长度不大于100000，保证字符串仅由'0'~'9'这10种字符组成）
public class StringPlus {
    public static void main(String[] args) {
        String ss = "123";
        char[] ch = ss.toCharArray();
        int c = Integer.parseInt(String.valueOf(ch[0]))+Integer.parseInt(String.valueOf(ch[1]));
        System.out.println(solve("0","1999"));

    }

    public static String solve (String s, String t) {
        int add1 = 0;
        String longS;
        String shortS;
        if (s.length() >= t.length()){
            longS = s;
            shortS = t;
        }
        else {
            longS = t;
            shortS = s;
        }
        int sL = longS.length();
        int tL = shortS.length();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sL; i++){
                int temp = 0;
                if (add1 == 1) {
                    temp = 1;
                }
                int lIndex = sL - i -1;
                int intS = Integer.parseInt(String.valueOf(longS.charAt(lIndex)));
                if (i < tL){
                    add1 = 0;
                    int sIndex = tL - i -1;
                    int intT = Integer.parseInt(String.valueOf(shortS.charAt(sIndex)));
                    temp += intS+intT;
                    if (temp >= 10){
                        temp -= 10;
                        add1 = 1;
                    }
                    sb.append(temp);
                    if (tL==sL&&sIndex==0&&add1==1){
                        sb.append(1);
                    }
                }else {
                    if (add1 == 1) {
                        intS = intS + 1;
                        add1 = 0;
                    }
                    if (intS >= 10){
                        intS -= 10;
                        add1 = 1;
                    }
                    sb.append(intS);
                    if (lIndex==0&&add1==1){
                        sb.append(1);
                    }
                }
            }
        // write code here
        return String.valueOf(sb.reverse());
    }
}
