package com.study.oo.nowcoder;

import java.util.HashMap;

public class IntegerTransfer {
    public static void main(String[] args) {
        int M = -100000000;
        int N = 16;
        System.out.println(solve(M,N));
        System.out.println(Integer.toString(M,N).toUpperCase());
    }
    public static String solve (int M, int N) {
        // write code here
        if (M == 0){
            return "0";
        }
        int original = M;
        StringBuilder sb = new StringBuilder();
        HashMap <Integer,Character> hm = new HashMap<>();
        for (int i = 65; i <= 70; i++) {
            hm.put(i-55, (char) i);
        }
        int num;
        while (M != 0) {
            if (N < 10) {
                num = (M > 0 ? M : M*-1) % N;
                M /= N;
                sb.append(num);
            } else {
                num = (M > 0 ? M : M*-1) % N;
                M /= N;
                sb.append(num > 10 ? String.valueOf(hm.get(num)) : num);
            }
        }
        if (original < 0) {
            sb.append("-");
        }
        return sb.reverse().toString();
    }
}
